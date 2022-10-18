package typings.hapiNes

import typings.hapiNes.anon.Code
import typings.hapiNes.hapiNesBooleans.`true`
import typings.hapiNes.libClientMod.Client.ClientConnectOptions
import typings.hapiNes.libClientMod.Client.ClientRequestOptions
import typings.hapiNes.libClientMod.Client.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClientMod {
  
  @js.native
  trait Client extends StObject {
    
    def connect(): js.Promise[Any] = js.native
    def connect(options: ClientConnectOptions): js.Promise[Any] = js.native
    
    def disconnect(): js.Promise[Any] = js.native
    
    var id: Any = js.native
    
    def message(message: Any): js.Promise[Any] = js.native
    
    def onConnect(): Unit = js.native
    
    def onDisconnect(willReconnect: Boolean, log: Code): Unit = js.native
    
    def onError(err: Any): Unit = js.native
    
    def onUpdate(message: Any): Unit = js.native
    
    def overrideReconnectionAuth(auth: Any): Unit = js.native
    
    def reauthenticate(auth: Any): js.Promise[`true`] = js.native
    
    // can be `null | number` but also the "socket" value from websocket message data.
    def request(options: String): js.Promise[Any] = js.native
    def request(options: ClientRequestOptions): js.Promise[Any] = js.native
    
    def subscribe(path: String, handler: Handler): js.Promise[Any] = js.native
    
    def subscriptions(): js.Array[String] = js.native
    
    def unsubscribe(path: String): js.Promise[Any] = js.native
    def unsubscribe(path: String, handler: Handler): js.Promise[Any] = js.native
  }
  object Client {
    
    trait ClientConnectOptions extends StObject {
      
      var auth: js.UndefOr[Any] = js.undefined
      
      var delay: js.UndefOr[Double] = js.undefined
      
      var maxDelay: js.UndefOr[Double] = js.undefined
      
      var retries: js.UndefOr[Double] = js.undefined
      
      var timeout: js.UndefOr[Double] = js.undefined
    }
    object ClientConnectOptions {
      
      inline def apply(): ClientConnectOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ClientConnectOptions]
      }
      
      extension [Self <: ClientConnectOptions](x: Self) {
        
        inline def setAuth(value: Any): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
        
        inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
        
        inline def setMaxDelay(value: Double): Self = StObject.set(x, "maxDelay", value.asInstanceOf[js.Any])
        
        inline def setMaxDelayUndefined: Self = StObject.set(x, "maxDelay", js.undefined)
        
        inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
        
        inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
        
        inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      }
    }
    
    trait ClientOptions extends StObject {
      
      var timeout: js.UndefOr[Double | Boolean] = js.undefined
      
      var ws: js.UndefOr[Any] = js.undefined
    }
    object ClientOptions {
      
      inline def apply(): ClientOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ClientOptions]
      }
      
      extension [Self <: ClientOptions](x: Self) {
        
        inline def setTimeout(value: Double | Boolean): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
        
        inline def setWs(value: Any): Self = StObject.set(x, "ws", value.asInstanceOf[js.Any])
        
        inline def setWsUndefined: Self = StObject.set(x, "ws", js.undefined)
      }
    }
    
    trait ClientRequestOptions extends StObject {
      
      var headers: js.UndefOr[js.Object] = js.undefined
      
      var method: js.UndefOr[String] = js.undefined
      
      var path: String
      
      var payload: js.UndefOr[Any] = js.undefined
    }
    object ClientRequestOptions {
      
      inline def apply(path: String): ClientRequestOptions = {
        val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
        __obj.asInstanceOf[ClientRequestOptions]
      }
      
      extension [Self <: ClientRequestOptions](x: Self) {
        
        inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
        
        inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      }
    }
    
    trait ClientSubscribeFlags extends StObject {
      
      var revoked: js.UndefOr[Boolean] = js.undefined
    }
    object ClientSubscribeFlags {
      
      inline def apply(): ClientSubscribeFlags = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ClientSubscribeFlags]
      }
      
      extension [Self <: ClientSubscribeFlags](x: Self) {
        
        inline def setRevoked(value: Boolean): Self = StObject.set(x, "revoked", value.asInstanceOf[js.Any])
        
        inline def setRevokedUndefined: Self = StObject.set(x, "revoked", js.undefined)
      }
    }
    
    type Handler = js.Function2[/* message */ Any, /* flags */ ClientSubscribeFlags, Unit]
  }
}
