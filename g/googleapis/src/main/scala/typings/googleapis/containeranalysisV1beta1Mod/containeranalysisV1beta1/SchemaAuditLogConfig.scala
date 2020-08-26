package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the configuration for logging a type of permissions. Example: {
  * &quot;audit_log_configs&quot;: [         {           &quot;log_type&quot;:
  * &quot;DATA_READ&quot;,           &quot;exempted_members&quot;: [
  * &quot;user:foo@gmail.com&quot;           ]         },         {
  * &quot;log_type&quot;: &quot;DATA_WRITE&quot;,         }       ]     }  This
  * enables &#39;DATA_READ&#39; and &#39;DATA_WRITE&#39; logging, while
  * exempting foo@gmail.com from DATA_READ logging.
  */
@js.native
trait SchemaAuditLogConfig extends js.Object {
  /**
    * Specifies the identities that do not cause logging for this type of
    * permission. Follows the same format of Binding.members.
    */
  var exemptedMembers: js.UndefOr[js.Array[String]] = js.native
  /**
    * The log type that this config enables.
    */
  var logType: js.UndefOr[String] = js.native
}

object SchemaAuditLogConfig {
  @scala.inline
  def apply(): SchemaAuditLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuditLogConfig]
  }
  @scala.inline
  implicit class SchemaAuditLogConfigOps[Self <: SchemaAuditLogConfig] (val x: Self) extends AnyVal {
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

