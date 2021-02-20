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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@hapi/nes", JSImport.Namespace)
  @js.native
  val ^ : NesClassExports with Plugin[js.Object] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@hapi/nes", "Client")
  @js.native
  class ClientCls protected ()
    extends typings.hapiNes.clientMod.Client {
    def this(url: String) = this()
    def this(url: String, options: typings.hapiNes.clientMod.Client.ClientOptions) = this()
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
  type Client = typings.hapiNes.clientMod.Client
  
  type ClientConnectOptions = typings.hapiNes.clientMod.Client.ClientConnectOptions
  
  type ClientOptions = typings.hapiNes.clientMod.Client.ClientOptions
  
  type ClientRequestOptions = typings.hapiNes.clientMod.Client.ClientRequestOptions
  
  type ClientSubscribeFlags = typings.hapiNes.clientMod.Client.ClientSubscribeFlags
  
  type Handler = typings.hapiNes.clientMod.Client.Handler
  
  @js.native
  trait NesClassExports extends StObject {
    
    var Client: Instantiable = js.native
  }
  object NesClassExports {
    
    @scala.inline
    def apply(Client: Instantiable): NesClassExports = {
      val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any])
      __obj.asInstanceOf[NesClassExports]
    }
    
    @scala.inline
    implicit class NesClassExportsMutableBuilder[Self <: NesClassExports] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: Instantiable): Self = StObject.set(x, "Client", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ServerBroadcastOptions extends StObject {
    
    var user: js.Any = js.native
  }
  object ServerBroadcastOptions {
    
    @scala.inline
    def apply(user: js.Any): ServerBroadcastOptions = {
      val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerBroadcastOptions]
    }
    
    @scala.inline
    implicit class ServerBroadcastOptionsMutableBuilder[Self <: ServerBroadcastOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUser(value: js.Any): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ServerEachSocketOptions extends StObject {
    
    var subscription: js.UndefOr[String] = js.native
    
    var user: js.UndefOr[js.Any] = js.native
  }
  object ServerEachSocketOptions {
    
    @scala.inline
    def apply(): ServerEachSocketOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerEachSocketOptions]
    }
    
    @scala.inline
    implicit class ServerEachSocketOptionsMutableBuilder[Self <: ServerEachSocketOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
      
      @scala.inline
      def setUser(value: js.Any): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  type ServerOnSubscribe = ServerOnSubscribeWithParams | ServerOnSubscribeWithoutParams
  
  type ServerOnSubscribeWithParams = js.Function3[/* socket */ Socket, /* path */ String, /* params */ js.Any, js.Promise[js.Any]]
  
  type ServerOnSubscribeWithoutParams = js.Function2[/* socket */ Socket, /* path */ String, js.Promise[js.Any]]
  
  type ServerOnUnSubscribe = ServerOnUnSubscribeWithParams | ServerOnUnSubscribeWithoutParams
  
  type ServerOnUnSubscribeWithParams = js.Function3[/* socket */ Socket, /* path */ String, /* params */ js.Any, Unit]
  
  type ServerOnUnSubscribeWithoutParams = js.Function2[/* socket */ Socket, /* path */ String, Unit]
  
  @js.native
  trait ServerPublishOptions extends StObject {
    
    var internal: js.UndefOr[js.Any] = js.native
    
    var user: js.UndefOr[js.Any] = js.native
  }
  object ServerPublishOptions {
    
    @scala.inline
    def apply(): ServerPublishOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerPublishOptions]
    }
    
    @scala.inline
    implicit class ServerPublishOptionsMutableBuilder[Self <: ServerPublishOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInternal(value: js.Any): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
      
      @scala.inline
      def setUser(value: js.Any): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  @js.native
  trait ServerSubscriptionOptions extends StObject {
    
    var auth: js.UndefOr[Boolean | ServerSubscriptionOptionsAuthOptions] = js.native
    
    var filter: js.UndefOr[
        js.Function4[
          /* path */ String, 
          /* message */ js.Any, 
          /* options */ ServerSubscriptionOptionsFilterOptions, 
          /* next */ js.Function2[/* isMatch */ Boolean, /* override */ js.UndefOr[js.Any], Unit], 
          Unit
        ]
      ] = js.native
    
    var onSubscribe: js.UndefOr[ServerOnSubscribe] = js.native
    
    var onUnsubscribe: js.UndefOr[ServerOnUnSubscribe] = js.native
  }
  object ServerSubscriptionOptions {
    
    @scala.inline
    def apply(): ServerSubscriptionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerSubscriptionOptions]
    }
    
    @scala.inline
    implicit class ServerSubscriptionOptionsMutableBuilder[Self <: ServerSubscriptionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: Boolean | ServerSubscriptionOptionsAuthOptions): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setFilter(
        value: (/* path */ String, /* message */ js.Any, /* options */ ServerSubscriptionOptionsFilterOptions, /* next */ js.Function2[/* isMatch */ Boolean, /* override */ js.UndefOr[js.Any], Unit]) => Unit
      ): Self = StObject.set(x, "filter", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setOnSubscribe(value: ServerOnSubscribe): Self = StObject.set(x, "onSubscribe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSubscribeFunction2(value: (/* socket */ Socket, /* path */ String) => js.Promise[js.Any]): Self = StObject.set(x, "onSubscribe", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSubscribeFunction3(value: (/* socket */ Socket, /* path */ String, /* params */ js.Any) => js.Promise[js.Any]): Self = StObject.set(x, "onSubscribe", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnSubscribeUndefined: Self = StObject.set(x, "onSubscribe", js.undefined)
      
      @scala.inline
      def setOnUnsubscribe(value: ServerOnUnSubscribe): Self = StObject.set(x, "onUnsubscribe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUnsubscribeFunction2(value: (/* socket */ Socket, /* path */ String) => Unit): Self = StObject.set(x, "onUnsubscribe", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnUnsubscribeFunction3(value: (/* socket */ Socket, /* path */ String, /* params */ js.Any) => Unit): Self = StObject.set(x, "onUnsubscribe", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnUnsubscribeUndefined: Self = StObject.set(x, "onUnsubscribe", js.undefined)
    }
  }
  
  @js.native
  trait ServerSubscriptionOptionsAuthOptions extends StObject {
    
    var entity: js.UndefOr[user | app | any] = js.native
    
    var index: js.UndefOr[Boolean] = js.native
    
    var mode: js.UndefOr[required | optional] = js.native
    
    var scope: js.UndefOr[String | js.Array[String]] = js.native
  }
  object ServerSubscriptionOptionsAuthOptions {
    
    @scala.inline
    def apply(): ServerSubscriptionOptionsAuthOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerSubscriptionOptionsAuthOptions]
    }
    
    @scala.inline
    implicit class ServerSubscriptionOptionsAuthOptionsMutableBuilder[Self <: ServerSubscriptionOptionsAuthOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntity(value: user | app | any): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
      
      @scala.inline
      def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setMode(value: required | optional): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ServerSubscriptionOptionsFilterOptions extends StObject {
    
    var credentials: js.UndefOr[js.Any] = js.native
    
    var params: js.UndefOr[js.Any] = js.native
    
    var socket: Socket = js.native
  }
  object ServerSubscriptionOptionsFilterOptions {
    
    @scala.inline
    def apply(socket: Socket): ServerSubscriptionOptionsFilterOptions = {
      val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerSubscriptionOptionsFilterOptions]
    }
    
    @scala.inline
    implicit class ServerSubscriptionOptionsFilterOptionsMutableBuilder[Self <: ServerSubscriptionOptionsFilterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCredentials(value: js.Any): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Socket extends StObject {
    
    var app: js.Object = js.native
    
    var auth: SocketAuthObject = js.native
    
    def disconnect(): js.Promise[_] = js.native
    
    var id: String = js.native
    
    def publish(path: String, message: js.Any): js.Promise[_] = js.native
    
    def revoke(path: String, message: js.Any): js.Promise[_] = js.native
    
    def send(message: js.Any): js.Promise[_] = js.native
  }
  object Socket {
    
    @scala.inline
    def apply(
      app: js.Object,
      auth: SocketAuthObject,
      disconnect: () => js.Promise[_],
      id: String,
      publish: (String, js.Any) => js.Promise[_],
      revoke: (String, js.Any) => js.Promise[_],
      send: js.Any => js.Promise[_]
    ): Socket = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], auth = auth.asInstanceOf[js.Any], disconnect = js.Any.fromFunction0(disconnect), id = id.asInstanceOf[js.Any], publish = js.Any.fromFunction2(publish), revoke = js.Any.fromFunction2(revoke), send = js.Any.fromFunction1(send))
      __obj.asInstanceOf[Socket]
    }
    
    @scala.inline
    implicit class SocketMutableBuilder[Self <: Socket] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp(value: js.Object): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuth(value: SocketAuthObject): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisconnect(value: () => js.Promise[_]): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublish(value: (String, js.Any) => js.Promise[_]): Self = StObject.set(x, "publish", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRevoke(value: (String, js.Any) => js.Promise[_]): Self = StObject.set(x, "revoke", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSend(value: js.Any => js.Promise[_]): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait SocketAuthObject extends StObject {
    
    var artifacts: js.Any = js.native
    
    var credentials: js.Any = js.native
    
    var isAuthenticated: Boolean = js.native
  }
  object SocketAuthObject {
    
    @scala.inline
    def apply(artifacts: js.Any, credentials: js.Any, isAuthenticated: Boolean): SocketAuthObject = {
      val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], isAuthenticated = isAuthenticated.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketAuthObject]
    }
    
    @scala.inline
    implicit class SocketAuthObjectMutableBuilder[Self <: SocketAuthObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArtifacts(value: js.Any): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentials(value: js.Any): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAuthenticated(value: Boolean): Self = StObject.set(x, "isAuthenticated", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = NesClassExports with Plugin[js.Object]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: NesClassExports with Plugin[js.Object] = ^
  
  /* augmented module */
  object hapiHapiAugmentingMod {
    
    @js.native
    trait Request extends StObject {
      
      var socket: Socket = js.native
    }
    object Request {
      
      @scala.inline
      def apply(socket: Socket): Request = {
        val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
        __obj.asInstanceOf[Request]
      }
      
      @scala.inline
      implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Server extends StObject {
      
      def broadcast(message: js.Any): Unit = js.native
      def broadcast(message: js.Any, options: ServerBroadcastOptions): Unit = js.native
      
      def eachSocket(each: js.Function1[/* socket */ Socket, Unit]): Unit = js.native
      def eachSocket(each: js.Function1[/* socket */ Socket, Unit], options: ServerEachSocketOptions): Unit = js.native
      
      def publish(path: String, message: js.Any): Unit = js.native
      def publish(path: String, message: js.Any, options: ServerPublishOptions): Unit = js.native
      
      def subscription(path: String): Unit = js.native
      def subscription(path: String, options: ServerSubscriptionOptions): Unit = js.native
    }
  }
}
