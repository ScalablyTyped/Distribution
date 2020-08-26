package typings.jqueryMockjax

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockJaxSettings extends js.Object {
  var contentType: js.UndefOr[String] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var dataType: js.UndefOr[String] = js.native
  var etag: js.UndefOr[String] = js.native
  var headers: js.UndefOr[MockJaxSettingsHeaders] = js.native
  var isTimeout: js.UndefOr[Boolean] = js.native
  var lastModified: js.UndefOr[String] = js.native
  var logLevelMethods: js.UndefOr[js.Array[String]] = js.native
  var logger: js.UndefOr[MockJaxStandardLogger | MockJaxCustomLogger] = js.native
  var logging: js.UndefOr[Boolean] = js.native
  var namespace: js.UndefOr[String] = js.native
  var onAfterComplete: js.UndefOr[js.Function] = js.native
  var onAfterError: js.UndefOr[js.Function] = js.native
  var onAfterSuccess: js.UndefOr[js.Function] = js.native
  var proxy: js.UndefOr[String] = js.native
  var proxyType: js.UndefOr[String] = js.native
  var response: js.UndefOr[js.Function2[/* settings */ js.Any, /* done */ js.UndefOr[js.Function], Unit]] = js.native
  var responseText: js.UndefOr[String | js.Object] = js.native
  var responseTime: js.UndefOr[Double] = js.native
  var responseXml: js.UndefOr[String] = js.native
  var retainAjaxCalls: js.UndefOr[Boolean] = js.native
  var status: js.UndefOr[Double] = js.native
  var statusText: js.UndefOr[String] = js.native
  var throwUnmocked: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
  var url: js.UndefOr[String | RegExp] = js.native
  var urlParams: js.UndefOr[js.Array[String]] = js.native
}

object MockJaxSettings {
  @scala.inline
  def apply(): MockJaxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockJaxSettings]
  }
  @scala.inline
  implicit class MockJaxSettingsOps[Self <: MockJaxSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setHeaders(value: MockJaxSettingsHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setIsTimeout(value: Boolean): Self = this.set("isTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTimeout: Self = this.set("isTimeout", js.undefined)
    @scala.inline
    def setLastModified(value: String): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModified: Self = this.set("lastModified", js.undefined)
    @scala.inline
    def setLogLevelMethodsVarargs(value: String*): Self = this.set("logLevelMethods", js.Array(value :_*))
    @scala.inline
    def setLogLevelMethods(value: js.Array[String]): Self = this.set("logLevelMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogLevelMethods: Self = this.set("logLevelMethods", js.undefined)
    @scala.inline
    def setLogger(value: MockJaxStandardLogger | MockJaxCustomLogger): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setLogging(value: Boolean): Self = this.set("logging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setOnAfterComplete(value: js.Function): Self = this.set("onAfterComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAfterComplete: Self = this.set("onAfterComplete", js.undefined)
    @scala.inline
    def setOnAfterError(value: js.Function): Self = this.set("onAfterError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAfterError: Self = this.set("onAfterError", js.undefined)
    @scala.inline
    def setOnAfterSuccess(value: js.Function): Self = this.set("onAfterSuccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAfterSuccess: Self = this.set("onAfterSuccess", js.undefined)
    @scala.inline
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    @scala.inline
    def setProxyType(value: String): Self = this.set("proxyType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyType: Self = this.set("proxyType", js.undefined)
    @scala.inline
    def setResponse(value: (/* settings */ js.Any, /* done */ js.UndefOr[js.Function]) => Unit): Self = this.set("response", js.Any.fromFunction2(value))
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    @scala.inline
    def setResponseText(value: String | js.Object): Self = this.set("responseText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseText: Self = this.set("responseText", js.undefined)
    @scala.inline
    def setResponseTime(value: Double): Self = this.set("responseTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseTime: Self = this.set("responseTime", js.undefined)
    @scala.inline
    def setResponseXml(value: String): Self = this.set("responseXml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseXml: Self = this.set("responseXml", js.undefined)
    @scala.inline
    def setRetainAjaxCalls(value: Boolean): Self = this.set("retainAjaxCalls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetainAjaxCalls: Self = this.set("retainAjaxCalls", js.undefined)
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusText: Self = this.set("statusText", js.undefined)
    @scala.inline
    def setThrowUnmocked(value: Boolean): Self = this.set("throwUnmocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrowUnmocked: Self = this.set("throwUnmocked", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUrl(value: String | RegExp): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setUrlParamsVarargs(value: String*): Self = this.set("urlParams", js.Array(value :_*))
    @scala.inline
    def setUrlParams(value: js.Array[String]): Self = this.set("urlParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlParams: Self = this.set("urlParams", js.undefined)
  }
  
}

