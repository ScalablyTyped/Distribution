package typings.ibmCloudSdkCore

import typings.axios.mod.AxiosInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLibRequestWrapperMod {
  
  @JSImport("ibm-cloud-sdk-core/es/lib/request-wrapper", "RequestWrapper")
  @js.native
  open class RequestWrapper () extends StObject {
    def this(axiosOptions: Any) = this()
    
    /* private */ var axiosInstance: Any = js.native
    
    /* private */ var compressRequestData: Any = js.native
    
    def disableRetries(): Unit = js.native
    
    def enableRetries(): Unit = js.native
    def enableRetries(retryOptions: RetryOptions): Unit = js.native
    
    /**
      * Format error returned by axios
      * @param  {object} the object returned by axios via rejection
      * @private
      * @returns {Error}
      */
    def formatError(axiosError: Any): js.Error = js.native
    
    def getHttpClient(): AxiosInstance = js.native
    
    /* private */ var gzipRequestBody: Any = js.native
    
    /* private */ var raxConfig: Any = js.native
    
    /* private */ var retryInterceptorId: Any = js.native
    
    /**
      * Creates the request.
      * 1. Merge default options with user provided options
      * 2. Checks for missing parameters
      * 3. Encode path and query parameters
      * 4. Call the api
      * @private
      * @returns {ReadableStream|undefined}
      * @throws {Error}
      */
    def sendRequest(parameters: Any): js.Promise[Any] = js.native
    
    def setCompressRequestData(setting: Boolean): Unit = js.native
  }
  /* static members */
  object RequestWrapper {
    
    @JSImport("ibm-cloud-sdk-core/es/lib/request-wrapper", "RequestWrapper")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ibm-cloud-sdk-core/es/lib/request-wrapper", "RequestWrapper.getRaxConfig")
    @js.native
    def getRaxConfig: Any = js.native
    inline def getRaxConfig_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getRaxConfig")(x.asInstanceOf[js.Any])
  }
  
  trait RetryOptions extends StObject {
    
    /**
      * Maximum retries to attempt.
      */
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * Ceiling for the retry delay (in seconds) - delay will not exceed this value.
      */
    var maxRetryInterval: js.UndefOr[Double] = js.undefined
  }
  object RetryOptions {
    
    inline def apply(): RetryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RetryOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RetryOptions] (val x: Self) extends AnyVal {
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setMaxRetryInterval(value: Double): Self = StObject.set(x, "maxRetryInterval", value.asInstanceOf[js.Any])
      
      inline def setMaxRetryIntervalUndefined: Self = StObject.set(x, "maxRetryInterval", js.undefined)
    }
  }
}
