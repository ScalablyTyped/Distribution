package typings.hapiHapi

import org.scalablytyped.runtime.StringDictionary
import typings.hapiBoom.mod.Boom
import typings.hapiHapi.anon.Access
import typings.hapiHapi.anon.Close
import typings.hapiHapi.anon.IsOriginMatch
import typings.hapiHapi.anon.Req
import typings.hapiHapi.hapiHapiStrings.disconnect
import typings.hapiHapi.hapiHapiStrings.finish
import typings.hapiHapi.hapiHapiStrings.peek
import typings.hapiHapi.libTypesPluginMod.PluginsStates
import typings.hapiHapi.libTypesPluginMod.ServerRealm
import typings.hapiHapi.libTypesResponseMod.ResponseObject
import typings.hapiHapi.libTypesRouteMod.RouteRules
import typings.hapiHapi.libTypesRouteMod.RouteSettings
import typings.hapiHapi.libTypesServerAuthMod.ServerAuthSchemeObjectApi
import typings.hapiHapi.libTypesServerMod.Server_
import typings.hapiHapi.libTypesServerServerMod.ServerApplicationState
import typings.hapiHapi.libTypesUtilsMod.HTTP_METHODS_PARTIAL
import typings.hapiHapi.libTypesUtilsMod.HTTP_METHODS_PARTIAL_LOWERCASE
import typings.hapiHapi.libTypesUtilsMod.PeekListener
import typings.hapiPodium.mod.Podium
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import typings.node.urlMod.URL_
import typings.std.Omit
import typings.std.Parameters
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesRequestMod {
  
  trait AppCredentials extends StObject
  
  type AuthArtifacts = StringDictionary[Any]
  
  trait AuthCredentials[AuthUser /* <: js.Object */, AuthApp /* <: js.Object */] extends StObject {
    
    /**
      * If set, will only work with routes that set `access.entity` to `app`.
      */
    var app: js.UndefOr[MergeType[AppCredentials, AuthApp]] = js.undefined
    
    /**
      * The application scopes to be granted.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsauthaccessscope)
      */
    var scope: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * If set, will only work with routes that set `access.entity` to `user`.
      */
    var user: js.UndefOr[MergeType[UserCredentials, AuthUser]] = js.undefined
  }
  object AuthCredentials {
    
    inline def apply[AuthUser /* <: js.Object */, AuthApp /* <: js.Object */](): AuthCredentials[AuthUser, AuthApp] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthCredentials[AuthUser, AuthApp]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthCredentials[?, ?], AuthUser /* <: js.Object */, AuthApp /* <: js.Object */] (val x: Self & (AuthCredentials[AuthUser, AuthApp])) extends AnyVal {
      
      inline def setApp(value: MergeType[AppCredentials, AuthApp]): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      inline def setScope(value: js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
      
      inline def setUser(value: MergeType[UserCredentials, AuthUser]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.hapiHapi.hapiHapiStrings.required
    - typings.hapiHapi.hapiHapiStrings.optional
    - typings.hapiHapi.hapiHapiStrings.`try`
  */
  trait AuthMode extends StObject
  object AuthMode {
    
    inline def optional: typings.hapiHapi.hapiHapiStrings.optional = "optional".asInstanceOf[typings.hapiHapi.hapiHapiStrings.optional]
    
    inline def required: typings.hapiHapi.hapiHapiStrings.required = "required".asInstanceOf[typings.hapiHapi.hapiHapiStrings.required]
    
    inline def `try`: typings.hapiHapi.hapiHapiStrings.`try` = "try".asInstanceOf[typings.hapiHapi.hapiHapiStrings.`try`]
  }
  
  trait InternalRequestDefaults extends StObject {
    
    var AuthApi: ServerAuthSchemeObjectApi
    
    var AuthApp: AppCredentials
    
    var AuthArtifactsExtra: Record[String, Any]
    
    var AuthCredentialsExtra: Record[String, Any]
    
    var AuthUser: UserCredentials
    
    var Bind: js.Object | Null
    
    var Headers: Record[String, Any]
    
    var Params: Record[String, Any]
    
    var Payload: Readable | Buffer | String | js.Object
    
    var Pres: Record[String, Any]
    
    var Query: RequestQuery
    
    var RequestApp: RequestApplicationState
    
    var RouteApp: RouteOptionsApp
    
    var Rules: RouteRules
    
    var Server: Server_[ServerApplicationState]
  }
  object InternalRequestDefaults {
    
    inline def apply(
      AuthApi: ServerAuthSchemeObjectApi,
      AuthApp: AppCredentials,
      AuthArtifactsExtra: Record[String, Any],
      AuthCredentialsExtra: Record[String, Any],
      AuthUser: UserCredentials,
      Headers: Record[String, Any],
      Params: Record[String, Any],
      Payload: Readable | Buffer | String | js.Object,
      Pres: Record[String, Any],
      Query: RequestQuery,
      RequestApp: RequestApplicationState,
      RouteApp: RouteOptionsApp,
      Rules: RouteRules,
      Server: Server_[ServerApplicationState]
    ): InternalRequestDefaults = {
      val __obj = js.Dynamic.literal(AuthApi = AuthApi.asInstanceOf[js.Any], AuthApp = AuthApp.asInstanceOf[js.Any], AuthArtifactsExtra = AuthArtifactsExtra.asInstanceOf[js.Any], AuthCredentialsExtra = AuthCredentialsExtra.asInstanceOf[js.Any], AuthUser = AuthUser.asInstanceOf[js.Any], Headers = Headers.asInstanceOf[js.Any], Params = Params.asInstanceOf[js.Any], Payload = Payload.asInstanceOf[js.Any], Pres = Pres.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], RequestApp = RequestApp.asInstanceOf[js.Any], RouteApp = RouteApp.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any], Server = Server.asInstanceOf[js.Any], Bind = null)
      __obj.asInstanceOf[InternalRequestDefaults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalRequestDefaults] (val x: Self) extends AnyVal {
      
      inline def setAuthApi(value: ServerAuthSchemeObjectApi): Self = StObject.set(x, "AuthApi", value.asInstanceOf[js.Any])
      
      inline def setAuthApp(value: AppCredentials): Self = StObject.set(x, "AuthApp", value.asInstanceOf[js.Any])
      
      inline def setAuthArtifactsExtra(value: Record[String, Any]): Self = StObject.set(x, "AuthArtifactsExtra", value.asInstanceOf[js.Any])
      
      inline def setAuthCredentialsExtra(value: Record[String, Any]): Self = StObject.set(x, "AuthCredentialsExtra", value.asInstanceOf[js.Any])
      
      inline def setAuthUser(value: UserCredentials): Self = StObject.set(x, "AuthUser", value.asInstanceOf[js.Any])
      
      inline def setBind(value: js.Object): Self = StObject.set(x, "Bind", value.asInstanceOf[js.Any])
      
      inline def setBindNull: Self = StObject.set(x, "Bind", null)
      
      inline def setHeaders(value: Record[String, Any]): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Record[String, Any]): Self = StObject.set(x, "Params", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: Readable | Buffer | String | js.Object): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
      
      inline def setPres(value: Record[String, Any]): Self = StObject.set(x, "Pres", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: RequestQuery): Self = StObject.set(x, "Query", value.asInstanceOf[js.Any])
      
      inline def setRequestApp(value: RequestApplicationState): Self = StObject.set(x, "RequestApp", value.asInstanceOf[js.Any])
      
      inline def setRouteApp(value: RouteOptionsApp): Self = StObject.set(x, "RouteApp", value.asInstanceOf[js.Any])
      
      inline def setRules(value: RouteRules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      inline def setServer(value: Server_[ServerApplicationState]): Self = StObject.set(x, "Server", value.asInstanceOf[js.Any])
    }
  }
  
  type MergeRefs[T /* <: ReqRef */] = MergeType[ReqRefDefaults, T]
  
  type MergeType[T /* <: js.Object */, U /* <: js.Object */] = (Omit[T, /* keyof U */ String]) & U
  
  /* Inlined std.Partial<std.Record<keyof @hapi/hapi.@hapi/hapi/lib/types/request.ReqRefDefaults, unknown>> */
  trait ReqRef extends StObject {
    
    var AuthApi: js.UndefOr[Any] = js.undefined
    
    var AuthApp: js.UndefOr[Any] = js.undefined
    
    var AuthArtifactsExtra: js.UndefOr[Any] = js.undefined
    
    var AuthCredentialsExtra: js.UndefOr[Any] = js.undefined
    
    var AuthUser: js.UndefOr[Any] = js.undefined
    
    var Bind: js.UndefOr[Any] = js.undefined
    
    var Headers: js.UndefOr[Any] = js.undefined
    
    var Params: js.UndefOr[Any] = js.undefined
    
    var Payload: js.UndefOr[Any] = js.undefined
    
    var Pres: js.UndefOr[Any] = js.undefined
    
    var Query: js.UndefOr[Any] = js.undefined
    
    var RequestApp: js.UndefOr[Any] = js.undefined
    
    var RouteApp: js.UndefOr[Any] = js.undefined
    
    var Rules: js.UndefOr[Any] = js.undefined
    
    var Server: js.UndefOr[Any] = js.undefined
  }
  object ReqRef {
    
    inline def apply(): ReqRef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReqRef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReqRef] (val x: Self) extends AnyVal {
      
      inline def setAuthApi(value: Any): Self = StObject.set(x, "AuthApi", value.asInstanceOf[js.Any])
      
      inline def setAuthApiUndefined: Self = StObject.set(x, "AuthApi", js.undefined)
      
      inline def setAuthApp(value: Any): Self = StObject.set(x, "AuthApp", value.asInstanceOf[js.Any])
      
      inline def setAuthAppUndefined: Self = StObject.set(x, "AuthApp", js.undefined)
      
      inline def setAuthArtifactsExtra(value: Any): Self = StObject.set(x, "AuthArtifactsExtra", value.asInstanceOf[js.Any])
      
      inline def setAuthArtifactsExtraUndefined: Self = StObject.set(x, "AuthArtifactsExtra", js.undefined)
      
      inline def setAuthCredentialsExtra(value: Any): Self = StObject.set(x, "AuthCredentialsExtra", value.asInstanceOf[js.Any])
      
      inline def setAuthCredentialsExtraUndefined: Self = StObject.set(x, "AuthCredentialsExtra", js.undefined)
      
      inline def setAuthUser(value: Any): Self = StObject.set(x, "AuthUser", value.asInstanceOf[js.Any])
      
      inline def setAuthUserUndefined: Self = StObject.set(x, "AuthUser", js.undefined)
      
      inline def setBind(value: Any): Self = StObject.set(x, "Bind", value.asInstanceOf[js.Any])
      
      inline def setBindUndefined: Self = StObject.set(x, "Bind", js.undefined)
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "Headers", js.undefined)
      
      inline def setParams(value: Any): Self = StObject.set(x, "Params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "Params", js.undefined)
      
      inline def setPayload(value: Any): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "Payload", js.undefined)
      
      inline def setPres(value: Any): Self = StObject.set(x, "Pres", value.asInstanceOf[js.Any])
      
      inline def setPresUndefined: Self = StObject.set(x, "Pres", js.undefined)
      
      inline def setQuery(value: Any): Self = StObject.set(x, "Query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "Query", js.undefined)
      
      inline def setRequestApp(value: Any): Self = StObject.set(x, "RequestApp", value.asInstanceOf[js.Any])
      
      inline def setRequestAppUndefined: Self = StObject.set(x, "RequestApp", js.undefined)
      
      inline def setRouteApp(value: Any): Self = StObject.set(x, "RouteApp", value.asInstanceOf[js.Any])
      
      inline def setRouteAppUndefined: Self = StObject.set(x, "RouteApp", js.undefined)
      
      inline def setRules(value: Any): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
      
      inline def setServer(value: Any): Self = StObject.set(x, "Server", value.asInstanceOf[js.Any])
      
      inline def setServerUndefined: Self = StObject.set(x, "Server", js.undefined)
    }
  }
  
  type ReqRefDefaults = InternalRequestDefaults
  
  @js.native
  trait Request[Refs /* <: ReqRef */] extends Podium[Unit] {
    
    /**
      * Returns `true` when the request is active and processing should continue and `false` when the
      *  request terminated early or completed its lifecycle. Useful when request processing is a
      * resource-intensive operation and should be terminated early if the request is no longer active
      * (e.g. client disconnected or aborted early).
      */
    def active(): Boolean = js.native
    
    /**
      * Application-specific state. Provides a safe place to store application data without potential conflicts with the framework. Should not be used by plugins which should use plugins[name].
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-requestapp)
      */
    var app: /* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['RequestApp'] */ js.Any = js.native
    
    /**
      * Authentication information:
      * * artifacts - an artifact object received from the authentication strategy and used in authentication-related actions.
      * * credentials - the credential object received during the authentication process. The presence of an object does not mean successful authentication.
      * * error - the authentication error is failed and mode set to 'try'.
      * * isAuthenticated - true if the request has been successfully authenticated, otherwise false.
      * * isAuthorized - true is the request has been successfully authorized against the route authentication access configuration. If the route has not access rules defined or if the request failed
      * authorization, set to false.
      * * mode - the route authentication mode.
      * * strategy - the name of the strategy used.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-requestauth)
      */
    val auth: RequestAuth[
        /* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['AuthUser'] */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['AuthApp'] */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['AuthCredentialsExtra'] */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['AuthArtifactsExtra'] */ js.Any
      ] = js.native
    
    /**
      * Access: read only and the public podium interface.
      * The request.events supports the following events:
      * * 'peek' - emitted for each chunk of payload data read from the client connection. The event method signature is function(chunk, encoding).
      * * 'finish' - emitted when the request payload finished reading. The event method signature is function ().
      * * 'disconnect' - emitted when a request errors or aborts unexpectedly.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-requestevents)
      */
    var events: RequestEvents = js.native
    
    /**
      * Returns a response which you can pass into the reply interface where:
      * @param source - the value to set as the source of the reply interface, optional.
      * @param options - options for the method, optional.
      * @return ResponseObject
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-requestgenerateresponsesource-options)
      */
    /* tslint:disable-next-line:max-line-length */
    def generateResponse(): ResponseObject = js.native
    def generateResponse(source: String): ResponseObject = js.native
    def generateResponse(source: String, options: Close): ResponseObject = js.native
    def generateResponse(source: js.Object): ResponseObject = js.native
    def generateResponse(source: js.Object, options: Close): ResponseObject = js.native
    def generateResponse(source: Null, options: Close): ResponseObject = js.native
    
    /**
      * The raw request headers (references request.raw.req.headers).
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-requestheaders)
      */
    val headers: /* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['Headers'] */ js.Any = js.native
    
    /**
      * Request information:
      * * acceptEncoding - the request preferred encoding.
      * * cors - if CORS is enabled for the route, contains the following:
      * * isOriginMatch - true if the request 'Origin' header matches the configured CORS restrictions. Set to false if no 'Origin' header is found or if it does not match. Note that this is only
      * available after the 'onRequest' extension point as CORS is configured per-route and no routing decisions are made at that point in the request lifecycle.
      * * host - content of the HTTP 'Host' header (e.g. 'example.com:8080').
      * * hostname - the hostname part of the 'Host' header (e.g. 'example.com').
      * * id - a unique request identifier (using the format '{now}:{connection.info.id}:{5 digits counter}').
      * * received - request reception timestamp.
      * * referrer - content of the HTTP 'Referrer' (or 'Referer') header.
      * * remoteAddress - remote client IP address.
      * * remotePort - remote client port.
      * * responded - request response timestamp (0 is not responded yet).
      * Note that the request.info object is not meant to be modified.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-requestinfo)
      */
    val info: RequestInfo = js.native
    
    /**
      * Logs request-specific events. When called, the server emits a 'request' event which can be used by other listeners or plugins. The arguments are:
      * @param tags - a string or an array of strings (e.g. ['error', 'database', 'read']) used to identify the event. Tags are used instead of log levels and provide a much more expressive mechanism
      *     for describing and filtering events.
      * @param data - (optional) an message string or object with the application data being logged. If data is a function, the function signature is function() and it called once to generate (return
      *     value) the actual data emitted to the listeners. Any logs generated by the server internally will be emitted only on the 'request-internal' channel and will include the event.internal flag
      *     set to true.
      * @return void
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-requestlogtags-data)
      */
    def log(tags: String): Unit = js.native
    def log(tags: String, data: String): Unit = js.native
    def log(tags: String, data: js.Function0[String | js.Object]): Unit = js.native
    def log(tags: String, data: js.Object): Unit = js.native
    def log(tags: js.Array[String]): Unit = js.native
    def log(tags: js.Array[String], data: String): Unit = js.native
    def log(tags: js.Array[String], data: js.Function0[String | js.Object]): Unit = js.native
    def log(tags: js.Array[String], data: js.Object): Unit = js.native
    
    /**
      * An array containing the logged request events.
      * Note that this array will be empty if route log.collect is set to false.
      */
    val logs: js.Array[RequestLog] = js.native
    
    /**
      * The request method in lower case (e.g. 'get', 'post').
      */
    val method: HTTP_METHODS_PARTIAL_LOWERCASE = js.native
    
    /**
      * The parsed content-type header. Only available when payload parsing enabled and no payload error occurred.
      */
    val mime: String = js.native
    
    /**
      * An object containing the values of params, query, and payload before any validation modifications made. Only set when input validation is performed.
      */
    val orig: RequestOrig = js.native
    
    /**
      * An object where each key is a path parameter name with matching value as described in [Path parameters](https://github.com/hapijs/hapi/blob/master/API.md#path-parameters).
      */
    val params: /* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['Params'] */ js.Any = js.native
    
    /**
      * An array containing all the path params values in the order they appeared in the path.
      */
    val paramsArray: (/* import warning: importer.ImportType#apply Failed type conversion: keyof @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['Params'] */ js.Any) | js.Array[String] = js.native
    
    /**
      * The request URI's pathname component.
      */
    val path: String = js.native
    
    /**
      * The request payload based on the route payload.output and payload.parse settings.
      * TODO check this typing and add references / links.
      */
    val payload: /* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['Payload'] */ js.Any = js.native
    
    /**
      * Plugin-specific state. Provides a place to store and pass request-level plugin data. The plugins is an object where each key is a plugin name and the value is the state.
      */
    var plugins: PluginsStates = js.native
    
    /**
      * An object where each key is the name assigned by a route pre-handler methods function. The values are the raw values provided to the continuation function as argument. For the wrapped response
      * object, use responses.
      */
    val pre: /* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['Pres'] */ js.Any = js.native
    
    /**
      * Same as pre but represented as the response object created by the pre method.
      */
    val preResponses: Record[String, Any] = js.native
    
    /**
      * By default the object outputted from node's URL parse() method.
      */
    val query: /* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['Query'] */ js.Any = js.native
    
    /**
      * An object containing the Node HTTP server objects. Direct interaction with these raw objects is not recommended.
      * * req - the node request object.
      * * res - the node response object.
      */
    val raw: Req = js.native
    
    /**
      * Access: read / write (see limitations below).
      * The response object when set. The object can be modified but must not be assigned another object. To replace the response with another from within an extension point, use reply(response) to
      * override with a different response.
      * In case of an aborted request the status code will be set to `disconnectStatusCode`.
      */
    var response: ResponseObject | Boom[Any] = js.native
    
    /**
      * The request route information object and method
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-requestroute)
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-requestrouteauthaccessrequest)
      */
    val route: RequestRoute[Refs] = js.native
    
    /**
      * Access: read only and the public server interface.
      * The server object.
      */
    val server: /* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['Server'] */ js.Any = js.native
    
    /**
      * Changes the request method before the router begins processing the request where:
      * @param method - is the request HTTP method (e.g. 'GET').
      * @return void
      * Can only be called from an 'onRequest' extension method.
      * [See docs](https://hapijs.com/api/17.0.1#-requestsetmethodmethod)
      */
    def setMethod(method: HTTP_METHODS_PARTIAL): Unit = js.native
    
    /**
      * Changes the request URI before the router begins processing the request where:
      * Can only be called from an 'onRequest' extension method.
      * @param url - the new request URI. If url is a string, it is parsed with node's URL parse() method with parseQueryString set to true. url can also be set to an object compatible with node's URL
      *     parse() method output.
      * @param stripTrailingSlash - if true, strip the trailing slash from the path. Defaults to false.
      * @return void
      * [See docs](https://hapijs.com/api/17.0.1#-requestseturlurl-striptrailingslash)
      */
    def setUrl(url: String): Unit = js.native
    def setUrl(url: String, stripTrailingSlash: Boolean): Unit = js.native
    def setUrl(url: URL_): Unit = js.native
    def setUrl(url: URL_, stripTrailingSlash: Boolean): Unit = js.native
    
    /**
      * An object containing parsed HTTP state information (cookies) where each key is the cookie name and value is the matching cookie content after processing using any registered cookie definition.
      */
    val state: Record[String, Any] = js.native
    
    /**
      * The parsed request URI.
      */
    val url: URL_ = js.native
  }
  
  trait RequestApplicationState extends StObject
  
  trait RequestAuth[AuthUser /* <: js.Object */, AuthApp /* <: js.Object */, CredentialsExtra /* <: js.Object */, ArtifactsExtra] extends StObject {
    
    /** an artifact object received from the authentication strategy and used in authentication-related actions. */
    var artifacts: ArtifactsExtra
    
    /** the credential object received during the authentication process. The presence of an object does not mean successful authentication. */
    var credentials: MergeType[CredentialsExtra, AuthCredentials[AuthUser, AuthApp]]
    
    /** the authentication error is failed and mode set to 'try'. */
    var error: js.Error
    
    /** true if the request has been successfully authenticated, otherwise false. */
    var isAuthenticated: Boolean
    
    /**
      * true is the request has been successfully authorized against the route authentication access configuration. If the route has not access rules defined or if the request failed authorization,
      * set to false.
      */
    var isAuthorized: Boolean
    
    /** the route authentication mode. */
    var mode: AuthMode
    
    /** the name of the strategy used. */
    var strategy: String
  }
  object RequestAuth {
    
    inline def apply[AuthUser /* <: js.Object */, AuthApp /* <: js.Object */, CredentialsExtra /* <: js.Object */, ArtifactsExtra](
      artifacts: ArtifactsExtra,
      credentials: MergeType[CredentialsExtra, AuthCredentials[AuthUser, AuthApp]],
      error: js.Error,
      isAuthenticated: Boolean,
      isAuthorized: Boolean,
      mode: AuthMode,
      strategy: String
    ): RequestAuth[AuthUser, AuthApp, CredentialsExtra, ArtifactsExtra] = {
      val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], isAuthenticated = isAuthenticated.asInstanceOf[js.Any], isAuthorized = isAuthorized.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestAuth[AuthUser, AuthApp, CredentialsExtra, ArtifactsExtra]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestAuth[?, ?, ?, ?], AuthUser /* <: js.Object */, AuthApp /* <: js.Object */, CredentialsExtra /* <: js.Object */, ArtifactsExtra] (val x: Self & (RequestAuth[AuthUser, AuthApp, CredentialsExtra, ArtifactsExtra])) extends AnyVal {
      
      inline def setArtifacts(value: ArtifactsExtra): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
      
      inline def setCredentials(value: MergeType[CredentialsExtra, AuthCredentials[AuthUser, AuthApp]]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setIsAuthenticated(value: Boolean): Self = StObject.set(x, "isAuthenticated", value.asInstanceOf[js.Any])
      
      inline def setIsAuthorized(value: Boolean): Self = StObject.set(x, "isAuthorized", value.asInstanceOf[js.Any])
      
      inline def setMode(value: AuthMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.hapiHapi.hapiHapiStrings.peek
    - typings.hapiHapi.hapiHapiStrings.finish
    - typings.hapiHapi.hapiHapiStrings.disconnect
  */
  trait RequestEventType extends StObject
  object RequestEventType {
    
    inline def disconnect: typings.hapiHapi.hapiHapiStrings.disconnect = "disconnect".asInstanceOf[typings.hapiHapi.hapiHapiStrings.disconnect]
    
    inline def finish: typings.hapiHapi.hapiHapiStrings.finish = "finish".asInstanceOf[typings.hapiHapi.hapiHapiStrings.finish]
    
    inline def peek: typings.hapiHapi.hapiHapiStrings.peek = "peek".asInstanceOf[typings.hapiHapi.hapiHapiStrings.peek]
  }
  
  @js.native
  trait RequestEvents extends Podium[Unit] {
    
    def on(criteria: finish | disconnect, listener: js.Function1[/* data */ Unit, Unit]): this.type = js.native
    /**
      * Access: read only and the public podium interface.
      * The request.events supports the following events:
      * * 'peek' - emitted for each chunk of payload data read from the client connection. The event method signature is function(chunk, encoding).
      * * 'finish' - emitted when the request payload finished reading. The event method signature is function ().
      * * 'disconnect' - emitted when a request errors or aborts unexpectedly.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-requestevents)
      */
    @JSName("on")
    def on_peek(criteria: peek, listener: PeekListener): this.type = js.native
    
    def once(criteria: finish | disconnect, listener: js.Function1[/* data */ Unit, Unit]): this.type = js.native
    @JSName("once")
    def once_peek(criteria: peek): js.Promise[Parameters[PeekListener]] = js.native
    /**
      * Access: read only and the public podium interface.
      * The request.events supports the following events:
      * * 'peek' - emitted for each chunk of payload data read from the client connection. The event method signature is function(chunk, encoding).
      * * 'finish' - emitted when the request payload finished reading. The event method signature is function ().
      * * 'disconnect' - emitted when a request errors or aborts unexpectedly.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-requestevents)
      */
    @JSName("once")
    def once_peek(criteria: peek, listener: PeekListener): this.type = js.native
  }
  
  trait RequestInfo extends StObject {
    
    /** the request preferred encoding. */
    var acceptEncoding: String
    
    /** request processing completion timestamp (0 is still processing). */
    var completed: Double
    
    /** if CORS is enabled for the route, contains the following: */
    var cors: IsOriginMatch
    
    /** content of the HTTP 'Host' header (e.g. 'example.com:8080'). */
    var host: String
    
    /** the hostname part of the 'Host' header (e.g. 'example.com'). */
    var hostname: String
    
    /** a unique request identifier (using the format '{now}:{connection.info.id}:{5 digits counter}') */
    var id: String
    
    /** request reception timestamp. */
    var received: Double
    
    /** content of the HTTP 'Referrer' (or 'Referer') header. */
    var referrer: String
    
    /** remote client IP address. */
    var remoteAddress: String
    
    /** remote client port. */
    var remotePort: String
    
    /** request response timestamp (0 is not responded yet). */
    var responded: Double
  }
  object RequestInfo {
    
    inline def apply(
      acceptEncoding: String,
      completed: Double,
      cors: IsOriginMatch,
      host: String,
      hostname: String,
      id: String,
      received: Double,
      referrer: String,
      remoteAddress: String,
      remotePort: String,
      responded: Double
    ): RequestInfo = {
      val __obj = js.Dynamic.literal(acceptEncoding = acceptEncoding.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], cors = cors.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], received = received.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any], responded = responded.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestInfo] (val x: Self) extends AnyVal {
      
      inline def setAcceptEncoding(value: String): Self = StObject.set(x, "acceptEncoding", value.asInstanceOf[js.Any])
      
      inline def setCompleted(value: Double): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      inline def setCors(value: IsOriginMatch): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setReceived(value: Double): Self = StObject.set(x, "received", value.asInstanceOf[js.Any])
      
      inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      inline def setRemoteAddress(value: String): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
      
      inline def setRemotePort(value: String): Self = StObject.set(x, "remotePort", value.asInstanceOf[js.Any])
      
      inline def setResponded(value: Double): Self = StObject.set(x, "responded", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestLog extends StObject {
    
    var channel: String
    
    var data: String | js.Object
    
    var request: String
    
    var tags: js.Array[String]
    
    var timestamp: Double
  }
  object RequestLog {
    
    inline def apply(
      channel: String,
      data: String | js.Object,
      request: String,
      tags: js.Array[String],
      timestamp: Double
    ): RequestLog = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestLog]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestLog] (val x: Self) extends AnyVal {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setData(value: String | js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestOrig extends StObject {
    
    var params: js.Object
    
    var payload: js.Object
    
    var query: js.Object
  }
  object RequestOrig {
    
    inline def apply(params: js.Object, payload: js.Object, query: js.Object): RequestOrig = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestOrig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestOrig] (val x: Self) extends AnyVal {
      
      inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: js.Object): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  type RequestQuery = StringDictionary[Any]
  
  trait RequestRoute[Refs /* <: ReqRef */] extends StObject {
    
    var auth: Access
    
    /** the route internal normalized string representing the normalized path. */
    var fingerprint: String
    
    /** the route HTTP method. */
    var method: HTTP_METHODS_PARTIAL
    
    /** the route path. */
    var path: String
    
    /** the active realm associated with the route. */
    var realm: ServerRealm
    
    /** the route options object with all defaults applied. */
    var settings: RouteSettings[Refs]
    
    /** the route vhost option if configured. */
    var vhost: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object RequestRoute {
    
    inline def apply[Refs /* <: ReqRef */](
      auth: Access,
      fingerprint: String,
      method: HTTP_METHODS_PARTIAL,
      path: String,
      realm: ServerRealm,
      settings: RouteSettings[Refs]
    ): RequestRoute[Refs] = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestRoute[Refs]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestRoute[?], Refs /* <: ReqRef */] (val x: Self & RequestRoute[Refs]) extends AnyVal {
      
      inline def setAuth(value: Access): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: HTTP_METHODS_PARTIAL): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRealm(value: ServerRealm): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      inline def setSettings(value: RouteSettings[Refs]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setVhost(value: String | js.Array[String]): Self = StObject.set(x, "vhost", value.asInstanceOf[js.Any])
      
      inline def setVhostUndefined: Self = StObject.set(x, "vhost", js.undefined)
      
      inline def setVhostVarargs(value: String*): Self = StObject.set(x, "vhost", js.Array(value*))
    }
  }
  
  trait RouteOptionsApp extends StObject
  
  trait UserCredentials extends StObject
}
