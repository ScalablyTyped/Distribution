package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// region Ajax
// #region Ajax
trait AjaxSettings[TContext]
  extends jqueryLib.JQueryNs.AjaxNs.AjaxSettingsBase[TContext] {
  /**
    * A string containing the URL to which the request is sent.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object AjaxSettings {
  @scala.inline
  def apply[TContext](
    accepts: PlainObject[java.lang.String] = null,
    async: js.UndefOr[scala.Boolean] = js.undefined,
    beforeSend: js.ThisFunction2[
      TContext, 
      /* jqXHR */ jqXHR[_], 
      AjaxSettings[TContext], 
      jqueryLib.jqueryLibNumbers.`false` | scala.Unit
    ] = null,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    complete: TypeOrArray[jqueryLib.JQueryNs.AjaxNs.CompleteCallback[TContext]] = null,
    contentType: java.lang.String | jqueryLib.jqueryLibNumbers.`false` = null,
    contents: PlainObject[stdLib.RegExp] = null,
    context: TContext = null,
    converters: PlainObject[(js.Function1[/* value */ _, _]) | jqueryLib.jqueryLibNumbers.`true`] = null,
    crossDomain: js.UndefOr[scala.Boolean] = js.undefined,
    data: PlainObject[_] | java.lang.String = null,
    dataFilter: (/* data */ java.lang.String, /* type */ java.lang.String) => _ = null,
    dataType: jqueryLib.jqueryLibStrings.xml | jqueryLib.jqueryLibStrings.html | jqueryLib.jqueryLibStrings.script | jqueryLib.jqueryLibStrings.json | jqueryLib.jqueryLibStrings.jsonp | jqueryLib.jqueryLibStrings.text | java.lang.String = null,
    error: TypeOrArray[jqueryLib.JQueryNs.AjaxNs.ErrorCallback[TContext]] = null,
    global: js.UndefOr[scala.Boolean] = js.undefined,
    headers: PlainObject[js.UndefOr[java.lang.String | scala.Null]] = null,
    ifModified: js.UndefOr[scala.Boolean] = js.undefined,
    isLocal: js.UndefOr[scala.Boolean] = js.undefined,
    jsonp: java.lang.String | jqueryLib.jqueryLibNumbers.`false` = null,
    jsonpCallback: java.lang.String | (js.ThisFunction0[TContext, java.lang.String]) = null,
    method: java.lang.String = null,
    mimeType: java.lang.String = null,
    password: java.lang.String = null,
    processData: js.UndefOr[scala.Boolean] = js.undefined,
    scriptCharset: java.lang.String = null,
    statusCode: jqueryLib.JQueryNs.AjaxNs.StatusCodeCallbacks[TContext] = null,
    success: TypeOrArray[jqueryLib.JQueryNs.AjaxNs.SuccessCallback[TContext]] = null,
    timeout: scala.Int | scala.Double = null,
    traditional: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null,
    url: java.lang.String = null,
    username: java.lang.String = null,
    xhr: () => stdLib.XMLHttpRequest = null,
    xhrFields: jqueryLib.JQueryNs.AjaxNs.XHRFields = null
  ): AjaxSettings[TContext] = {
    val __obj = js.Dynamic.literal()
    if (accepts != null) __obj.updateDynamic("accepts")(accepts)
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(beforeSend)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (complete != null) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (contents != null) __obj.updateDynamic("contents")(contents)
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (converters != null) __obj.updateDynamic("converters")(converters)
    if (!js.isUndefined(crossDomain)) __obj.updateDynamic("crossDomain")(crossDomain)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataFilter != null) __obj.updateDynamic("dataFilter")(js.Any.fromFunction2(dataFilter))
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(ifModified)) __obj.updateDynamic("ifModified")(ifModified)
    if (!js.isUndefined(isLocal)) __obj.updateDynamic("isLocal")(isLocal)
    if (jsonp != null) __obj.updateDynamic("jsonp")(jsonp.asInstanceOf[js.Any])
    if (jsonpCallback != null) __obj.updateDynamic("jsonpCallback")(jsonpCallback.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (password != null) __obj.updateDynamic("password")(password)
    if (!js.isUndefined(processData)) __obj.updateDynamic("processData")(processData)
    if (scriptCharset != null) __obj.updateDynamic("scriptCharset")(scriptCharset)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode)
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(traditional)) __obj.updateDynamic("traditional")(traditional)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    if (username != null) __obj.updateDynamic("username")(username)
    if (xhr != null) __obj.updateDynamic("xhr")(js.Any.fromFunction0(xhr))
    if (xhrFields != null) __obj.updateDynamic("xhrFields")(xhrFields)
    __obj.asInstanceOf[AjaxSettings[TContext]]
  }
}

