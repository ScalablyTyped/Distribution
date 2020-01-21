package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information to identify a particular user uniquely.
  */
@js.native
trait SchemaUser extends js.Object {
  /**
    * Type of the user in the request. The field `userId` is associated with
    * this type.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Unique Id of the user for which the data is being requested.
    */
  var userId: js.UndefOr[String] = js.native
}

object SchemaUser {
  @scala.inline
  def apply(`type`: String = null, userId: String = null): SchemaUser = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUser]
  }
}

