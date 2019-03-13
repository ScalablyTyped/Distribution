package typings
package greasemonkeyLib.GMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request[TContext] extends js.Object {
  /**
    * When true, the data is sent as a Blob
    * @default false
    */
  var binary: js.UndefOr[scala.Boolean] = js.undefined
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
  var data: js.UndefOr[java.lang.String] = js.undefined
  /** A set of headers to include in the request */
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /** String type of HTTP request to make (E.G. "GET", "POST") */
  var method: greasemonkeyLib.greasemonkeyLibStrings.GET | greasemonkeyLib.greasemonkeyLibStrings.POST | greasemonkeyLib.greasemonkeyLibStrings.PUT | greasemonkeyLib.greasemonkeyLibStrings.DELETE | greasemonkeyLib.greasemonkeyLibStrings.PATCH | greasemonkeyLib.greasemonkeyLibStrings.HEAD | greasemonkeyLib.greasemonkeyLibStrings.TRACE | greasemonkeyLib.greasemonkeyLibStrings.OPTIONS | greasemonkeyLib.greasemonkeyLibStrings.CONNECT
  // Event handlers
  /** Will be called when the request is aborted */
  var onabort: js.UndefOr[js.Function1[/* response */ Response[TContext], scala.Unit]] = js.undefined
  /** Will be called if an error occurs while processing the request */
  var onerror: js.UndefOr[js.Function1[/* response */ Response[TContext], scala.Unit]] = js.undefined
  /** Will be called when the request has completed successfully */
  var onload: js.UndefOr[js.Function1[/* response */ Response[TContext], scala.Unit]] = js.undefined
  /** Will be called when the request progress changes */
  var onprogress: js.UndefOr[js.Function1[/* response */ ProgressResponse[TContext], scala.Unit]] = js.undefined
  /** Will be called repeatedly while the request is in progress */
  var onreadystatechange: js.UndefOr[js.Function1[/* response */ Response[TContext], scala.Unit]] = js.undefined
  /** Will be called if/when the request times out */
  var ontimeout: js.UndefOr[js.Function1[/* response */ Response[TContext], scala.Unit]] = js.undefined
  /**
    * A MIME type to specify with the request (e.g.
    * "text/html; charset=ISO-8859-1")
    */
  var overrideMimeType: js.UndefOr[java.lang.String] = js.undefined
  /** Password to use for authentication purposes */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When `true`, this is a synchronous request.
    * Be careful: The entire Firefox UI will be locked and frozen until the
    * request completes.In this mode, more data will be available in the
    * return value.
    */
  var synchronous: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The number of milliseconds to wait before terminating the call. Zero
    * (the default) means wait forever.
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Object containing optional function callbacks to monitor the upload
    * of data.
    */
  var upload: js.UndefOr[greasemonkeyLib.Anon_Onabort[TContext]] = js.undefined
  // Fields
  /**
    * The URL to make the request to. Must be an absolute URL, beginning
    * with the scheme. May be relative to the current page.
    */
  var url: java.lang.String
  /** User name to use for authentication purposes. */
  var user: js.UndefOr[java.lang.String] = js.undefined
}

object Request {
  @scala.inline
  def apply[TContext](
    method: greasemonkeyLib.greasemonkeyLibStrings.GET | greasemonkeyLib.greasemonkeyLibStrings.POST | greasemonkeyLib.greasemonkeyLibStrings.PUT | greasemonkeyLib.greasemonkeyLibStrings.DELETE | greasemonkeyLib.greasemonkeyLibStrings.PATCH | greasemonkeyLib.greasemonkeyLibStrings.HEAD | greasemonkeyLib.greasemonkeyLibStrings.TRACE | greasemonkeyLib.greasemonkeyLibStrings.OPTIONS | greasemonkeyLib.greasemonkeyLibStrings.CONNECT,
    url: java.lang.String,
    binary: js.UndefOr[scala.Boolean] = js.undefined,
    context: TContext = null,
    data: java.lang.String = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    onabort: /* response */ Response[TContext] => scala.Unit = null,
    onerror: /* response */ Response[TContext] => scala.Unit = null,
    onload: /* response */ Response[TContext] => scala.Unit = null,
    onprogress: /* response */ ProgressResponse[TContext] => scala.Unit = null,
    onreadystatechange: /* response */ Response[TContext] => scala.Unit = null,
    ontimeout: /* response */ Response[TContext] => scala.Unit = null,
    overrideMimeType: java.lang.String = null,
    password: java.lang.String = null,
    synchronous: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    upload: greasemonkeyLib.Anon_Onabort[TContext] = null,
    user: java.lang.String = null
  ): Request[TContext] = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url)
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary)
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (onabort != null) __obj.updateDynamic("onabort")(js.Any.fromFunction1(onabort))
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction1(onerror))
    if (onload != null) __obj.updateDynamic("onload")(js.Any.fromFunction1(onload))
    if (onprogress != null) __obj.updateDynamic("onprogress")(js.Any.fromFunction1(onprogress))
    if (onreadystatechange != null) __obj.updateDynamic("onreadystatechange")(js.Any.fromFunction1(onreadystatechange))
    if (ontimeout != null) __obj.updateDynamic("ontimeout")(js.Any.fromFunction1(ontimeout))
    if (overrideMimeType != null) __obj.updateDynamic("overrideMimeType")(overrideMimeType)
    if (password != null) __obj.updateDynamic("password")(password)
    if (!js.isUndefined(synchronous)) __obj.updateDynamic("synchronous")(synchronous)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (upload != null) __obj.updateDynamic("upload")(upload)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Request[TContext]]
  }
}

