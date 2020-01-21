package typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Authorization-related information used by Cloud Audit Logging.
  */
@js.native
trait SchemaAuthorizationLoggingOptions extends js.Object {
  /**
    * The type of the permission that was checked.
    */
  var permissionType: js.UndefOr[String] = js.native
}

object SchemaAuthorizationLoggingOptions {
  @scala.inline
  def apply(permissionType: String = null): SchemaAuthorizationLoggingOptions = {
    val __obj = js.Dynamic.literal()
    if (permissionType != null) __obj.updateDynamic("permissionType")(permissionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAuthorizationLoggingOptions]
  }
}

