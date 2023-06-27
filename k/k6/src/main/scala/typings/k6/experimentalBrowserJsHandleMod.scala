package typings.k6

import typings.k6.experimentalBrowserElementHandleMod.ElementHandle
import typings.k6.experimentalBrowserMod.PageFunction
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalBrowserJsHandleMod {
  
  @JSImport("k6/experimental/browser/js_handle", "JSHandle")
  @js.native
  open class JSHandle[T] () extends StObject {
    
    /**
      * Returns either `null` or the object handle itself, if the object handle is
      * an instance of `ElementHandle`.
      * @returns The ElementHandle if available.
      */
    def asElement(): ElementHandle | Null = js.native
    
    /**
      * Stops referencing the element handle.
      */
    def dispose(): Unit = js.native
    
    /**
      * Evaluates the page function and returns its return value.
      * This method passes this handle as the first argument to the page function.
      * @param pageFunction The function to be evaluated.
      * @param args The arguments to pass to the page function.
      * @returns The return value of `pageFunction`.
      */
    def evaluate[R, Arg](
      pageFunction: PageFunction[R, Arg],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any = js.native
    
    /**
      * Evaluates the page function and returns a `JSHandle`.
      * This method passes this handle as the first argument to the page function.
      * Unlike `evaluate`, `evaluateHandle` returns the value as a `JSHandle`
      * @param pageFunction The function to be evaluated.
      * @param args The arguments to pass to the page function.
      * @returns A JSHandle of the return value of `pageFunction`.
      */
    def evaluateHandle[R, Arg](
      pageFunction: PageFunction[R, Arg],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): JSHandle[R] = js.native
    
    /**
      * Fethes a map with own property names of of the `JSHandle` with their values as
      * `JSHandle` instances.
      * @returns A map with property names as keys and `JSHandle` instances for the property values.
      */
    def getProperties(): Map[String, JSHandle[Any]] = js.native
    
    /**
      * Fetches a JSON representation of the object.
      * @returns A JSON representation of the object.
      */
    def jsonValue(): Any = js.native
  }
}
