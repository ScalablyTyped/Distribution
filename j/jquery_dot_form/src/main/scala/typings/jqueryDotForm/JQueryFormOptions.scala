package typings.jqueryDotForm

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
import typings.std.ProgressEvent
import typings.std.RegExp
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryFormOptions
  extends AjaxSettings[js.Any] {
  var beforeSerialize: js.UndefOr[js.Function2[/* $form */ JQuery, /* options */ JQueryFormOptions, Boolean]] = js.undefined
  var beforeSubmit: js.UndefOr[
    js.Function3[
      /* formData */ js.Array[_], 
      /* $form */ JQuery, 
      /* options */ JQueryFormOptions, 
      Boolean
    ]
  ] = js.undefined
  var clearForm: js.UndefOr[Boolean] = js.undefined
  var forceSync: js.UndefOr[Boolean] = js.undefined
  var iframe: js.UndefOr[Boolean] = js.undefined
  var iframeSrc: js.UndefOr[String] = js.undefined
  var iframeTarget: js.UndefOr[js.Any] = js.undefined
  var replaceTarget: js.UndefOr[Boolean] = js.undefined
  var resetForm: js.UndefOr[Boolean] = js.undefined
  var semantic: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[js.Any] = js.undefined
  var uploadProgress: js.UndefOr[
    js.Function4[
      /* event */ ProgressEvent, 
      /* position */ Double, 
      /* total */ Double, 
      /* percentComplete */ Double, 
      Unit
    ]
  ] = js.undefined
}

object JQueryFormOptions {
  @scala.inline
  def apply(
    accepts: PlainObject[String] = null,
    async: js.UndefOr[Boolean] = js.undefined,
    beforeSend: js.ThisFunction2[js.Any, /* jqXHR */ jqXHR[_], JQueryFormOptions, `false` | Unit] = null,
    beforeSerialize: (/* $form */ JQuery, /* options */ JQueryFormOptions) => Boolean = null,
    beforeSubmit: (/* formData */ js.Array[_], /* $form */ JQuery, /* options */ JQueryFormOptions) => Boolean = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    clearForm: js.UndefOr[Boolean] = js.undefined,
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
    forceSync: js.UndefOr[Boolean] = js.undefined,
    global: js.UndefOr[Boolean] = js.undefined,
    headers: PlainObject[js.UndefOr[String | Null]] = null,
    ifModified: js.UndefOr[Boolean] = js.undefined,
    iframe: js.UndefOr[Boolean] = js.undefined,
    iframeSrc: String = null,
    iframeTarget: js.Any = null,
    isLocal: js.UndefOr[Boolean] = js.undefined,
    jsonp: String | `false` = null,
    jsonpCallback: String | (js.ThisFunction0[js.Any, String]) = null,
    method: String = null,
    mimeType: String = null,
    password: String = null,
    processData: js.UndefOr[Boolean] = js.undefined,
    replaceTarget: js.UndefOr[Boolean] = js.undefined,
    resetForm: js.UndefOr[Boolean] = js.undefined,
    scriptCharset: String = null,
    semantic: js.UndefOr[Boolean] = js.undefined,
    statusCode: StatusCodeCallbacks[js.Any] = null,
    success: TypeOrArray[SuccessCallback[js.Any]] = null,
    target: js.Any = null,
    timeout: Int | Double = null,
    traditional: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    uploadProgress: (/* event */ ProgressEvent, /* position */ Double, /* total */ Double, /* percentComplete */ Double) => Unit = null,
    url: String = null,
    username: String = null,
    xhr: () => XMLHttpRequest = null,
    xhrFields: XHRFields = null
  ): JQueryFormOptions = {
    val __obj = js.Dynamic.literal()
    if (accepts != null) __obj.updateDynamic("accepts")(accepts)
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(beforeSend)
    if (beforeSerialize != null) __obj.updateDynamic("beforeSerialize")(js.Any.fromFunction2(beforeSerialize))
    if (beforeSubmit != null) __obj.updateDynamic("beforeSubmit")(js.Any.fromFunction3(beforeSubmit))
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (!js.isUndefined(clearForm)) __obj.updateDynamic("clearForm")(clearForm)
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
    if (!js.isUndefined(forceSync)) __obj.updateDynamic("forceSync")(forceSync)
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(ifModified)) __obj.updateDynamic("ifModified")(ifModified)
    if (!js.isUndefined(iframe)) __obj.updateDynamic("iframe")(iframe)
    if (iframeSrc != null) __obj.updateDynamic("iframeSrc")(iframeSrc)
    if (iframeTarget != null) __obj.updateDynamic("iframeTarget")(iframeTarget)
    if (!js.isUndefined(isLocal)) __obj.updateDynamic("isLocal")(isLocal)
    if (jsonp != null) __obj.updateDynamic("jsonp")(jsonp.asInstanceOf[js.Any])
    if (jsonpCallback != null) __obj.updateDynamic("jsonpCallback")(jsonpCallback.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (password != null) __obj.updateDynamic("password")(password)
    if (!js.isUndefined(processData)) __obj.updateDynamic("processData")(processData)
    if (!js.isUndefined(replaceTarget)) __obj.updateDynamic("replaceTarget")(replaceTarget)
    if (!js.isUndefined(resetForm)) __obj.updateDynamic("resetForm")(resetForm)
    if (scriptCharset != null) __obj.updateDynamic("scriptCharset")(scriptCharset)
    if (!js.isUndefined(semantic)) __obj.updateDynamic("semantic")(semantic)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode)
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(traditional)) __obj.updateDynamic("traditional")(traditional)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (uploadProgress != null) __obj.updateDynamic("uploadProgress")(js.Any.fromFunction4(uploadProgress))
    if (url != null) __obj.updateDynamic("url")(url)
    if (username != null) __obj.updateDynamic("username")(username)
    if (xhr != null) __obj.updateDynamic("xhr")(js.Any.fromFunction0(xhr))
    if (xhrFields != null) __obj.updateDynamic("xhrFields")(xhrFields)
    __obj.asInstanceOf[JQueryFormOptions]
  }
}

