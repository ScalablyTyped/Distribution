package typings
package mailgunDashJsLib.mailgunDashJsMod.listsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberUpdateData extends js.Object {
  var name: java.lang.String
  var subscribed: scala.Boolean
  var vars: js.UndefOr[js.Object] = js.undefined
}

object MemberUpdateData {
  @scala.inline
  def apply(name: java.lang.String, subscribed: scala.Boolean, vars: js.Object = null): MemberUpdateData = {
    val __obj = js.Dynamic.literal(name = name, subscribed = subscribed)
    if (vars != null) __obj.updateDynamic("vars")(vars)
    __obj.asInstanceOf[MemberUpdateData]
  }
}

