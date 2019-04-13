package typings
package mailgunDashJsLib.mailgunDashJsMod.listsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberCreateData extends js.Object {
  var address: java.lang.String
  var name: java.lang.String
  var subscribed: scala.Boolean
  var vars: js.UndefOr[js.Object] = js.undefined
}

object MemberCreateData {
  @scala.inline
  def apply(
    address: java.lang.String,
    name: java.lang.String,
    subscribed: scala.Boolean,
    vars: js.Object = null
  ): MemberCreateData = {
    val __obj = js.Dynamic.literal(address = address, name = name, subscribed = subscribed)
    if (vars != null) __obj.updateDynamic("vars")(vars)
    __obj.asInstanceOf[MemberCreateData]
  }
}

