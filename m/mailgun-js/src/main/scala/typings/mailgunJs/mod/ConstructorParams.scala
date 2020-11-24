package typings.mailgunJs.mod

import typings.mailgunJs.anon.Interval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstructorParams extends js.Object {
  
  var apiKey: String = js.native
  
  var domain: String = js.native
  
  var endpoint: js.UndefOr[String] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var mute: js.UndefOr[Boolean] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var protocol: js.UndefOr[String] = js.native
  
  var proxy: js.UndefOr[String] = js.native
  
  var publicApiKey: js.UndefOr[String] = js.native
  
  var retry: js.UndefOr[Double | Interval] = js.native
  
  var testMode: js.UndefOr[Boolean] = js.native
  
  var testModeLogger: js.UndefOr[
    js.Function3[
      /* httpOptions */ LoggerHttpOptions, 
      /* payload */ String, 
      /* form */ typings.formData.mod.^, 
      Unit
    ]
  ] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object ConstructorParams {
  
  @scala.inline
  def apply(apiKey: String, domain: String): ConstructorParams = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorParams]
  }
  
  @scala.inline
  implicit class ConstructorParamsOps[Self <: ConstructorParams] (val x: Self) extends AnyVal {
    
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
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setMute(value: Boolean): Self = this.set("mute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMute: Self = this.set("mute", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setPublicApiKey(value: String): Self = this.set("publicApiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicApiKey: Self = this.set("publicApiKey", js.undefined)
    
    @scala.inline
    def setRetry(value: Double | Interval): Self = this.set("retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
    
    @scala.inline
    def setTestMode(value: Boolean): Self = this.set("testMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestMode: Self = this.set("testMode", js.undefined)
    
    @scala.inline
    def setTestModeLogger(
      value: (/* httpOptions */ LoggerHttpOptions, /* payload */ String, /* form */ typings.formData.mod.^) => Unit
    ): Self = this.set("testModeLogger", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTestModeLogger: Self = this.set("testModeLogger", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
