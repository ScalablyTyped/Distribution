package typings
package jqueryDashMockjaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockJaxSettings extends js.Object {
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dataType: js.UndefOr[java.lang.String] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[MockJaxSettingsHeaders] = js.undefined
  var isTimeout: js.UndefOr[scala.Boolean] = js.undefined
  var lastModified: js.UndefOr[java.lang.String] = js.undefined
  var logLevelMethods: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var logger: js.UndefOr[MockJaxStandardLogger | MockJaxCustomLogger] = js.undefined
  var logging: js.UndefOr[scala.Boolean] = js.undefined
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  var onAfterComplete: js.UndefOr[js.Function] = js.undefined
  var onAfterError: js.UndefOr[js.Function] = js.undefined
  var onAfterSuccess: js.UndefOr[js.Function] = js.undefined
  var proxy: js.UndefOr[java.lang.String] = js.undefined
  var proxyType: js.UndefOr[java.lang.String] = js.undefined
  var response: js.UndefOr[
    js.Function2[/* settings */ js.Any, /* done */ js.UndefOr[js.Function], scala.Unit]
  ] = js.undefined
  var responseText: js.UndefOr[java.lang.String | js.Object] = js.undefined
  var responseTime: js.UndefOr[scala.Double] = js.undefined
  var responseXml: js.UndefOr[java.lang.String] = js.undefined
  var retainAjaxCalls: js.UndefOr[scala.Boolean] = js.undefined
  var status: js.UndefOr[scala.Double] = js.undefined
  var statusText: js.UndefOr[java.lang.String] = js.undefined
  var throwUnmocked: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
  var urlParams: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object MockJaxSettings {
  @scala.inline
  def apply(
    contentType: java.lang.String = null,
    data: js.Any = null,
    dataType: java.lang.String = null,
    etag: java.lang.String = null,
    headers: MockJaxSettingsHeaders = null,
    isTimeout: js.UndefOr[scala.Boolean] = js.undefined,
    lastModified: java.lang.String = null,
    logLevelMethods: js.Array[java.lang.String] = null,
    logger: MockJaxStandardLogger | MockJaxCustomLogger = null,
    logging: js.UndefOr[scala.Boolean] = js.undefined,
    namespace: java.lang.String = null,
    onAfterComplete: js.Function = null,
    onAfterError: js.Function = null,
    onAfterSuccess: js.Function = null,
    proxy: java.lang.String = null,
    proxyType: java.lang.String = null,
    response: js.Function2[/* settings */ js.Any, /* done */ js.UndefOr[js.Function], scala.Unit] = null,
    responseText: java.lang.String | js.Object = null,
    responseTime: scala.Int | scala.Double = null,
    responseXml: java.lang.String = null,
    retainAjaxCalls: js.UndefOr[scala.Boolean] = js.undefined,
    status: scala.Int | scala.Double = null,
    statusText: java.lang.String = null,
    throwUnmocked: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null,
    url: java.lang.String | stdLib.RegExp = null,
    urlParams: js.Array[java.lang.String] = null
  ): MockJaxSettings = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(isTimeout)) __obj.updateDynamic("isTimeout")(isTimeout)
    if (lastModified != null) __obj.updateDynamic("lastModified")(lastModified)
    if (logLevelMethods != null) __obj.updateDynamic("logLevelMethods")(logLevelMethods)
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (!js.isUndefined(logging)) __obj.updateDynamic("logging")(logging)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (onAfterComplete != null) __obj.updateDynamic("onAfterComplete")(onAfterComplete)
    if (onAfterError != null) __obj.updateDynamic("onAfterError")(onAfterError)
    if (onAfterSuccess != null) __obj.updateDynamic("onAfterSuccess")(onAfterSuccess)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (proxyType != null) __obj.updateDynamic("proxyType")(proxyType)
    if (response != null) __obj.updateDynamic("response")(response)
    if (responseText != null) __obj.updateDynamic("responseText")(responseText.asInstanceOf[js.Any])
    if (responseTime != null) __obj.updateDynamic("responseTime")(responseTime.asInstanceOf[js.Any])
    if (responseXml != null) __obj.updateDynamic("responseXml")(responseXml)
    if (!js.isUndefined(retainAjaxCalls)) __obj.updateDynamic("retainAjaxCalls")(retainAjaxCalls)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText)
    if (!js.isUndefined(throwUnmocked)) __obj.updateDynamic("throwUnmocked")(throwUnmocked)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urlParams != null) __obj.updateDynamic("urlParams")(urlParams)
    __obj.asInstanceOf[MockJaxSettings]
  }
}

