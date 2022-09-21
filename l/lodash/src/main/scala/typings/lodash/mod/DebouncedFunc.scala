package typings.lodash.mod

import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebouncedFunc[T /* <: js.Function1[/* repeated */ Any, Any] */] extends StObject {
  
  /**
    * Call the original function, but applying the debounce rules.
    *
    * If the debounced function can be run immediately, this calls it and returns its return
    * value.
    *
    * Otherwise, it returns the return value of the last invocation, or undefined if the debounced
    * function was not invoked yet.
    */
  def apply(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<T> is not an array type */ args: Parameters[T]
  ): js.UndefOr[ReturnType[T]] = js.native
  
  /**
    * Throw away any pending invocation of the debounced function.
    */
  def cancel(): Unit = js.native
  
  /**
    * If there is a pending invocation of the debounced function, invoke it immediately and return
    * its return value.
    *
    * Otherwise, return the value from the last invocation, or undefined if the debounced function
    * was never invoked.
    */
  def flush(): js.UndefOr[ReturnType[T]] = js.native
}
