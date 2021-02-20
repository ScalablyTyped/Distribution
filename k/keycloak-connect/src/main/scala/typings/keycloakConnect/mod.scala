package typings.keycloakConnect

import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.keycloakConnect.anon.Roles
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("keycloak-connect", JSImport.Namespace)
  @js.native
  class ^ protected () extends Keycloak {
    def this(config: Config) = this()
    def this(config: Config, keycloakConfig: String) = this()
    def this(config: Config, keycloakConfig: js.Object) = this()
  }
  
  @js.native
  trait BaseConfig extends Config {
    
    var scope: js.UndefOr[js.Any] = js.native
  }
  object BaseConfig {
    
    @scala.inline
    def apply(): BaseConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseConfig]
    }
    
    @scala.inline
    implicit class BaseConfigMutableBuilder[Self <: BaseConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.keycloakConnect.mod.StoreConfig
    - typings.keycloakConnect.mod.CookiesConfig
    - typings.keycloakConnect.mod.BaseConfig
  */
  trait Config extends StObject
  object Config {
    
    @scala.inline
    def BaseConfig(): typings.keycloakConnect.mod.BaseConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.keycloakConnect.mod.BaseConfig]
    }
    
    @scala.inline
    def CookiesConfig(cookies: js.Any): typings.keycloakConnect.mod.CookiesConfig = {
      val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.keycloakConnect.mod.CookiesConfig]
    }
    
    @scala.inline
    def StoreConfig(store: js.Any): typings.keycloakConnect.mod.StoreConfig = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.keycloakConnect.mod.StoreConfig]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.keycloakConnect.mod.Config because Already inherited */ @js.native
  trait CookiesConfig extends BaseConfig {
    
    var cookies: js.Any = js.native
  }
  object CookiesConfig {
    
    @scala.inline
    def apply(cookies: js.Any): CookiesConfig = {
      val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any])
      __obj.asInstanceOf[CookiesConfig]
    }
    
    @scala.inline
    implicit class CookiesConfigMutableBuilder[Self <: CookiesConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookies(value: js.Any): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Grant extends StObject {
    
    var __raw: String = js.native
    
    var access_token: Token = js.native
    
    var expires_in: Double = js.native
    
    var id_token: Token = js.native
    
    def isExpired(): Boolean = js.native
    
    var refresh_token: Token = js.native
    
    def store(request: Request_[ParamsDictionary, _, _, Query], response: Response_[_]): Unit = js.native
    
    var token_type: String = js.native
    
    def update(grant: Grant): Unit = js.native
  }
  object Grant {
    
    @scala.inline
    def apply(
      __raw: String,
      access_token: Token,
      expires_in: Double,
      id_token: Token,
      isExpired: () => Boolean,
      refresh_token: Token,
      store: (Request_[ParamsDictionary, _, _, Query], Response_[_]) => Unit,
      token_type: String,
      update: Grant => Unit
    ): Grant = {
      val __obj = js.Dynamic.literal(__raw = __raw.asInstanceOf[js.Any], access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], id_token = id_token.asInstanceOf[js.Any], isExpired = js.Any.fromFunction0(isExpired), refresh_token = refresh_token.asInstanceOf[js.Any], store = js.Any.fromFunction2(store), token_type = token_type.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Grant]
    }
    
    @scala.inline
    implicit class GrantMutableBuilder[Self <: Grant] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccess_token(value: Token): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId_token(value: Token): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsExpired(value: () => Boolean): Self = StObject.set(x, "isExpired", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRefresh_token(value: Token): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStore(value: (Request_[ParamsDictionary, _, _, Query], Response_[_]) => Unit): Self = StObject.set(x, "store", js.Any.fromFunction2(value))
      
      @scala.inline
      def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: Grant => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
      
      @scala.inline
      def set__raw(value: String): Self = StObject.set(x, "__raw", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GrantedRequest
    extends Request[ParamsDictionary, js.Any, js.Any, Query] {
    
    var kauth: js.UndefOr[typings.keycloakConnect.anon.Grant] = js.native
  }
  
  @js.native
  trait Keycloak extends StObject {
    
    def accessDenied(request: Request_[ParamsDictionary, _, _, Query], response: Response_[_]): Unit = js.native
    
    def accountUrl(): String = js.native
    
    def authenticated(request: Request_[ParamsDictionary, _, _, Query]): Unit = js.native
    
    def deauthenticated(request: Request_[ParamsDictionary, _, _, Query]): Unit = js.native
    
    def getAccount(token: Token): js.Promise[_] = js.native
    
    def getGrant(request: Request_[ParamsDictionary, _, _, Query], response: Response_[_]): js.Promise[Grant] = js.native
    
    def getGrantFromCode(code: String, request: Request_[ParamsDictionary, _, _, Query], response: Response_[_]): js.Promise[Grant] = js.native
    
    def loginUrl(uuid: String, redirectUrl: String): String = js.native
    
    def logoutUrl(redirectUrl: String): String = js.native
    
    def middleware(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def middleware(options: MiddlewareOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    def protect(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def protect(spec: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def protect(spec: SpecHandler): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    def redirectToLogin(request: Request_[ParamsDictionary, _, _, Query]): Boolean = js.native
    
    def storeGrant(grant: Grant, request: Request_[ParamsDictionary, _, _, Query], response: Response_[_]): Grant = js.native
    
    def unstoreGrant(sessionId: String): Unit = js.native
  }
  
  @js.native
  trait MiddlewareOptions extends StObject {
    
    var admin: js.UndefOr[String] = js.native
    
    var logout: js.UndefOr[String] = js.native
  }
  object MiddlewareOptions {
    
    @scala.inline
    def apply(): MiddlewareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MiddlewareOptions]
    }
    
    @scala.inline
    implicit class MiddlewareOptionsMutableBuilder[Self <: MiddlewareOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdmin(value: String): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdminUndefined: Self = StObject.set(x, "admin", js.undefined)
      
      @scala.inline
      def setLogout(value: String): Self = StObject.set(x, "logout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogoutUndefined: Self = StObject.set(x, "logout", js.undefined)
    }
  }
  
  type SpecHandler = js.Function3[
    /* token */ Token, 
    /* request */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* response */ Response_[js.Any], 
    Boolean
  ]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.keycloakConnect.mod.Config because Already inherited */ @js.native
  trait StoreConfig extends BaseConfig {
    
    var store: js.Any = js.native
  }
  object StoreConfig {
    
    @scala.inline
    def apply(store: js.Any): StoreConfig = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoreConfig]
    }
    
    @scala.inline
    implicit class StoreConfigMutableBuilder[Self <: StoreConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStore(value: js.Any): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Token extends StObject {
    
    var clientId: String = js.native
    
    var content: TokenContent = js.native
    
    def hasApplicationRole(appName: String, roleName: String): Boolean = js.native
    
    def hasPermission(resource: String, scope: String): Boolean = js.native
    
    def hasRealmRole(roleName: String): Boolean = js.native
    
    def hasRole(roleName: String): Boolean = js.native
    
    var header: js.UndefOr[js.Any] = js.native
    
    def isExpired(): Boolean = js.native
    
    var signature: js.UndefOr[Buffer] = js.native
    
    var signed: js.UndefOr[String] = js.native
    
    var token: String = js.native
  }
  object Token {
    
    @scala.inline
    def apply(
      clientId: String,
      content: TokenContent,
      hasApplicationRole: (String, String) => Boolean,
      hasPermission: (String, String) => Boolean,
      hasRealmRole: String => Boolean,
      hasRole: String => Boolean,
      isExpired: () => Boolean,
      token: String
    ): Token = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], hasApplicationRole = js.Any.fromFunction2(hasApplicationRole), hasPermission = js.Any.fromFunction2(hasPermission), hasRealmRole = js.Any.fromFunction1(hasRealmRole), hasRole = js.Any.fromFunction1(hasRole), isExpired = js.Any.fromFunction0(isExpired), token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: TokenContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasApplicationRole(value: (String, String) => Boolean): Self = StObject.set(x, "hasApplicationRole", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHasPermission(value: (String, String) => Boolean): Self = StObject.set(x, "hasPermission", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHasRealmRole(value: String => Boolean): Self = StObject.set(x, "hasRealmRole", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasRole(value: String => Boolean): Self = StObject.set(x, "hasRole", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setIsExpired(value: () => Boolean): Self = StObject.set(x, "isExpired", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSignature(value: Buffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
      
      @scala.inline
      def setSigned(value: String): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignedUndefined: Self = StObject.set(x, "signed", js.undefined)
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TokenContent extends StObject {
    
    var exp: Double = js.native
    
    var realm_access: js.UndefOr[Roles] = js.native
    
    var resource_access: js.UndefOr[js.Any] = js.native
    
    var sub: String = js.native
  }
  object TokenContent {
    
    @scala.inline
    def apply(exp: Double, sub: String): TokenContent = {
      val __obj = js.Dynamic.literal(exp = exp.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenContent]
    }
    
    @scala.inline
    implicit class TokenContentMutableBuilder[Self <: TokenContent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealm_access(value: Roles): Self = StObject.set(x, "realm_access", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealm_accessUndefined: Self = StObject.set(x, "realm_access", js.undefined)
      
      @scala.inline
      def setResource_access(value: js.Any): Self = StObject.set(x, "resource_access", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResource_accessUndefined: Self = StObject.set(x, "resource_access", js.undefined)
      
      @scala.inline
      def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    }
  }
}
