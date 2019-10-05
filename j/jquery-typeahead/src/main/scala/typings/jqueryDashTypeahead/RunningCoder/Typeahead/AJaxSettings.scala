package typings.jqueryDashTypeahead.RunningCoder.Typeahead

import typings.jquery.JQuery.Ajax.CompleteCallback
import typings.jquery.JQuery.Ajax.ErrorCallback
import typings.jquery.JQuery.Ajax.StatusCodeCallbacks
import typings.jquery.JQuery.Ajax.SuccessCallback
import typings.jquery.JQuery.Ajax.XHRFields
import typings.jquery.JQuery.AjaxSettings
import typings.jquery.JQuery.PlainObject
import typings.jquery.JQuery.TypeOrArray
import typings.jquery.JQuery.jqXHR
import typings.jquery.JQueryXHR
import typings.jquery.jqueryNumbers.`false`
import typings.jquery.jqueryNumbers.`true`
import typings.jquery.jqueryStrings.html
import typings.jquery.jqueryStrings.json
import typings.jquery.jqueryStrings.jsonp
import typings.jquery.jqueryStrings.script
import typings.jquery.jqueryStrings.text
import typings.jquery.jqueryStrings.xml
import typings.jqueryDashTypeahead.JQuery
import typings.std.RegExp
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AJaxSettings
  extends AjaxSettings[js.Any] {
  var always: js.UndefOr[
    js.Function3[
      /* data */ js.UndefOr[JQuery], 
      /* textStatus */ js.UndefOr[String], 
      /* jqXHR */ js.UndefOr[JQueryXHR], 
      Unit
    ]
  ] = js.undefined
  var done: js.UndefOr[
    js.Function3[
      /* data */ js.UndefOr[JQuery], 
      /* textStatus */ js.UndefOr[String], 
      /* jqXHR */ js.UndefOr[JQueryXHR], 
      Unit
    ]
  ] = js.undefined
  var fail: js.UndefOr[
    js.Function3[
      /* jqXHR */ js.UndefOr[JQueryXHR], 
      /* textStatus */ js.UndefOr[String], 
      /* errorThrown */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var `then`: js.UndefOr[
    js.Function2[/* jqXHR */ js.UndefOr[JQueryXHR], /* textStatus */ js.UndefOr[String], Unit]
  ] = js.undefined
}

object AJaxSettings {
  @scala.inline
  def apply(
    accepts: PlainObject[String] = null,
    always: (/* data */ js.UndefOr[JQuery], /* textStatus */ js.UndefOr[String], /* jqXHR */ js.UndefOr[JQueryXHR]) => Unit = null,
    async: js.UndefOr[Boolean] = js.undefined,
    beforeSend: js.ThisFunction2[js.Any, /* jqXHR */ jqXHR[_], AJaxSettings, `false` | Unit] = null,
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
    done: (/* data */ js.UndefOr[JQuery], /* textStatus */ js.UndefOr[String], /* jqXHR */ js.UndefOr[JQueryXHR]) => Unit = null,
    error: TypeOrArray[ErrorCallback[js.Any]] = null,
    fail: (/* jqXHR */ js.UndefOr[JQueryXHR], /* textStatus */ js.UndefOr[String], /* errorThrown */ js.UndefOr[js.Any]) => Unit = null,
    global: js.UndefOr[Boolean] = js.undefined,
    headers: PlainObject[js.UndefOr[String | Null]] = null,
    ifModified: js.UndefOr[Boolean] = js.undefined,
    isLocal: js.UndefOr[Boolean] = js.undefined,
    jsonp: String | `false` = null,
    jsonpCallback: String | (js.ThisFunction0[js.Any, String]) = null,
    method: String = null,
    mimeType: String = null,
    password: String = null,
    path: String = null,
    processData: js.UndefOr[Boolean] = js.undefined,
    scriptCharset: String = null,
    statusCode: StatusCodeCallbacks[js.Any] = null,
    success: TypeOrArray[SuccessCallback[js.Any]] = null,
    `then`: (/* jqXHR */ js.UndefOr[JQueryXHR], /* textStatus */ js.UndefOr[String]) => Unit = null,
    timeout: Int | Double = null,
    traditional: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    url: String = null,
    username: String = null,
    xhr: () => XMLHttpRequest = null,
    xhrFields: XHRFields = null
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

