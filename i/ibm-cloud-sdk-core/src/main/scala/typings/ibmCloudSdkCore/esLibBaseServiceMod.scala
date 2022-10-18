package typings.ibmCloudSdkCore

import org.scalablytyped.runtime.StringDictionary
import typings.axios.mod.AxiosInstance
import typings.ibmCloudSdkCore.esAuthAuthenticatorsAuthenticatorInterfaceMod.AuthenticatorInterface
import typings.ibmCloudSdkCore.esLibRequestWrapperMod.RetryOptions
import typings.node.httpMod.OutgoingHttpHeaders
import typings.toughCookie.mod.CookieJar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLibBaseServiceMod {
  
  @JSImport("ibm-cloud-sdk-core/es/lib/base-service", "BaseService")
  @js.native
  open class BaseService protected () extends StObject {
    /**
      * Configuration values for a service.
      * @param {Authenticator} userOptions.authenticator Object used to authenticate requests to the service.
      * @param {string} [userOptions.serviceUrl] The base url to use when contacting the service.
      *   The base url may differ between IBM Cloud regions.
      * @param {object<string, string>} [userOptions.headers] Default headers that shall be
      *   included with every request to the service.
      * @param {string} [userOptions.version] The API version date to use with the service,
      *   in "YYYY-MM-DD" format.
      * @param {boolean} [userOptions.disableSslVerification] A flag that indicates
      *   whether verification of the token server's SSL certificate should be
      *   disabled or not.
      */
    def this(userOptions: UserOptions) = this()
    
    /* private */ var authenticator: Any = js.native
    
    /* protected */ var baseOptions: BaseServiceOptions = js.native
    
    /**
      * Configure the service using external configuration
      *
      * @param {string} serviceName The name of the service. Will be used to read from external
      * configuration.
      */
    /* protected */ def configureService(serviceName: String): Unit = js.native
    
    /**
      * Wrapper around `sendRequest` that enforces the request will be authenticated.
      *
      * @param {object} parameters Service request options passed in by user.
      * @param {string} parameters.options.method The http method.
      * @param {string} parameters.options.url The path portion of the URL to be appended to the serviceUrl.
      * @param {object} [parameters.options.path] The path parameters to be inserted into the URL.
      * @param {object} [parameters.options.qs] The querystring to be included in the URL.
      * @param {object} [parameters.options.body] The data to be sent as the request body.
      * @param {object} [parameters.options.form] An object containing the key/value pairs for a www-form-urlencoded request.
      * @param {object} [parameters.options.formData] An object containing the contents for a multipart/form-data request
      * The following processing is performed on formData values:
      * - string: no special processing -- the value is sent as is
      * - object: the value is converted to a JSON string before insertion into the form body
      * - NodeJS.ReadableStream|Buffer|FileWithMetadata: sent as a file, with any associated metadata
      * - array: each element of the array is sent as a separate form part using any special processing as described above
      * @param {object} parameters.defaultOptions
      * @param {string} parameters.defaultOptions.serviceUrl The base URL of the service.
      * @param {OutgoingHttpHeaders} parameters.defaultOptions.headers Additional headers to be passed on the request.
      * @returns {Promise<any>}
      */
    /* protected */ def createRequest(parameters: Any): js.Promise[Any] = js.native
    
    /**
      * Disables retries.
      */
    def disableRetries(): Unit = js.native
    
    /**
      * Enable retries for unfulfilled requests.
      *
      * @param {RetryOptions} retryOptions configuration for retries
      */
    def enableRetries(): Unit = js.native
    def enableRetries(retryOptions: RetryOptions): Unit = js.native
    
    /**
      * Get the instance of the authenticator set on the service.
      *
      * @returns {Authenticator}
      */
    def getAuthenticator(): Any = js.native
    
    /**
      * Get the Axios instance set on the service.
      * All requests will be made using this instance.
      */
    def getHttpClient(): AxiosInstance = js.native
    
    /* private */ var readOptionsFromExternalConfig: Any = js.native
    
    /* private */ var requestWrapperInstance: Any = js.native
    
    /**
      * Set the HTTP headers to be sent in every request.
      *
      * @param {OutgoingHttpHeaders} headers The map of headers to include in requests.
      */
    def setDefaultHeaders(headers: OutgoingHttpHeaders): Unit = js.native
    
    /**
      * Turn request body compression on or off.
      *
      * @param {boolean} setting Will turn it on if 'true', off if 'false'.
      */
    def setEnableGzipCompression(setting: Boolean): Unit = js.native
    
    /**
      * Set the service URL to send requests to.
      *
      * @param {string} url The base URL for the service.
      */
    def setServiceUrl(url: String): Unit = js.native
  }
  /* static members */
  object BaseService {
    
    @JSImport("ibm-cloud-sdk-core/es/lib/base-service", "BaseService")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ibm-cloud-sdk-core/es/lib/base-service", "BaseService.DEFAULT_SERVICE_NAME")
    @js.native
    def DEFAULT_SERVICE_NAME: String = js.native
    inline def DEFAULT_SERVICE_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_SERVICE_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("ibm-cloud-sdk-core/es/lib/base-service", "BaseService.DEFAULT_SERVICE_URL")
    @js.native
    def DEFAULT_SERVICE_URL: String = js.native
    inline def DEFAULT_SERVICE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_SERVICE_URL")(x.asInstanceOf[js.Any])
  }
  
  trait BaseServiceOptions
    extends StObject
       with UserOptions {
    
    var enableRetries: js.UndefOr[Boolean] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    /** Querystring to be sent with every request. If not a string will be stringified. */
    var qs: js.UndefOr[Any] = js.undefined
    
    var retryInterval: js.UndefOr[Double] = js.undefined
  }
  object BaseServiceOptions {
    
    inline def apply(): BaseServiceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseServiceOptions]
    }
    
    extension [Self <: BaseServiceOptions](x: Self) {
      
      inline def setEnableRetries(value: Boolean): Self = StObject.set(x, "enableRetries", value.asInstanceOf[js.Any])
      
      inline def setEnableRetriesUndefined: Self = StObject.set(x, "enableRetries", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setQs(value: Any): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
      
      inline def setQsUndefined: Self = StObject.set(x, "qs", js.undefined)
      
      inline def setRetryInterval(value: Double): Self = StObject.set(x, "retryInterval", value.asInstanceOf[js.Any])
      
      inline def setRetryIntervalUndefined: Self = StObject.set(x, "retryInterval", js.undefined)
    }
  }
  
  trait UserOptions
    extends StObject
       with /* propName */ StringDictionary[Any] {
    
    /** The Authenticator object used to authenticate requests to the service */
    var authenticator: js.UndefOr[AuthenticatorInterface] = js.undefined
    
    /** Set to `true` to allow unauthorized requests - not recommended for production use. */
    var disableSslVerification: js.UndefOr[Boolean] = js.undefined
    
    /** Default headers that shall be included with every request to the service. */
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    /** Set your own cookie jar object */
    var jar: js.UndefOr[CookieJar | Boolean] = js.undefined
    
    /** The base url to use when contacting the service. The base url may differ between IBM Cloud regions. */
    var serviceUrl: js.UndefOr[String] = js.undefined
    
    /** Deprecated. Use `serviceUrl` instead. */
    var url: js.UndefOr[String] = js.undefined
    
    /** The API version date to use with the service, in "YYYY-MM-DD" format. */
    var version: js.UndefOr[String] = js.undefined
  }
  object UserOptions {
    
    inline def apply(): UserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserOptions]
    }
    
    extension [Self <: UserOptions](x: Self) {
      
      inline def setAuthenticator(value: AuthenticatorInterface): Self = StObject.set(x, "authenticator", value.asInstanceOf[js.Any])
      
      inline def setAuthenticatorUndefined: Self = StObject.set(x, "authenticator", js.undefined)
      
      inline def setDisableSslVerification(value: Boolean): Self = StObject.set(x, "disableSslVerification", value.asInstanceOf[js.Any])
      
      inline def setDisableSslVerificationUndefined: Self = StObject.set(x, "disableSslVerification", js.undefined)
      
      inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setJar(value: CookieJar | Boolean): Self = StObject.set(x, "jar", value.asInstanceOf[js.Any])
      
      inline def setJarUndefined: Self = StObject.set(x, "jar", js.undefined)
      
      inline def setServiceUrl(value: String): Self = StObject.set(x, "serviceUrl", value.asInstanceOf[js.Any])
      
      inline def setServiceUrlUndefined: Self = StObject.set(x, "serviceUrl", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
