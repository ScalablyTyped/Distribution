package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON request template for setting/revoking admin status of a user in
  * Directory API.
  */
@js.native
trait SchemaUserMakeAdmin extends js.Object {
  /**
    * Boolean indicating new admin status of the user
    */
  var status: js.UndefOr[Boolean] = js.native
}

object SchemaUserMakeAdmin {
  @scala.inline
  def apply(status: js.UndefOr[Boolean] = js.undefined): SchemaUserMakeAdmin = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUserMakeAdmin]
  }
}

