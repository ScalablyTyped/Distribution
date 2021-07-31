package typings.jsforce

import typings.jsforce.anon.Scope
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oauth2Mod {
  
  @JSImport("jsforce/oauth2", "OAuth2")
  @js.native
  class OAuth2 () extends StObject {
    def this(options: OAuth2Options) = this()
    
    def authenticate(username: String, password: String): js.Promise[TokenResponse] = js.native
    def authenticate(
      username: String,
      password: String,
      callback: js.Function2[/* err */ Error, /* tokenResponse */ TokenResponse, Unit]
    ): js.Promise[TokenResponse] = js.native
    
    var authzServiceUrl: String = js.native
    
    var clientId: String = js.native
    
    var clientSecret: String = js.native
    
    def getAuthorizationUrl(params: Scope): String = js.native
    
    var loginUrl: String = js.native
    
    var redirectUri: String = js.native
    
    def refreshToken(code: String): js.Promise[TokenResponse] = js.native
    def refreshToken(code: String, callback: js.Function2[/* err */ Error, /* tokenResponse */ TokenResponse, Unit]): js.Promise[TokenResponse] = js.native
    
    def requestToken(code: String): js.Promise[TokenResponse] = js.native
    def requestToken(code: String, callback: js.Function2[/* err */ Error, /* tokenResponse */ TokenResponse, Unit]): js.Promise[TokenResponse] = js.native
    
    var revokeServiceUrl: String = js.native
    
    def revokeToken(accessToken: String): js.Promise[Unit] = js.native
    def revokeToken(accessToken: String, callback: js.Function1[/* err */ Error, Unit]): js.Promise[Unit] = js.native
    
    var tokenServiceUrl: String = js.native
  }
  
  trait OAuth2Options extends StObject {
    
    var authCode: js.UndefOr[String] = js.undefined
    
    var authzServiceUrl: js.UndefOr[String] = js.undefined
    
    var clientId: js.UndefOr[String] = js.undefined
    
    var clientSecret: js.UndefOr[String] = js.undefined
    
    var httpProxy: js.UndefOr[String] = js.undefined
    
    var loginUrl: js.UndefOr[String] = js.undefined
    
    var privateKey: js.UndefOr[String] = js.undefined
    
    var privateKeyFile: js.UndefOr[String] = js.undefined
    
    var proxyUrl: js.UndefOr[String] = js.undefined
    
    var redirectUri: js.UndefOr[String] = js.undefined
    
    var refreshToken: js.UndefOr[String] = js.undefined
    
    var revokeServiceUrl: js.UndefOr[String] = js.undefined
    
    var tokenServiceUrl: js.UndefOr[String] = js.undefined
  }
  object OAuth2Options {
    
    @scala.inline
    def apply(): OAuth2Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OAuth2Options]
    }
    
    @scala.inline
    implicit class OAuth2OptionsMutableBuilder[Self <: OAuth2Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthCode(value: String): Self = StObject.set(x, "authCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthCodeUndefined: Self = StObject.set(x, "authCode", js.undefined)
      
      @scala.inline
      def setAuthzServiceUrl(value: String): Self = StObject.set(x, "authzServiceUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthzServiceUrlUndefined: Self = StObject.set(x, "authzServiceUrl", js.undefined)
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      @scala.inline
      def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      @scala.inline
      def setHttpProxy(value: String): Self = StObject.set(x, "httpProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpProxyUndefined: Self = StObject.set(x, "httpProxy", js.undefined)
      
      @scala.inline
      def setLoginUrl(value: String): Self = StObject.set(x, "loginUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoginUrlUndefined: Self = StObject.set(x, "loginUrl", js.undefined)
      
      @scala.inline
      def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyFile(value: String): Self = StObject.set(x, "privateKeyFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyFileUndefined: Self = StObject.set(x, "privateKeyFile", js.undefined)
      
      @scala.inline
      def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
      
      @scala.inline
      def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUrlUndefined: Self = StObject.set(x, "proxyUrl", js.undefined)
      
      @scala.inline
      def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
      
      @scala.inline
      def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
      
      @scala.inline
      def setRevokeServiceUrl(value: String): Self = StObject.set(x, "revokeServiceUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevokeServiceUrlUndefined: Self = StObject.set(x, "revokeServiceUrl", js.undefined)
      
      @scala.inline
      def setTokenServiceUrl(value: String): Self = StObject.set(x, "tokenServiceUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenServiceUrlUndefined: Self = StObject.set(x, "tokenServiceUrl", js.undefined)
    }
  }
  
  trait TokenResponse extends StObject {
    
    var access_token: String
    
    var refresh_token: String
  }
  object TokenResponse {
    
    @scala.inline
    def apply(access_token: String, refresh_token: String): TokenResponse = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], refresh_token = refresh_token.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenResponse]
    }
    
    @scala.inline
    implicit class TokenResponseMutableBuilder[Self <: TokenResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
    }
  }
}
