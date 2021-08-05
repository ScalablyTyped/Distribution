package typings.ibmCloudSdkCore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseServiceMod {
  
  @JSImport("ibm-cloud-sdk-core/lib/base_service", "BaseService")
  @js.native
  class BaseService protected () extends StObject {
    /**
      * Internal base class that other services inherit from
      * @param {UserOptions} options
      * @param {string} [options.username] - required unless use_unauthenticated is set
      * @param {string} [options.password] - required unless use_unauthenticated is set
      * @param {boolean} [options.use_unauthenticated] - skip credential requirement
      * @param {HeaderOptions} [options.headers]
      * @param {boolean} [options.headers.X-Watson-Learning-Opt-Out=false] - opt-out of data collection
      * @param {string} [options.url] - override default service base url
      * @private
      * @abstract
      * @constructor
      * @throws {Error}
      * @returns {BaseService}
      */
    def this(userOptions: UserOptions) = this()
    
    /* protected */ var _options: BaseServiceOptions = js.native
    
    /**
      * Wrapper around `sendRequest` that determines whether or not IAM tokens
      * are being used to authenticate the request. If so, the token is
      * retrieved by the token manager.
      *
      * @param {Object} parameters - service request options passed in by user
      * @param {Function} callback - callback function to pass the response back to
      * @returns {ReadableStream|undefined}
      */
    /* protected */ def createRequest(parameters: js.Any, callback: js.Any): js.Any = js.native
    
    /**
      * Pulls credentials from VCAP_SERVICES env property that bluemix sets
      * @param {string} vcap_services_name
      * @private
      * @returns {Credentials}
      */
    /* private */ var getCredentialsFromBluemix: js.Any = js.native
    
    /**
      * Pulls credentials from env properties
      *
      * Property checked is uppercase service.name suffixed by _USERNAME and _PASSWORD
      *
      * For example, if service.name is speech_to_text,
      * env properties are SPEECH_TO_TEXT_USERNAME and SPEECH_TO_TEXT_PASSWORD
      *
      * @private
      * @param {string} name - the service snake case name
      * @returns {Credentials}
      */
    /* private */ var getCredentialsFromEnvironment: js.Any = js.native
    
    /**
      * Retrieve this service's credentials - useful for passing to the authorization service
      *
      * Only returns a URL when token auth is used.
      *
      * @returns {Credentials}
      */
    def getServiceCredentials(): Credentials = js.native
    
    /**
      * @private
      * @param {UserOptions} options
      * @returns {BaseServiceOptions}
      */
    /* private */ var initCredentials: js.Any = js.native
    
    var name: String = js.native
    
    /**
      * Guarantee that the next request you make will be IAM authenticated. This
      * performs any requests necessary to get a valid IAM token so that if your
      * next request involves a streaming operation, it will not be interrupted.
      *
      * @param {Function} callback - callback function to return flow of execution
      *
      * @returns {void}
      */
    /* protected */ def preAuthenticate(callback: js.Any): Unit = js.native
    
    /* protected */ var serviceDefaults: js.Object = js.native
    
    var serviceVersion: String = js.native
    
    /**
      * Set an IAM access token to use when authenticating with the service.
      * The access token should be valid and not yet expired.
      *
      * By using this method, you accept responsibility for managing the
      * access token yourself. You must set a new access token before this
      * one expires. Failing to do so will result in authentication errors
      * after this token expires.
      *
      * @param {string} iam_access_token - A valid, non-expired IAM access token
      * @returns {void}
      */
    def setAccessToken(iam_access_token: String): Unit = js.native
    
    /* protected */ var tokenManager: js.Any = js.native
  }
  /* static members */
  object BaseService {
    
    @JSImport("ibm-cloud-sdk-core/lib/base_service", "BaseService")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ibm-cloud-sdk-core/lib/base_service", "BaseService.URL")
    @js.native
    def URL: String = js.native
    inline def URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URL")(x.asInstanceOf[js.Any])
  }
  
  trait BaseServiceOptions
    extends StObject
       with UserOptions {
    
    @JSName("headers")
    var headers_BaseServiceOptions: HeaderOptions
    
    var qs: js.Any
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    @JSName("url")
    var url_BaseServiceOptions: String
  }
  object BaseServiceOptions {
    
    inline def apply(headers: HeaderOptions, qs: js.Any, url: String): BaseServiceOptions = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], qs = qs.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseServiceOptions]
    }
    
    extension [Self <: BaseServiceOptions](x: Self) {
      
      inline def setHeaders(value: HeaderOptions): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setQs(value: js.Any): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Credentials extends StObject {
    
    var iam_access_token: js.UndefOr[String] = js.undefined
    
    var iam_apikey: js.UndefOr[String] = js.undefined
    
    var iam_url: js.UndefOr[String] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object Credentials {
    
    inline def apply(): Credentials = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Credentials]
    }
    
    extension [Self <: Credentials](x: Self) {
      
      inline def setIam_access_token(value: String): Self = StObject.set(x, "iam_access_token", value.asInstanceOf[js.Any])
      
      inline def setIam_access_tokenUndefined: Self = StObject.set(x, "iam_access_token", js.undefined)
      
      inline def setIam_apikey(value: String): Self = StObject.set(x, "iam_apikey", value.asInstanceOf[js.Any])
      
      inline def setIam_apikeyUndefined: Self = StObject.set(x, "iam_apikey", js.undefined)
      
      inline def setIam_url(value: String): Self = StObject.set(x, "iam_url", value.asInstanceOf[js.Any])
      
      inline def setIam_urlUndefined: Self = StObject.set(x, "iam_url", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait HeaderOptions
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var `X-Watson-Learning-Opt-Out`: js.UndefOr[Boolean] = js.undefined
  }
  object HeaderOptions {
    
    inline def apply(): HeaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderOptions]
    }
    
    extension [Self <: HeaderOptions](x: Self) {
      
      inline def `setX-Watson-Learning-Opt-Out`(value: Boolean): Self = StObject.set(x, "X-Watson-Learning-Opt-Out", value.asInstanceOf[js.Any])
      
      inline def `setX-Watson-Learning-Opt-OutUndefined`: Self = StObject.set(x, "X-Watson-Learning-Opt-Out", js.undefined)
    }
  }
  
  trait UserOptions extends StObject {
    
    var apikey: js.UndefOr[String] = js.undefined
    
    var disable_ssl_verification: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[HeaderOptions] = js.undefined
    
    var iam_access_token: js.UndefOr[String] = js.undefined
    
    var iam_apikey: js.UndefOr[String] = js.undefined
    
    var iam_url: js.UndefOr[String] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var use_unauthenticated: js.UndefOr[Boolean] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object UserOptions {
    
    inline def apply(): UserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserOptions]
    }
    
    extension [Self <: UserOptions](x: Self) {
      
      inline def setApikey(value: String): Self = StObject.set(x, "apikey", value.asInstanceOf[js.Any])
      
      inline def setApikeyUndefined: Self = StObject.set(x, "apikey", js.undefined)
      
      inline def setDisable_ssl_verification(value: Boolean): Self = StObject.set(x, "disable_ssl_verification", value.asInstanceOf[js.Any])
      
      inline def setDisable_ssl_verificationUndefined: Self = StObject.set(x, "disable_ssl_verification", js.undefined)
      
      inline def setHeaders(value: HeaderOptions): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIam_access_token(value: String): Self = StObject.set(x, "iam_access_token", value.asInstanceOf[js.Any])
      
      inline def setIam_access_tokenUndefined: Self = StObject.set(x, "iam_access_token", js.undefined)
      
      inline def setIam_apikey(value: String): Self = StObject.set(x, "iam_apikey", value.asInstanceOf[js.Any])
      
      inline def setIam_apikeyUndefined: Self = StObject.set(x, "iam_apikey", js.undefined)
      
      inline def setIam_url(value: String): Self = StObject.set(x, "iam_url", value.asInstanceOf[js.Any])
      
      inline def setIam_urlUndefined: Self = StObject.set(x, "iam_url", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUse_unauthenticated(value: Boolean): Self = StObject.set(x, "use_unauthenticated", value.asInstanceOf[js.Any])
      
      inline def setUse_unauthenticatedUndefined: Self = StObject.set(x, "use_unauthenticated", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
