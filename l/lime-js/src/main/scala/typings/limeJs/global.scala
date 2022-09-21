package typings.limeJs

import typings.limeJs.mod.Session
import typings.limeJs.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Lime {
    
    @JSGlobal("Lime.Authentication")
    @js.native
    open class Authentication ()
      extends typings.limeJs.mod.Authentication
    object Authentication {
      
      @JSGlobal("Lime.Authentication")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Lime.Authentication.guest")
      @js.native
      def guest: String = js.native
      inline def guest_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("guest")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Lime.Authentication.key")
      @js.native
      def key: String = js.native
      inline def key_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("key")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Lime.Authentication.plain")
      @js.native
      def plain: String = js.native
      inline def plain_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plain")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Lime.Authentication.transport")
      @js.native
      def transport: String = js.native
      inline def transport_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transport")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Lime.Channel")
    @js.native
    open class Channel protected ()
      extends typings.limeJs.mod.Channel {
      def this(transport: Transport, autoReplyPings: Boolean, autoNotifyReceipt: Boolean) = this()
    }
    
    @JSGlobal("Lime.ClientChannel")
    @js.native
    open class ClientChannel protected ()
      extends typings.limeJs.mod.ClientChannel {
      def this(transport: Transport) = this()
      def this(transport: Transport, autoReplyPings: Boolean) = this()
      def this(transport: Transport, autoReplyPings: Boolean, autoNotifyReceipt: Boolean) = this()
      def this(transport: Transport, autoReplyPings: Unit, autoNotifyReceipt: Boolean) = this()
    }
    
    @JSGlobal("Lime.ClientChannelExtensions")
    @js.native
    open class ClientChannelExtensions ()
      extends typings.limeJs.mod.ClientChannelExtensions
    object ClientChannelExtensions {
      
      @JSGlobal("Lime.ClientChannelExtensions")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def establishSession(
        clientChannel: typings.limeJs.mod.ClientChannel,
        compression: String,
        encryption: String,
        identity: String,
        authentication: typings.limeJs.mod.Authentication,
        instance: String,
        callback: js.Function2[/* error */ js.Error, /* session */ Session, Any]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("establishSession")(clientChannel.asInstanceOf[js.Any], compression.asInstanceOf[js.Any], encryption.asInstanceOf[js.Any], identity.asInstanceOf[js.Any], authentication.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    @JSGlobal("Lime.CommandMethod")
    @js.native
    open class CommandMethod ()
      extends typings.limeJs.mod.CommandMethod
    object CommandMethod {
      
      @JSGlobal("Lime.CommandMethod")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Lime.CommandMethod.delete")
      @js.native
      def delete: String = js.native
      inline def delete_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delete")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Lime.CommandMethod.get")
      @js.native
      def get: String = js.native
      inline def get_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Lime.CommandMethod.observe")
      @js.native
      def observe: String = js.native
      inline def observe_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("observe")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Lime.CommandMethod.set")
      @js.native
      def set: String = js.native
      inline def set_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Lime.CommandMethod.subscribe")
      @js.native
      def subscribe: String = js.native
      inline def subscribe_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Lime.CommandStatus")
    @js.native
    open class CommandStatus ()
      extends typings.limeJs.mod.CommandStatus
    object CommandStatus {
      
      @JSGlobal("Lime.CommandStatus")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Lime.CommandStatus.failure")
      @js.native
      def failure: String = js.native
      inline def failure_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("failure")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Lime.CommandStatus.success")
      @js.native
      def success: String = js.native
      inline def success_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("success")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Lime.GuestAuthentication")
    @js.native
    open class GuestAuthentication ()
      extends typings.limeJs.mod.GuestAuthentication
    
    @JSGlobal("Lime.KeyAuthentication")
    @js.native
    open class KeyAuthentication ()
      extends typings.limeJs.mod.KeyAuthentication
    
    @JSGlobal("Lime.NotificationEvent")
    @js.native
    open class NotificationEvent ()
      extends typings.limeJs.mod.NotificationEvent
    object NotificationEvent {
      
      @JSGlobal("Lime.NotificationEvent")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Lime.NotificationEvent.accepted")
      @js.native
      def accepted: String = js.native
      inline def accepted_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accepted")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Lime.NotificationEvent.authorized")
      @js.native
      def authorized: String = js.native
      inline def authorized_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("authorized")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Lime.NotificationEvent.consumed")
      @js.native
      def consumed: String = js.native
      inline def consumed_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("consumed")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Lime.NotificationEvent.dispatched")
      @js.native
      def dispatched: String = js.native
      inline def dispatched_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dispatched")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Lime.NotificationEvent.received")
      @js.native
      def received: String = js.native
      inline def received_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("received")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Lime.NotificationEvent.validated")
      @js.native
      def validated: String = js.native
      inline def validated_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validated")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Lime.PlainAuthentication")
    @js.native
    open class PlainAuthentication ()
      extends typings.limeJs.mod.PlainAuthentication
    
    @JSGlobal("Lime.SessionCompression")
    @js.native
    open class SessionCompression ()
      extends typings.limeJs.mod.SessionCompression
    object SessionCompression {
      
      @JSGlobal("Lime.SessionCompression")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Lime.SessionCompression.gzip")
      @js.native
      def gzip: String = js.native
      inline def gzip_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gzip")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Lime.SessionCompression.none")
      @js.native
      def none: String = js.native
      inline def none_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Lime.SessionEncryption")
    @js.native
    open class SessionEncryption ()
      extends typings.limeJs.mod.SessionEncryption
    object SessionEncryption {
      
      @JSGlobal("Lime.SessionEncryption")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Lime.SessionEncryption.none")
      @js.native
      def none: String = js.native
      inline def none_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Lime.SessionEncryption.tls")
      @js.native
      def tls: String = js.native
      inline def tls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tls")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Lime.SessionState")
    @js.native
    open class SessionState ()
      extends typings.limeJs.mod.SessionState
    object SessionState {
      
      @JSGlobal("Lime.SessionState")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Lime.SessionState.authenticating")
      @js.native
      def authenticating: String = js.native
      inline def authenticating_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("authenticating")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Lime.SessionState.established")
      @js.native
      def established: String = js.native
      inline def established_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("established")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Lime.SessionState.failed")
      @js.native
      def failed: String = js.native
      inline def failed_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("failed")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Lime.SessionState.finished")
      @js.native
      def finished: String = js.native
      inline def finished_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("finished")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Lime.SessionState.finishing")
      @js.native
      def finishing: String = js.native
      inline def finishing_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("finishing")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Lime.SessionState.negotiating")
      @js.native
      def negotiating: String = js.native
      inline def negotiating_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("negotiating")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Lime.SessionState.new")
      @js.native
      val `new`: String = js.native
    }
    
    @JSGlobal("Lime.TransportAuthentication")
    @js.native
    open class TransportAuthentication ()
      extends typings.limeJs.mod.TransportAuthentication
    
    @JSGlobal("Lime.WebSocketTransport")
    @js.native
    open class WebSocketTransport ()
      extends typings.limeJs.mod.WebSocketTransport {
      def this(traceEnabled: Boolean) = this()
    }
  }
}
