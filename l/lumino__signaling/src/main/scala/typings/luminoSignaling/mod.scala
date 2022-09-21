package typings.luminoSignaling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lumino/signaling", "Signal")
  @js.native
  open class Signal[T, U] protected ()
    extends StObject
       with ISignal[T, U] {
    /**
      * Construct a new signal.
      *
      * @param sender - The sender which owns the signal.
      */
    def this(sender: T) = this()
    
    /**
      * Emit the signal and invoke the connected slots.
      *
      * @param args - The args to pass to the connected slots.
      *
      * #### Notes
      * Slots are invoked synchronously in connection order.
      *
      * Exceptions thrown by connected slots will be caught and logged.
      */
    def emit(args: U): Unit = js.native
    
    /**
      * The sender which owns the signal.
      */
    val sender: T = js.native
  }
  object Signal {
    
    @JSImport("@lumino/signaling", "Signal")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Clear all signal data associated with the given object.
      *
      * @param object - The object for which the data should be cleared.
      *
      * #### Notes
      * This removes all signal connections and any other signal data
      * associated with the object.
      */
    inline def clearData(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearData")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Remove all connections where an object is the sender or receiver.
      *
      * @param object - The object of interest.
      *
      * #### Notes
      * If a `thisArg` is provided when connecting a signal, that object
      * is considered the receiver. Otherwise, the `slot` is considered
      * the receiver.
      */
    inline def disconnectAll(`object`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnectAll")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Remove all connections between a sender and receiver.
      *
      * @param sender - The sender object of interest.
      *
      * @param receiver - The receiver object of interest.
      *
      * #### Notes
      * If a `thisArg` is provided when connecting a signal, that object
      * is considered the receiver. Otherwise, the `slot` is considered
      * the receiver.
      */
    inline def disconnectBetween(sender: Any, receiver: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("disconnectBetween")(sender.asInstanceOf[js.Any], receiver.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Remove all connections where the given object is the receiver.
      *
      * @param receiver - The receiver object of interest.
      *
      * #### Notes
      * If a `thisArg` is provided when connecting a signal, that object
      * is considered the receiver. Otherwise, the `slot` is considered
      * the receiver.
      */
    inline def disconnectReceiver(receiver: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnectReceiver")(receiver.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Remove all connections where the given object is the sender.
      *
      * @param sender - The sender object of interest.
      */
    inline def disconnectSender(sender: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnectSender")(sender.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Get the signal exception handler.
      *
      * @returns The current exception handler.
      *
      * #### Notes
      * The default exception handler is `console.error`.
      */
    inline def getExceptionHandler(): ExceptionHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("getExceptionHandler")().asInstanceOf[ExceptionHandler]
    
    /**
      * Set the signal exception handler.
      *
      * @param handler - The function to use as the exception handler.
      *
      * @returns The old exception handler.
      *
      * #### Notes
      * The exception handler is invoked when a slot throws an exception.
      */
    inline def setExceptionHandler(handler: ExceptionHandler): ExceptionHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("setExceptionHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[ExceptionHandler]
    
    /**
      * A type alias for the exception handler function.
      */
    type ExceptionHandler = js.Function1[/* err */ js.Error, Unit]
  }
  
  @js.native
  trait ISignal[T, U] extends StObject {
    
    /**
      * Connect a slot to the signal.
      *
      * @param slot - The slot to invoke when the signal is emitted.
      *
      * @param thisArg - The `this` context for the slot. If provided,
      *   this must be a non-primitive object.
      *
      * @returns `true` if the connection succeeds, `false` otherwise.
      *
      * #### Notes
      * Slots are invoked in the order in which they are connected.
      *
      * Signal connections are unique. If a connection already exists for
      * the given `slot` and `thisArg`, this method returns `false`.
      *
      * A newly connected slot will not be invoked until the next time the
      * signal is emitted, even if the slot is connected while the signal
      * is dispatching.
      */
    def connect(slot: Slot[T, U]): Boolean = js.native
    def connect(slot: Slot[T, U], thisArg: Any): Boolean = js.native
    
    /**
      * Disconnect a slot from the signal.
      *
      * @param slot - The slot to disconnect from the signal.
      *
      * @param thisArg - The `this` context for the slot. If provided,
      *   this must be a non-primitive object.
      *
      * @returns `true` if the connection is removed, `false` otherwise.
      *
      * #### Notes
      * If no connection exists for the given `slot` and `thisArg`, this
      * method returns `false`.
      *
      * A disconnected slot will no longer be invoked, even if the slot
      * is disconnected while the signal is dispatching.
      */
    def disconnect(slot: Slot[T, U]): Boolean = js.native
    def disconnect(slot: Slot[T, U], thisArg: Any): Boolean = js.native
  }
  
  type Slot[T, U] = js.Function2[/* sender */ T, /* args */ U, Unit]
}
