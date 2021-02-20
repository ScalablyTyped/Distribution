package typings.greasemonkey

import org.scalablytyped.runtime.StringDictionary
import typings.greasemonkey.anon.Mimetype
import typings.greasemonkey.anon.Onabort
import typings.greasemonkey.greasemonkeyBooleans.`false`
import typings.greasemonkey.greasemonkeyNumbers.`1`
import typings.greasemonkey.greasemonkeyNumbers.`2`
import typings.greasemonkey.greasemonkeyNumbers.`3`
import typings.greasemonkey.greasemonkeyNumbers.`4`
import typings.greasemonkey.greasemonkeyStrings.CONNECT
import typings.greasemonkey.greasemonkeyStrings.DELETE
import typings.greasemonkey.greasemonkeyStrings.GET
import typings.greasemonkey.greasemonkeyStrings.HEAD
import typings.greasemonkey.greasemonkeyStrings.OPTIONS
import typings.greasemonkey.greasemonkeyStrings.PATCH
import typings.greasemonkey.greasemonkeyStrings.POST
import typings.greasemonkey.greasemonkeyStrings.PUT
import typings.greasemonkey.greasemonkeyStrings.TRACE
import typings.greasemonkey.greasemonkeyStrings.end
import typings.greasemonkey.greasemonkeyStrings.idle
import typings.greasemonkey.greasemonkeyStrings.start
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GM {
  
  @js.native
  trait ProgressResponse[TContext] extends Response[TContext] {
    
    var lengthComputable: Boolean = js.native
    
    var loaded: Double = js.native
    
    var total: Double = js.native
  }
  object ProgressResponse {
    
    @scala.inline
    def apply[TContext](
      finalUrl: String,
      lengthComputable: Boolean,
      loaded: Double,
      readyState: `1` | `2` | `3` | `4`,
      response: js.Any,
      responseHeaders: String,
      responseText: String,
      responseXML: Document | `false`,
      status: Double,
      statusText: String,
      total: Double
    ): ProgressResponse[TContext] = {
      val __obj = js.Dynamic.literal(finalUrl = finalUrl.asInstanceOf[js.Any], lengthComputable = lengthComputable.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], responseXML = responseXML.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressResponse[TContext]]
    }
    
    @scala.inline
    implicit class ProgressResponseMutableBuilder[Self <: ProgressResponse[_], TContext] (val x: Self with ProgressResponse[TContext]) extends AnyVal {
      
      @scala.inline
      def setLengthComputable(value: Boolean): Self = StObject.set(x, "lengthComputable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Request[TContext] extends StObject {
    
    /**
      * When true, the data is sent as a Blob
      * @default false
      */
    var binary: js.UndefOr[Boolean] = js.native
    
    /**
      * Any object (Compatibility: 1.10+). This object will also be the
      * context property of the Response Object.
      */
    var context: js.UndefOr[TContext] = js.native
    
    /**
      * Data to send in the request body. Usually for POST method requests.
      * If the data field contains form-encoded data, you usually must also
      * set the header `'Content-Type': 'application/x-www-form-urlencoded'`
      * in the `headers` field.
      */
    var data: js.UndefOr[String] = js.native
    
    /** A set of headers to include in the request */
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    /** String type of HTTP request to make (E.G. "GET", "POST") */
    var method: GET | POST | PUT | DELETE | PATCH | HEAD | TRACE | OPTIONS | CONNECT = js.native
    
    // Event handlers
    /** Will be called when the request is aborted */
    var onabort: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.native
    
    /** Will be called if an error occurs while processing the request */
    var onerror: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.native
    
    /** Will be called when the request has completed successfully */
    var onload: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.native
    
    /** Will be called when the request progress changes */
    var onprogress: js.UndefOr[js.Function1[/* response */ ProgressResponse[TContext], Unit]] = js.native
    
    /** Will be called repeatedly while the request is in progress */
    var onreadystatechange: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.native
    
    /** Will be called if/when the request times out */
    var ontimeout: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.native
    
    /**
      * A MIME type to specify with the request (e.g.
      * "text/html; charset=ISO-8859-1")
      */
    var overrideMimeType: js.UndefOr[String] = js.native
    
    /** Password to use for authentication purposes */
    var password: js.UndefOr[String] = js.native
    
    /**
      * When `true`, this is a synchronous request.
      * Be careful: The entire Firefox UI will be locked and frozen until the
      * request completes.In this mode, more data will be available in the
      * return value.
      */
    var synchronous: js.UndefOr[Boolean] = js.native
    
    /**
      * The number of milliseconds to wait before terminating the call. Zero
      * (the default) means wait forever.
      */
    var timeout: js.UndefOr[Double] = js.native
    
    /**
      * Object containing optional function callbacks to monitor the upload
      * of data.
      */
    var upload: js.UndefOr[Onabort[TContext]] = js.native
    
    // Fields
    /**
      * The URL to make the request to. Must be an absolute URL, beginning
      * with the scheme. May be relative to the current page.
      */
    var url: String = js.native
    
    /** User name to use for authentication purposes. */
    var user: js.UndefOr[String] = js.native
  }
  object Request {
    
    @scala.inline
    def apply[TContext](method: GET | POST | PUT | DELETE | PATCH | HEAD | TRACE | OPTIONS | CONNECT, url: String): Request[TContext] = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request[TContext]]
    }
    
    @scala.inline
    implicit class RequestMutableBuilder[Self <: Request[_], TContext] (val x: Self with Request[TContext]) extends AnyVal {
      
      @scala.inline
      def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      @scala.inline
      def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: GET | POST | PUT | DELETE | PATCH | HEAD | TRACE | OPTIONS | CONNECT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnabort(value: /* response */ Response[TContext] => Unit): Self = StObject.set(x, "onabort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnabortUndefined: Self = StObject.set(x, "onabort", js.undefined)
      
      @scala.inline
      def setOnerror(value: /* response */ Response[TContext] => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      @scala.inline
      def setOnload(value: /* response */ Response[TContext] => Unit): Self = StObject.set(x, "onload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
      
      @scala.inline
      def setOnprogress(value: /* response */ ProgressResponse[TContext] => Unit): Self = StObject.set(x, "onprogress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnprogressUndefined: Self = StObject.set(x, "onprogress", js.undefined)
      
      @scala.inline
      def setOnreadystatechange(value: /* response */ Response[TContext] => Unit): Self = StObject.set(x, "onreadystatechange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnreadystatechangeUndefined: Self = StObject.set(x, "onreadystatechange", js.undefined)
      
      @scala.inline
      def setOntimeout(value: /* response */ Response[TContext] => Unit): Self = StObject.set(x, "ontimeout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOntimeoutUndefined: Self = StObject.set(x, "ontimeout", js.undefined)
      
      @scala.inline
      def setOverrideMimeType(value: String): Self = StObject.set(x, "overrideMimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideMimeTypeUndefined: Self = StObject.set(x, "overrideMimeType", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setSynchronous(value: Boolean): Self = StObject.set(x, "synchronous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSynchronousUndefined: Self = StObject.set(x, "synchronous", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUpload(value: Onabort[TContext]): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  @js.native
  trait Response[TContext] extends StObject {
    
    /** The same object passed into the original request */
    val context: js.UndefOr[TContext] = js.native
    
    val finalUrl: String = js.native
    
    val readyState: `1` | `2` | `3` | `4` = js.native
    
    val response: js.Any = js.native
    
    val responseHeaders: String = js.native
    
    val responseText: String = js.native
    
    val responseXML: Document | `false` = js.native
    
    val status: Double = js.native
    
    val statusText: String = js.native
  }
  object Response {
    
    @scala.inline
    def apply[TContext](
      finalUrl: String,
      readyState: `1` | `2` | `3` | `4`,
      response: js.Any,
      responseHeaders: String,
      responseText: String,
      responseXML: Document | `false`,
      status: Double,
      statusText: String
    ): Response[TContext] = {
      val __obj = js.Dynamic.literal(finalUrl = finalUrl.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], responseXML = responseXML.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response[TContext]]
    }
    
    @scala.inline
    implicit class ResponseMutableBuilder[Self <: Response[_], TContext] (val x: Self with Response[TContext]) extends AnyVal {
      
      @scala.inline
      def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setFinalUrl(value: String): Self = StObject.set(x, "finalUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadyState(value: `1` | `2` | `3` | `4`): Self = StObject.set(x, "readyState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: js.Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseHeaders(value: String): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseText(value: String): Self = StObject.set(x, "responseText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseXML(value: Document | `false`): Self = StObject.set(x, "responseXML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ScriptInfo extends StObject {
    
    var description: String = js.native
    
    var excludes: js.Array[String] = js.native
    
    var includes: js.Array[String] = js.native
    
    var matches: js.Array[String] = js.native
    
    var name: String = js.native
    
    var namespace: js.UndefOr[String] = js.native
    
    /**
      * An object keyed by resource name.
      * Each value is an object with keys `name` and `mimetype` and `url`
      * with string values.
      */
    var resources: StringDictionary[Mimetype] = js.native
    
    /** @default 'end' */
    var runAt: start | end | idle = js.native
    
    var uuid: String = js.native
    
    var version: String = js.native
  }
  object ScriptInfo {
    
    @scala.inline
    def apply(
      description: String,
      excludes: js.Array[String],
      includes: js.Array[String],
      matches: js.Array[String],
      name: String,
      resources: StringDictionary[Mimetype],
      runAt: start | end | idle,
      uuid: String,
      version: String
    ): ScriptInfo = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], excludes = excludes.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], runAt = runAt.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScriptInfo]
    }
    
    @scala.inline
    implicit class ScriptInfoMutableBuilder[Self <: ScriptInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludes(value: js.Array[String]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludesVarargs(value: String*): Self = StObject.set(x, "excludes", js.Array(value :_*))
      
      @scala.inline
      def setIncludes(value: js.Array[String]): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludesVarargs(value: String*): Self = StObject.set(x, "includes", js.Array(value :_*))
      
      @scala.inline
      def setMatches(value: js.Array[String]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchesVarargs(value: String*): Self = StObject.set(x, "matches", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      @scala.inline
      def setResources(value: StringDictionary[Mimetype]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunAt(value: start | end | idle): Self = StObject.set(x, "runAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type Value = String | Boolean | Double
}
