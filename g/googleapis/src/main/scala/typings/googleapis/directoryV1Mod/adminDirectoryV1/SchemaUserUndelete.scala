package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON request template to undelete a user in Directory API.
  */
@js.native
trait SchemaUserUndelete extends js.Object {
  /**
    * OrgUnit of User
    */
  var orgUnitPath: js.UndefOr[String] = js.native
}

object SchemaUserUndelete {
  @scala.inline
  def apply(orgUnitPath: String = null): SchemaUserUndelete = {
    val __obj = js.Dynamic.literal()
    if (orgUnitPath != null) __obj.updateDynamic("orgUnitPath")(orgUnitPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUserUndelete]
  }
}

