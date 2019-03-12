package typings
package jqueryDotFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryFormOptions
  extends jqueryLib.JQueryNs.AjaxSettings[js.Any] {
  var beforeSerialize: js.UndefOr[js.Function2[/* $form */ JQuery, /* options */ JQueryFormOptions, scala.Boolean]] = js.undefined
  var beforeSubmit: js.UndefOr[
    js.Function3[
      /* formData */ js.Array[_], 
      /* $form */ JQuery, 
      /* options */ JQueryFormOptions, 
      scala.Boolean
    ]
  ] = js.undefined
  var clearForm: js.UndefOr[scala.Boolean] = js.undefined
  var forceSync: js.UndefOr[scala.Boolean] = js.undefined
  var iframe: js.UndefOr[scala.Boolean] = js.undefined
  var iframeSrc: js.UndefOr[java.lang.String] = js.undefined
  var iframeTarget: js.UndefOr[js.Any] = js.undefined
  var replaceTarget: js.UndefOr[scala.Boolean] = js.undefined
  var resetForm: js.UndefOr[scala.Boolean] = js.undefined
  var semantic: js.UndefOr[scala.Boolean] = js.undefined
  var target: js.UndefOr[js.Any] = js.undefined
  var uploadProgress: js.UndefOr[
    js.Function4[
      /* event */ stdLib.ProgressEvent, 
      /* position */ scala.Double, 
      /* total */ scala.Double, 
      /* percentComplete */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
}

object JQueryFormOptions {
  @scala.inline
  def apply(
    accepts: jqueryLib.JQueryNs.PlainObject[java.lang.String] = null,
    async: js.UndefOr[scala.Boolean] = js.undefined,
    beforeSend: js.ThisFunction2[
      js.Any, 
      /* jqXHR */ jqueryLib.JQueryNs.jqXHR[_], 
      JQueryFormOptions, 
      jqueryLib.jqueryLibNumbers.`false` | scala.Unit
    ] = null,
    beforeSerialize: (/* $form */ JQuery, /* options */ JQueryFormOptions) => scala.Boolean = null,
    beforeSubmit: (/* formData */ js.Array[_], /* $form */ JQuery, /* options */ JQueryFormOptions) => scala.Boolean = null,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    clearForm: js.UndefOr[scala.Boolean] = js.undefined,
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
    forceSync: js.UndefOr[scala.Boolean] = js.undefined,
    global: js.UndefOr[scala.Boolean] = js.undefined,
    headers: jqueryLib.JQueryNs.PlainObject[js.UndefOr[java.lang.String | scala.Null]] = null,
    ifModified: js.UndefOr[scala.Boolean] = js.undefined,
    iframe: js.UndefOr[scala.Boolean] = js.undefined,
    iframeSrc: java.lang.String = null,
    iframeTarget: js.Any = null,
    isLocal: js.UndefOr[scala.Boolean] = js.undefined,
    jsonp: java.lang.String | jqueryLib.jqueryLibNumbers.`false` = null,
    jsonpCallback: java.lang.String | (js.ThisFunction0[js.Any, java.lang.String]) = null,
    method: java.lang.String = null,
    mimeType: java.lang.String = null,
    password: java.lang.String = null,
    processData: js.UndefOr[scala.Boolean] = js.undefined,
    replaceTarget: js.UndefOr[scala.Boolean] = js.undefined,
    resetForm: js.UndefOr[scala.Boolean] = js.undefined,
    scriptCharset: java.lang.String = null,
    semantic: js.UndefOr[scala.Boolean] = js.undefined,
    statusCode: jqueryLib.JQueryNs.AjaxNs.StatusCodeCallbacks[js.Any] = null,
    success: jqueryLib.JQueryNs.TypeOrArray[jqueryLib.JQueryNs.AjaxNs.SuccessCallback[js.Any]] = null,
    target: js.Any = null,
    timeout: scala.Int | scala.Double = null,
    traditional: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null,
    uploadProgress: (/* event */ stdLib.ProgressEvent, /* position */ scala.Double, /* total */ scala.Double, /* percentComplete */ scala.Double) => scala.Unit = null,
    url: java.lang.String = null,
    username: java.lang.String = null,
    xhr: () => stdLib.XMLHttpRequest = null,
    xhrFields: jqueryLib.JQueryNs.AjaxNs.XHRFields = null
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

