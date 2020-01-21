package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the Google Tag Manager Account access permissions.
  */
@js.native
trait SchemaAccountAccess extends js.Object {
  /**
    * Whether the user has no access, user access, or admin access to an
    * account.
    */
  var permission: js.UndefOr[String] = js.native
}

object SchemaAccountAccess {
  @scala.inline
  def apply(permission: String = null): SchemaAccountAccess = {
    val __obj = js.Dynamic.literal()
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccountAccess]
  }
}

