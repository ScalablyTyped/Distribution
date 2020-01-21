package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User&#39;s information.
  */
@js.native
trait SchemaUserInfo extends js.Object {
  /**
    * The displayed name of the user.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The email address of the user.
    */
  var email: js.UndefOr[String] = js.native
}

object SchemaUserInfo {
  @scala.inline
  def apply(displayName: String = null, email: String = null): SchemaUserInfo = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUserInfo]
  }
}

