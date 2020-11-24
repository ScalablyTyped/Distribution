package typings.jiraClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JiraApiOptions extends js.Object {
  
  var apiVersion: js.UndefOr[String] = js.native
  
  var base: js.UndefOr[String] = js.native
  
  var bearer: js.UndefOr[String] = js.native
  
  var greenhopperVersion: js.UndefOr[String] = js.native
  
  var host: String = js.native
  
  var intermediatePath: js.UndefOr[String] = js.native
  
  var oauth: js.UndefOr[OAuth] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var port: js.UndefOr[String] = js.native
  
  var protocol: js.UndefOr[String] = js.native
  
  var request: js.UndefOr[js.Any] = js.native
  
  var strictSSL: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var username: js.UndefOr[String] = js.native
  
  var webhookVersion: js.UndefOr[String] = js.native
}
object JiraApiOptions {
  
  @scala.inline
  def apply(host: String): JiraApiOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
    __obj.asInstanceOf[JiraApiOptions]
  }
  
  @scala.inline
  implicit class JiraApiOptionsOps[Self <: JiraApiOptions] (val x: Self) extends AnyVal {
    
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    
    @scala.inline
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    
    @scala.inline
    def setBearer(value: String): Self = this.set("bearer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBearer: Self = this.set("bearer", js.undefined)
    
    @scala.inline
    def setGreenhopperVersion(value: String): Self = this.set("greenhopperVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreenhopperVersion: Self = this.set("greenhopperVersion", js.undefined)
    
    @scala.inline
    def setIntermediatePath(value: String): Self = this.set("intermediatePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntermediatePath: Self = this.set("intermediatePath", js.undefined)
    
    @scala.inline
    def setOauth(value: OAuth): Self = this.set("oauth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth: Self = this.set("oauth", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setRequest(value: js.Any): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    
    @scala.inline
    def setStrictSSL(value: Boolean): Self = this.set("strictSSL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictSSL: Self = this.set("strictSSL", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
    
    @scala.inline
    def setWebhookVersion(value: String): Self = this.set("webhookVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebhookVersion: Self = this.set("webhookVersion", js.undefined)
  }
}
