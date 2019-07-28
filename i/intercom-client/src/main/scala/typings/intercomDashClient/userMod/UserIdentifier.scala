package typings.intercomDashClient.userMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserIdentifier extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var user_id: js.UndefOr[String] = js.undefined
}

object UserIdentifier {
  @scala.inline
  def apply(email: String = null, id: String = null, user_id: String = null): UserIdentifier = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (id != null) __obj.updateDynamic("id")(id)
    if (user_id != null) __obj.updateDynamic("user_id")(user_id)
    __obj.asInstanceOf[UserIdentifier]
  }
}

