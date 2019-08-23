package typings.intercomDashClient.visitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisitorIdentifier extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var user_id: js.UndefOr[String] = js.undefined
}

object VisitorIdentifier {
  @scala.inline
  def apply(id: String = null, user_id: String = null): VisitorIdentifier = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (user_id != null) __obj.updateDynamic("user_id")(user_id)
    __obj.asInstanceOf[VisitorIdentifier]
  }
}

