package typings.gtoken

import typings.gaxios.buildSrcCommonMod.GaxiosOptions
import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gtoken", "GoogleToken")
  @js.native
  /**
    * Create a GoogleToken.
    *
    * @param options  Configuration object.
    */
  open class GoogleToken () extends StObject {
    def this(options: TokenOptions) = this()
    
    def accessToken: js.UndefOr[String] = js.native
    
    var additionalClaims: js.UndefOr[js.Object] = js.native
    
    /**
      * Configure the GoogleToken for re-use.
      * @param  {object} options Configuration object.
      */
    /* private */ var configure: Any = js.native
    
    var eagerRefreshThresholdMillis: js.UndefOr[Double] = js.native
    
    var email: js.UndefOr[String] = js.native
    
    /* private */ var ensureEmail: Any = js.native
    
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
    
    /* private */ var getTokenAsync: Any = js.native
    
    /* private */ var getTokenAsyncInner: Any = js.native
    
    /**
      * Returns whether the token has expired.
      *
      * @return true if the token has expired, false otherwise.
      */
    def hasExpired(): Boolean = js.native
    
    def idToken: js.UndefOr[String] = js.native
    
    /* private */ var inFlightRequest: Any = js.native
    
    /**
      * Returns whether the token will expire within eagerRefreshThresholdMillis
      *
      * @return true if the token will be expired within eagerRefreshThresholdMillis, false otherwise.
      */
    def isTokenExpiring(): Boolean = js.native
    
    var iss: js.UndefOr[String] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var keyFile: js.UndefOr[String] = js.native
    
    var rawToken: js.UndefOr[TokenData] = js.native
    
    def refreshToken: js.UndefOr[String] = js.native
    
    /**
      * Request the token from Google.
      */
    /* private */ var requestToken: Any = js.native
    
    /**
      * Revoke the token if one is set.
      *
      * @param callback The callback function.
      */
    def revokeToken(): js.Promise[Unit] = js.native
    def revokeToken(callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    /* private */ var revokeTokenAsync: Any = js.native
    
    var scope: js.UndefOr[String] = js.native
    
    var sub: js.UndefOr[String] = js.native
    
    var tokenExpires: js.UndefOr[Double] = js.native
    
    def tokenType: js.UndefOr[String] = js.native
    
    var transporter: Transporter = js.native
  }
  
  trait Credentials extends StObject {
    
    var clientEmail: js.UndefOr[String] = js.undefined
    
    var privateKey: String
  }
  object Credentials {
    
    inline def apply(privateKey: String): Credentials = {
      val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
      
      inline def setClientEmail(value: String): Self = StObject.set(x, "clientEmail", value.asInstanceOf[js.Any])
      
      inline def setClientEmailUndefined: Self = StObject.set(x, "clientEmail", js.undefined)
      
      inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    }
  }
  
  type GetTokenCallback = js.Function2[/* err */ js.Error | Null, /* token */ js.UndefOr[TokenData], Unit]
  
  trait GetTokenOptions extends StObject {
    
    var forceRefresh: js.UndefOr[Boolean] = js.undefined
  }
  object GetTokenOptions {
    
    inline def apply(): GetTokenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetTokenOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetTokenOptions] (val x: Self) extends AnyVal {
      
      inline def setForceRefresh(value: Boolean): Self = StObject.set(x, "forceRefresh", value.asInstanceOf[js.Any])
      
      inline def setForceRefreshUndefined: Self = StObject.set(x, "forceRefresh", js.undefined)
    }
  }
  
  trait TokenData extends StObject {
    
    var access_token: js.UndefOr[String] = js.undefined
    
    var expires_in: js.UndefOr[Double] = js.undefined
    
    var id_token: js.UndefOr[String] = js.undefined
    
    var refresh_token: js.UndefOr[String] = js.undefined
    
    var token_type: js.UndefOr[String] = js.undefined
  }
  object TokenData {
    
    inline def apply(): TokenData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenData] (val x: Self) extends AnyVal {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
      
      inline def setExpires_inUndefined: Self = StObject.set(x, "expires_in", js.undefined)
      
      inline def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
      
      inline def setId_tokenUndefined: Self = StObject.set(x, "id_token", js.undefined)
      
      inline def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
      
      inline def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
      
      inline def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
      
      inline def setToken_typeUndefined: Self = StObject.set(x, "token_type", js.undefined)
    }
  }
  
  trait TokenOptions extends StObject {
    
    var additionalClaims: js.UndefOr[js.Object] = js.undefined
    
    var eagerRefreshThresholdMillis: js.UndefOr[Double] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var iss: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var keyFile: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var sub: js.UndefOr[String] = js.undefined
    
    var transporter: js.UndefOr[Transporter] = js.undefined
  }
  object TokenOptions {
    
    inline def apply(): TokenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenOptions] (val x: Self) extends AnyVal {
      
      inline def setAdditionalClaims(value: js.Object): Self = StObject.set(x, "additionalClaims", value.asInstanceOf[js.Any])
      
      inline def setAdditionalClaimsUndefined: Self = StObject.set(x, "additionalClaims", js.undefined)
      
      inline def setEagerRefreshThresholdMillis(value: Double): Self = StObject.set(x, "eagerRefreshThresholdMillis", value.asInstanceOf[js.Any])
      
      inline def setEagerRefreshThresholdMillisUndefined: Self = StObject.set(x, "eagerRefreshThresholdMillis", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setIssUndefined: Self = StObject.set(x, "iss", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyFile(value: String): Self = StObject.set(x, "keyFile", value.asInstanceOf[js.Any])
      
      inline def setKeyFileUndefined: Self = StObject.set(x, "keyFile", js.undefined)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
      
      inline def setTransporter(value: Transporter): Self = StObject.set(x, "transporter", value.asInstanceOf[js.Any])
      
      inline def setTransporterUndefined: Self = StObject.set(x, "transporter", js.undefined)
    }
  }
  
  trait Transporter extends StObject {
    
    def request[T](opts: GaxiosOptions): GaxiosPromise[T]
  }
  object Transporter {
    
    inline def apply(request: GaxiosOptions => GaxiosPromise[Any]): Transporter = {
      val __obj = js.Dynamic.literal(request = js.Any.fromFunction1(request))
      __obj.asInstanceOf[Transporter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Transporter] (val x: Self) extends AnyVal {
      
      inline def setRequest(value: GaxiosOptions => GaxiosPromise[Any]): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
    }
  }
}
