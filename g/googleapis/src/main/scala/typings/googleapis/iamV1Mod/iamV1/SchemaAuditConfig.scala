package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the audit configuration for a service. The configuration
  * determines which permission types are logged, and what identities, if any,
  * are exempted from logging. An AuditConfig must have one or more
  * AuditLogConfigs.  If there are AuditConfigs for both `allServices` and a
  * specific service, the union of the two AuditConfigs is used for that
  * service: the log_types specified in each AuditConfig are enabled, and the
  * exempted_members in each AuditLogConfig are exempted.  Example Policy with
  * multiple AuditConfigs:      {       &quot;audit_configs&quot;: [         {
  * &quot;service&quot;: &quot;allServices&quot; &quot;audit_log_configs&quot;:
  * [             {               &quot;log_type&quot;: &quot;DATA_READ&quot;,
  * &quot;exempted_members&quot;: [ &quot;user:foo@gmail.com&quot; ] }, {
  * &quot;log_type&quot;: &quot;DATA_WRITE&quot;,             },             {
  * &quot;log_type&quot;: &quot;ADMIN_READ&quot;,             }           ] },
  * {           &quot;service&quot;: &quot;fooservice.googleapis.com&quot;
  * &quot;audit_log_configs&quot;: [             { &quot;log_type&quot;:
  * &quot;DATA_READ&quot;,             },             { &quot;log_type&quot;:
  * &quot;DATA_WRITE&quot;,               &quot;exempted_members&quot;: [
  * &quot;user:bar@gmail.com&quot;               ]             }           ] }
  * ]     }  For fooservice, this policy enables DATA_READ, DATA_WRITE and
  * ADMIN_READ logging. It also exempts foo@gmail.com from DATA_READ logging,
  * and bar@gmail.com from DATA_WRITE logging.
  */
@js.native
trait SchemaAuditConfig extends js.Object {
  /**
    * The configuration for logging of each type of permission.
    */
  var auditLogConfigs: js.UndefOr[js.Array[SchemaAuditLogConfig]] = js.native
  /**
    * Specifies a service that will be enabled for audit logging. For example,
    * `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a
    * special value that covers all services.
    */
  var service: js.UndefOr[String] = js.native
}

object SchemaAuditConfig {
  @scala.inline
  def apply(): SchemaAuditConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuditConfig]
  }
  @scala.inline
  implicit class SchemaAuditConfigOps[Self <: SchemaAuditConfig] (val x: Self) extends AnyVal {
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
    def setAuditLogConfigsVarargs(value: SchemaAuditLogConfig*): Self = this.set("auditLogConfigs", js.Array(value :_*))
    @scala.inline
    def setAuditLogConfigs(value: js.Array[SchemaAuditLogConfig]): Self = this.set("auditLogConfigs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuditLogConfigs: Self = this.set("auditLogConfigs", js.undefined)
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
  
}

