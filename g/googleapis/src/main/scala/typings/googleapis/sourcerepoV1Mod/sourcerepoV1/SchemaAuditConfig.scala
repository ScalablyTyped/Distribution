package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

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
  def apply(auditLogConfigs: js.Array[SchemaAuditLogConfig] = null, service: String = null): SchemaAuditConfig = {
    val __obj = js.Dynamic.literal()
    if (auditLogConfigs != null) __obj.updateDynamic("auditLogConfigs")(auditLogConfigs.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAuditConfig]
  }
}

