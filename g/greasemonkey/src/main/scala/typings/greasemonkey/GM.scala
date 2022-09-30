package typings.greasemonkey

import org.scalablytyped.runtime.StringDictionary
import typings.greasemonkey.anon.Mimetype
import typings.greasemonkey.anon.Onabort
import typings.greasemonkey.greasemonkeyBooleans.`false`
import typings.greasemonkey.greasemonkeyInts.`1`
import typings.greasemonkey.greasemonkeyInts.`2`
import typings.greasemonkey.greasemonkeyInts.`3`
import typings.greasemonkey.greasemonkeyInts.`4`
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
import typings.std.XMLHttpRequestResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GM {
  
  trait ProgressResponse[TContext]
    extends StObject
       with Response[TContext] {
    
    var lengthComputable: Boolean
    
    var loaded: Double
    
    var total: Double
  }
  object ProgressResponse {
    
    inline def apply[TContext](
      finalUrl: String,
      lengthComputable: Boolean,
      loaded: Double,
      readyState: `1` | `2` | `3` | `4`,
      response: Any,
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
    
    extension [Self <: ProgressResponse[?], TContext](x: Self & ProgressResponse[TContext]) {
      
      inline def setLengthComputable(value: Boolean): Self = StObject.set(x, "lengthComputable", value.asInstanceOf[js.Any])
      
      inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait Request[TContext] extends StObject {
    
    /**
      * When true, the data is sent as a Blob
      * @default false
      */
    var binary: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Any object (Compatibility: 1.10+). This object will also be the
      * context property of the Response Object.
      */
    var context: js.UndefOr[TContext] = js.undefined
    
    /**
      * Data to send in the request body. Usually for POST method requests.
      * If the data field contains form-encoded data, you usually must also
      * set the header `'Content-Type': 'application/x-www-form-urlencoded'`
      * in the `headers` field.
      */
    var data: js.UndefOr[String] = js.undefined
    
    /** A set of headers to include in the request */
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /** String type of HTTP request to make (E.G. "GET", "POST") */
    var method: GET | POST | PUT | DELETE | PATCH | HEAD | TRACE | OPTIONS | CONNECT
    
    // Event handlers
    /** Will be called when the request is aborted */
    var onabort: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.undefined
    
    /** Will be called if an error occurs while processing the request */
    var onerror: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.undefined
    
    /** Will be called when the request has completed successfully */
    var onload: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.undefined
    
    /** Will be called when the request progress changes */
    var onprogress: js.UndefOr[js.Function1[/* response */ ProgressResponse[TContext], Unit]] = js.undefined
    
    /** Will be called repeatedly while the request is in progress */
    var onreadystatechange: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.undefined
    
    /** Will be called if/when the request times out */
    var ontimeout: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.undefined
    
    /**
      * A MIME type to specify with the request (e.g.
      * "text/html; charset=ISO-8859-1")
      */
    var overrideMimeType: js.UndefOr[String] = js.undefined
    
    /** Password to use for authentication purposes */
    var password: js.UndefOr[String] = js.undefined
    
    /** Decode the response as specified type. Default value is "text" */
    var responseType: js.UndefOr[XMLHttpRequestResponseType] = js.undefined
    
    /**
      * When `true`, this is a synchronous request.
      * Be careful: The entire Firefox UI will be locked and frozen until the
      * request completes.In this mode, more data will be available in the
      * return value.
      */
    var synchronous: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The number of milliseconds to wait before terminating the call. Zero
      * (the default) means wait forever.
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Object containing optional function callbacks to monitor the upload
      * of data.
      */
    var upload: js.UndefOr[Onabort[TContext]] = js.undefined
    
    // Fields
    /**
      * The URL to make the request to. Must be an absolute URL, beginning
      * with the scheme. May be relative to the current page.
      */
    var url: String
    
    /** User name to use for authentication purposes. */
    var user: js.UndefOr[String] = js.undefined
  }
  object Request {
    
    inline def apply[TContext](method: GET | POST | PUT | DELETE | PATCH | HEAD | TRACE | OPTIONS | CONNECT, url: String): Request[TContext] = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request[TContext]]
    }
    
    extension [Self <: Request[?], TContext](x: Self & Request[TContext]) {
      
      inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      inline def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: GET | POST | PUT | DELETE | PATCH | HEAD | TRACE | OPTIONS | CONNECT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setOnabort(value: /* response */ Response[TContext] => Unit): Self = StObject.set(x, "onabort", js.Any.fromFunction1(value))
      
      inline def setOnabortUndefined: Self = StObject.set(x, "onabort", js.undefined)
      
      inline def setOnerror(value: /* response */ Response[TContext] => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
      
      inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      inline def setOnload(value: /* response */ Response[TContext] => Unit): Self = StObject.set(x, "onload", js.Any.fromFunction1(value))
      
      inline def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
      
      inline def setOnprogress(value: /* response */ ProgressResponse[TContext] => Unit): Self = StObject.set(x, "onprogress", js.Any.fromFunction1(value))
      
      inline def setOnprogressUndefined: Self = StObject.set(x, "onprogress", js.undefined)
      
      inline def setOnreadystatechange(value: /* response */ Response[TContext] => Unit): Self = StObject.set(x, "onreadystatechange", js.Any.fromFunction1(value))
      
      inline def setOnreadystatechangeUndefined: Self = StObject.set(x, "onreadystatechange", js.undefined)
      
      inline def setOntimeout(value: /* response */ Response[TContext] => Unit): Self = StObject.set(x, "ontimeout", js.Any.fromFunction1(value))
      
      inline def setOntimeoutUndefined: Self = StObject.set(x, "ontimeout", js.undefined)
      
      inline def setOverrideMimeType(value: String): Self = StObject.set(x, "overrideMimeType", value.asInstanceOf[js.Any])
      
      inline def setOverrideMimeTypeUndefined: Self = StObject.set(x, "overrideMimeType", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setResponseType(value: XMLHttpRequestResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      inline def setSynchronous(value: Boolean): Self = StObject.set(x, "synchronous", value.asInstanceOf[js.Any])
      
      inline def setSynchronousUndefined: Self = StObject.set(x, "synchronous", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUpload(value: Onabort[TContext]): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
      
      inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait Response[TContext] extends StObject {
    
    /** The same object passed into the original request */
    val context: js.UndefOr[TContext] = js.undefined
    
    val finalUrl: String
    
    val readyState: `1` | `2` | `3` | `4`
    
    val response: Any
    
    val responseHeaders: String
    
    val responseText: String
    
    val responseXML: Document | `false`
    
    val status: Double
    
    val statusText: String
  }
  object Response {
    
    inline def apply[TContext](
      finalUrl: String,
      readyState: `1` | `2` | `3` | `4`,
      response: Any,
      responseHeaders: String,
      responseText: String,
      responseXML: Document | `false`,
      status: Double,
      statusText: String
    ): Response[TContext] = {
      val __obj = js.Dynamic.literal(finalUrl = finalUrl.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], responseXML = responseXML.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response[TContext]]
    }
    
    extension [Self <: Response[?], TContext](x: Self & Response[TContext]) {
      
      inline def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setFinalUrl(value: String): Self = StObject.set(x, "finalUrl", value.asInstanceOf[js.Any])
      
      inline def setReadyState(value: `1` | `2` | `3` | `4`): Self = StObject.set(x, "readyState", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseHeaders(value: String): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
      
      inline def setResponseText(value: String): Self = StObject.set(x, "responseText", value.asInstanceOf[js.Any])
      
      inline def setResponseXML(value: Document | `false`): Self = StObject.set(x, "responseXML", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScriptInfo extends StObject {
    
    /** Possibly empty string. */
    var description: String
    
    var excludes: js.Array[String]
    
    var includes: js.Array[String]
    
    var matches: js.Array[String]
    
    var name: String
    
    /** Possibly empty string. */
    var namespace: String
    
    /**
      * An object keyed by resource name.
      * Each value is an object with keys `name` and `mimetype` and `url`
      * with string values.
      */
    var resources: StringDictionary[Mimetype]
    
    /** @default 'end' */
    var runAt: start | end | idle
    
    var uuid: String
    
    /** Possibly empty string. */
    var version: String
  }
  object ScriptInfo {
    
    inline def apply(
      description: String,
      excludes: js.Array[String],
      includes: js.Array[String],
      matches: js.Array[String],
      name: String,
      namespace: String,
      resources: StringDictionary[Mimetype],
      runAt: start | end | idle,
      uuid: String,
      version: String
    ): ScriptInfo = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], excludes = excludes.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], runAt = runAt.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScriptInfo]
    }
    
    extension [Self <: ScriptInfo](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setExcludes(value: js.Array[String]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
      
      inline def setExcludesVarargs(value: String*): Self = StObject.set(x, "excludes", js.Array(value*))
      
      inline def setIncludes(value: js.Array[String]): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
      
      inline def setIncludesVarargs(value: String*): Self = StObject.set(x, "includes", js.Array(value*))
      
      inline def setMatches(value: js.Array[String]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setMatchesVarargs(value: String*): Self = StObject.set(x, "matches", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setResources(value: StringDictionary[Mimetype]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setRunAt(value: start | end | idle): Self = StObject.set(x, "runAt", value.asInstanceOf[js.Any])
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type Value = String | Boolean | Double
}
