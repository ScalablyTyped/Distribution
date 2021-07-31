package typings.jqueryMockjax

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MockJaxSettings extends StObject {
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var dataType: js.UndefOr[String] = js.undefined
  
  var etag: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[MockJaxSettingsHeaders] = js.undefined
  
  var isTimeout: js.UndefOr[Boolean] = js.undefined
  
  var lastModified: js.UndefOr[String] = js.undefined
  
  var logLevelMethods: js.UndefOr[js.Array[String]] = js.undefined
  
  var logger: js.UndefOr[MockJaxStandardLogger | MockJaxCustomLogger] = js.undefined
  
  var logging: js.UndefOr[Boolean | Double] = js.undefined
  
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
  def apply(): MockJaxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockJaxSettings]
  }
  
  @scala.inline
  implicit class MockJaxSettingsMutableBuilder[Self <: MockJaxSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setHeaders(value: MockJaxSettingsHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setIsTimeout(value: Boolean): Self = StObject.set(x, "isTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTimeoutUndefined: Self = StObject.set(x, "isTimeout", js.undefined)
    
    @scala.inline
    def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    @scala.inline
    def setLogLevelMethods(value: js.Array[String]): Self = StObject.set(x, "logLevelMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevelMethodsUndefined: Self = StObject.set(x, "logLevelMethods", js.undefined)
    
    @scala.inline
    def setLogLevelMethodsVarargs(value: String*): Self = StObject.set(x, "logLevelMethods", js.Array(value :_*))
    
    @scala.inline
    def setLogger(value: MockJaxStandardLogger | MockJaxCustomLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    @scala.inline
    def setLogging(value: Boolean | Double): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setOnAfterComplete(value: js.Function): Self = StObject.set(x, "onAfterComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAfterCompleteUndefined: Self = StObject.set(x, "onAfterComplete", js.undefined)
    
    @scala.inline
    def setOnAfterError(value: js.Function): Self = StObject.set(x, "onAfterError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAfterErrorUndefined: Self = StObject.set(x, "onAfterError", js.undefined)
    
    @scala.inline
    def setOnAfterSuccess(value: js.Function): Self = StObject.set(x, "onAfterSuccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAfterSuccessUndefined: Self = StObject.set(x, "onAfterSuccess", js.undefined)
    
    @scala.inline
    def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyType(value: String): Self = StObject.set(x, "proxyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyTypeUndefined: Self = StObject.set(x, "proxyType", js.undefined)
    
    @scala.inline
    def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    @scala.inline
    def setResponse(value: (/* settings */ js.Any, /* done */ js.UndefOr[js.Function]) => Unit): Self = StObject.set(x, "response", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResponseText(value: String | js.Object): Self = StObject.set(x, "responseText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTextUndefined: Self = StObject.set(x, "responseText", js.undefined)
    
    @scala.inline
    def setResponseTime(value: Double): Self = StObject.set(x, "responseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTimeUndefined: Self = StObject.set(x, "responseTime", js.undefined)
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    @scala.inline
    def setResponseXml(value: String): Self = StObject.set(x, "responseXml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseXmlUndefined: Self = StObject.set(x, "responseXml", js.undefined)
    
    @scala.inline
    def setRetainAjaxCalls(value: Boolean): Self = StObject.set(x, "retainAjaxCalls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetainAjaxCallsUndefined: Self = StObject.set(x, "retainAjaxCalls", js.undefined)
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setThrowUnmocked(value: Boolean): Self = StObject.set(x, "throwUnmocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowUnmockedUndefined: Self = StObject.set(x, "throwUnmocked", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrl(value: String | RegExp): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlParams(value: js.Array[String]): Self = StObject.set(x, "urlParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlParamsUndefined: Self = StObject.set(x, "urlParams", js.undefined)
    
    @scala.inline
    def setUrlParamsVarargs(value: String*): Self = StObject.set(x, "urlParams", js.Array(value :_*))
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
