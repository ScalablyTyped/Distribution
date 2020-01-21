package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Write a Cloud Audit log
  */
@js.native
trait SchemaLogConfigCloudAuditOptions extends js.Object {
  /**
    * Information used by the Cloud Audit Logging pipeline.
    */
  var authorizationLoggingOptions: js.UndefOr[SchemaAuthorizationLoggingOptions] = js.native
  /**
    * The log_name to populate in the Cloud Audit Record.
    */
  var logName: js.UndefOr[String] = js.native
}

object SchemaLogConfigCloudAuditOptions {
  @scala.inline
  def apply(authorizationLoggingOptions: SchemaAuthorizationLoggingOptions = null, logName: String = null): SchemaLogConfigCloudAuditOptions = {
    val __obj = js.Dynamic.literal()
    if (authorizationLoggingOptions != null) __obj.updateDynamic("authorizationLoggingOptions")(authorizationLoggingOptions.asInstanceOf[js.Any])
    if (logName != null) __obj.updateDynamic("logName")(logName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLogConfigCloudAuditOptions]
  }
}

