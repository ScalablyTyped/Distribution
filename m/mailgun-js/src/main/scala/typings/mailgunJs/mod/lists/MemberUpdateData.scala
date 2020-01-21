package typings.mailgunJs.mod.lists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberUpdateData extends js.Object {
  var name: String
  var subscribed: Boolean
  var vars: js.UndefOr[js.Object] = js.undefined
}

object MemberUpdateData {
  @scala.inline
  def apply(name: String, subscribed: Boolean, vars: js.Object = null): MemberUpdateData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any])
    if (vars != null) __obj.updateDynamic("vars")(vars.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberUpdateData]
  }
}

