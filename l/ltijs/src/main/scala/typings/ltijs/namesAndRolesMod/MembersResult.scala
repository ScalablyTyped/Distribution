package typings.ltijs.namesAndRolesMod

import typings.ltijs.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MembersResult extends js.Object {
  var context: Id
  var id: String
  var members: js.Array[Member]
  var next: js.UndefOr[String] = js.undefined
}

object MembersResult {
  @scala.inline
  def apply(context: Id, id: String, members: js.Array[Member], next: String = null): MembersResult = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    __obj.asInstanceOf[MembersResult]
  }
}

