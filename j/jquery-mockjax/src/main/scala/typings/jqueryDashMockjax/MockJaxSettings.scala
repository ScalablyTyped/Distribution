package typings.jqueryDashMockjax

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockJaxSettings extends js.Object {
  var contentType: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dataType: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[MockJaxSettingsHeaders] = js.undefined
  var isTimeout: js.UndefOr[Boolean] = js.undefined
  var lastModified: js.UndefOr[String] = js.undefined
  var logLevelMethods: js.UndefOr[js.Array[String]] = js.undefined
  var logger: js.UndefOr[MockJaxStandardLogger | MockJaxCustomLogger] = js.undefined
  var logging: js.UndefOr[Boolean] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var onAfterComplete: js.UndefOr[js.Function] = js.undefined
  var onAfterError: js.UndefOr[js.Function] = js.undefined
  var onAfterSuccess: js.UndefOr[js.Function] = js.undefined
  var proxy: js.UndefOr[String] = js.undefined
  var proxyType: js.UndefOr[String] = js.undefined
  var response: js.UndefOr[js.Function2[/* settings */ js.Any, /* done */ js.UndefOr[js.Function], Unit]] = js.undefined
  var responseText: js.UndefOr[String | js.Object] = js.undefined
  var responseTime: js.UndefOr[Double] = js.undefined
  var responseXml: js.UndefOr[String] = js.undefined
  var retainAjaxCalls: js.UndefOr[Boolean] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
  var statusText: js.UndefOr[String] = js.undefined
  var throwUnmocked: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String | RegExp] = js.undefined
  var urlParams: js.UndefOr[js.Array[String]] = js.undefined
}

object MockJaxSettings {
  @scala.inline
  def apply(
    contentType: String = null,
    data: js.Any = null,
    dataType: String = null,
    etag: String = null,
    headers: MockJaxSettingsHeaders = null,
    isTimeout: js.UndefOr[Boolean] = js.undefined,
    lastModified: String = null,
    logLevelMethods: js.Array[String] = null,
    logger: MockJaxStandardLogger | MockJaxCustomLogger = null,
    logging: js.UndefOr[Boolean] = js.undefined,
    namespace: String = null,
    onAfterComplete: js.Function = null,
    onAfterError: js.Function = null,
    onAfterSuccess: js.Function = null,
    proxy: String = null,
    proxyType: String = null,
    response: (/* settings */ js.Any, /* done */ js.UndefOr[js.Function]) => Unit = null,
    responseText: String | js.Object = null,
    responseTime: Int | Double = null,
    responseXml: String = null,
    retainAjaxCalls: js.UndefOr[Boolean] = js.undefined,
    status: Int | Double = null,
    statusText: String = null,
    throwUnmocked: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    url: String | RegExp = null,
    urlParams: js.Array[String] = null
  ): MockJaxSettings = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(isTimeout)) __obj.updateDynamic("isTimeout")(isTimeout.asInstanceOf[js.Any])
    if (lastModified != null) __obj.updateDynamic("lastModified")(lastModified.asInstanceOf[js.Any])
    if (logLevelMethods != null) __obj.updateDynamic("logLevelMethods")(logLevelMethods.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (!js.isUndefined(logging)) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (onAfterComplete != null) __obj.updateDynamic("onAfterComplete")(onAfterComplete.asInstanceOf[js.Any])
    if (onAfterError != null) __obj.updateDynamic("onAfterError")(onAfterError.asInstanceOf[js.Any])
    if (onAfterSuccess != null) __obj.updateDynamic("onAfterSuccess")(onAfterSuccess.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (proxyType != null) __obj.updateDynamic("proxyType")(proxyType.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(js.Any.fromFunction2(response))
    if (responseText != null) __obj.updateDynamic("responseText")(responseText.asInstanceOf[js.Any])
    if (responseTime != null) __obj.updateDynamic("responseTime")(responseTime.asInstanceOf[js.Any])
    if (responseXml != null) __obj.updateDynamic("responseXml")(responseXml.asInstanceOf[js.Any])
    if (!js.isUndefined(retainAjaxCalls)) __obj.updateDynamic("retainAjaxCalls")(retainAjaxCalls.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText.asInstanceOf[js.Any])
    if (!js.isUndefined(throwUnmocked)) __obj.updateDynamic("throwUnmocked")(throwUnmocked.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urlParams != null) __obj.updateDynamic("urlParams")(urlParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockJaxSettings]
  }
}

