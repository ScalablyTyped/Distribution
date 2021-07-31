package typings.hapiBell

import org.scalablytyped.runtime.StringDictionary
import typings.hapiBell.anon.ExtendedProfile
import typings.hapiBell.anon.Uri
import typings.hapiBell.hapiBellBooleans.`false`
import typings.hapiBell.hapiBellStrings.`HMAC-SHA1`
import typings.hapiBell.hapiBellStrings.`RSA-SHA1`
import typings.hapiBell.hapiBellStrings.bell
import typings.hapiBell.hapiBellStrings.custom
import typings.hapiBell.hapiBellStrings.oauth
import typings.hapiBell.hapiBellStrings.oauth2
import typings.hapiHapi.mod.AuthCredentials
import typings.hapiHapi.mod.Plugin
import typings.hapiHapi.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/bell", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@hapi/bell", "plugin")
  @js.native
  val plugin: Plugin[BellOptions] = js.native
  
  @scala.inline
  def simulate(credentialsFunc: RequestPassThrough): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("simulate")(credentialsFunc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def simulate_false(state: `false`): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("simulate")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type AuthedRequest = js.Function2[
    /* uri */ String, 
    /* params */ js.UndefOr[StringDictionary[String]], 
    js.Promise[js.Object]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.hapiBell.mod.CustomProviderOptions
    - typings.hapiBell.mod.KnownProviderOptions
  */
  trait BellOptions extends StObject
  object BellOptions {
    
    @scala.inline
    def CustomProviderOptions(
      clientId: String,
      clientSecret: String,
      password: String,
      provider: CustomProtocol1 | CustomProtocol2
    ): typings.hapiBell.mod.CustomProviderOptions = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.hapiBell.mod.CustomProviderOptions]
    }
    
    @scala.inline
    def KnownProviderOptions(clientId: String, clientSecret: String, password: String, provider: Provider): typings.hapiBell.mod.KnownProviderOptions = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.hapiBell.mod.KnownProviderOptions]
    }
  }
  
  trait Credentials extends StObject {
    
    /**
      * Varying data depending on provider.
      */
    var profile: js.UndefOr[js.Object] = js.undefined
    
    var provider: Provider | custom
    
    var query: StringLikeMap
    
    var token: String
  }
  object Credentials {
    
    @scala.inline
    def apply(provider: Provider | custom, query: StringLikeMap, token: String): Credentials = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    @scala.inline
    implicit class CredentialsMutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProfile(value: js.Object): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      @scala.inline
      def setProvider(value: Provider | custom): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: StringLikeMap): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait Credentials1
    extends StObject
       with Credentials {
    
    var secret: String
  }
  object Credentials1 {
    
    @scala.inline
    def apply(provider: Provider | custom, query: StringLikeMap, secret: String, token: String): Credentials1 = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials1]
    }
    
    @scala.inline
    implicit class Credentials1MutableBuilder[Self <: Credentials1] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    }
  }
  
  trait Credentials2
    extends StObject
       with Credentials {
    
    var expiresIn: js.UndefOr[Double] = js.undefined
    
    var refreshToken: js.UndefOr[String] = js.undefined
  }
  object Credentials2 {
    
    @scala.inline
    def apply(provider: Provider | custom, query: StringLikeMap, token: String): Credentials2 = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials2]
    }
    
    @scala.inline
    implicit class Credentials2MutableBuilder[Self <: Credentials2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      @scala.inline
      def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
    }
  }
  
  trait CustomProtocol extends StObject {
    
    /**
      * the authorization endpoint URI.
      */
    var auth: String
    
    /**
      * a headers object with additional headers required by the provider
      * (e.g. GitHub required the 'User-Agent' header which is set by default).
      */
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * The name of the protocol.
      * @default custom
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * the access token endpoint URI.
      */
    var token: String
  }
  object CustomProtocol {
    
    @scala.inline
    def apply(auth: String, token: String): CustomProtocol = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomProtocol]
    }
    
    @scala.inline
    implicit class CustomProtocolMutableBuilder[Self <: CustomProtocol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomProtocol1
    extends StObject
       with CustomProtocol {
    
    def profile(credentials: Credentials1, params: StringDictionary[String], get: AuthedRequest): js.Promise[Unit]
    @JSName("profile")
    var profile_Original: ProfileGetter[Credentials1]
    
    /**
      * the authorization protocol used.
      */
    var protocol: oauth
    
    /**
      * the OAuth signature method. Must be one of:
      * * 'HMAC-SHA1' - default
      * * 'RSA-SHA1' - in that case, the clientSecret is your RSA private key
      */
    var signatureMethod: js.UndefOr[`HMAC-SHA1` | `RSA-SHA1`] = js.undefined
    
    /**
      * the temporary credentials (request token) endpoint).
      */
    var temporary: js.UndefOr[String] = js.undefined
  }
  object CustomProtocol1 {
    
    @scala.inline
    def apply(auth: String, profile: ProfileGetter[Credentials1], token: String): CustomProtocol1 = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], protocol = "oauth", token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomProtocol1]
    }
    
    @scala.inline
    implicit class CustomProtocol1MutableBuilder[Self <: CustomProtocol1] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProfile(value: ProfileGetter[Credentials1]): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: oauth): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureMethod(value: `HMAC-SHA1` | `RSA-SHA1`): Self = StObject.set(x, "signatureMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureMethodUndefined: Self = StObject.set(x, "signatureMethod", js.undefined)
      
      @scala.inline
      def setTemporary(value: String): Self = StObject.set(x, "temporary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemporaryUndefined: Self = StObject.set(x, "temporary", js.undefined)
    }
  }
  
  trait CustomProtocol2
    extends StObject
       with CustomProtocol {
    
    /**
      * If specified, uses proof key exchange.
      */
    var pkce: js.UndefOr[PkceSetting] = js.undefined
    
    def profile(credentials: Credentials2, params: StringDictionary[String], get: AuthedRequest): js.Promise[Unit]
    @JSName("profile")
    var profile_Original: ProfileGetter[Credentials2]
    
    /**
      * the authorization protocol used.
      */
    var protocol: oauth2
    
    /**
      * an array of scope strings.
      */
    var scope: js.UndefOr[js.Array[String] | (js.Function1[/* query */ StringLikeMap, js.Array[String]])] = js.undefined
    
    /**
      * the scope separator character. Only required when a provider has a broken OAuth 2.0 implementation. Defaults to space (Facebook and GitHub default to comma).
      */
    var scopeSeparator: js.UndefOr[String] = js.undefined
    
    /**
      * boolean that determines if OAuth client id and client secret will be sent
      * as parameters as opposed to an Authorization header.
      * Defaults to false.
      */
    var useParamsAuth: js.UndefOr[Boolean] = js.undefined
  }
  object CustomProtocol2 {
    
    @scala.inline
    def apply(auth: String, profile: ProfileGetter[Credentials2], token: String): CustomProtocol2 = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], protocol = "oauth2", token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomProtocol2]
    }
    
    @scala.inline
    implicit class CustomProtocol2MutableBuilder[Self <: CustomProtocol2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPkce(value: PkceSetting): Self = StObject.set(x, "pkce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPkceUndefined: Self = StObject.set(x, "pkce", js.undefined)
      
      @scala.inline
      def setProfile(value: ProfileGetter[Credentials2]): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: oauth2): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: js.Array[String] | (js.Function1[/* query */ StringLikeMap, js.Array[String]])): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeFunction1(value: /* query */ StringLikeMap => js.Array[String]): Self = StObject.set(x, "scope", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScopeSeparator(value: String): Self = StObject.set(x, "scopeSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeSeparatorUndefined: Self = StObject.set(x, "scopeSeparator", js.undefined)
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
      
      @scala.inline
      def setUseParamsAuth(value: Boolean): Self = StObject.set(x, "useParamsAuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseParamsAuthUndefined: Self = StObject.set(x, "useParamsAuth", js.undefined)
    }
  }
  
  trait CustomProviderOptions
    extends StObject
       with RequiredProviderOptions
       with OptionalOptions
       with BellOptions {
    
    var provider: CustomProtocol1 | CustomProtocol2
  }
  object CustomProviderOptions {
    
    @scala.inline
    def apply(
      clientId: String,
      clientSecret: String,
      password: String,
      provider: CustomProtocol1 | CustomProtocol2
    ): CustomProviderOptions = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomProviderOptions]
    }
    
    @scala.inline
    implicit class CustomProviderOptionsMutableBuilder[Self <: CustomProviderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProvider(value: CustomProtocol1 | CustomProtocol2): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
  
  trait KnownProviderOptions
    extends StObject
       with RequiredProviderOptions
       with OptionalOptions
       with BellOptions {
    
    var provider: Provider
  }
  object KnownProviderOptions {
    
    @scala.inline
    def apply(clientId: String, clientSecret: String, password: String, provider: Provider): KnownProviderOptions = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[KnownProviderOptions]
    }
    
    @scala.inline
    implicit class KnownProviderOptionsMutableBuilder[Self <: KnownProviderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProvider(value: Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionalOptions extends StObject {
    
    /**
      * allows passing query parameters from a bell protected endpoint to the auth request.
      * It will merge the query params you pass along with the providerParams and any other predefined ones.
      * Be aware that this will override predefined query parameters!
      * Default to false.
      */
    var allowRuntimeProviderParams: js.UndefOr[StringLikeMap | Boolean] = js.undefined
    
    /**
      * a configuration object used to customize the provider settings.
      * The built-in 'twitter' provider accepts the `extendedProfile` & `getMethod` options.
      * option which allows disabling the extra profile request when the provider
      * returns the user information in the callback (defaults to true).
      * The built-in 'github' and 'phabricator' providers accept the uri
      * option which allows pointing to a private enterprise installation (e.g. 'https://vpn.example.com').
      * See Providers documentation for more information.
      */
    var config: js.UndefOr[ExtendedProfile | Uri] = js.undefined
    
    /**
      * the name of the cookie used to manage the temporary state.
      * Defaults to 'bell-provider' where 'provider' is the provider name (or 'custom' for custom providers).
      * For example, the Twitter cookie name defaults to 'bell-twitter'.
      */
    var cookie: js.UndefOr[String] = js.undefined
    
    /**
      * the domain scope.
      * Defaults to null (no domain).
      */
    var domain: js.UndefOr[String] = js.undefined
    
    // THESE ARE IN THE *REQUIRED* section but are actually not...
    /**
      * A boolean indicating whether or not you want the redirect_uri to be forced to https.
      * Useful if your hapi application runs as http, but is accessed through https.
      */
    var forceHttps: js.UndefOr[Boolean] = js.undefined
    
    /**
      * sets the cookie HTTP only flag.
      * Defaults to true.
      */
    var isHttpOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * sets the cookie secure flag.
      * Defaults to true.
      */
    var isSecure: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set the base redirect_uri manually if it cannot be inferred properly from server settings.
      * Useful to override port, protocol, and host if proxied or forwarded.
      */
    var location: js.UndefOr[String | (js.Function1[/* req */ Request, String])] = js.undefined
    
    /**
      * an object of key-value pairs that specify additional
      * URL query parameters to send with the profile request to the provider.
      * The built-in facebook provider,
      * for example, could have fields specified to determine the fields returned from the user's graph,
      * which would then be available to you in the auth.credentials.profile.raw object.
      */
    var profileParams: js.UndefOr[StringLikeMap] = js.undefined
    
    /**
      * provider-specific query parameters for the authentication endpoint.
      * It may be passed either as an object to merge into the query string,
      * or a function which takes the client's request and returns an object.
      * Each provider supports its own set of parameters which customize the user's login experience.
      * For example:
      * * Facebook supports `display` ('page', 'popup', or 'touch'), `auth_type`, `auth_nonce`.
      * * Google supports `access_type`, `approval_prompt`, `prompt`, `login_hint`, `user_id`, `hd`.
      * * Twitter supports `force_login`, `screen_name`.
      * * Linkedin supports `fields`.
      */
    var providerParams: js.UndefOr[StringLikeMap | (js.Function1[/* request */ Request, StringLikeMap])] = js.undefined
    
    /**
      * allows passing additional OAuth state from initial request.
      * This must be a function returning a string,
      * which will be appended to the bell internal state parameter for OAuth code flow.
      */
    var runtimeStateCallback: js.UndefOr[js.Function1[/* req */ Request, String]] = js.undefined
    
    /**
      * Each built-in vendor comes with the required scope for basic profile information.
      * Use scope to specify a different scope as required by your application.
      * It may be passed either as an object to merge into the query string,
      * or a function which takes the client's request and returns an object.
      * Consult the provider for their specific supported scopes.
      */
    var scope: js.UndefOr[js.Array[String] | (js.Function1[/* request */ Request, js.Array[String]])] = js.undefined
    
    /**
      * skips obtaining a user profile from the provider.
      * Useful if you need specific scopes,
      * but not the user profile.
      * Defaults to false.
      */
    var skipProfile: js.UndefOr[Boolean] = js.undefined
    
    /**
      * cookie time-to-live in milliseconds.
      * Defaults to null (session time-life - cookies are deleted when the browser is closed).
      */
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object OptionalOptions {
    
    @scala.inline
    def apply(): OptionalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalOptions]
    }
    
    @scala.inline
    implicit class OptionalOptionsMutableBuilder[Self <: OptionalOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowRuntimeProviderParams(value: StringLikeMap | Boolean): Self = StObject.set(x, "allowRuntimeProviderParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowRuntimeProviderParamsUndefined: Self = StObject.set(x, "allowRuntimeProviderParams", js.undefined)
      
      @scala.inline
      def setConfig(value: ExtendedProfile | Uri): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setForceHttps(value: Boolean): Self = StObject.set(x, "forceHttps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceHttpsUndefined: Self = StObject.set(x, "forceHttps", js.undefined)
      
      @scala.inline
      def setIsHttpOnly(value: Boolean): Self = StObject.set(x, "isHttpOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHttpOnlyUndefined: Self = StObject.set(x, "isHttpOnly", js.undefined)
      
      @scala.inline
      def setIsSecure(value: Boolean): Self = StObject.set(x, "isSecure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSecureUndefined: Self = StObject.set(x, "isSecure", js.undefined)
      
      @scala.inline
      def setLocation(value: String | (js.Function1[/* req */ Request, String])): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationFunction1(value: /* req */ Request => String): Self = StObject.set(x, "location", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setProfileParams(value: StringLikeMap): Self = StObject.set(x, "profileParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileParamsUndefined: Self = StObject.set(x, "profileParams", js.undefined)
      
      @scala.inline
      def setProviderParams(value: StringLikeMap | (js.Function1[/* request */ Request, StringLikeMap])): Self = StObject.set(x, "providerParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderParamsFunction1(value: /* request */ Request => StringLikeMap): Self = StObject.set(x, "providerParams", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProviderParamsUndefined: Self = StObject.set(x, "providerParams", js.undefined)
      
      @scala.inline
      def setRuntimeStateCallback(value: /* req */ Request => String): Self = StObject.set(x, "runtimeStateCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRuntimeStateCallbackUndefined: Self = StObject.set(x, "runtimeStateCallback", js.undefined)
      
      @scala.inline
      def setScope(value: js.Array[String] | (js.Function1[/* request */ Request, js.Array[String]])): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeFunction1(value: /* request */ Request => js.Array[String]): Self = StObject.set(x, "scope", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
      
      @scala.inline
      def setSkipProfile(value: Boolean): Self = StObject.set(x, "skipProfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipProfileUndefined: Self = StObject.set(x, "skipProfile", js.undefined)
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.hapiBell.hapiBellStrings.plain
    - typings.hapiBell.hapiBellStrings.S256
  */
  trait PkceSetting extends StObject
  object PkceSetting {
    
    @scala.inline
    def S256: typings.hapiBell.hapiBellStrings.S256 = "S256".asInstanceOf[typings.hapiBell.hapiBellStrings.S256]
    
    @scala.inline
    def plain: typings.hapiBell.hapiBellStrings.plain = "plain".asInstanceOf[typings.hapiBell.hapiBellStrings.plain]
  }
  
  type ProfileGetter[C /* <: Credentials */] = js.ThisFunction3[
    /* this */ CustomProviderOptions, 
    /* credentials */ C, 
    /* params */ StringDictionary[String], 
    /* get */ AuthedRequest, 
    js.Promise[Unit]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.hapiBell.hapiBellStrings.arcgisonline
    - typings.hapiBell.hapiBellStrings.auth0
    - typings.hapiBell.hapiBellStrings.azure
    - typings.hapiBell.hapiBellStrings.bitbucket
    - typings.hapiBell.hapiBellStrings.cognito
    - typings.hapiBell.hapiBellStrings.digitalocean
    - typings.hapiBell.hapiBellStrings.discord
    - typings.hapiBell.hapiBellStrings.dropbox
    - typings.hapiBell.hapiBellStrings.facebook
    - typings.hapiBell.hapiBellStrings.fitbit
    - typings.hapiBell.hapiBellStrings.foursquare
    - typings.hapiBell.hapiBellStrings.github
    - typings.hapiBell.hapiBellStrings.gitlab
    - typings.hapiBell.hapiBellStrings.google
    - typings.hapiBell.hapiBellStrings.googleplus
    - typings.hapiBell.hapiBellStrings.instagram
    - typings.hapiBell.hapiBellStrings.linkedin
    - typings.hapiBell.hapiBellStrings.live
    - typings.hapiBell.hapiBellStrings.medium
    - typings.hapiBell.hapiBellStrings.meetup
    - typings.hapiBell.hapiBellStrings.mixer
    - typings.hapiBell.hapiBellStrings.nest
    - typings.hapiBell.hapiBellStrings.okta
    - typings.hapiBell.hapiBellStrings.phabricator
    - typings.hapiBell.hapiBellStrings.pingfed
    - typings.hapiBell.hapiBellStrings.pinterest
    - typings.hapiBell.hapiBellStrings.reddit
    - typings.hapiBell.hapiBellStrings.salesforce
    - typings.hapiBell.hapiBellStrings.slack
    - typings.hapiBell.hapiBellStrings.spotify
    - typings.hapiBell.hapiBellStrings.stripe
    - typings.hapiBell.hapiBellStrings.trakt
    - typings.hapiBell.hapiBellStrings.tumblr
    - typings.hapiBell.hapiBellStrings.twitch
    - typings.hapiBell.hapiBellStrings.twitter
    - typings.hapiBell.hapiBellStrings.vk
    - typings.hapiBell.hapiBellStrings.wordpress
    - typings.hapiBell.hapiBellStrings.yahoo
  */
  trait Provider extends StObject
  object Provider {
    
    @scala.inline
    def arcgisonline: typings.hapiBell.hapiBellStrings.arcgisonline = "arcgisonline".asInstanceOf[typings.hapiBell.hapiBellStrings.arcgisonline]
    
    @scala.inline
    def auth0: typings.hapiBell.hapiBellStrings.auth0 = "auth0".asInstanceOf[typings.hapiBell.hapiBellStrings.auth0]
    
    @scala.inline
    def azure: typings.hapiBell.hapiBellStrings.azure = "azure".asInstanceOf[typings.hapiBell.hapiBellStrings.azure]
    
    @scala.inline
    def bitbucket: typings.hapiBell.hapiBellStrings.bitbucket = "bitbucket".asInstanceOf[typings.hapiBell.hapiBellStrings.bitbucket]
    
    @scala.inline
    def cognito: typings.hapiBell.hapiBellStrings.cognito = "cognito".asInstanceOf[typings.hapiBell.hapiBellStrings.cognito]
    
    @scala.inline
    def digitalocean: typings.hapiBell.hapiBellStrings.digitalocean = "digitalocean".asInstanceOf[typings.hapiBell.hapiBellStrings.digitalocean]
    
    @scala.inline
    def discord: typings.hapiBell.hapiBellStrings.discord = "discord".asInstanceOf[typings.hapiBell.hapiBellStrings.discord]
    
    @scala.inline
    def dropbox: typings.hapiBell.hapiBellStrings.dropbox = "dropbox".asInstanceOf[typings.hapiBell.hapiBellStrings.dropbox]
    
    @scala.inline
    def facebook: typings.hapiBell.hapiBellStrings.facebook = "facebook".asInstanceOf[typings.hapiBell.hapiBellStrings.facebook]
    
    @scala.inline
    def fitbit: typings.hapiBell.hapiBellStrings.fitbit = "fitbit".asInstanceOf[typings.hapiBell.hapiBellStrings.fitbit]
    
    @scala.inline
    def foursquare: typings.hapiBell.hapiBellStrings.foursquare = "foursquare".asInstanceOf[typings.hapiBell.hapiBellStrings.foursquare]
    
    @scala.inline
    def github: typings.hapiBell.hapiBellStrings.github = "github".asInstanceOf[typings.hapiBell.hapiBellStrings.github]
    
    @scala.inline
    def gitlab: typings.hapiBell.hapiBellStrings.gitlab = "gitlab".asInstanceOf[typings.hapiBell.hapiBellStrings.gitlab]
    
    @scala.inline
    def google: typings.hapiBell.hapiBellStrings.google = "google".asInstanceOf[typings.hapiBell.hapiBellStrings.google]
    
    @scala.inline
    def googleplus: typings.hapiBell.hapiBellStrings.googleplus = "googleplus".asInstanceOf[typings.hapiBell.hapiBellStrings.googleplus]
    
    @scala.inline
    def instagram: typings.hapiBell.hapiBellStrings.instagram = "instagram".asInstanceOf[typings.hapiBell.hapiBellStrings.instagram]
    
    @scala.inline
    def linkedin: typings.hapiBell.hapiBellStrings.linkedin = "linkedin".asInstanceOf[typings.hapiBell.hapiBellStrings.linkedin]
    
    @scala.inline
    def live: typings.hapiBell.hapiBellStrings.live = "live".asInstanceOf[typings.hapiBell.hapiBellStrings.live]
    
    @scala.inline
    def medium: typings.hapiBell.hapiBellStrings.medium = "medium".asInstanceOf[typings.hapiBell.hapiBellStrings.medium]
    
    @scala.inline
    def meetup: typings.hapiBell.hapiBellStrings.meetup = "meetup".asInstanceOf[typings.hapiBell.hapiBellStrings.meetup]
    
    @scala.inline
    def mixer: typings.hapiBell.hapiBellStrings.mixer = "mixer".asInstanceOf[typings.hapiBell.hapiBellStrings.mixer]
    
    @scala.inline
    def nest: typings.hapiBell.hapiBellStrings.nest = "nest".asInstanceOf[typings.hapiBell.hapiBellStrings.nest]
    
    @scala.inline
    def okta: typings.hapiBell.hapiBellStrings.okta = "okta".asInstanceOf[typings.hapiBell.hapiBellStrings.okta]
    
    @scala.inline
    def phabricator: typings.hapiBell.hapiBellStrings.phabricator = "phabricator".asInstanceOf[typings.hapiBell.hapiBellStrings.phabricator]
    
    @scala.inline
    def pingfed: typings.hapiBell.hapiBellStrings.pingfed = "pingfed".asInstanceOf[typings.hapiBell.hapiBellStrings.pingfed]
    
    @scala.inline
    def pinterest: typings.hapiBell.hapiBellStrings.pinterest = "pinterest".asInstanceOf[typings.hapiBell.hapiBellStrings.pinterest]
    
    @scala.inline
    def reddit: typings.hapiBell.hapiBellStrings.reddit = "reddit".asInstanceOf[typings.hapiBell.hapiBellStrings.reddit]
    
    @scala.inline
    def salesforce: typings.hapiBell.hapiBellStrings.salesforce = "salesforce".asInstanceOf[typings.hapiBell.hapiBellStrings.salesforce]
    
    @scala.inline
    def slack: typings.hapiBell.hapiBellStrings.slack = "slack".asInstanceOf[typings.hapiBell.hapiBellStrings.slack]
    
    @scala.inline
    def spotify: typings.hapiBell.hapiBellStrings.spotify = "spotify".asInstanceOf[typings.hapiBell.hapiBellStrings.spotify]
    
    @scala.inline
    def stripe: typings.hapiBell.hapiBellStrings.stripe = "stripe".asInstanceOf[typings.hapiBell.hapiBellStrings.stripe]
    
    @scala.inline
    def trakt: typings.hapiBell.hapiBellStrings.trakt = "trakt".asInstanceOf[typings.hapiBell.hapiBellStrings.trakt]
    
    @scala.inline
    def tumblr: typings.hapiBell.hapiBellStrings.tumblr = "tumblr".asInstanceOf[typings.hapiBell.hapiBellStrings.tumblr]
    
    @scala.inline
    def twitch: typings.hapiBell.hapiBellStrings.twitch = "twitch".asInstanceOf[typings.hapiBell.hapiBellStrings.twitch]
    
    @scala.inline
    def twitter: typings.hapiBell.hapiBellStrings.twitter = "twitter".asInstanceOf[typings.hapiBell.hapiBellStrings.twitter]
    
    @scala.inline
    def vk: typings.hapiBell.hapiBellStrings.vk = "vk".asInstanceOf[typings.hapiBell.hapiBellStrings.vk]
    
    @scala.inline
    def wordpress: typings.hapiBell.hapiBellStrings.wordpress = "wordpress".asInstanceOf[typings.hapiBell.hapiBellStrings.wordpress]
    
    @scala.inline
    def yahoo: typings.hapiBell.hapiBellStrings.yahoo = "yahoo".asInstanceOf[typings.hapiBell.hapiBellStrings.yahoo]
  }
  
  type RequestPassThrough = js.Function1[/* request */ Request, js.Thenable[AuthCredentials] | AuthCredentials]
  
  trait RequiredProviderOptions extends StObject {
    
    /**
      * the OAuth client identifier (consumer key).
      */
    var clientId: String
    
    /**
      * the OAuth client secret (consumer secret)
      */
    var clientSecret: String
    
    /**
      * the cookie encryption password.
      * Used to encrypt the temporary state cookie used by the module in
      * between the authorization protocol steps.
      */
    var password: String
  }
  object RequiredProviderOptions {
    
    @scala.inline
    def apply(clientId: String, clientSecret: String, password: String): RequiredProviderOptions = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredProviderOptions]
    }
    
    @scala.inline
    implicit class RequiredProviderOptionsMutableBuilder[Self <: RequiredProviderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    }
  }
  
  type StringLikeMap = StringDictionary[String | Double]
  
  /* augmented module */
  object hapiHapiAugmentingMod {
    
    trait ServerAuth extends StObject {
      
      @JSName("strategy")
      def strategy_bell(name: String, scheme: bell, options: BellOptions): Unit
    }
    object ServerAuth {
      
      @scala.inline
      def apply(strategy: (String, bell, BellOptions) => Unit): ServerAuth = {
        val __obj = js.Dynamic.literal(strategy = js.Any.fromFunction3(strategy))
        __obj.asInstanceOf[ServerAuth]
      }
      
      @scala.inline
      implicit class ServerAuthMutableBuilder[Self <: ServerAuth] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setStrategy(value: (String, bell, BellOptions) => Unit): Self = StObject.set(x, "strategy", js.Any.fromFunction3(value))
      }
    }
  }
}
