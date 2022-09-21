package typings.jexl

import org.scalablytyped.runtime.StringDictionary
import typings.jexl.astMod.Ast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expressionMod {
  
  @JSImport("jexl/Expression", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Expression {
    def this(lang: Any, exprStr: String) = this()
  }
  
  type Context = StringDictionary[Any]
  
  @js.native
  trait Expression extends StObject {
    
    /**
      * Get the abstract syntax tree that represents the compiled expression
      * @returns the abstract syntax tree
      */
    def _getAst(): Ast = js.native
    
    /**
      * Forces a compilation of the expression string that this Expression object
      * was constructed with. This function can be called multiple times; useful
      * if the language elements of the associated Jexl instance change.
      * @returns this Expression instance, for convenience
      */
    def compile(): Expression = js.native
    
    /**
      * Asynchronously evaluates the expression within an optional context.
      * @param context A mapping of variables to values, which will be
      *      made accessible to the Jexl expression when evaluating it
      * @returns resolves with the result of the evaluation.
      */
    def eval(): js.Promise[Any] = js.native
    def eval(context: Context): js.Promise[Any] = js.native
    
    /**
      * Synchronously evaluates the expression within an optional context.
      * @param context A mapping of variables to values, which will be
      *      made accessible to the Jexl expression when evaluating it
      * @returns the result of the evaluation.
      * @throws on error
      */
    def evalSync(): Any = js.native
    def evalSync(context: Context): Any = js.native
  }
}
