package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditConfig extends StObject {
  
  /** The configuration for logging of each type of permission. */
  var auditLogConfigs: js.UndefOr[js.Array[AuditLogConfig]] = js.undefined
  
  var exemptedMembers: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Specifies a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all
    * services.
    */
  var service: js.UndefOr[String] = js.undefined
}
object AuditConfig {
  
  @scala.inline
  def apply(): AuditConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditConfig]
  }
  
  @scala.inline
  implicit class AuditConfigMutableBuilder[Self <: AuditConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuditLogConfigs(value: js.Array[AuditLogConfig]): Self = StObject.set(x, "auditLogConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuditLogConfigsUndefined: Self = StObject.set(x, "auditLogConfigs", js.undefined)
    
    @scala.inline
    def setAuditLogConfigsVarargs(value: AuditLogConfig*): Self = StObject.set(x, "auditLogConfigs", js.Array(value :_*))
    
    @scala.inline
    def setExemptedMembers(value: js.Array[String]): Self = StObject.set(x, "exemptedMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExemptedMembersUndefined: Self = StObject.set(x, "exemptedMembers", js.undefined)
    
    @scala.inline
    def setExemptedMembersVarargs(value: String*): Self = StObject.set(x, "exemptedMembers", js.Array(value :_*))
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
