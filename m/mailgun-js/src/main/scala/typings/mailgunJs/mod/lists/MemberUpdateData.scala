package typings.mailgunJs.mod.lists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberUpdateData extends js.Object {
  var name: String = js.native
  var subscribed: Boolean = js.native
  var vars: js.UndefOr[js.Object] = js.native
}

object MemberUpdateData {
  @scala.inline
  def apply(name: String, subscribed: Boolean): MemberUpdateData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberUpdateData]
  }
  @scala.inline
  implicit class MemberUpdateDataOps[Self <: MemberUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscribed(value: Boolean): Self = this.set("subscribed", value.asInstanceOf[js.Any])
    @scala.inline
    def setVars(value: js.Object): Self = this.set("vars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVars: Self = this.set("vars", js.undefined)
  }
  
}

