package typings.mailgunJs.mod

import typings.mailgunJs.anon.Interval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstructorParams extends StObject {
  
  var apiKey: String
  
  var domain: String
  
  var endpoint: js.UndefOr[String] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var mute: js.UndefOr[Boolean] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  var protocol: js.UndefOr[String] = js.undefined
  
  var proxy: js.UndefOr[String] = js.undefined
  
  var publicApiKey: js.UndefOr[String] = js.undefined
  
  var retry: js.UndefOr[Double | Interval] = js.undefined
  
  var testMode: js.UndefOr[Boolean] = js.undefined
  
  var testModeLogger: js.UndefOr[
    js.Function3[
      /* httpOptions */ LoggerHttpOptions, 
      /* payload */ String, 
      /* form */ typings.formData.mod.^, 
      Unit
    ]
  ] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object ConstructorParams {
  
  @scala.inline
  def apply(apiKey: String, domain: String): ConstructorParams = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorParams]
  }
  
  @scala.inline
  implicit class ConstructorParamsMutableBuilder[Self <: ConstructorParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setMute(value: Boolean): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    @scala.inline
    def setPublicApiKey(value: String): Self = StObject.set(x, "publicApiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicApiKeyUndefined: Self = StObject.set(x, "publicApiKey", js.undefined)
    
    @scala.inline
    def setRetry(value: Double | Interval): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    @scala.inline
    def setTestMode(value: Boolean): Self = StObject.set(x, "testMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestModeLogger(
      value: (/* httpOptions */ LoggerHttpOptions, /* payload */ String, /* form */ typings.formData.mod.^) => Unit
    ): Self = StObject.set(x, "testModeLogger", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTestModeLoggerUndefined: Self = StObject.set(x, "testModeLogger", js.undefined)
    
    @scala.inline
    def setTestModeUndefined: Self = StObject.set(x, "testMode", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
