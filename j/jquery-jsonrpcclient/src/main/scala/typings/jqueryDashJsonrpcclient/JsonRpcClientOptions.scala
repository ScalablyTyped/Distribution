package typings.jqueryDashJsonrpcclient

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryNs.AjaxNs.CompleteCallback
import typings.jquery.JQueryNs.AjaxNs.ErrorCallback
import typings.jquery.JQueryNs.AjaxNs.StatusCodeCallbacks
import typings.jquery.JQueryNs.AjaxNs.SuccessCallback
import typings.jquery.JQueryNs.AjaxNs.XHRFields
import typings.jquery.JQueryNs.AjaxSettings
import typings.jquery.JQueryNs.PlainObject
import typings.jquery.JQueryNs.TypeOrArray
import typings.jquery.JQueryNs.jqXHR
import typings.jquery.jqueryNumbers.`false`
import typings.jquery.jqueryNumbers.`true`
import typings.jquery.jqueryStrings.html
import typings.jquery.jqueryStrings.json
import typings.jquery.jqueryStrings.jsonp
import typings.jquery.jqueryStrings.script
import typings.jquery.jqueryStrings.text
import typings.jquery.jqueryStrings.xml
import typings.std.CloseEvent
import typings.std.Event
import typings.std.MessageEvent
import typings.std.RegExp
import typings.std.WebSocket
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonRpcClientOptions
  extends AjaxSettings[js.Any] {
  var ajaxUrl: String
  var getSockect: js.UndefOr[js.Function1[/* onmessageCb */ js.Function0[Unit], WebSocket]] = js.undefined
  @JSName("headers")
  var headers_JsonRpcClientOptions: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var onclose: js.UndefOr[js.Function1[/* ev */ CloseEvent, Unit]] = js.undefined
  var onerror: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.undefined
  var onmessage: js.UndefOr[js.Function1[/* ev */ MessageEvent, Unit]] = js.undefined
  var onopen: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.undefined
  var socketUrl: js.UndefOr[String] = js.undefined
}

object JsonRpcClientOptions {
  @scala.inline
  def apply(
    ajaxUrl: String,
    accepts: PlainObject[String] = null,
    async: js.UndefOr[Boolean] = js.undefined,
    beforeSend: js.ThisFunction2[js.Any, /* jqXHR */ jqXHR[_], JsonRpcClientOptions, `false` | Unit] = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    complete: TypeOrArray[CompleteCallback[js.Any]] = null,
    contentType: String | `false` = null,
    contents: PlainObject[RegExp] = null,
    context: js.Any = null,
    converters: PlainObject[(js.Function1[/* value */ _, _]) | `true`] = null,
    crossDomain: js.UndefOr[Boolean] = js.undefined,
    data: PlainObject[_] | String = null,
    dataFilter: (/* data */ String, /* type */ String) => _ = null,
    dataType: xml | html | script | json | jsonp | text | String = null,
    error: TypeOrArray[ErrorCallback[js.Any]] = null,
    getSockect: /* onmessageCb */ js.Function0[Unit] => WebSocket = null,
    global: js.UndefOr[Boolean] = js.undefined,
    headers: StringDictionary[js.Any] = null,
    ifModified: js.UndefOr[Boolean] = js.undefined,
    isLocal: js.UndefOr[Boolean] = js.undefined,
    jsonp: String | `false` = null,
    jsonpCallback: String | (js.ThisFunction0[js.Any, String]) = null,
    method: String = null,
    mimeType: String = null,
    onclose: /* ev */ CloseEvent => Unit = null,
    onerror: /* ev */ Event => Unit = null,
    onmessage: /* ev */ MessageEvent => Unit = null,
    onopen: /* ev */ Event => Unit = null,
    password: String = null,
    processData: js.UndefOr[Boolean] = js.undefined,
    scriptCharset: String = null,
    socketUrl: String = null,
    statusCode: StatusCodeCallbacks[js.Any] = null,
    success: TypeOrArray[SuccessCallback[js.Any]] = null,
    timeout: Int | Double = null,
    traditional: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    url: String = null,
    username: String = null,
    xhr: () => XMLHttpRequest = null,
    xhrFields: XHRFields = null
  ): JsonRpcClientOptions = {
    val __obj = js.Dynamic.literal(ajaxUrl = ajaxUrl)
    if (accepts != null) __obj.updateDynamic("accepts")(accepts)
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(beforeSend)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (complete != null) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (contents != null) __obj.updateDynamic("contents")(contents)
    if (context != null) __obj.updateDynamic("context")(context)
    if (converters != null) __obj.updateDynamic("converters")(converters)
    if (!js.isUndefined(crossDomain)) __obj.updateDynamic("crossDomain")(crossDomain)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataFilter != null) __obj.updateDynamic("dataFilter")(js.Any.fromFunction2(dataFilter))
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (getSockect != null) __obj.updateDynamic("getSockect")(js.Any.fromFunction1(getSockect))
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(ifModified)) __obj.updateDynamic("ifModified")(ifModified)
    if (!js.isUndefined(isLocal)) __obj.updateDynamic("isLocal")(isLocal)
    if (jsonp != null) __obj.updateDynamic("jsonp")(jsonp.asInstanceOf[js.Any])
    if (jsonpCallback != null) __obj.updateDynamic("jsonpCallback")(jsonpCallback.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (onclose != null) __obj.updateDynamic("onclose")(js.Any.fromFunction1(onclose))
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction1(onerror))
    if (onmessage != null) __obj.updateDynamic("onmessage")(js.Any.fromFunction1(onmessage))
    if (onopen != null) __obj.updateDynamic("onopen")(js.Any.fromFunction1(onopen))
    if (password != null) __obj.updateDynamic("password")(password)
    if (!js.isUndefined(processData)) __obj.updateDynamic("processData")(processData)
    if (scriptCharset != null) __obj.updateDynamic("scriptCharset")(scriptCharset)
    if (socketUrl != null) __obj.updateDynamic("socketUrl")(socketUrl)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode)
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(traditional)) __obj.updateDynamic("traditional")(traditional)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    if (username != null) __obj.updateDynamic("username")(username)
    if (xhr != null) __obj.updateDynamic("xhr")(js.Any.fromFunction0(xhr))
    if (xhrFields != null) __obj.updateDynamic("xhrFields")(xhrFields)
    __obj.asInstanceOf[JsonRpcClientOptions]
  }
}

