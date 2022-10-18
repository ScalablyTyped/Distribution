package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unstable {
  
  @JSImport("matrix-appservice-bridge", "unstable")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * An unexpected internal error occured while the bridge handled the event.
    */
  @JSImport("matrix-appservice-bridge", "unstable.BridgeInternalError")
  @js.native
  open class BridgeInternalError ()
    extends typings.matrixAppserviceBridge.libErrorsMod.unstable.BridgeInternalError {
    def this(message: String) = this()
  }
  
  /**
    * Base Error for when the bride can not handle the event.
    */
  @JSImport("matrix-appservice-bridge", "unstable.EventNotHandledError")
  @js.native
  open class EventNotHandledError ()
    extends typings.matrixAppserviceBridge.libErrorsMod.unstable.EventNotHandledError {
    def this(message: String) = this()
  }
  
  /**
    * The bridge decides that the event is too old to be sent.
    */
  @JSImport("matrix-appservice-bridge", "unstable.EventTooOldError")
  @js.native
  open class EventTooOldError ()
    extends typings.matrixAppserviceBridge.libErrorsMod.unstable.EventTooOldError {
    def this(message: String) = this()
  }
  
  /**
    * The event is not understood by the bridge.
    */
  @JSImport("matrix-appservice-bridge", "unstable.EventUnknownError")
  @js.native
  open class EventUnknownError ()
    extends typings.matrixAppserviceBridge.libErrorsMod.unstable.EventUnknownError {
    def this(message: String) = this()
  }
  
  /**
    * The foreign network errored and the event couldn't be delivered.
    */
  @JSImport("matrix-appservice-bridge", "unstable.ForeignNetworkError")
  @js.native
  open class ForeignNetworkError ()
    extends typings.matrixAppserviceBridge.libErrorsMod.unstable.ForeignNetworkError {
    def this(message: String) = this()
  }
  
  inline def wrap[T /* <: typings.matrixAppserviceBridge.libErrorsMod.unstable.EventNotHandledError */](oldError: String, newErrorType: Instantiable[T]): typings.matrixAppserviceBridge.libErrorsMod.unstable.EventNotHandledError = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(oldError.asInstanceOf[js.Any], newErrorType.asInstanceOf[js.Any])).asInstanceOf[typings.matrixAppserviceBridge.libErrorsMod.unstable.EventNotHandledError]
  inline def wrap[T /* <: typings.matrixAppserviceBridge.libErrorsMod.unstable.EventNotHandledError */](oldError: String, newErrorType: Instantiable[T], message: String): typings.matrixAppserviceBridge.libErrorsMod.unstable.EventNotHandledError = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(oldError.asInstanceOf[js.Any], newErrorType.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[typings.matrixAppserviceBridge.libErrorsMod.unstable.EventNotHandledError]
  /**
    * @deprecated Use {@link wrapError}
    */
  inline def wrap[T /* <: typings.matrixAppserviceBridge.libErrorsMod.unstable.EventNotHandledError */](oldError: js.Error, newErrorType: Instantiable[T]): typings.matrixAppserviceBridge.libErrorsMod.unstable.EventNotHandledError = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(oldError.asInstanceOf[js.Any], newErrorType.asInstanceOf[js.Any])).asInstanceOf[typings.matrixAppserviceBridge.libErrorsMod.unstable.EventNotHandledError]
  inline def wrap[T /* <: typings.matrixAppserviceBridge.libErrorsMod.unstable.EventNotHandledError */](oldError: js.Error, newErrorType: Instantiable[T], message: String): typings.matrixAppserviceBridge.libErrorsMod.unstable.EventNotHandledError = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(oldError.asInstanceOf[js.Any], newErrorType.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[typings.matrixAppserviceBridge.libErrorsMod.unstable.EventNotHandledError]
  
  inline def wrapError[T /* <: typings.matrixAppserviceBridge.libErrorsMod.unstable.EventNotHandledError */](oldError: String, newErrorType: Instantiable[T]): typings.matrixAppserviceBridge.libErrorsMod.unstable.EventNotHandledError = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapError")(oldError.asInstanceOf[js.Any], newErrorType.asInstanceOf[js.Any])).asInstanceOf[typings.matrixAppserviceBridge.libErrorsMod.unstable.EventNotHandledError]
  inline def wrapError[T /* <: typings.matrixAppserviceBridge.libErrorsMod.unstable.EventNotHandledError */](oldError: String, newErrorType: Instantiable[T], message: String): typings.matrixAppserviceBridge.libErrorsMod.unstable.EventNotHandledError = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapError")(oldError.asInstanceOf[js.Any], newErrorType.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[typings.matrixAppserviceBridge.libErrorsMod.unstable.EventNotHandledError]
  /**
    * Append the old error message to the new one and keep its stack trace.
    * Example:
    *     throw wrapError(e, HighLevelError, "This error is more specific");
    */
  inline def wrapError[T /* <: typings.matrixAppserviceBridge.libErrorsMod.unstable.EventNotHandledError */](oldError: js.Error, newErrorType: Instantiable[T]): typings.matrixAppserviceBridge.libErrorsMod.unstable.EventNotHandledError = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapError")(oldError.asInstanceOf[js.Any], newErrorType.asInstanceOf[js.Any])).asInstanceOf[typings.matrixAppserviceBridge.libErrorsMod.unstable.EventNotHandledError]
  inline def wrapError[T /* <: typings.matrixAppserviceBridge.libErrorsMod.unstable.EventNotHandledError */](oldError: js.Error, newErrorType: Instantiable[T], message: String): typings.matrixAppserviceBridge.libErrorsMod.unstable.EventNotHandledError = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapError")(oldError.asInstanceOf[js.Any], newErrorType.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[typings.matrixAppserviceBridge.libErrorsMod.unstable.EventNotHandledError]
}
