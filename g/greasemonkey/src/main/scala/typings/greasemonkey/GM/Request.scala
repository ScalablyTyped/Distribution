package typings.greasemonkey.GM

import org.scalablytyped.runtime.StringDictionary
import typings.greasemonkey.anon.Onabort
import typings.greasemonkey.greasemonkeyStrings.CONNECT
import typings.greasemonkey.greasemonkeyStrings.DELETE
import typings.greasemonkey.greasemonkeyStrings.GET
import typings.greasemonkey.greasemonkeyStrings.HEAD
import typings.greasemonkey.greasemonkeyStrings.OPTIONS
import typings.greasemonkey.greasemonkeyStrings.PATCH
import typings.greasemonkey.greasemonkeyStrings.POST
import typings.greasemonkey.greasemonkeyStrings.PUT
import typings.greasemonkey.greasemonkeyStrings.TRACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request[TContext] extends js.Object {
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
  implicit class RequestOps[Self <: Request[_], TContext] (val x: Self with Request[TContext]) extends AnyVal {
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
    def setMethod(value: GET | POST | PUT | DELETE | PATCH | HEAD | TRACE | OPTIONS | CONNECT): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setBinary(value: Boolean): Self = this.set("binary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinary: Self = this.set("binary", js.undefined)
    @scala.inline
    def setContext(value: TContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setOnabort(value: /* response */ Response[TContext] => Unit): Self = this.set("onabort", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnabort: Self = this.set("onabort", js.undefined)
    @scala.inline
    def setOnerror(value: /* response */ Response[TContext] => Unit): Self = this.set("onerror", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    @scala.inline
    def setOnload(value: /* response */ Response[TContext] => Unit): Self = this.set("onload", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnload: Self = this.set("onload", js.undefined)
    @scala.inline
    def setOnprogress(value: /* response */ ProgressResponse[TContext] => Unit): Self = this.set("onprogress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnprogress: Self = this.set("onprogress", js.undefined)
    @scala.inline
    def setOnreadystatechange(value: /* response */ Response[TContext] => Unit): Self = this.set("onreadystatechange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnreadystatechange: Self = this.set("onreadystatechange", js.undefined)
    @scala.inline
    def setOntimeout(value: /* response */ Response[TContext] => Unit): Self = this.set("ontimeout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOntimeout: Self = this.set("ontimeout", js.undefined)
    @scala.inline
    def setOverrideMimeType(value: String): Self = this.set("overrideMimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrideMimeType: Self = this.set("overrideMimeType", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setSynchronous(value: Boolean): Self = this.set("synchronous", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSynchronous: Self = this.set("synchronous", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUpload(value: Onabort[TContext]): Self = this.set("upload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpload: Self = this.set("upload", js.undefined)
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

