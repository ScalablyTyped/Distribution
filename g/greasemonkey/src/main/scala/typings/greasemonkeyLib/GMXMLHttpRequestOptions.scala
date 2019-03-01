package typings
package greasemonkeyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////
// XMLHttpRequest
////////////////
/**
  * Request options for {@link GM_xmlhttpRequest}.
  * @see {@link http://wiki.greasespot.net/GM_xmlhttpRequest#Arguments}
  */
trait GMXMLHttpRequestOptions extends js.Object {
  var binary: js.UndefOr[scala.Boolean] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var method: java.lang.String
  var onabort: js.UndefOr[js.Function1[/* response */ GMXMLHttpRequestResponse, _]] = js.undefined
  var onerror: js.UndefOr[js.Function1[/* response */ GMXMLHttpRequestResponse, _]] = js.undefined
  var onload: js.UndefOr[js.Function1[/* response */ GMXMLHttpRequestResponse, _]] = js.undefined
  var onprogress: js.UndefOr[js.Function1[/* response */ GMXMLHttpRequestProgressResponse, _]] = js.undefined
  var onreadystatechange: js.UndefOr[js.Function1[/* response */ GMXMLHttpRequestResponse, _]] = js.undefined
  var ontimeout: js.UndefOr[js.Function1[/* response */ GMXMLHttpRequestResponse, _]] = js.undefined
  var overrideMimeType: js.UndefOr[java.lang.String] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var synchronous: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var upload: js.UndefOr[Anon_Onabort] = js.undefined
  var url: java.lang.String
  var user: js.UndefOr[java.lang.String] = js.undefined
}

object GMXMLHttpRequestOptions {
  @scala.inline
  def apply(
    method: java.lang.String,
    url: java.lang.String,
    binary: js.UndefOr[scala.Boolean] = js.undefined,
    context: js.Any = null,
    data: java.lang.String = null,
    headers: js.Object = null,
    onabort: js.Function1[/* response */ GMXMLHttpRequestResponse, _] = null,
    onerror: js.Function1[/* response */ GMXMLHttpRequestResponse, _] = null,
    onload: js.Function1[/* response */ GMXMLHttpRequestResponse, _] = null,
    onprogress: js.Function1[/* response */ GMXMLHttpRequestProgressResponse, _] = null,
    onreadystatechange: js.Function1[/* response */ GMXMLHttpRequestResponse, _] = null,
    ontimeout: js.Function1[/* response */ GMXMLHttpRequestResponse, _] = null,
    overrideMimeType: java.lang.String = null,
    password: java.lang.String = null,
    synchronous: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    upload: Anon_Onabort = null,
    user: java.lang.String = null
  ): GMXMLHttpRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("url")(url)
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary)
    if (context != null) __obj.updateDynamic("context")(context)
    if (data != null) __obj.updateDynamic("data")(data)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (onabort != null) __obj.updateDynamic("onabort")(onabort)
    if (onerror != null) __obj.updateDynamic("onerror")(onerror)
    if (onload != null) __obj.updateDynamic("onload")(onload)
    if (onprogress != null) __obj.updateDynamic("onprogress")(onprogress)
    if (onreadystatechange != null) __obj.updateDynamic("onreadystatechange")(onreadystatechange)
    if (ontimeout != null) __obj.updateDynamic("ontimeout")(ontimeout)
    if (overrideMimeType != null) __obj.updateDynamic("overrideMimeType")(overrideMimeType)
    if (password != null) __obj.updateDynamic("password")(password)
    if (!js.isUndefined(synchronous)) __obj.updateDynamic("synchronous")(synchronous)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (upload != null) __obj.updateDynamic("upload")(upload)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[GMXMLHttpRequestOptions]
  }
}

