package typings.jssip

import typings.events.mod.EventEmitter
import typings.jssip.anon.PartialMessageEventMap
import typings.jssip.jssipStrings.failed
import typings.jssip.jssipStrings.succeeded
import typings.jssip.libConstantsMod.causes
import typings.jssip.libNameAddrHeaderMod.NameAddrHeader
import typings.jssip.libRtcsessionMod.ExtraHeaders
import typings.jssip.libRtcsessionMod.Originator
import typings.jssip.libRtcsessionMod.OutgoingEvent
import typings.jssip.libRtcsessionMod.OutgoingListener
import typings.jssip.libRtcsessionMod.SessionDirection
import typings.jssip.libRtcsessionMod.TerminateOptions
import typings.jssip.libSipmessageMod.IncomingResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMessageMod {
  
  @JSImport("jssip/lib/Message", "Message")
  @js.native
  open class Message () extends EventEmitter {
    
    def accept(options: AcceptOptions): Unit = js.native
    
    def direction: SessionDirection = js.native
    
    def local_identity: NameAddrHeader = js.native
    
    @JSName("on")
    def on_failed(`type`: failed, listener: MessageFailedListener): this.type = js.native
    @JSName("on")
    def on_succeeded(`type`: succeeded, listener: OutgoingListener): this.type = js.native
    
    def reject(options: TerminateOptions): Unit = js.native
    
    def remote_identity: NameAddrHeader = js.native
    
    def send(target: String, body: String): Unit = js.native
    def send(target: String, body: String, options: SendMessageOptions): Unit = js.native
  }
  
  trait AcceptOptions
    extends StObject
       with ExtraHeaders {
    
    var body: js.UndefOr[String] = js.undefined
  }
  object AcceptOptions {
    
    inline def apply(): AcceptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AcceptOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AcceptOptions] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    }
  }
  
  trait MessageEventMap extends StObject {
    
    def failed(event: MessageFailedEvent): Unit
    @JSName("failed")
    var failed_Original: MessageFailedListener
    
    def succeeded(event: OutgoingEvent): Unit
    @JSName("succeeded")
    var succeeded_Original: OutgoingListener
  }
  object MessageEventMap {
    
    inline def apply(failed: /* event */ MessageFailedEvent => Unit, succeeded: /* event */ OutgoingEvent => Unit): MessageEventMap = {
      val __obj = js.Dynamic.literal(failed = js.Any.fromFunction1(failed), succeeded = js.Any.fromFunction1(succeeded))
      __obj.asInstanceOf[MessageEventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageEventMap] (val x: Self) extends AnyVal {
      
      inline def setFailed(value: /* event */ MessageFailedEvent => Unit): Self = StObject.set(x, "failed", js.Any.fromFunction1(value))
      
      inline def setSucceeded(value: /* event */ OutgoingEvent => Unit): Self = StObject.set(x, "succeeded", js.Any.fromFunction1(value))
    }
  }
  
  trait MessageFailedEvent extends StObject {
    
    var cause: js.UndefOr[causes] = js.undefined
    
    var originator: Originator
    
    var response: IncomingResponse
  }
  object MessageFailedEvent {
    
    inline def apply(originator: Originator, response: IncomingResponse): MessageFailedEvent = {
      val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageFailedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageFailedEvent] (val x: Self) extends AnyVal {
      
      inline def setCause(value: causes): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      inline def setOriginator(value: Originator): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: IncomingResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  type MessageFailedListener = js.Function1[/* event */ MessageFailedEvent, Unit]
  
  trait SendMessageOptions
    extends StObject
       with ExtraHeaders {
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var eventHandlers: js.UndefOr[PartialMessageEventMap] = js.undefined
    
    var fromDisplayName: js.UndefOr[String] = js.undefined
    
    var fromUserName: js.UndefOr[String] = js.undefined
  }
  object SendMessageOptions {
    
    inline def apply(): SendMessageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SendMessageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SendMessageOptions] (val x: Self) extends AnyVal {
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setEventHandlers(value: PartialMessageEventMap): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
      
      inline def setEventHandlersUndefined: Self = StObject.set(x, "eventHandlers", js.undefined)
      
      inline def setFromDisplayName(value: String): Self = StObject.set(x, "fromDisplayName", value.asInstanceOf[js.Any])
      
      inline def setFromDisplayNameUndefined: Self = StObject.set(x, "fromDisplayName", js.undefined)
      
      inline def setFromUserName(value: String): Self = StObject.set(x, "fromUserName", value.asInstanceOf[js.Any])
      
      inline def setFromUserNameUndefined: Self = StObject.set(x, "fromUserName", js.undefined)
    }
  }
}
