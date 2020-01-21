package typings.googleapis.licensingV1Mod.licensingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Template for LicenseAssignment Insert request
  */
@js.native
trait SchemaLicenseAssignmentInsert extends js.Object {
  /**
    * Email id of the user
    */
  var userId: js.UndefOr[String] = js.native
}

object SchemaLicenseAssignmentInsert {
  @scala.inline
  def apply(userId: String = null): SchemaLicenseAssignmentInsert = {
    val __obj = js.Dynamic.literal()
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLicenseAssignmentInsert]
  }
}

