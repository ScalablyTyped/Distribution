package typings
package jqueryDotPjaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PjaxSettings
  extends jqueryLib.JQueryNs.AjaxSettings[js.Any] {
  /**
    * A jQuery selector indicates where to stick the response body. E.g., $(container).html(xhr.responseBody).
    * If it is not defined, the `data-pjax` attribute of the link will be treated as container.
    * If such an attribute is not defined too, the context will be treated as container.
    */
  var container: js.UndefOr[java.lang.String] = js.undefined
  /**
    * CSS selector for the fragment to extract from ajax response.
    */
  var fragment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * How many requests to cache. Defaults to 20.
    */
  var maxCacheLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to pushState the URL. Defaults to true.
    */
  var push: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to replaceState the URL. Defaults to false.
    */
  var replace: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Vertical position to scroll to after navigation.
    * To avoid changing scroll position, pass false.
    */
  var scrollTo: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  /**
    * Eventually the relatedTarget value for pjax events.
    */
  var target: js.UndefOr[stdLib.EventTarget] = js.undefined
  /**
    * A string or function returning the current pjax version
    */
  var version: js.UndefOr[java.lang.String | js.Function0[java.lang.String]] = js.undefined
}

object PjaxSettings {
  @scala.inline
  def apply(
    accepts: jqueryLib.JQueryNs.PlainObject[java.lang.String] = null,
    async: js.UndefOr[scala.Boolean] = js.undefined,
    beforeSend: js.ThisFunction2[
      js.Any, 
      /* jqXHR */ jqueryLib.JQueryNs.jqXHR[_], 
      PjaxSettings, 
      jqueryLib.jqueryLibNumbers.`false` | scala.Unit
    ] = null,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    complete: jqueryLib.JQueryNs.TypeOrArray[jqueryLib.JQueryNs.AjaxNs.CompleteCallback[js.Any]] = null,
    container: java.lang.String = null,
    contentType: java.lang.String | jqueryLib.jqueryLibNumbers.`false` = null,
    contents: jqueryLib.JQueryNs.PlainObject[stdLib.RegExp] = null,
    context: js.Any = null,
    converters: jqueryLib.JQueryNs.PlainObject[(js.Function1[/* value */ _, _]) | jqueryLib.jqueryLibNumbers.`true`] = null,
    crossDomain: js.UndefOr[scala.Boolean] = js.undefined,
    data: jqueryLib.JQueryNs.PlainObject[_] | java.lang.String = null,
    dataFilter: js.Function2[/* data */ java.lang.String, /* type */ java.lang.String, _] = null,
    dataType: jqueryLib.jqueryLibStrings.xml | jqueryLib.jqueryLibStrings.html | jqueryLib.jqueryLibStrings.script | jqueryLib.jqueryLibStrings.json | jqueryLib.jqueryLibStrings.jsonp | jqueryLib.jqueryLibStrings.text | java.lang.String = null,
    error: jqueryLib.JQueryNs.TypeOrArray[jqueryLib.JQueryNs.AjaxNs.ErrorCallback[js.Any]] = null,
    fragment: java.lang.String = null,
    global: js.UndefOr[scala.Boolean] = js.undefined,
    headers: jqueryLib.JQueryNs.PlainObject[js.UndefOr[java.lang.String | scala.Null]] = null,
    ifModified: js.UndefOr[scala.Boolean] = js.undefined,
    isLocal: js.UndefOr[scala.Boolean] = js.undefined,
    jsonp: java.lang.String | jqueryLib.jqueryLibNumbers.`false` = null,
    jsonpCallback: java.lang.String | (js.ThisFunction0[js.Any, java.lang.String]) = null,
    maxCacheLength: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    mimeType: java.lang.String = null,
    password: java.lang.String = null,
    processData: js.UndefOr[scala.Boolean] = js.undefined,
    push: js.UndefOr[scala.Boolean] = js.undefined,
    replace: js.UndefOr[scala.Boolean] = js.undefined,
    scriptCharset: java.lang.String = null,
    scrollTo: scala.Double | scala.Boolean = null,
    statusCode: jqueryLib.JQueryNs.AjaxNs.StatusCodeCallbacks[js.Any] = null,
    success: jqueryLib.JQueryNs.TypeOrArray[jqueryLib.JQueryNs.AjaxNs.SuccessCallback[js.Any]] = null,
    target: stdLib.EventTarget = null,
    timeout: scala.Int | scala.Double = null,
    traditional: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null,
    url: java.lang.String = null,
    username: java.lang.String = null,
    version: java.lang.String | js.Function0[java.lang.String] = null,
    xhr: js.Function0[stdLib.XMLHttpRequest] = null,
    xhrFields: jqueryLib.JQueryNs.AjaxNs.XHRFields = null
  ): PjaxSettings = {
    val __obj = js.Dynamic.literal()
    if (accepts != null) __obj.updateDynamic("accepts")(accepts)
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(beforeSend)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (complete != null) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (contents != null) __obj.updateDynamic("contents")(contents)
    if (context != null) __obj.updateDynamic("context")(context)
    if (converters != null) __obj.updateDynamic("converters")(converters)
    if (!js.isUndefined(crossDomain)) __obj.updateDynamic("crossDomain")(crossDomain)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataFilter != null) __obj.updateDynamic("dataFilter")(dataFilter)
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (fragment != null) __obj.updateDynamic("fragment")(fragment)
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(ifModified)) __obj.updateDynamic("ifModified")(ifModified)
    if (!js.isUndefined(isLocal)) __obj.updateDynamic("isLocal")(isLocal)
    if (jsonp != null) __obj.updateDynamic("jsonp")(jsonp.asInstanceOf[js.Any])
    if (jsonpCallback != null) __obj.updateDynamic("jsonpCallback")(jsonpCallback.asInstanceOf[js.Any])
    if (maxCacheLength != null) __obj.updateDynamic("maxCacheLength")(maxCacheLength.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (password != null) __obj.updateDynamic("password")(password)
    if (!js.isUndefined(processData)) __obj.updateDynamic("processData")(processData)
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push)
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace)
    if (scriptCharset != null) __obj.updateDynamic("scriptCharset")(scriptCharset)
    if (scrollTo != null) __obj.updateDynamic("scrollTo")(scrollTo.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode)
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(traditional)) __obj.updateDynamic("traditional")(traditional)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    if (username != null) __obj.updateDynamic("username")(username)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    if (xhrFields != null) __obj.updateDynamic("xhrFields")(xhrFields)
    __obj.asInstanceOf[PjaxSettings]
  }
}

