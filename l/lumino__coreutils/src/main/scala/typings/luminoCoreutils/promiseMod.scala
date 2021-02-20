package typings.luminoCoreutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promiseMod {
  
  @JSImport("@lumino/coreutils/types/promise", "PromiseDelegate")
  @js.native
  /**
    * Construct a new promise delegate.
    */
  class PromiseDelegate[T] () extends StObject {
    
    var _reject: js.Any = js.native
    
    var _resolve: js.Any = js.native
    
    /**
      * The promise wrapped by the delegate.
      */
    val promise: js.Promise[T] = js.native
    
    /**
      * Reject the wrapped promise with the given value.
      *
      * @reason - The reason for rejecting the promise.
      */
    def reject(reason: js.Any): Unit = js.native
    
    /**
      * Resolve the wrapped promise with the given value.
      *
      * @param value - The value to use for resolving the promise.
      */
    def resolve(value: T): Unit = js.native
    def resolve(value: js.Thenable[T]): Unit = js.native
  }
}
