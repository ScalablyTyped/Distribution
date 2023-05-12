package typings.luminoMessaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lumino/messaging", "ConflatableMessage")
  @js.native
  open class ConflatableMessage protected () extends Message {
    /**
      * Construct a new message.
      *
      * @param type - The type of the message.
      */
    def this(`type`: String) = this()
    
    /**
      * Conflate this message with another message of the same `type`.
      *
      * #### Notes
      * This method always returns `true`.
      */
    def conflate(other: ConflatableMessage): Boolean = js.native
  }
  
  @JSImport("@lumino/messaging", "Message")
  @js.native
  open class Message protected () extends StObject {
    /**
      * Construct a new message.
      *
      * @param type - The type of the message.
      */
    def this(`type`: String) = this()
    
    /**
      * Conflate this message with another message of the same `type`.
      *
      * @param other - A conflatable message of the same `type`.
      *
      * @returns `true` if the message was successfully conflated, or
      *   `false` otherwise.
      *
      * #### Notes
      * Message conflation is an advanced topic. Most message types will
      * not make use of this feature.
      *
      * This method is called automatically by the message loop when the
      * given message is posted to the handler paired with this message.
      * This message will already be enqueued and conflatable, and the
      * given message will have the same `type` and also be conflatable.
      *
      * This method should merge the state of the other message into this
      * message as needed so that when this message is finally delivered
      * to the handler, it receives the most up-to-date information.
      *
      * If this method returns `true`, it signals that the other message
      * was successfully conflated and that message will not be enqueued.
      *
      * If this method returns `false`, the other message will be enqueued
      * for normal delivery.
      *
      * Custom message types may reimplement this method.
      *
      * The default implementation always returns `false`.
      */
    def conflate(other: Message): Boolean = js.native
    
    /**
      * Test whether the message is conflatable.
      *
      * #### Notes
      * Message conflation is an advanced topic. Most message types will
      * not make use of this feature.
      *
      * If a conflatable message is posted to a handler while another
      * conflatable message of the same `type` has already been posted
      * to the handler, the `conflate()` method of the existing message
      * will be invoked. If that method returns `true`, the new message
      * will not be enqueued. This allows messages to be compressed, so
      * that only a single instance of the message type is processed per
      * cycle, no matter how many times messages of that type are posted.
      *
      * Custom message types may reimplement this property.
      *
      * The default implementation is always `false`.
      */
    def isConflatable: Boolean = js.native
    
    /**
      * The type of the message.
      *
      * #### Notes
      * The `type` of a message should be related directly to its actual
      * runtime type. This means that `type` can and will be used to cast
      * the message to the relevant derived `Message` subtype.
      */
    val `type`: String = js.native
  }
  
  object MessageLoop {
    
    @JSImport("@lumino/messaging", "MessageLoop")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Clear all message data associated with a message handler.
      *
      * @param handler - The message handler of interest.
      *
      * #### Notes
      * This will clear all posted messages and hooks for the handler.
      */
    inline def clearData(handler: IMessageHandler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearData")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Process the pending posted messages in the queue immediately.
      *
      * #### Notes
      * This function is useful when posted messages must be processed immediately.
      *
      * This function should normally not be needed, but it may be
      * required to work around certain browser idiosyncrasies.
      *
      * Recursing into this function is a no-op.
      */
    inline def flush(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[Unit]
    
    /**
      * Get the message loop exception handler.
      *
      * @returns The current exception handler.
      *
      * #### Notes
      * The default exception handler is `console.error`.
      */
    inline def getExceptionHandler(): ExceptionHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("getExceptionHandler")().asInstanceOf[ExceptionHandler]
    
    /**
      * Install a message hook for a message handler.
      *
      * @param handler - The message handler of interest.
      *
      * @param hook - The message hook to install.
      *
      * #### Notes
      * A message hook is invoked before a message is delivered to the
      * handler. If the hook returns `false`, no other hooks will be
      * invoked and the message will not be delivered to the handler.
      *
      * The most recently installed message hook is executed first.
      *
      * If the hook is already installed, this is a no-op.
      */
    inline def installMessageHook(handler: IMessageHandler, hook: MessageHook): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("installMessageHook")(handler.asInstanceOf[js.Any], hook.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Post a message to a message handler to process in the future.
      *
      * @param handler - The handler which should process the message.
      *
      * @param msg - The message to post to the handler.
      *
      * #### Notes
      * The message will be conflated with the pending posted messages for
      * the handler, if possible. If the message is not conflated, it will
      * be queued for normal delivery on the next cycle of the event loop.
      *
      * Exceptions in hooks and handlers will be caught and logged.
      */
    inline def postMessage(handler: IMessageHandler, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("postMessage")(handler.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Remove an installed message hook for a message handler.
      *
      * @param handler - The message handler of interest.
      *
      * @param hook - The message hook to remove.
      *
      * #### Notes
      * It is safe to call this function while the hook is executing.
      *
      * If the hook is not installed, this is a no-op.
      */
    inline def removeMessageHook(handler: IMessageHandler, hook: MessageHook): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeMessageHook")(handler.asInstanceOf[js.Any], hook.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Send a message to a message handler to process immediately.
      *
      * @param handler - The handler which should process the message.
      *
      * @param msg - The message to deliver to the handler.
      *
      * #### Notes
      * The message will first be sent through any installed message hooks
      * for the handler. If the message passes all hooks, it will then be
      * delivered to the `processMessage` method of the handler.
      *
      * The message will not be conflated with pending posted messages.
      *
      * Exceptions in hooks and handlers will be caught and logged.
      */
    inline def sendMessage(handler: IMessageHandler, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(handler.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Set the message loop exception handler.
      *
      * @param handler - The function to use as the exception handler.
      *
      * @returns The old exception handler.
      *
      * #### Notes
      * The exception handler is invoked when a message handler or a
      * message hook throws an exception.
      */
    inline def setExceptionHandler(handler: ExceptionHandler): ExceptionHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("setExceptionHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[ExceptionHandler]
    
    /**
      * A type alias for the exception handler function.
      */
    type ExceptionHandler = js.Function1[/* err */ js.Error, Unit]
  }
  
  trait IMessageHandler extends StObject {
    
    /**
      * Process a message sent to the handler.
      *
      * @param msg - The message to be processed.
      */
    def processMessage(msg: Message): Unit
  }
  object IMessageHandler {
    
    inline def apply(processMessage: Message => Unit): IMessageHandler = {
      val __obj = js.Dynamic.literal(processMessage = js.Any.fromFunction1(processMessage))
      __obj.asInstanceOf[IMessageHandler]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IMessageHandler] (val x: Self) extends AnyVal {
      
      inline def setProcessMessage(value: Message => Unit): Self = StObject.set(x, "processMessage", js.Any.fromFunction1(value))
    }
  }
  
  trait IMessageHook extends StObject {
    
    /**
      * Intercept a message sent to a message handler.
      *
      * @param handler - The target handler of the message.
      *
      * @param msg - The message to be sent to the handler.
      *
      * @returns `true` if the message should continue to be processed
      *   as normal, or `false` if processing should cease immediately.
      */
    def messageHook(handler: IMessageHandler, msg: Message): Boolean
  }
  object IMessageHook {
    
    inline def apply(messageHook: (IMessageHandler, Message) => Boolean): IMessageHook = {
      val __obj = js.Dynamic.literal(messageHook = js.Any.fromFunction2(messageHook))
      __obj.asInstanceOf[IMessageHook]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IMessageHook] (val x: Self) extends AnyVal {
      
      inline def setMessageHook(value: (IMessageHandler, Message) => Boolean): Self = StObject.set(x, "messageHook", js.Any.fromFunction2(value))
    }
  }
  
  type MessageHook = IMessageHook | (js.Function2[/* handler */ IMessageHandler, /* msg */ Message, Boolean])
}
