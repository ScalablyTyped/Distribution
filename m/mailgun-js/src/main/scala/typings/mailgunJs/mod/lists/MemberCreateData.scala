package typings.mailgunJs.mod.lists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberCreateData extends js.Object {
  var address: String
  var name: String
  var subscribed: Boolean
  var vars: js.UndefOr[js.Object] = js.undefined
}

object MemberCreateData {
  @scala.inline
  def apply(address: String, name: String, subscribed: Boolean, vars: js.Object = null): MemberCreateData = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any])
    if (vars != null) __obj.updateDynamic("vars")(vars.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberCreateData]
  }
}

