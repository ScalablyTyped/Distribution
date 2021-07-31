package typings.jscodeshift

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateMod extends Shortcut {
  
  @JSImport("jscodeshift/src/template", JSImport.Namespace)
  @js.native
  val ^ : js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify recast.Parser */ /* parser */ js.Any, 
    Template
  ] = js.native
  
  trait Template extends StObject {
    
    /** Tagged template function. Parses the string as source and returns an Expression AST node. */
    def expression(args: js.Any*): js.Any
    
    /** Tagged template function. Parses the string as source and returns an Statement AST node. */
    def statement(args: js.Any*): js.Any
    
    /** Tagged template function. Parses the string as source and returns an array of Statement AST nodes. */
    def statements(args: js.Any*): js.Any
  }
  object Template {
    
    @scala.inline
    def apply(
      expression: /* repeated */ js.Any => js.Any,
      statement: /* repeated */ js.Any => js.Any,
      statements: /* repeated */ js.Any => js.Any
    ): Template = {
      val __obj = js.Dynamic.literal(expression = js.Any.fromFunction1(expression), statement = js.Any.fromFunction1(statement), statements = js.Any.fromFunction1(statements))
      __obj.asInstanceOf[Template]
    }
    
    @scala.inline
    implicit class TemplateMutableBuilder[Self <: Template] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpression(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "expression", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStatement(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "statement", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStatements(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "statements", js.Any.fromFunction1(value))
    }
  }
  
  type _To = js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify recast.Parser */ /* parser */ js.Any, 
    Template
  ]
  
  /* This means you don't have to write `^`, but can instead just say `templateMod.foo` */
  override def _to: js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify recast.Parser */ /* parser */ js.Any, 
    Template
  ] = ^
}
