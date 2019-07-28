package typings.intercomDashClient.leadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeadIdentifier extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var user_id: js.UndefOr[String] = js.undefined
}

object LeadIdentifier {
  @scala.inline
  def apply(id: String = null, user_id: String = null): LeadIdentifier = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (user_id != null) __obj.updateDynamic("user_id")(user_id)
    __obj.asInstanceOf[LeadIdentifier]
  }
}

