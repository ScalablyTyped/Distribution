package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuditLogConfig extends js.Object {
  
  /** Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members. */
  var exemptedMembers: js.UndefOr[js.Array[String]] = js.native
  
  /** The log type that this config enables. */
  var logType: js.UndefOr[String] = js.native
}
object AuditLogConfig {
  
  @scala.inline
  def apply(): AuditLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditLogConfig]
  }
  
  @scala.inline
  implicit class AuditLogConfigOps[Self <: AuditLogConfig] (val x: Self) extends AnyVal {
    
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
    def setExemptedMembersVarargs(value: String*): Self = this.set("exemptedMembers", js.Array(value :_*))
    
    @scala.inline
    def setExemptedMembers(value: js.Array[String]): Self = this.set("exemptedMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExemptedMembers: Self = this.set("exemptedMembers", js.undefined)
    
    @scala.inline
    def setLogType(value: String): Self = this.set("logType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogType: Self = this.set("logType", js.undefined)
  }
}
