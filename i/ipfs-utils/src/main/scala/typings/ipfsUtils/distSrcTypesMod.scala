package typings.ipfsUtils

import typings.ipfsUnixfs.mod.MtimeLike
import typings.node.streamMod.Readable
import typings.std.AbortSignal
import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import typings.std.Blob
import typings.std.BodyInit
import typings.std.FormData
import typings.std.Headers
import typings.std.HeadersInit
import typings.std.Omit
import typings.std.ReferrerPolicy
import typings.std.RequestCache
import typings.std.RequestCredentials
import typings.std.RequestMode
import typings.std.RequestRedirect
import typings.std.Response
import typings.std.ResponseType
import typings.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMod {
  
  trait ExtendedResponse
    extends StObject
       with Response {
    
    def iterator(): AsyncGenerator[js.typedarray.Uint8Array, Unit, Unit]
    
    def ndjson(): AsyncGenerator[Any, Unit, Unit]
  }
  object ExtendedResponse {
    
    inline def apply(
      arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
      blob: () => js.Promise[Blob],
      bodyUsed: Boolean,
      formData: () => js.Promise[FormData],
      headers: Headers,
      iterator: () => AsyncGenerator[js.typedarray.Uint8Array, Unit, Unit],
      json: () => js.Promise[Any],
      ndjson: () => AsyncGenerator[Any, Unit, Unit],
      ok: Boolean,
      redirected: Boolean,
      status: Double,
      statusText: String,
      text: () => js.Promise[String],
      `type`: ResponseType,
      url: String
    ): ExtendedResponse = {
      val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), headers = headers.asInstanceOf[js.Any], iterator = js.Any.fromFunction0(iterator), json = js.Any.fromFunction0(json), ndjson = js.Any.fromFunction0(ndjson), ok = ok.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), url = url.asInstanceOf[js.Any], body = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendedResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtendedResponse] (val x: Self) extends AnyVal {
      
      inline def setIterator(value: () => AsyncGenerator[js.typedarray.Uint8Array, Unit, Unit]): Self = StObject.set(x, "iterator", js.Any.fromFunction0(value))
      
      inline def setNdjson(value: () => AsyncGenerator[Any, Unit, Unit]): Self = StObject.set(x, "ndjson", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined ipfs-utils.ipfs-utils/dist/src/types.Override<std.RequestInit, {  body :std.BodyInit | null | node.stream.Readable | undefined,   timeout :number | undefined,   searchParams :std.URLSearchParams | undefined,   onUploadProgress :ipfs-utils.ipfs-utils/dist/src/types.ProgressFn | undefined,   onDownloadProgress :ipfs-utils.ipfs-utils/dist/src/types.ProgressFn | undefined,   overrideMimeType :string | undefined}> */
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
    var onDownloadProgress: js.UndefOr[ProgressFn] = js.undefined
    
    /**
      * Can be passed to track upload progress.
      * Note that if this option in passed underlying request will be performed using `XMLHttpRequest` and response will not be streamed.
      */
    var onUploadProgress: js.UndefOr[ProgressFn] = js.undefined
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetchOptions] (val x: Self) extends AnyVal {
      
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
  
  trait GlobSourceOptions extends StObject {
    
    /**
      * follow symlinks
      */
    var followSymlinks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Include .dot files in matched paths
      */
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * mode to use - if preserveMode is true this will be ignored
      */
    var mode: js.UndefOr[Double] = js.undefined
    
    /**
      * mtime to use - if preserveMtime is true this will be ignored
      */
    var mtime: js.UndefOr[MtimeLike] = js.undefined
    
    /**
      * Preserve mode
      */
    var preserveMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Preserve mtime
      */
    var preserveMtime: js.UndefOr[Boolean] = js.undefined
  }
  object GlobSourceOptions {
    
    inline def apply(): GlobSourceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobSourceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlobSourceOptions] (val x: Self) extends AnyVal {
      
      inline def setFollowSymlinks(value: Boolean): Self = StObject.set(x, "followSymlinks", value.asInstanceOf[js.Any])
      
      inline def setFollowSymlinksUndefined: Self = StObject.set(x, "followSymlinks", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: MtimeLike): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setPreserveMode(value: Boolean): Self = StObject.set(x, "preserveMode", value.asInstanceOf[js.Any])
      
      inline def setPreserveModeUndefined: Self = StObject.set(x, "preserveMode", js.undefined)
      
      inline def setPreserveMtime(value: Boolean): Self = StObject.set(x, "preserveMtime", value.asInstanceOf[js.Any])
      
      inline def setPreserveMtimeUndefined: Self = StObject.set(x, "preserveMtime", js.undefined)
    }
  }
  
  trait GlobSourceResult extends StObject {
    
    var content: js.UndefOr[AsyncIterable[js.typedarray.Uint8Array]] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[MtimeLike] = js.undefined
    
    var path: String
  }
  object GlobSourceResult {
    
    inline def apply(path: String): GlobSourceResult = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobSourceResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlobSourceResult] (val x: Self) extends AnyVal {
      
      inline def setContent(value: AsyncIterable[js.typedarray.Uint8Array]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: MtimeLike): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait HTTPOptions
    extends StObject
       with FetchOptions {
    
    /**
      * The base URL to use in case url is a relative URL
      */
    var base: js.UndefOr[String] = js.undefined
    
    /**
      * Handle errors
      */
    var handleError: js.UndefOr[js.Function1[/* rsp */ Response, js.Promise[Unit]]] = js.undefined
    
    var json: js.UndefOr[Any] = js.undefined
    
    /**
      * Throw not ok responses as Errors
      */
    var throwHttpErrors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When iterating the response body, transform each chunk with this function.
      */
    var transform: js.UndefOr[js.Function1[/* chunk */ Any, Any]] = js.undefined
    
    /**
      * Transform search params
      */
    var transformSearchParams: js.UndefOr[js.Function1[/* params */ URLSearchParams, URLSearchParams]] = js.undefined
  }
  object HTTPOptions {
    
    inline def apply(): HTTPOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HTTPOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HTTPOptions] (val x: Self) extends AnyVal {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setHandleError(value: /* rsp */ Response => js.Promise[Unit]): Self = StObject.set(x, "handleError", js.Any.fromFunction1(value))
      
      inline def setHandleErrorUndefined: Self = StObject.set(x, "handleError", js.undefined)
      
      inline def setJson(value: Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setThrowHttpErrors(value: Boolean): Self = StObject.set(x, "throwHttpErrors", value.asInstanceOf[js.Any])
      
      inline def setThrowHttpErrorsUndefined: Self = StObject.set(x, "throwHttpErrors", js.undefined)
      
      inline def setTransform(value: /* chunk */ Any => Any): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransformSearchParams(value: /* params */ URLSearchParams => URLSearchParams): Self = StObject.set(x, "transformSearchParams", js.Any.fromFunction1(value))
      
      inline def setTransformSearchParamsUndefined: Self = StObject.set(x, "transformSearchParams", js.undefined)
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  type Override[T, R] = (Omit[T, /* keyof R */ String]) & R
  
  type ProgressFn = js.Function1[/* status */ ProgressStatus, Unit]
  
  trait ProgressStatus extends StObject {
    
    var lengthComputable: Boolean
    
    var loaded: Double
    
    var total: Double
  }
  object ProgressStatus {
    
    inline def apply(lengthComputable: Boolean, loaded: Double, total: Double): ProgressStatus = {
      val __obj = js.Dynamic.literal(lengthComputable = lengthComputable.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressStatus]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProgressStatus] (val x: Self) extends AnyVal {
      
      inline def setLengthComputable(value: Boolean): Self = StObject.set(x, "lengthComputable", value.asInstanceOf[js.Any])
      
      inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
