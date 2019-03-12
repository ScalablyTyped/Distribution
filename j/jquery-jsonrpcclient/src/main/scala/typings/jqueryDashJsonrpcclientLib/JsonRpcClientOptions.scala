package typings
package jqueryDashJsonrpcclientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonRpcClientOptions
  extends jqueryLib.JQueryNs.AjaxSettings[js.Any] {
  var ajaxUrl: java.lang.String
  var getSockect: js.UndefOr[js.Function1[/* onmessageCb */ js.Function0[scala.Unit], stdLib.WebSocket]] = js.undefined
  @JSName("headers")
  var headers_JsonRpcClientOptions: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var onclose: js.UndefOr[js.Function1[/* ev */ stdLib.CloseEvent, scala.Unit]] = js.undefined
  var onerror: js.UndefOr[js.Function1[/* ev */ stdLib.Event, scala.Unit]] = js.undefined
  var onmessage: js.UndefOr[js.Function1[/* ev */ stdLib.MessageEvent, scala.Unit]] = js.undefined
  var onopen: js.UndefOr[js.Function1[/* ev */ stdLib.Event, scala.Unit]] = js.undefined
  var socketUrl: js.UndefOr[java.lang.String] = js.undefined
}

object JsonRpcClientOptions {
  @scala.inline
  def apply(
    ajaxUrl: java.lang.String,
    accepts: jqueryLib.JQueryNs.PlainObject[java.lang.String] = null,
    async: js.UndefOr[scala.Boolean] = js.undefined,
    beforeSend: js.ThisFunction2[
      js.Any, 
      /* jqXHR */ jqueryLib.JQueryNs.jqXHR[_], 
      JsonRpcClientOptions, 
      jqueryLib.jqueryLibNumbers.`false` | scala.Unit
    ] = null,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    complete: jqueryLib.JQueryNs.TypeOrArray[jqueryLib.JQueryNs.AjaxNs.CompleteCallback[js.Any]] = null,
    contentType: java.lang.String | jqueryLib.jqueryLibNumbers.`false` = null,
    contents: jqueryLib.JQueryNs.PlainObject[stdLib.RegExp] = null,
    context: js.Any = null,
    converters: jqueryLib.JQueryNs.PlainObject[(js.Function1[/* value */ _, _]) | jqueryLib.jqueryLibNumbers.`true`] = null,
    crossDomain: js.UndefOr[scala.Boolean] = js.undefined,
    data: jqueryLib.JQueryNs.PlainObject[_] | java.lang.String = null,
    dataFilter: (/* data */ java.lang.String, /* type */ java.lang.String) => _ = null,
    dataType: jqueryLib.jqueryLibStrings.xml | jqueryLib.jqueryLibStrings.html | jqueryLib.jqueryLibStrings.script | jqueryLib.jqueryLibStrings.json | jqueryLib.jqueryLibStrings.jsonp | jqueryLib.jqueryLibStrings.text | java.lang.String = null,
    error: jqueryLib.JQueryNs.TypeOrArray[jqueryLib.JQueryNs.AjaxNs.ErrorCallback[js.Any]] = null,
    getSockect: /* onmessageCb */ js.Function0[scala.Unit] => stdLib.WebSocket = null,
    global: js.UndefOr[scala.Boolean] = js.undefined,
    headers: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    ifModified: js.UndefOr[scala.Boolean] = js.undefined,
    isLocal: js.UndefOr[scala.Boolean] = js.undefined,
    jsonp: java.lang.String | jqueryLib.jqueryLibNumbers.`false` = null,
    jsonpCallback: java.lang.String | (js.ThisFunction0[js.Any, java.lang.String]) = null,
    method: java.lang.String = null,
    mimeType: java.lang.String = null,
    onclose: /* ev */ stdLib.CloseEvent => scala.Unit = null,
    onerror: /* ev */ stdLib.Event => scala.Unit = null,
    onmessage: /* ev */ stdLib.MessageEvent => scala.Unit = null,
    onopen: /* ev */ stdLib.Event => scala.Unit = null,
    password: java.lang.String = null,
    processData: js.UndefOr[scala.Boolean] = js.undefined,
    scriptCharset: java.lang.String = null,
    socketUrl: java.lang.String = null,
    statusCode: jqueryLib.JQueryNs.AjaxNs.StatusCodeCallbacks[js.Any] = null,
    success: jqueryLib.JQueryNs.TypeOrArray[jqueryLib.JQueryNs.AjaxNs.SuccessCallback[js.Any]] = null,
    timeout: scala.Int | scala.Double = null,
    traditional: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null,
    url: java.lang.String = null,
    username: java.lang.String = null,
    xhr: () => stdLib.XMLHttpRequest = null,
    xhrFields: jqueryLib.JQueryNs.AjaxNs.XHRFields = null
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

