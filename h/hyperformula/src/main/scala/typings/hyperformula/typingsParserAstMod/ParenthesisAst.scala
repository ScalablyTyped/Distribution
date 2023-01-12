package typings.hyperformula.typingsParserAstMod

import typings.hyperformula.typingsParserAstMod.AstNodeType.PARENTHESIS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParenthesisAst
  extends StObject
     with AstWithInternalWhitespace
     with Ast {
  
  var expression: Ast
  
  var `type`: PARENTHESIS
}
object ParenthesisAst {
  
  inline def apply(expression: Ast, `type`: PARENTHESIS): ParenthesisAst = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParenthesisAst]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParenthesisAst] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Ast): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: PARENTHESIS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
