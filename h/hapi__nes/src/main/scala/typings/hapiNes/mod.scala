package typings.hapiNes

import org.scalablytyped.runtime.Shortcut
import typings.hapiHapi.mod.Plugin
import typings.hapiNes.anon.Instantiable
import typings.hapiNes.hapiNesStrings.any
import typings.hapiNes.hapiNesStrings.app
import typings.hapiNes.hapiNesStrings.optional
import typings.hapiNes.hapiNesStrings.required
import typings.hapiNes.hapiNesStrings.user
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@hapi/nes", JSImport.Namespace)
  @js.native
  val ^ : NesClassExports & Plugin[js.Object] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@hapi/nes", "Client")
  @js.native
  open class ClientCls protected ()
    extends typings.hapiNes.libClientMod.Client {
    def this(url: String) = this()
    def this(url: String, options: typings.hapiNes.libClientMod.Client.ClientOptions) = this()
  }
  
  /**
    * TODO (if possible) use a drier, more robust way of doing this that
    * allows for:
    *      * the export to have be of type Hapi.PluginFunction whilst
    *      * also exposing the Client type
    *      * exporting the NesClient as the Client class without having to
    *          duplicate the constructor definition
    *      * and all the type exports from the NesClient namespace (Handler,
    *          ClientOptions, ClientConnectOptions, ClientRequestOptions,
    *          ClientSubscribeFlags)
    */
  type Client = typings.hapiNes.libClientMod.Client
  
  type ClientConnectOptions = typings.hapiNes.libClientMod.Client.ClientConnectOptions
  
  type ClientOptions = typings.hapiNes.libClientMod.Client.ClientOptions
  
  type ClientRequestOptions = typings.hapiNes.libClientMod.Client.ClientRequestOptions
  
  type ClientSubscribeFlags = typings.hapiNes.libClientMod.Client.ClientSubscribeFlags
  
  type Handler = typings.hapiNes.libClientMod.Client.Handler
  
  trait NesClassExports extends StObject {
    
    var Client: Instantiable
  }
  object NesClassExports {
    
    inline def apply(Client: Instantiable): NesClassExports = {
      val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any])
      __obj.asInstanceOf[NesClassExports]
    }
    
    extension [Self <: NesClassExports](x: Self) {
      
      inline def setClient(value: Instantiable): Self = StObject.set(x, "Client", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServerBroadcastOptions extends StObject {
    
    var user: Any
  }
  object ServerBroadcastOptions {
    
    inline def apply(user: Any): ServerBroadcastOptions = {
      val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerBroadcastOptions]
    }
    
    extension [Self <: ServerBroadcastOptions](x: Self) {
      
      inline def setUser(value: Any): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServerEachSocketOptions extends StObject {
    
    var subscription: js.UndefOr[String] = js.undefined
    
    var user: js.UndefOr[Any] = js.undefined
  }
  object ServerEachSocketOptions {
    
    inline def apply(): ServerEachSocketOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerEachSocketOptions]
    }
    
    extension [Self <: ServerEachSocketOptions](x: Self) {
      
      inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
      
      inline def setUser(value: Any): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  type ServerOnSubscribe = ServerOnSubscribeWithParams | ServerOnSubscribeWithoutParams
  
  type ServerOnSubscribeWithParams = js.Function3[/* socket */ Socket, /* path */ String, /* params */ Any, js.Promise[Any]]
  
  type ServerOnSubscribeWithoutParams = js.Function2[/* socket */ Socket, /* path */ String, js.Promise[Any]]
  
  type ServerOnUnSubscribe = ServerOnUnSubscribeWithParams | ServerOnUnSubscribeWithoutParams
  
  type ServerOnUnSubscribeWithParams = js.Function3[/* socket */ Socket, /* path */ String, /* params */ Any, Unit]
  
  type ServerOnUnSubscribeWithoutParams = js.Function2[/* socket */ Socket, /* path */ String, Unit]
  
  trait ServerPublishOptions extends StObject {
    
    var internal: js.UndefOr[Any] = js.undefined
    
    var user: js.UndefOr[Any] = js.undefined
  }
  object ServerPublishOptions {
    
    inline def apply(): ServerPublishOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerPublishOptions]
    }
    
    extension [Self <: ServerPublishOptions](x: Self) {
      
      inline def setInternal(value: Any): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
      
      inline def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
      
      inline def setUser(value: Any): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait ServerSubscriptionOptions extends StObject {
    
    var auth: js.UndefOr[Boolean | ServerSubscriptionOptionsAuthOptions] = js.undefined
    
    var filter: js.UndefOr[
        js.Function4[
          /* path */ String, 
          /* message */ Any, 
          /* options */ ServerSubscriptionOptionsFilterOptions, 
          /* next */ js.Function2[/* isMatch */ Boolean, /* override */ js.UndefOr[Any], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var onSubscribe: js.UndefOr[ServerOnSubscribe] = js.undefined
    
    var onUnsubscribe: js.UndefOr[ServerOnUnSubscribe] = js.undefined
  }
  object ServerSubscriptionOptions {
    
    inline def apply(): ServerSubscriptionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerSubscriptionOptions]
    }
    
    extension [Self <: ServerSubscriptionOptions](x: Self) {
      
      inline def setAuth(value: Boolean | ServerSubscriptionOptionsAuthOptions): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setFilter(
        value: (/* path */ String, /* message */ Any, /* options */ ServerSubscriptionOptionsFilterOptions, /* next */ js.Function2[/* isMatch */ Boolean, /* override */ js.UndefOr[Any], Unit]) => Unit
      ): Self = StObject.set(x, "filter", js.Any.fromFunction4(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setOnSubscribe(value: ServerOnSubscribe): Self = StObject.set(x, "onSubscribe", value.asInstanceOf[js.Any])
      
      inline def setOnSubscribeFunction2(value: (/* socket */ Socket, /* path */ String) => js.Promise[Any]): Self = StObject.set(x, "onSubscribe", js.Any.fromFunction2(value))
      
      inline def setOnSubscribeFunction3(value: (/* socket */ Socket, /* path */ String, /* params */ Any) => js.Promise[Any]): Self = StObject.set(x, "onSubscribe", js.Any.fromFunction3(value))
      
      inline def setOnSubscribeUndefined: Self = StObject.set(x, "onSubscribe", js.undefined)
      
      inline def setOnUnsubscribe(value: ServerOnUnSubscribe): Self = StObject.set(x, "onUnsubscribe", value.asInstanceOf[js.Any])
      
      inline def setOnUnsubscribeFunction2(value: (/* socket */ Socket, /* path */ String) => Unit): Self = StObject.set(x, "onUnsubscribe", js.Any.fromFunction2(value))
      
      inline def setOnUnsubscribeFunction3(value: (/* socket */ Socket, /* path */ String, /* params */ Any) => Unit): Self = StObject.set(x, "onUnsubscribe", js.Any.fromFunction3(value))
      
      inline def setOnUnsubscribeUndefined: Self = StObject.set(x, "onUnsubscribe", js.undefined)
    }
  }
  
  trait ServerSubscriptionOptionsAuthOptions extends StObject {
    
    var entity: js.UndefOr[user | app | any] = js.undefined
    
    var index: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[required | optional] = js.undefined
    
    var scope: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object ServerSubscriptionOptionsAuthOptions {
    
    inline def apply(): ServerSubscriptionOptionsAuthOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerSubscriptionOptionsAuthOptions]
    }
    
    extension [Self <: ServerSubscriptionOptionsAuthOptions](x: Self) {
      
      inline def setEntity(value: user | app | any): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
      
      inline def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setMode(value: required | optional): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
    }
  }
  
  trait ServerSubscriptionOptionsFilterOptions extends StObject {
    
    var credentials: js.UndefOr[Any] = js.undefined
    
    var params: js.UndefOr[Any] = js.undefined
    
    var socket: Socket
  }
  object ServerSubscriptionOptionsFilterOptions {
    
    inline def apply(socket: Socket): ServerSubscriptionOptionsFilterOptions = {
      val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerSubscriptionOptionsFilterOptions]
    }
    
    extension [Self <: ServerSubscriptionOptionsFilterOptions](x: Self) {
      
      inline def setCredentials(value: Any): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  trait Socket extends StObject {
    
    var app: js.Object
    
    var auth: SocketAuthObject
    
    def disconnect(): js.Promise[Any]
    
    var id: String
    
    def publish(path: String, message: Any): js.Promise[Any]
    
    def revoke(path: String, message: Any): js.Promise[Any]
    
    def send(message: Any): js.Promise[Any]
  }
  object Socket {
    
    inline def apply(
      app: js.Object,
      auth: SocketAuthObject,
      disconnect: () => js.Promise[Any],
      id: String,
      publish: (String, Any) => js.Promise[Any],
      revoke: (String, Any) => js.Promise[Any],
      send: Any => js.Promise[Any]
    ): Socket = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], auth = auth.asInstanceOf[js.Any], disconnect = js.Any.fromFunction0(disconnect), id = id.asInstanceOf[js.Any], publish = js.Any.fromFunction2(publish), revoke = js.Any.fromFunction2(revoke), send = js.Any.fromFunction1(send))
      __obj.asInstanceOf[Socket]
    }
    
    extension [Self <: Socket](x: Self) {
      
      inline def setApp(value: js.Object): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setAuth(value: SocketAuthObject): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setDisconnect(value: () => js.Promise[Any]): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPublish(value: (String, Any) => js.Promise[Any]): Self = StObject.set(x, "publish", js.Any.fromFunction2(value))
      
      inline def setRevoke(value: (String, Any) => js.Promise[Any]): Self = StObject.set(x, "revoke", js.Any.fromFunction2(value))
      
      inline def setSend(value: Any => js.Promise[Any]): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    }
  }
  
  trait SocketAuthObject extends StObject {
    
    var artifacts: Any
    
    var credentials: Any
    
    var isAuthenticated: Boolean
  }
  object SocketAuthObject {
    
    inline def apply(artifacts: Any, credentials: Any, isAuthenticated: Boolean): SocketAuthObject = {
      val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], isAuthenticated = isAuthenticated.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketAuthObject]
    }
    
    extension [Self <: SocketAuthObject](x: Self) {
      
      inline def setArtifacts(value: Any): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
      
      inline def setCredentials(value: Any): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setIsAuthenticated(value: Boolean): Self = StObject.set(x, "isAuthenticated", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = NesClassExports & Plugin[js.Object]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: NesClassExports & Plugin[js.Object] = ^
  
  /* augmented module */
  object hapiHapiAugmentingMod {
    
    trait Request extends StObject {
      
      var socket: Socket
    }
    object Request {
      
      inline def apply(socket: Socket): Request = {
        val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
        __obj.asInstanceOf[Request]
      }
      
      extension [Self <: Request](x: Self) {
        
        inline def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Server extends StObject {
      
      def broadcast(message: Any): Unit = js.native
      def broadcast(message: Any, options: ServerBroadcastOptions): Unit = js.native
      
      def eachSocket(each: js.Function1[/* socket */ Socket, Unit]): Unit = js.native
      def eachSocket(each: js.Function1[/* socket */ Socket, Unit], options: ServerEachSocketOptions): Unit = js.native
      
      def publish(path: String, message: Any): Unit = js.native
      def publish(path: String, message: Any, options: ServerPublishOptions): Unit = js.native
      
      def subscription(path: String): Unit = js.native
      def subscription(path: String, options: ServerSubscriptionOptions): Unit = js.native
    }
  }
}
