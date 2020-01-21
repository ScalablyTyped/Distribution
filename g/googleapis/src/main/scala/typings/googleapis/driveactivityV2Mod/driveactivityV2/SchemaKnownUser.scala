package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A known user.
  */
@js.native
trait SchemaKnownUser extends js.Object {
  /**
    * True if this is the user making the request.
    */
  var isCurrentUser: js.UndefOr[Boolean] = js.native
  /**
    * The identifier for this user that can be used with the People API to get
    * more information. The format is &quot;people/ACCOUNT_ID&quot;. See
    * https://developers.google.com/people/.
    */
  var personName: js.UndefOr[String] = js.native
}

object SchemaKnownUser {
  @scala.inline
  def apply(isCurrentUser: js.UndefOr[Boolean] = js.undefined, personName: String = null): SchemaKnownUser = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isCurrentUser)) __obj.updateDynamic("isCurrentUser")(isCurrentUser.asInstanceOf[js.Any])
    if (personName != null) __obj.updateDynamic("personName")(personName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaKnownUser]
  }
}

