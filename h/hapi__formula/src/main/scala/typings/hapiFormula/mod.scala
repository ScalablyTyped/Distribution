package typings.hapiFormula

import typings.hapiFormula.mod.Options.Reference
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/formula", "Parser")
  @js.native
  open class Parser[T /* <: String | Double */] protected () extends StObject {
    /**
      * Create a new formula parser.
      * 
      * @param formula - the formula string to parse.
      * @param options - optional settings.
      */
    def this(formula: String) = this()
    def this(formula: String, options: Options) = this()
    
    /**
      * Evaluate the formula.
      * 
      * @param context - optional object with runtime formula context used to resolve variables.
      * 
      * @returns the string or number outcome of the resolved formula.
      */
    def evaluate(): T = js.native
    def evaluate(context: Any): T = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * A hash of key - value pairs used to convert constants to values.
      */
    val constants: js.UndefOr[Record[String, Any]] = js.undefined
    
    /**
      * A hash of key-value pairs used to resolve formula functions.
      */
    val functions: js.UndefOr[Record[String, js.Function]] = js.undefined
    
    /**
      * A variable resolver factory function.
      */
    val reference: js.UndefOr[Reference] = js.undefined
    
    /**
      * A regular expression used to validate token variables.
      */
    val tokenRx: js.UndefOr[js.RegExp] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setConstants(value: Record[String, Any]): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
      
      inline def setConstantsUndefined: Self = StObject.set(x, "constants", js.undefined)
      
      inline def setFunctions(value: Record[String, js.Function]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
      
      inline def setReference(value: /* name */ String => js.Function1[/* context */ Any, Any]): Self = StObject.set(x, "reference", js.Any.fromFunction1(value))
      
      inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
      
      inline def setTokenRx(value: js.RegExp): Self = StObject.set(x, "tokenRx", value.asInstanceOf[js.Any])
      
      inline def setTokenRxUndefined: Self = StObject.set(x, "tokenRx", js.undefined)
    }
    
    type Reference = js.Function1[/* name */ String, js.Function1[/* context */ Any, Any]]
  }
}
