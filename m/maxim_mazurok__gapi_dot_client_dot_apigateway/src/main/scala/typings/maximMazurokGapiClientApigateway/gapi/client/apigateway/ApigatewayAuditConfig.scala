package typings.maximMazurokGapiClientApigateway.gapi.client.apigateway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApigatewayAuditConfig extends js.Object {
  
  /** The configuration for logging of each type of permission. */
  var auditLogConfigs: js.UndefOr[js.Array[ApigatewayAuditLogConfig]] = js.native
  
  /**
    * Specifies a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all
    * services.
    */
  var service: js.UndefOr[String] = js.native
}
object ApigatewayAuditConfig {
  
  @scala.inline
  def apply(): ApigatewayAuditConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApigatewayAuditConfig]
  }
  
  @scala.inline
  implicit class ApigatewayAuditConfigOps[Self <: ApigatewayAuditConfig] (val x: Self) extends AnyVal {
    
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
    def setAuditLogConfigsVarargs(value: ApigatewayAuditLogConfig*): Self = this.set("auditLogConfigs", js.Array(value :_*))
    
    @scala.inline
    def setAuditLogConfigs(value: js.Array[ApigatewayAuditLogConfig]): Self = this.set("auditLogConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuditLogConfigs: Self = this.set("auditLogConfigs", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
}
