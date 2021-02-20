package typings.matrixAppserviceBridge

import typings.matrixAppserviceBridge.anon.Instantiable
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  object unstable {
    
    /**
      * An unexpected internal error occured while the bridge handled the event.
      */
    @JSImport("matrix-appservice-bridge/lib/errors", "unstable.BridgeInternalError")
    @js.native
    class BridgeInternalError () extends EventNotHandledError {
      def this(message: String) = this()
    }
    
    /**
      * Base Error for when the bride can not handle the event.
      */
    @JSImport("matrix-appservice-bridge/lib/errors", "unstable.EventNotHandledError")
    @js.native
    class EventNotHandledError () extends Error {
      def this(message: String) = this()
      
      var internalReason: BridgeErrorReason = js.native
      
      def reason: BridgeErrorReason = js.native
    }
    
    /**
      * The bridge decides that the event is too old to be sent.
      */
    @JSImport("matrix-appservice-bridge/lib/errors", "unstable.EventTooOldError")
    @js.native
    class EventTooOldError () extends EventNotHandledError {
      def this(message: String) = this()
    }
    
    /**
      * The event is not understood by the bridge.
      */
    @JSImport("matrix-appservice-bridge/lib/errors", "unstable.EventUnknownError")
    @js.native
    class EventUnknownError () extends EventNotHandledError {
      def this(message: String) = this()
    }
    
    /**
      * The foreign network errored and the event couldn't be delivered.
      */
    @JSImport("matrix-appservice-bridge/lib/errors", "unstable.ForeignNetworkError")
    @js.native
    class ForeignNetworkError () extends EventNotHandledError {
      def this(message: String) = this()
    }
    
    @JSImport("matrix-appservice-bridge/lib/errors", "unstable.wrap")
    @js.native
    def wrap[T /* <: EventNotHandledError */](oldError: String, newErrorType: Instantiable[T]): EventNotHandledError = js.native
    @JSImport("matrix-appservice-bridge/lib/errors", "unstable.wrap")
    @js.native
    def wrap[T /* <: EventNotHandledError */](oldError: String, newErrorType: Instantiable[T], message: String): EventNotHandledError = js.native
    /**
      * @deprecated Use {@link wrapError}
      */
    @JSImport("matrix-appservice-bridge/lib/errors", "unstable.wrap")
    @js.native
    def wrap[T /* <: EventNotHandledError */](oldError: Error, newErrorType: Instantiable[T]): EventNotHandledError = js.native
    @JSImport("matrix-appservice-bridge/lib/errors", "unstable.wrap")
    @js.native
    def wrap[T /* <: EventNotHandledError */](oldError: Error, newErrorType: Instantiable[T], message: String): EventNotHandledError = js.native
    
    @JSImport("matrix-appservice-bridge/lib/errors", "unstable.wrapError")
    @js.native
    def wrapError[T /* <: EventNotHandledError */](oldError: String, newErrorType: Instantiable[T]): EventNotHandledError = js.native
    @JSImport("matrix-appservice-bridge/lib/errors", "unstable.wrapError")
    @js.native
    def wrapError[T /* <: EventNotHandledError */](oldError: String, newErrorType: Instantiable[T], message: String): EventNotHandledError = js.native
    /**
      * Append the old error message to the new one and keep its stack trace.
      * Example:
      *     throw wrapError(e, HighLevelError, "This error is more specific");
      */
    @JSImport("matrix-appservice-bridge/lib/errors", "unstable.wrapError")
    @js.native
    def wrapError[T /* <: EventNotHandledError */](oldError: Error, newErrorType: Instantiable[T]): EventNotHandledError = js.native
    @JSImport("matrix-appservice-bridge/lib/errors", "unstable.wrapError")
    @js.native
    def wrapError[T /* <: EventNotHandledError */](oldError: Error, newErrorType: Instantiable[T], message: String): EventNotHandledError = js.native
    
    /* Rewritten from type alias, can be one of: 
      - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotevent_not_handled
      - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotevent_too_old
      - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotinternal_error
      - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotforeign_network_error
      - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotevent_unknown
    */
    trait BridgeErrorReason extends StObject
    object BridgeErrorReason {
      
      @scala.inline
      def mDotevent_not_handled: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotevent_not_handled = "m.event_not_handled".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotevent_not_handled]
      
      @scala.inline
      def mDotevent_too_old: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotevent_too_old = "m.event_too_old".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotevent_too_old]
      
      @scala.inline
      def mDotevent_unknown: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotevent_unknown = "m.event_unknown".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotevent_unknown]
      
      @scala.inline
      def mDotforeign_network_error: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotforeign_network_error = "m.foreign_network_error".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotforeign_network_error]
      
      @scala.inline
      def mDotinternal_error: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotinternal_error = "m.internal_error".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotinternal_error]
    }
  }
}
