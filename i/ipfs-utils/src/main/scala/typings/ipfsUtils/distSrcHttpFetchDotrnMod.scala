package typings.ipfsUtils

import typings.ipfsUtils.distSrcFetchMod.Request
import typings.ipfsUtils.distSrcTypesMod.ProgressStatus
import typings.node.streamMod.Readable
import typings.std.AbortSignal
import typings.std.BodyInit
import typings.std.HeadersInit
import typings.std.ReferrerPolicy
import typings.std.RequestCache
import typings.std.RequestCredentials
import typings.std.RequestMode
import typings.std.RequestRedirect
import typings.std.ResponseInit
import typings.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHttpFetchDotrnMod {
  
  @JSImport("ipfs-utils/dist/src/http/fetch.rn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Response * / any */ @JSImport("ipfs-utils/dist/src/http/fetch.rn", "ResponseWithURL")
  @js.native
  open class ResponseWithURL protected () extends StObject {
    /**
      * @param {string} url
      * @param {BodyInit} body
      * @param {ResponseInit} options
      */
    def this(url: String, body: BodyInit, options: ResponseInit) = this()
  }
  
  /**
    * @param {string | Request} url
    * @param {FetchOptions} options
    */
  inline def fetch(url: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def fetch(url: String, options: FetchOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fetch(url: Request): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def fetch(url: Request, options: FetchOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /* Inlined ipfs-utils.ipfs-utils/dist/src/types.FetchOptions */
  trait FetchOptions extends StObject {
    
    /**
      * Extended body with support for node readable stream
      */
    var body: js.UndefOr[BodyInit | Null | Readable] = js.undefined
    
    var cache: js.UndefOr[RequestCache] = js.undefined
    
    var credentials: js.UndefOr[RequestCredentials] = js.undefined
    
    var headers: js.UndefOr[HeadersInit] = js.undefined
    
    var integrity: js.UndefOr[String] = js.undefined
    
    var keepalive: js.UndefOr[Boolean] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[RequestMode] = js.undefined
    
    /**
      * Can be passed to track download progress.
      */
    var onDownloadProgress: js.UndefOr[typings.ipfsUtils.distSrcTypesMod.ProgressFn] = js.undefined
    
    /**
      * Can be passed to track upload progress.
      * Note that if this option in passed underlying request will be performed using `XMLHttpRequest` and response will not be streamed.
      */
    var onUploadProgress: js.UndefOr[typings.ipfsUtils.distSrcTypesMod.ProgressFn] = js.undefined
    
    var overrideMimeType: js.UndefOr[String] = js.undefined
    
    var redirect: js.UndefOr[RequestRedirect] = js.undefined
    
    var referrer: js.UndefOr[String] = js.undefined
    
    var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
    
    /**
      * URL search param.
      */
    var searchParams: js.UndefOr[URLSearchParams] = js.undefined
    
    var signal: js.UndefOr[AbortSignal | Null] = js.undefined
    
    /**
      * Amount of time until request should timeout in ms.
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    var window: js.UndefOr[Null] = js.undefined
  }
  object FetchOptions {
    
    inline def apply(): FetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchOptions]
    }
    
    extension [Self <: FetchOptions](x: Self) {
      
      inline def setBody(value: BodyInit | Readable): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCache(value: RequestCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCredentials(value: RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      inline def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMode(value: RequestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnDownloadProgress(value: /* status */ ProgressStatus => Unit): Self = StObject.set(x, "onDownloadProgress", js.Any.fromFunction1(value))
      
      inline def setOnDownloadProgressUndefined: Self = StObject.set(x, "onDownloadProgress", js.undefined)
      
      inline def setOnUploadProgress(value: /* status */ ProgressStatus => Unit): Self = StObject.set(x, "onUploadProgress", js.Any.fromFunction1(value))
      
      inline def setOnUploadProgressUndefined: Self = StObject.set(x, "onUploadProgress", js.undefined)
      
      inline def setOverrideMimeType(value: String): Self = StObject.set(x, "overrideMimeType", value.asInstanceOf[js.Any])
      
      inline def setOverrideMimeTypeUndefined: Self = StObject.set(x, "overrideMimeType", js.undefined)
      
      inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
      
      inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
      
      inline def setSearchParams(value: URLSearchParams): Self = StObject.set(x, "searchParams", value.asInstanceOf[js.Any])
      
      inline def setSearchParamsUndefined: Self = StObject.set(x, "searchParams", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalNull: Self = StObject.set(x, "signal", null)
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type ProgressFn = typings.ipfsUtils.distSrcTypesMod.ProgressFn
}
