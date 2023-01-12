package typings.hellojs

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.hellojs.anon.Code
import typings.hellojs.hellojsBooleans.`false`
import typings.std.Blob
import typings.std.HTMLAnchorElement
import typings.std.HTMLElement
import typings.std.Location
import typings.std.NodeList
import typings.std.PromiseLike
import typings.std.URL
import typings.std.Window
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("hellojs", JSImport.Namespace)
  @js.native
  val ^ : HelloJSStatic = js.native
  
  trait HelloJSAuthResponse extends StObject {
    
    var access_token: js.UndefOr[String] = js.undefined
    
    var client_id: js.UndefOr[String] = js.undefined
    
    var display: js.UndefOr[HelloJSDisplayType] = js.undefined
    
    var expires: js.UndefOr[Double] = js.undefined
    
    var expires_in: js.UndefOr[Double] = js.undefined
    
    var id_token: js.UndefOr[String] = js.undefined
    
    var network: js.UndefOr[String] = js.undefined
    
    var redirect_uri: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[String] = js.undefined
    
    var session_state: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
    
    var token_type: js.UndefOr[String] = js.undefined
  }
  object HelloJSAuthResponse {
    
    inline def apply(): HelloJSAuthResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelloJSAuthResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HelloJSAuthResponse] (val x: Self) extends AnyVal {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
      
      inline def setDisplay(value: HelloJSDisplayType): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
      
      inline def setExpires_inUndefined: Self = StObject.set(x, "expires_in", js.undefined)
      
      inline def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
      
      inline def setId_tokenUndefined: Self = StObject.set(x, "id_token", js.undefined)
      
      inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
      
      inline def setRedirect_uri(value: String): Self = StObject.set(x, "redirect_uri", value.asInstanceOf[js.Any])
      
      inline def setRedirect_uriUndefined: Self = StObject.set(x, "redirect_uri", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setSession_state(value: String): Self = StObject.set(x, "session_state", value.asInstanceOf[js.Any])
      
      inline def setSession_stateUndefined: Self = StObject.set(x, "session_state", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
      
      inline def setToken_typeUndefined: Self = StObject.set(x, "token_type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.hellojs.hellojsStrings.popup
    - typings.hellojs.hellojsStrings.page
    - typings.hellojs.hellojsStrings.none
  */
  trait HelloJSDisplayType extends StObject
  object HelloJSDisplayType {
    
    inline def none: typings.hellojs.hellojsStrings.none = "none".asInstanceOf[typings.hellojs.hellojsStrings.none]
    
    inline def page: typings.hellojs.hellojsStrings.page = "page".asInstanceOf[typings.hellojs.hellojsStrings.page]
    
    inline def popup: typings.hellojs.hellojsStrings.popup = "popup".asInstanceOf[typings.hellojs.hellojsStrings.popup]
  }
  
  trait HelloJSEvent extends StObject {
    
    def emit(event: String, data: Any): HelloJSStatic
    
    def emitAfter(): HelloJSStatic
    
    def findEvents(event: String, callback: js.Function2[/* name */ String, /* index */ Double, Unit]): Unit
    
    def off(event: String, callback: js.Function1[/* auth */ HelloJSEventArgument, Unit]): HelloJSStatic
    
    def on(event: String, callback: js.Function1[/* auth */ HelloJSEventArgument, Unit]): HelloJSStatic
  }
  object HelloJSEvent {
    
    inline def apply(
      emit: (String, Any) => HelloJSStatic,
      emitAfter: () => HelloJSStatic,
      findEvents: (String, js.Function2[/* name */ String, /* index */ Double, Unit]) => Unit,
      off: (String, js.Function1[/* auth */ HelloJSEventArgument, Unit]) => HelloJSStatic,
      on: (String, js.Function1[/* auth */ HelloJSEventArgument, Unit]) => HelloJSStatic
    ): HelloJSEvent = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), emitAfter = js.Any.fromFunction0(emitAfter), findEvents = js.Any.fromFunction2(findEvents), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on))
      __obj.asInstanceOf[HelloJSEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HelloJSEvent] (val x: Self) extends AnyVal {
      
      inline def setEmit(value: (String, Any) => HelloJSStatic): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      inline def setEmitAfter(value: () => HelloJSStatic): Self = StObject.set(x, "emitAfter", js.Any.fromFunction0(value))
      
      inline def setFindEvents(value: (String, js.Function2[/* name */ String, /* index */ Double, Unit]) => Unit): Self = StObject.set(x, "findEvents", js.Any.fromFunction2(value))
      
      inline def setOff(value: (String, js.Function1[/* auth */ HelloJSEventArgument, Unit]) => HelloJSStatic): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      inline def setOn(value: (String, js.Function1[/* auth */ HelloJSEventArgument, Unit]) => HelloJSStatic): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    }
  }
  
  trait HelloJSEventArgument extends StObject {
    
    var authResponse: js.UndefOr[HelloJSAuthResponse] = js.undefined
    
    var network: String
  }
  object HelloJSEventArgument {
    
    inline def apply(network: String): HelloJSEventArgument = {
      val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelloJSEventArgument]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HelloJSEventArgument] (val x: Self) extends AnyVal {
      
      inline def setAuthResponse(value: HelloJSAuthResponse): Self = StObject.set(x, "authResponse", value.asInstanceOf[js.Any])
      
      inline def setAuthResponseUndefined: Self = StObject.set(x, "authResponse", js.undefined)
      
      inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    }
  }
  
  trait HelloJSLoginEventArguement extends StObject {
    
    var authResponse: js.UndefOr[HelloJSAuthResponse] = js.undefined
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var network: String
  }
  object HelloJSLoginEventArguement {
    
    inline def apply(network: String): HelloJSLoginEventArguement = {
      val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelloJSLoginEventArguement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HelloJSLoginEventArguement] (val x: Self) extends AnyVal {
      
      inline def setAuthResponse(value: HelloJSAuthResponse): Self = StObject.set(x, "authResponse", value.asInstanceOf[js.Any])
      
      inline def setAuthResponseUndefined: Self = StObject.set(x, "authResponse", js.undefined)
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    }
  }
  
  trait HelloJSLoginOptions extends StObject {
    
    var default_service: js.UndefOr[String] = js.undefined
    
    var display: js.UndefOr[HelloJSDisplayType] = js.undefined
    
    var force: js.UndefOr[Boolean | Null] = js.undefined
    
    var oauth_proxy: js.UndefOr[String] = js.undefined
    
    var popup: js.UndefOr[HelloJSPopupOptions] = js.undefined
    
    var redirect_uri: js.UndefOr[String] = js.undefined
    
    var response_type: js.UndefOr[HelloJSTokenResponseType] = js.undefined
    
    var scope: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object HelloJSLoginOptions {
    
    inline def apply(): HelloJSLoginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelloJSLoginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HelloJSLoginOptions] (val x: Self) extends AnyVal {
      
      inline def setDefault_service(value: String): Self = StObject.set(x, "default_service", value.asInstanceOf[js.Any])
      
      inline def setDefault_serviceUndefined: Self = StObject.set(x, "default_service", js.undefined)
      
      inline def setDisplay(value: HelloJSDisplayType): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceNull: Self = StObject.set(x, "force", null)
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setOauth_proxy(value: String): Self = StObject.set(x, "oauth_proxy", value.asInstanceOf[js.Any])
      
      inline def setOauth_proxyUndefined: Self = StObject.set(x, "oauth_proxy", js.undefined)
      
      inline def setPopup(value: HelloJSPopupOptions): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
      
      inline def setRedirect_uri(value: String): Self = StObject.set(x, "redirect_uri", value.asInstanceOf[js.Any])
      
      inline def setRedirect_uriUndefined: Self = StObject.set(x, "redirect_uri", js.undefined)
      
      inline def setResponse_type(value: HelloJSTokenResponseType): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
      
      inline def setResponse_typeUndefined: Self = StObject.set(x, "response_type", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait HelloJSLogoutOptions extends StObject {
    
    var force: js.UndefOr[Boolean] = js.undefined
  }
  object HelloJSLogoutOptions {
    
    inline def apply(): HelloJSLogoutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelloJSLogoutOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HelloJSLogoutOptions] (val x: Self) extends AnyVal {
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    }
  }
  
  trait HelloJSOAuth1Def
    extends StObject
       with HelloJSOAuthDef {
    
    var request: js.UndefOr[String] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
  }
  object HelloJSOAuth1Def {
    
    inline def apply(version: String | Double): HelloJSOAuth1Def = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelloJSOAuth1Def]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HelloJSOAuth1Def] (val x: Self) extends AnyVal {
      
      inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
  
  trait HelloJSOAuth2Def
    extends StObject
       with HelloJSOAuthDef {
    
    var grant: js.UndefOr[String] = js.undefined
    
    var response_type: js.UndefOr[HelloJSTokenResponseType] = js.undefined
  }
  object HelloJSOAuth2Def {
    
    inline def apply(version: String | Double): HelloJSOAuth2Def = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelloJSOAuth2Def]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HelloJSOAuth2Def] (val x: Self) extends AnyVal {
      
      inline def setGrant(value: String): Self = StObject.set(x, "grant", value.asInstanceOf[js.Any])
      
      inline def setGrantUndefined: Self = StObject.set(x, "grant", js.undefined)
      
      inline def setResponse_type(value: HelloJSTokenResponseType): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
      
      inline def setResponse_typeUndefined: Self = StObject.set(x, "response_type", js.undefined)
    }
  }
  
  trait HelloJSOAuthDef extends StObject {
    
    var auth: js.UndefOr[String] = js.undefined
    
    var version: String | Double
  }
  object HelloJSOAuthDef {
    
    inline def apply(version: String | Double): HelloJSOAuthDef = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelloJSOAuthDef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HelloJSOAuthDef] (val x: Self) extends AnyVal {
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setVersion(value: String | Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait HelloJSPopupOptions extends StObject {
    
    var height: Double
    
    var resizable: Double
    
    var scrollbars: Double
    
    var width: Double
  }
  object HelloJSPopupOptions {
    
    inline def apply(height: Double, resizable: Double, scrollbars: Double, width: Double): HelloJSPopupOptions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], resizable = resizable.asInstanceOf[js.Any], scrollbars = scrollbars.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelloJSPopupOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HelloJSPopupOptions] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setResizable(value: Double): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      inline def setScrollbars(value: Double): Self = StObject.set(x, "scrollbars", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type HelloJSResponseCallback = js.Function2[/* r */ Any, /* headers */ Any, Unit]
  
  trait HelloJSServiceDef extends StObject {
    
    var base: js.UndefOr[String] = js.undefined
    
    var del: js.UndefOr[StringDictionary[String | HelloJSUrlMappingFunction]] = js.undefined
    
    var form: js.UndefOr[(js.Function2[/* p */ Any, /* query */ Any, Unit]) | Boolean] = js.undefined
    
    var get: js.UndefOr[StringDictionary[String | HelloJSUrlMappingFunction]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var jsonp: js.UndefOr[(js.Function2[/* p */ Any, /* query */ Any, Unit]) | Boolean] = js.undefined
    
    var login: js.UndefOr[js.Function1[/* p */ Any, Unit]] = js.undefined
    
    var logout: js.UndefOr[(js.Function1[/* callback */ js.Function0[Unit | String], Unit]) | String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var oauth: HelloJSOAuth2Def | HelloJSOAuth1Def
    
    var patch: js.UndefOr[StringDictionary[String | HelloJSUrlMappingFunction]] = js.undefined
    
    var post: js.UndefOr[StringDictionary[String | HelloJSUrlMappingFunction]] = js.undefined
    
    var put: js.UndefOr[StringDictionary[String | HelloJSUrlMappingFunction]] = js.undefined
    
    var refresh: js.UndefOr[Boolean] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var scope_delim: js.UndefOr[String] = js.undefined
    
    var wrap: js.UndefOr[
        StringDictionary[js.Function3[/* r */ Any, /* headers */ Any, /* p */ Any, Unit]]
      ] = js.undefined
    
    var xhr: js.UndefOr[js.Function2[/* p */ Any, /* query */ Any, Unit]] = js.undefined
  }
  object HelloJSServiceDef {
    
    inline def apply(oauth: HelloJSOAuth2Def | HelloJSOAuth1Def): HelloJSServiceDef = {
      val __obj = js.Dynamic.literal(oauth = oauth.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelloJSServiceDef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HelloJSServiceDef] (val x: Self) extends AnyVal {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setDel(value: StringDictionary[String | HelloJSUrlMappingFunction]): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
      
      inline def setDelUndefined: Self = StObject.set(x, "del", js.undefined)
      
      inline def setForm(value: (js.Function2[/* p */ Any, /* query */ Any, Unit]) | Boolean): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormFunction2(value: (/* p */ Any, /* query */ Any) => Unit): Self = StObject.set(x, "form", js.Any.fromFunction2(value))
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setGet(value: StringDictionary[String | HelloJSUrlMappingFunction]): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setJsonp(value: (js.Function2[/* p */ Any, /* query */ Any, Unit]) | Boolean): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
      
      inline def setJsonpFunction2(value: (/* p */ Any, /* query */ Any) => Unit): Self = StObject.set(x, "jsonp", js.Any.fromFunction2(value))
      
      inline def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
      
      inline def setLogin(value: /* p */ Any => Unit): Self = StObject.set(x, "login", js.Any.fromFunction1(value))
      
      inline def setLoginUndefined: Self = StObject.set(x, "login", js.undefined)
      
      inline def setLogout(value: (js.Function1[/* callback */ js.Function0[Unit | String], Unit]) | String): Self = StObject.set(x, "logout", value.asInstanceOf[js.Any])
      
      inline def setLogoutFunction1(value: /* callback */ js.Function0[Unit | String] => Unit): Self = StObject.set(x, "logout", js.Any.fromFunction1(value))
      
      inline def setLogoutUndefined: Self = StObject.set(x, "logout", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOauth(value: HelloJSOAuth2Def | HelloJSOAuth1Def): Self = StObject.set(x, "oauth", value.asInstanceOf[js.Any])
      
      inline def setPatch(value: StringDictionary[String | HelloJSUrlMappingFunction]): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
      
      inline def setPost(value: StringDictionary[String | HelloJSUrlMappingFunction]): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
      
      inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      inline def setPut(value: StringDictionary[String | HelloJSUrlMappingFunction]): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
      
      inline def setPutUndefined: Self = StObject.set(x, "put", js.undefined)
      
      inline def setRefresh(value: Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
      
      inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setScope(value: StringDictionary[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScope_delim(value: String): Self = StObject.set(x, "scope_delim", value.asInstanceOf[js.Any])
      
      inline def setScope_delimUndefined: Self = StObject.set(x, "scope_delim", js.undefined)
      
      inline def setWrap(value: StringDictionary[js.Function3[/* r */ Any, /* headers */ Any, /* p */ Any, Unit]]): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
      
      inline def setXhr(value: (/* p */ Any, /* query */ Any) => Unit): Self = StObject.set(x, "xhr", js.Any.fromFunction2(value))
      
      inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  @js.native
  trait HelloJSStatic
    extends StObject
       with HelloJSEvent {
    
    def apply(network: String): HelloJSStatic = js.native
    
    def api(): PromiseLike[Any] = js.native
    def api(options: js.Object): PromiseLike[Any] = js.native
    def api(
      path: js.UndefOr[String],
      query: js.UndefOr[js.Object],
      method: js.UndefOr[String],
      data: js.UndefOr[js.Object],
      timeout: js.UndefOr[Double],
      callback: js.UndefOr[js.Function1[/* json */ Any, Unit]]
    ): PromiseLike[Any] = js.native
    def api(path: String): PromiseLike[Any] = js.native
    def api(path: String, method: String): PromiseLike[Any] = js.native
    def api(path: String, method: String, data: js.Object): PromiseLike[Any] = js.native
    def api(path: String, method: String, data: js.Object, callback: js.Function1[/* json */ Any, Unit]): PromiseLike[Any] = js.native
    def api(path: String, method: String, data: Unit, callback: js.Function1[/* json */ Any, Unit]): PromiseLike[Any] = js.native
    def api(path: String, method: Unit, data: js.Object): PromiseLike[Any] = js.native
    def api(path: String, method: Unit, data: js.Object, callback: js.Function1[/* json */ Any, Unit]): PromiseLike[Any] = js.native
    def api(path: String, method: Unit, data: Unit, callback: js.Function1[/* json */ Any, Unit]): PromiseLike[Any] = js.native
    def api(path: Unit, method: String): PromiseLike[Any] = js.native
    def api(path: Unit, method: String, data: js.Object): PromiseLike[Any] = js.native
    def api(path: Unit, method: String, data: js.Object, callback: js.Function1[/* json */ Any, Unit]): PromiseLike[Any] = js.native
    def api(path: Unit, method: String, data: Unit, callback: js.Function1[/* json */ Any, Unit]): PromiseLike[Any] = js.native
    def api(path: Unit, method: Unit, data: js.Object): PromiseLike[Any] = js.native
    def api(path: Unit, method: Unit, data: js.Object, callback: js.Function1[/* json */ Any, Unit]): PromiseLike[Any] = js.native
    def api(path: Unit, method: Unit, data: Unit, callback: js.Function1[/* json */ Any, Unit]): PromiseLike[Any] = js.native
    
    def getAuthResponse(): HelloJSAuthResponse = js.native
    def getAuthResponse(network: String): HelloJSAuthResponse = js.native
    
    def init(serviceAppIdsOrDefs: StringDictionary[String | HelloJSServiceDef]): Unit = js.native
    def init(serviceAppIdsOrDefs: StringDictionary[String | HelloJSServiceDef], options: HelloJSLoginOptions): Unit = js.native
    
    def login(): PromiseLike[HelloJSLoginEventArguement] = js.native
    def login(callback: js.Function0[Unit]): PromiseLike[HelloJSLoginEventArguement] = js.native
    def login(network: String): PromiseLike[HelloJSLoginEventArguement] = js.native
    def login(network: String, options: Unit, callback: js.Function0[Unit]): PromiseLike[HelloJSLoginEventArguement] = js.native
    def login(network: String, options: HelloJSLoginOptions): PromiseLike[HelloJSLoginEventArguement] = js.native
    def login(network: String, options: HelloJSLoginOptions, callback: js.Function0[Unit]): PromiseLike[HelloJSLoginEventArguement] = js.native
    def login(network: Unit, options: Unit, callback: js.Function0[Unit]): PromiseLike[HelloJSLoginEventArguement] = js.native
    def login(network: Unit, options: HelloJSLoginOptions): PromiseLike[HelloJSLoginEventArguement] = js.native
    def login(network: Unit, options: HelloJSLoginOptions, callback: js.Function0[Unit]): PromiseLike[HelloJSLoginEventArguement] = js.native
    def login(options: Unit, callback: js.Function0[Unit]): PromiseLike[HelloJSLoginEventArguement] = js.native
    def login(options: HelloJSLoginOptions): PromiseLike[HelloJSLoginEventArguement] = js.native
    def login(options: HelloJSLoginOptions, callback: js.Function0[Unit]): PromiseLike[HelloJSLoginEventArguement] = js.native
    
    def logout(): PromiseLike[Any] = js.native
    def logout(callback: js.Function0[Unit]): PromiseLike[Any] = js.native
    def logout(network: String): PromiseLike[Any] = js.native
    def logout(network: String, options: Unit, callback: js.Function0[Unit]): PromiseLike[Any] = js.native
    def logout(network: String, options: HelloJSLogoutOptions): PromiseLike[Any] = js.native
    def logout(network: String, options: HelloJSLogoutOptions, callback: js.Function0[Unit]): PromiseLike[Any] = js.native
    def logout(network: Unit, options: Unit, callback: js.Function0[Unit]): PromiseLike[Any] = js.native
    def logout(network: Unit, options: HelloJSLogoutOptions): PromiseLike[Any] = js.native
    def logout(network: Unit, options: HelloJSLogoutOptions, callback: js.Function0[Unit]): PromiseLike[Any] = js.native
    def logout(options: Unit, callback: js.Function0[Unit]): PromiseLike[Any] = js.native
    def logout(options: HelloJSLogoutOptions): PromiseLike[Any] = js.native
    def logout(options: HelloJSLogoutOptions, callback: js.Function0[Unit]): PromiseLike[Any] = js.native
    
    var settings: HelloJSLoginOptions = js.native
    
    var utils: HelloJSUtils = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.hellojs.hellojsStrings.code
    - typings.hellojs.hellojsStrings.`code id_token`
    - typings.hellojs.hellojsStrings.`code id_token token`
    - typings.hellojs.hellojsStrings.`code token`
    - typings.hellojs.hellojsStrings.id_token
    - typings.hellojs.hellojsStrings.`id_token token`
    - typings.hellojs.hellojsStrings.none
    - typings.hellojs.hellojsStrings.token
  */
  trait HelloJSTokenResponseType extends StObject
  object HelloJSTokenResponseType {
    
    inline def code: typings.hellojs.hellojsStrings.code = "code".asInstanceOf[typings.hellojs.hellojsStrings.code]
    
    inline def `code id_token`: typings.hellojs.hellojsStrings.`code id_token` = ("code id_token").asInstanceOf[typings.hellojs.hellojsStrings.`code id_token`]
    
    inline def `code id_token token`: typings.hellojs.hellojsStrings.`code id_token token` = ("code id_token token").asInstanceOf[typings.hellojs.hellojsStrings.`code id_token token`]
    
    inline def `code token`: typings.hellojs.hellojsStrings.`code token` = ("code token").asInstanceOf[typings.hellojs.hellojsStrings.`code token`]
    
    inline def id_token: typings.hellojs.hellojsStrings.id_token = "id_token".asInstanceOf[typings.hellojs.hellojsStrings.id_token]
    
    inline def `id_token token`: typings.hellojs.hellojsStrings.`id_token token` = ("id_token token").asInstanceOf[typings.hellojs.hellojsStrings.`id_token token`]
    
    inline def none: typings.hellojs.hellojsStrings.none = "none".asInstanceOf[typings.hellojs.hellojsStrings.none]
    
    inline def token: typings.hellojs.hellojsStrings.token = "token".asInstanceOf[typings.hellojs.hellojsStrings.token]
  }
  
  type HelloJSUrlMappingFunction = js.Function2[/* p */ Any, /* callback */ js.Function1[/* url */ String, Unit], Unit]
  
  // API utilities
  @js.native
  trait HelloJSUtils extends StObject {
    
    var Event: HelloJSEvent = js.native
    
    def append(node: String, attr: js.Object, target: String): HTMLElement = js.native
    def append(node: String, attr: js.Object, target: HTMLElement): HTMLElement = js.native
    def append(node: String, attr: Null, target: String): HTMLElement = js.native
    def append(node: String, attr: Null, target: HTMLElement): HTMLElement = js.native
    def append(node: String, attr: Unit, target: String): HTMLElement = js.native
    def append(node: String, attr: Unit, target: HTMLElement): HTMLElement = js.native
    def append(node: HTMLElement, attr: js.Object, target: String): HTMLElement = js.native
    def append(node: HTMLElement, attr: js.Object, target: HTMLElement): HTMLElement = js.native
    def append(node: HTMLElement, attr: Null, target: String): HTMLElement = js.native
    def append(node: HTMLElement, attr: Null, target: HTMLElement): HTMLElement = js.native
    def append(node: HTMLElement, attr: Unit, target: String): HTMLElement = js.native
    def append(node: HTMLElement, attr: Unit, target: HTMLElement): HTMLElement = js.native
    
    def args(o: js.Object, args: js.Object): Any | `false` = js.native
    
    def clone[T](obj: T): T = js.native
    
    def dataToJSON(p: Any): Any = js.native
    
    def diff(a: js.Array[Any], b: js.Array[Any]): js.Array[Any] = js.native
    
    def diffKey(a: js.Array[Any], b: js.Array[Any]): js.Array[Any] = js.native
    
    def domInstance(`type`: String, data: Any): Boolean = js.native
    
    def error(code: Double, message: String): Code = js.native
    
    def extend(r: js.Object, a: Any*): Any = js.native
    
    def globalEvent(callback: js.Function0[Unit]): String = js.native
    def globalEvent(callback: js.Function0[Unit], guid: String): String = js.native
    
    def hasBinary(data: Any): Boolean = js.native
    
    def iframe(src: String): Unit = js.native
    def iframe(src: String, redirectUri: String): Unit = js.native
    
    def isBinary(data: Any): Boolean = js.native
    
    def isEmpty(obj: Any): Boolean = js.native
    
    def jsonp(url: String, callback: js.Function0[Unit]): Unit = js.native
    def jsonp(url: String, callback: js.Function0[Unit], callbackID: String): Unit = js.native
    def jsonp(url: String, callback: js.Function0[Unit], callbackID: String, timeout: Double): Unit = js.native
    def jsonp(url: String, callback: js.Function0[Unit], callbackID: Unit, timeout: Double): Unit = js.native
    
    def merge(a: Any*): Any = js.native
    
    def nodeListToJSON(nodelist: NodeList): Any = js.native
    
    def param(o: js.Object): String = js.native
    def param(o: js.Object, formatFunction: js.Function1[/* param */ Any, String]): String = js.native
    def param(s: String): Any = js.native
    def param(s: String, formatFunction: js.Function1[/* param */ String, Any]): Any = js.native
    
    def popup(url: String): Window | Any = js.native
    def popup(url: String, redirectUri: String): Window | Any = js.native
    def popup(url: String, redirectUri: String, options: js.Object): Window | Any = js.native
    def popup(url: String, redirectUri: Unit, options: js.Object): Window | Any = js.native
    
    def post(url: String, data: Any, options: js.Object, callback: HelloJSResponseCallback): Unit = js.native
    def post(url: String, data: Any, options: js.Object, callback: HelloJSResponseCallback, callbackID: String): Unit = js.native
    def post(
      url: String,
      data: Any,
      options: js.Object,
      callback: HelloJSResponseCallback,
      callbackID: String,
      timeout: Double
    ): Unit = js.native
    def post(
      url: String,
      data: Any,
      options: js.Object,
      callback: HelloJSResponseCallback,
      callbackID: Unit,
      timeout: Double
    ): Unit = js.native
    
    def qs(url: String): String = js.native
    def qs(url: String, params: js.Object): String = js.native
    def qs(url: String, params: js.Object, formatFunction: js.Function1[/* param */ Any, String]): String = js.native
    def qs(url: String, params: Unit, formatFunction: js.Function1[/* param */ Any, String]): String = js.native
    
    def request(p: js.Object, callback: HelloJSResponseCallback): Unit = js.native
    
    def request_cors(callback: HelloJSResponseCallback): Boolean = js.native
    
    def responseHandler(window: Window): Unit = js.native
    def responseHandler(window: Window, parent: Any): Unit = js.native
    
    def store(): Any = js.native
    def store(name: String): Any = js.native
    def store(name: String, value: Any): Any = js.native
    def store(name: Unit, value: Any): Any = js.native
    
    def toBlob(dataURI: String): Blob | String = js.native
    
    def unique(a: js.Array[Any]): js.Array[Any] = js.native
    
    def url(): Location = js.native
    def url(path: String): URL | HTMLAnchorElement = js.native
    
    def xhr(method: String, url: String, headers: js.Object, data: Any, callback: HelloJSResponseCallback): XMLHttpRequest = js.native
  }
  
  type _To = HelloJSStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: HelloJSStatic = ^
}
