package typings.jexl

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expressionMod {
  
  @JSImport("jexl/Expression", JSImport.Default)
  @js.native
  class default protected () extends Expression {
    def this(lang: js.Any, exprStr: String) = this()
  }
  
  type Context = StringDictionary[js.Any]
  
  @js.native
  trait Expression extends StObject {
    
    def _getAst(): js.Any = js.native
    
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
    def eval(): js.Promise[_] = js.native
    def eval(context: Context): js.Promise[_] = js.native
    
    /**
      * Synchronously evaluates the expression within an optional context.
      * @param context A mapping of variables to values, which will be
      *      made accessible to the Jexl expression when evaluating it
      * @returns the result of the evaluation.
      * @throws on error
      */
    def evalSync(): js.Any = js.native
    def evalSync(context: Context): js.Any = js.native
  }
}
