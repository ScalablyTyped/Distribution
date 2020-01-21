package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the Google Tag Manager Account access permissions.
  */
@js.native
trait SchemaAccountAccess extends js.Object {
  /**
    * List of Account permissions. Valid account permissions are read and
    * manage.
    */
  var permission: js.UndefOr[js.Array[String]] = js.native
}

object SchemaAccountAccess {
  @scala.inline
  def apply(permission: js.Array[String] = null): SchemaAccountAccess = {
    val __obj = js.Dynamic.literal()
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccountAccess]
  }
}

