package typings
package jqueryDashTypeaheadLib.RunningCoderNs.TypeaheadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AJaxSettings
  extends jqueryLib.JQueryNs.AjaxSettings[js.Any] {
  var always: js.UndefOr[
    js.Function3[
      /* data */ js.UndefOr[jqueryDashTypeaheadLib.JQuery], 
      /* textStatus */ js.UndefOr[java.lang.String], 
      /* jqXHR */ js.UndefOr[jqueryLib.JQueryXHR], 
      scala.Unit
    ]
  ] = js.undefined
  var done: js.UndefOr[
    js.Function3[
      /* data */ js.UndefOr[jqueryDashTypeaheadLib.JQuery], 
      /* textStatus */ js.UndefOr[java.lang.String], 
      /* jqXHR */ js.UndefOr[jqueryLib.JQueryXHR], 
      scala.Unit
    ]
  ] = js.undefined
  var fail: js.UndefOr[
    js.Function3[
      /* jqXHR */ js.UndefOr[jqueryLib.JQueryXHR], 
      /* textStatus */ js.UndefOr[java.lang.String], 
      /* errorThrown */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var `then`: js.UndefOr[
    js.Function2[
      /* jqXHR */ js.UndefOr[jqueryLib.JQueryXHR], 
      /* textStatus */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
}

object AJaxSettings {
  @scala.inline
  def apply(
    accepts: jqueryLib.JQueryNs.PlainObject[java.lang.String] = null,
    always: (/* data */ js.UndefOr[jqueryDashTypeaheadLib.JQuery], /* textStatus */ js.UndefOr[java.lang.String], /* jqXHR */ js.UndefOr[jqueryLib.JQueryXHR]) => scala.Unit = null,
    async: js.UndefOr[scala.Boolean] = js.undefined,
    beforeSend: js.ThisFunction2[
      js.Any, 
      /* jqXHR */ jqueryLib.JQueryNs.jqXHR[_], 
      AJaxSettings, 
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
    done: (/* data */ js.UndefOr[jqueryDashTypeaheadLib.JQuery], /* textStatus */ js.UndefOr[java.lang.String], /* jqXHR */ js.UndefOr[jqueryLib.JQueryXHR]) => scala.Unit = null,
    error: jqueryLib.JQueryNs.TypeOrArray[jqueryLib.JQueryNs.AjaxNs.ErrorCallback[js.Any]] = null,
    fail: (/* jqXHR */ js.UndefOr[jqueryLib.JQueryXHR], /* textStatus */ js.UndefOr[java.lang.String], /* errorThrown */ js.UndefOr[js.Any]) => scala.Unit = null,
    global: js.UndefOr[scala.Boolean] = js.undefined,
    headers: jqueryLib.JQueryNs.PlainObject[js.UndefOr[java.lang.String | scala.Null]] = null,
    ifModified: js.UndefOr[scala.Boolean] = js.undefined,
    isLocal: js.UndefOr[scala.Boolean] = js.undefined,
    jsonp: java.lang.String | jqueryLib.jqueryLibNumbers.`false` = null,
    jsonpCallback: java.lang.String | (js.ThisFunction0[js.Any, java.lang.String]) = null,
    method: java.lang.String = null,
    mimeType: java.lang.String = null,
    password: java.lang.String = null,
    path: java.lang.String = null,
    processData: js.UndefOr[scala.Boolean] = js.undefined,
    scriptCharset: java.lang.String = null,
    statusCode: jqueryLib.JQueryNs.AjaxNs.StatusCodeCallbacks[js.Any] = null,
    success: jqueryLib.JQueryNs.TypeOrArray[jqueryLib.JQueryNs.AjaxNs.SuccessCallback[js.Any]] = null,
    `then`: (/* jqXHR */ js.UndefOr[jqueryLib.JQueryXHR], /* textStatus */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    timeout: scala.Int | scala.Double = null,
    traditional: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null,
    url: java.lang.String = null,
    username: java.lang.String = null,
    xhr: () => stdLib.XMLHttpRequest = null,
    xhrFields: jqueryLib.JQueryNs.AjaxNs.XHRFields = null
  ): AJaxSettings = {
    val __obj = js.Dynamic.literal()
    if (accepts != null) __obj.updateDynamic("accepts")(accepts)
    if (always != null) __obj.updateDynamic("always")(js.Any.fromFunction3(always))
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
    if (done != null) __obj.updateDynamic("done")(js.Any.fromFunction3(done))
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction3(fail))
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(ifModified)) __obj.updateDynamic("ifModified")(ifModified)
    if (!js.isUndefined(isLocal)) __obj.updateDynamic("isLocal")(isLocal)
    if (jsonp != null) __obj.updateDynamic("jsonp")(jsonp.asInstanceOf[js.Any])
    if (jsonpCallback != null) __obj.updateDynamic("jsonpCallback")(jsonpCallback.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (password != null) __obj.updateDynamic("password")(password)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(processData)) __obj.updateDynamic("processData")(processData)
    if (scriptCharset != null) __obj.updateDynamic("scriptCharset")(scriptCharset)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode)
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (`then` != null) __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(traditional)) __obj.updateDynamic("traditional")(traditional)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    if (username != null) __obj.updateDynamic("username")(username)
    if (xhr != null) __obj.updateDynamic("xhr")(js.Any.fromFunction0(xhr))
    if (xhrFields != null) __obj.updateDynamic("xhrFields")(xhrFields)
    __obj.asInstanceOf[AJaxSettings]
  }
}

