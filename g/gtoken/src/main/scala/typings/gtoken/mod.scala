package typings.gtoken

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gtoken", "GoogleToken")
  @js.native
  /**
    * Create a GoogleToken.
    *
    * @param options  Configuration object.
    */
  class GoogleToken () extends StObject {
    def this(options: TokenOptions) = this()
    
    def accessToken: js.UndefOr[String] = js.native
    
    var additionalClaims: js.UndefOr[js.Object] = js.native
    
    /**
      * Configure the GoogleToken for re-use.
      * @param  {object} options Configuration object.
      */
    var configure: js.Any = js.native
    
    var email: js.UndefOr[String] = js.native
    
    var ensureEmail: js.Any = js.native
    
    var expiresAt: js.UndefOr[Double] = js.native
    
    /**
      * Given a keyFile, extract the key and client email if available
      * @param keyFile Path to a json, pem, or p12 file that contains the key.
      * @returns an object with privateKey and clientEmail properties
      */
    def getCredentials(keyFile: String): js.Promise[Credentials] = js.native
    
    /**
      * Returns a cached token or retrieves a new one from Google.
      *
      * @param callback The callback function.
      */
    def getToken(): js.Promise[TokenData] = js.native
    def getToken(callback: GetTokenCallback): Unit = js.native
    def getToken(callback: GetTokenCallback, opts: GetTokenOptions): Unit = js.native
    def getToken(opts: GetTokenOptions): js.Promise[TokenData] = js.native
    
    var getTokenAsync: js.Any = js.native
    
    var getTokenAsyncInner: js.Any = js.native
    
    /**
      * Returns whether the token has expired.
      *
      * @return true if the token has expired, false otherwise.
      */
    def hasExpired(): Boolean = js.native
    
    def idToken: js.UndefOr[String] = js.native
    
    var inFlightRequest: js.Any = js.native
    
    var iss: js.UndefOr[String] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var keyFile: js.UndefOr[String] = js.native
    
    var rawToken: js.UndefOr[TokenData] = js.native
    
    def refreshToken: js.UndefOr[String] = js.native
    
    /**
      * Request the token from Google.
      */
    var requestToken: js.Any = js.native
    
    /**
      * Revoke the token if one is set.
      *
      * @param callback The callback function.
      */
    def revokeToken(): js.Promise[Unit] = js.native
    def revokeToken(callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    
    var revokeTokenAsync: js.Any = js.native
    
    var scope: js.UndefOr[String] = js.native
    
    var sub: js.UndefOr[String] = js.native
    
    var tokenExpires: js.UndefOr[Double] = js.native
    
    def tokenType: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait Credentials extends StObject {
    
    var clientEmail: js.UndefOr[String] = js.native
    
    var privateKey: String = js.native
  }
  object Credentials {
    
    @scala.inline
    def apply(privateKey: String): Credentials = {
      val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    @scala.inline
    implicit class CredentialsMutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientEmail(value: String): Self = StObject.set(x, "clientEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientEmailUndefined: Self = StObject.set(x, "clientEmail", js.undefined)
      
      @scala.inline
      def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    }
  }
  
  type GetTokenCallback = js.Function2[/* err */ Error | Null, /* token */ js.UndefOr[TokenData], Unit]
  
  @js.native
  trait GetTokenOptions extends StObject {
    
    var forceRefresh: js.UndefOr[Boolean] = js.native
  }
  object GetTokenOptions {
    
    @scala.inline
    def apply(): GetTokenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetTokenOptions]
    }
    
    @scala.inline
    implicit class GetTokenOptionsMutableBuilder[Self <: GetTokenOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForceRefresh(value: Boolean): Self = StObject.set(x, "forceRefresh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceRefreshUndefined: Self = StObject.set(x, "forceRefresh", js.undefined)
    }
  }
  
  @js.native
  trait TokenData extends StObject {
    
    var access_token: js.UndefOr[String] = js.native
    
    var expires_in: js.UndefOr[Double] = js.native
    
    var id_token: js.UndefOr[String] = js.native
    
    var refresh_token: js.UndefOr[String] = js.native
    
    var token_type: js.UndefOr[String] = js.native
  }
  object TokenData {
    
    @scala.inline
    def apply(): TokenData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenData]
    }
    
    @scala.inline
    implicit class TokenDataMutableBuilder[Self <: TokenData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      @scala.inline
      def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpires_inUndefined: Self = StObject.set(x, "expires_in", js.undefined)
      
      @scala.inline
      def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId_tokenUndefined: Self = StObject.set(x, "id_token", js.undefined)
      
      @scala.inline
      def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
      
      @scala.inline
      def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken_typeUndefined: Self = StObject.set(x, "token_type", js.undefined)
    }
  }
  
  @js.native
  trait TokenOptions extends StObject {
    
    var additionalClaims: js.UndefOr[js.Object] = js.native
    
    var email: js.UndefOr[String] = js.native
    
    var iss: js.UndefOr[String] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var keyFile: js.UndefOr[String] = js.native
    
    var scope: js.UndefOr[String | js.Array[String]] = js.native
    
    var sub: js.UndefOr[String] = js.native
  }
  object TokenOptions {
    
    @scala.inline
    def apply(): TokenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenOptions]
    }
    
    @scala.inline
    implicit class TokenOptionsMutableBuilder[Self <: TokenOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalClaims(value: js.Object): Self = StObject.set(x, "additionalClaims", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalClaimsUndefined: Self = StObject.set(x, "additionalClaims", js.undefined)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssUndefined: Self = StObject.set(x, "iss", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyFile(value: String): Self = StObject.set(x, "keyFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyFileUndefined: Self = StObject.set(x, "keyFile", js.undefined)
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
      
      @scala.inline
      def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
    }
  }
}
