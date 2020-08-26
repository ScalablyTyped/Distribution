package typings.jquery.JQuery.Ajax

import typings.jquery.JQuery.PlainObject
import typings.jquery.JQuery.TypeOrArray
import typings.jquery.JQuery.jqXHR
import typings.jquery.jqueryBooleans.`false`
import typings.jquery.jqueryBooleans.`true`
import typings.jquery.jqueryStrings.`applicationSlashx-www-form-urlencoded`
import typings.jquery.jqueryStrings.`multipartSlashform-data`
import typings.jquery.jqueryStrings.html
import typings.jquery.jqueryStrings.json
import typings.jquery.jqueryStrings.jsonp
import typings.jquery.jqueryStrings.script
import typings.jquery.jqueryStrings.text
import typings.jquery.jqueryStrings.textSlashplain
import typings.jquery.jqueryStrings.xml
import typings.std.RegExp
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see \`{@link https://api.jquery.com/jquery.ajax/#jQuery-ajax-settings }\`
  */
@js.native
trait AjaxSettingsBase[TContext] extends js.Object {
  /**
    * A set of key/value pairs that map a given dataType to its MIME type, which gets sent in the Accept request header. This header tells the server what kind of response it will accept in return.
    */
  var accepts: js.UndefOr[PlainObject[String]] = js.native
  /**
    * By default, all requests are sent asynchronously (i.e. this is set to true by default). If you need synchronous requests, set this option to false. Cross-domain requests and dataType: "jsonp" requests do not support synchronous operation. Note that synchronous requests may temporarily lock the browser, disabling any actions while the request is active. As of jQuery 1.8, the use of async: false with jqXHR ($.Deferred) is deprecated; you must use the success/error/complete callback options instead of the corresponding methods of the jqXHR object such as jqXHR.done().
    */
  var async: js.UndefOr[Boolean] = js.native
  /**
    * A pre-request callback function that can be used to modify the jqXHR (in jQuery 1.4.x, XMLHTTPRequest) object before it is sent. Use this to set custom headers, etc. The jqXHR and settings objects are passed as arguments. This is an Ajax Event. Returning false in the beforeSend function will cancel the request. As of jQuery 1.5, the beforeSend option will be called regardless of the type of request.
    */
  var beforeSend: js.UndefOr[
    js.ThisFunction2[/* this */ TContext, /* jqXHR */ jqXHR[_], /* settings */ this.type, `false` | Unit]
  ] = js.native
  /**
    * If set to false, it will force requested pages not to be cached by the browser. Note: Setting cache to false will only work correctly with HEAD and GET requests. It works by appending "_={timestamp}" to the GET parameters. The parameter is not needed for other types of requests, except in IE8 when a POST is made to a URL that has already been requested by a GET.
    */
  var cache: js.UndefOr[Boolean] = js.native
  /**
    * A function to be called when the request finishes (after success and error callbacks are executed). The function gets passed two arguments: The jqXHR (in jQuery 1.4.x, XMLHTTPRequest) object and a string categorizing the status of the request ("success", "notmodified", "nocontent", "error", "timeout", "abort", or "parsererror"). As of jQuery 1.5, the complete setting can accept an array of functions. Each function will be called in turn. This is an Ajax Event.
    */
  var complete: js.UndefOr[TypeOrArray[CompleteCallback[TContext]]] = js.native
  /**
    * When sending data to the server, use this content type. Default is "application/x-www-form-urlencoded; charset=UTF-8", which is fine for most cases. If you explicitly pass in a content-type to $.ajax(), then it is always sent to the server (even if no data is sent). As of jQuery 1.6 you can pass false to tell jQuery to not set any content type header. Note: The W3C XMLHttpRequest specification dictates that the charset is always UTF-8; specifying another charset will not force the browser to change the encoding. Note: For cross-domain requests, setting the content type to anything other than application/x-www-form-urlencoded, multipart/form-data, or text/plain will trigger the browser to send a preflight OPTIONS request to the server.
    */
  var contentType: js.UndefOr[String | `false`] = js.native
  /**
    * An object of string/regular-expression pairs that determine how jQuery will parse the response, given its content type.
    */
  var contents: js.UndefOr[PlainObject[RegExp]] = js.native
  /**
    * This object will be the context of all Ajax-related callbacks. By default, the context is an object that represents the Ajax settings used in the call ($.ajaxSettings merged with the settings passed to $.ajax).
    */
  var context: js.UndefOr[TContext] = js.native
  /**
    * An object containing dataType-to-dataType converters. Each converter's value is a function that returns the transformed value of the response.
    */
  var converters: js.UndefOr[PlainObject[(js.Function1[/* value */ _, _]) | `true`]] = js.native
  /**
    * If you wish to force a crossDomain request (such as JSONP) on the same domain, set the value of crossDomain to true. This allows, for example, server-side redirection to another domain.
    */
  var crossDomain: js.UndefOr[Boolean] = js.native
  /**
    * Data to be sent to the server. It is converted to a query string, if not already a string. It's appended to the url for GET-requests. See processData option to prevent this automatic processing. Object must be Key/Value pairs. If value is an Array, jQuery serializes multiple values with same key based on the value of the traditional setting (described below).
    */
  var data: js.UndefOr[PlainObject[_] | String] = js.native
  /**
    * A function to be used to handle the raw response data of XMLHttpRequest. This is a pre-filtering function to sanitize the response. You should return the sanitized data. The function accepts two arguments: The raw data returned from the server and the 'dataType' parameter.
    */
  var dataFilter: js.UndefOr[js.Function2[/* data */ String, /* type */ String, _]] = js.native
  /**
    * The type of data that you're expecting back from the server. If none is specified, jQuery will try to infer it based on the MIME type of the response (an XML MIME type will yield XML, in 1.4 JSON will yield a JavaScript object, in 1.4 script will execute the script, and anything else will be returned as a string). The available types (and the result passed as the first argument to your success callback) are:
    *
    * "xml": Returns a XML document that can be processed via jQuery.
    *
    * "html": Returns HTML as plain text; included script tags are evaluated when inserted in the DOM.
    *
    * "script": Evaluates the response as JavaScript and returns it as plain text. Disables caching by appending a query string parameter, _=[TIMESTAMP], to the URL unless the cache option is set to true. Note: This will turn POSTs into GETs for remote-domain requests.
    *
    * "json": Evaluates the response as JSON and returns a JavaScript object. Cross-domain "json" requests are converted to "jsonp" unless the request includes jsonp: false in its request options. The JSON data is parsed in a strict manner; any malformed JSON is rejected and a parse error is thrown. As of jQuery 1.9, an empty response is also rejected; the server should return a response of null or {} instead. (See json.org for more information on proper JSON formatting.)
    *
    * "jsonp": Loads in a JSON block using JSONP. Adds an extra "?callback=?" to the end of your URL to specify the callback. Disables caching by appending a query string parameter, "_=[TIMESTAMP]", to the URL unless the cache option is set to true.
    *
    * "text": A plain text string.
    *
    * multiple, space-separated values: As of jQuery 1.5, jQuery can convert a dataType from what it received in the Content-Type header to what you require. For example, if you want a text response to be treated as XML, use "text xml" for the dataType. You can also make a JSONP request, have it received as text, and interpreted by jQuery as XML: "jsonp text xml". Similarly, a shorthand string such as "jsonp xml" will first attempt to convert from jsonp to xml, and, failing that, convert from jsonp to text, and then from text to xml.
    */
  var dataType: js.UndefOr[xml | html | script | json | jsonp | text | String] = js.native
  /**
    * The MIME type of content that is used to submit the form to the server. Possible values are:
    *
    * "application/x-www-form-urlencoded": The initial default type.
    *
    * "multipart/form-data": The type that allows file <input> element(s) to upload file data.
    *
    * "text/plain": A type introduced in HTML5.
    */
  var enctype: js.UndefOr[
    `applicationSlashx-www-form-urlencoded` | `multipartSlashform-data` | textSlashplain
  ] = js.native
  /**
    * A function to be called if the request fails. The function receives three arguments: The jqXHR (in jQuery 1.4.x, XMLHttpRequest) object, a string describing the type of error that occurred and an optional exception object, if one occurred. Possible values for the second argument (besides null) are "timeout", "error", "abort", and "parsererror". When an HTTP error occurs, errorThrown receives the textual portion of the HTTP status, such as "Not Found" or "Internal Server Error." As of jQuery 1.5, the error setting can accept an array of functions. Each function will be called in turn. Note: This handler is not called for cross-domain script and cross-domain JSONP requests. This is an Ajax Event.
    */
  var error: js.UndefOr[TypeOrArray[ErrorCallback[TContext]]] = js.native
  /**
    * Whether to trigger global Ajax event handlers for this request. The default is true. Set to false to prevent the global handlers like ajaxStart or ajaxStop from being triggered. This can be used to control various Ajax Events.
    */
  var global: js.UndefOr[Boolean] = js.native
  /**
    * An object of additional header key/value pairs to send along with requests using the XMLHttpRequest transport. The header X-Requested-With: XMLHttpRequest is always added, but its default XMLHttpRequest value can be changed here. Values in the headers setting can also be overwritten from within the beforeSend function.
    */
  var headers: js.UndefOr[PlainObject[js.UndefOr[String | Null]]] = js.native
  /**
    * Allow the request to be successful only if the response has changed since the last request. This is done by checking the Last-Modified header. Default value is false, ignoring the header. In jQuery 1.4 this technique also checks the 'etag' specified by the server to catch unmodified data.
    */
  var ifModified: js.UndefOr[Boolean] = js.native
  /**
    * Allow the current environment to be recognized as "local," (e.g. the filesystem), even if jQuery does not recognize it as such by default. The following protocols are currently recognized as local: file, *-extension, and widget. If the isLocal setting needs modification, it is recommended to do so once in the $.ajaxSetup() method.
    */
  var isLocal: js.UndefOr[Boolean] = js.native
  /**
    * Override the callback function name in a JSONP request. This value will be used instead of 'callback' in the 'callback=?' part of the query string in the url. So {jsonp:'onJSONPLoad'} would result in 'onJSONPLoad=?' passed to the server. As of jQuery 1.5, setting the jsonp option to false prevents jQuery from adding the "?callback" string to the URL or attempting to use "=?" for transformation. In this case, you should also explicitly set the jsonpCallback setting. For example, { jsonp: false, jsonpCallback: "callbackName" }. If you don't trust the target of your Ajax requests, consider setting the jsonp property to false for security reasons.
    */
  var jsonp: js.UndefOr[String | `false`] = js.native
  /**
    * Specify the callback function name for a JSONP request. This value will be used instead of the random name automatically generated by jQuery. It is preferable to let jQuery generate a unique name as it'll make it easier to manage the requests and provide callbacks and error handling. You may want to specify the callback when you want to enable better browser caching of GET requests. As of jQuery 1.5, you can also use a function for this setting, in which case the value of jsonpCallback is set to the return value of that function.
    */
  var jsonpCallback: js.UndefOr[String | (js.ThisFunction0[/* this */ TContext, String])] = js.native
  /**
    * The HTTP method to use for the request (e.g. "POST", "GET", "PUT").
    */
  var method: js.UndefOr[String] = js.native
  /**
    * A mime type to override the XHR mime type.
    */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * A password to be used with XMLHttpRequest in response to an HTTP access authentication request.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * By default, data passed in to the data option as an object (technically, anything other than a string) will be processed and transformed into a query string, fitting to the default content-type "application/x-www-form-urlencoded". If you want to send a DOMDocument, or other non-processed data, set this option to false.
    */
  var processData: js.UndefOr[Boolean] = js.native
  /**
    * Only applies when the "script" transport is used (e.g., cross-domain requests with "jsonp" or "script" dataType and "GET" type). Sets the charset attribute on the script tag used in the request. Used when the character set on the local page is not the same as the one on the remote script.
    */
  var scriptCharset: js.UndefOr[String] = js.native
  /**
    * An object of numeric HTTP codes and functions to be called when the response has the corresponding code.
    *
    * If the request is successful, the status code functions take the same parameters as the success callback; if it results in an error (including 3xx redirect), they take the same parameters as the error callback.
    */
  var statusCode: js.UndefOr[StatusCodeCallbacks[TContext]] = js.native
  /**
    * A function to be called if the request succeeds. The function gets passed three arguments: The data returned from the server, formatted according to the dataType parameter or the dataFilter callback function, if specified; a string describing the status; and the jqXHR (in jQuery 1.4.x, XMLHttpRequest) object. As of jQuery 1.5, the success setting can accept an array of functions. Each function will be called in turn. This is an Ajax Event.
    */
  var success: js.UndefOr[TypeOrArray[SuccessCallback[TContext]]] = js.native
  /**
    * Set a timeout (in milliseconds) for the request. A value of 0 means there will be no timeout. This will override any global timeout set with $.ajaxSetup(). The timeout period starts at the point the $.ajax call is made; if several other requests are in progress and the browser has no connections available, it is possible for a request to time out before it can be sent. In jQuery 1.4.x and below, the XMLHttpRequest object will be in an invalid state if the request times out; accessing any object members may throw an exception. In Firefox 3.0+ only, script and JSONP requests cannot be cancelled by a timeout; the script will run even if it arrives after the timeout period.
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * Set this to true if you wish to use the traditional style of param serialization.
    */
  var traditional: js.UndefOr[Boolean] = js.native
  /**
    * An alias for method. You should use type if you're using versions of jQuery prior to 1.9.0.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * A username to be used with XMLHttpRequest in response to an HTTP access authentication request.
    */
  var username: js.UndefOr[String] = js.native
  // ActiveXObject requires "lib": ["scripthost"] which consumers would also require
  /**
    * Callback for creating the XMLHttpRequest object. Defaults to the ActiveXObject when available (IE), the XMLHttpRequest otherwise. Override to provide your own implementation for XMLHttpRequest or enhancements to the factory.
    */
  var xhr: js.UndefOr[js.Function0[XMLHttpRequest]] = js.native
  /**
    * An object of fieldName-fieldValue pairs to set on the native XHR object.
    *
    * In jQuery 1.5, the withCredentials property was not propagated to the native XHR and thus CORS requests requiring it would ignore this flag. For this reason, we recommend using jQuery 1.5.1+ should you require the use of it.
    */
  var xhrFields: js.UndefOr[XHRFields] = js.native
}

object AjaxSettingsBase {
  @scala.inline
  def apply[TContext](): AjaxSettingsBase[TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AjaxSettingsBase[TContext]]
  }
  @scala.inline
  implicit class AjaxSettingsBaseOps[Self <: AjaxSettingsBase[_], TContext] (val x: Self with AjaxSettingsBase[TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccepts(value: PlainObject[String]): Self = this.set("accepts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccepts: Self = this.set("accepts", js.undefined)
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setBeforeSend(
      value: js.ThisFunction2[/* this */ TContext, /* jqXHR */ jqXHR[_], AjaxSettingsBase[TContext], `false` | Unit]
    ): Self = this.set("beforeSend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeSend: Self = this.set("beforeSend", js.undefined)
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setCompleteVarargs(value: CompleteCallback[TContext]*): Self = this.set("complete", js.Array(value :_*))
    @scala.inline
    def setComplete(value: TypeOrArray[CompleteCallback[TContext]]): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setContentType(value: String | `false`): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setContents(value: PlainObject[RegExp]): Self = this.set("contents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContents: Self = this.set("contents", js.undefined)
    @scala.inline
    def setContext(value: TContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setConverters(value: PlainObject[(js.Function1[/* value */ _, _]) | `true`]): Self = this.set("converters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConverters: Self = this.set("converters", js.undefined)
    @scala.inline
    def setCrossDomain(value: Boolean): Self = this.set("crossDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossDomain: Self = this.set("crossDomain", js.undefined)
    @scala.inline
    def setData(value: PlainObject[_] | String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataFilter(value: (/* data */ String, /* type */ String) => _): Self = this.set("dataFilter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDataFilter: Self = this.set("dataFilter", js.undefined)
    @scala.inline
    def setDataType(value: xml | html | script | json | jsonp | text | String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    @scala.inline
    def setEnctype(value: `applicationSlashx-www-form-urlencoded` | `multipartSlashform-data` | textSlashplain): Self = this.set("enctype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnctype: Self = this.set("enctype", js.undefined)
    @scala.inline
    def setErrorVarargs(value: ErrorCallback[TContext]*): Self = this.set("error", js.Array(value :_*))
    @scala.inline
    def setError(value: TypeOrArray[ErrorCallback[TContext]]): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setGlobal(value: Boolean): Self = this.set("global", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    @scala.inline
    def setHeaders(value: PlainObject[js.UndefOr[String | Null]]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setIfModified(value: Boolean): Self = this.set("ifModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfModified: Self = this.set("ifModified", js.undefined)
    @scala.inline
    def setIsLocal(value: Boolean): Self = this.set("isLocal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLocal: Self = this.set("isLocal", js.undefined)
    @scala.inline
    def setJsonp(value: String | `false`): Self = this.set("jsonp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonp: Self = this.set("jsonp", js.undefined)
    @scala.inline
    def setJsonpCallback(value: String | (js.ThisFunction0[/* this */ TContext, String])): Self = this.set("jsonpCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonpCallback: Self = this.set("jsonpCallback", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setProcessData(value: Boolean): Self = this.set("processData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessData: Self = this.set("processData", js.undefined)
    @scala.inline
    def setScriptCharset(value: String): Self = this.set("scriptCharset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptCharset: Self = this.set("scriptCharset", js.undefined)
    @scala.inline
    def setStatusCode(value: StatusCodeCallbacks[TContext]): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
    @scala.inline
    def setSuccessVarargs(value: SuccessCallback[TContext]*): Self = this.set("success", js.Array(value :_*))
    @scala.inline
    def setSuccess(value: TypeOrArray[SuccessCallback[TContext]]): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTraditional(value: Boolean): Self = this.set("traditional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTraditional: Self = this.set("traditional", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
    @scala.inline
    def setXhr(value: () => XMLHttpRequest): Self = this.set("xhr", js.Any.fromFunction0(value))
    @scala.inline
    def deleteXhr: Self = this.set("xhr", js.undefined)
    @scala.inline
    def setXhrFields(value: XHRFields): Self = this.set("xhrFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXhrFields: Self = this.set("xhrFields", js.undefined)
  }
  
}

