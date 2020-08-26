package typings.mailgunJs.mod.lists

import typings.mailgunJs.anon.Address
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberAddMultipleData extends js.Object {
  var members: js.Array[Address] = js.native
  var upsert: js.UndefOr[Boolean] = js.native
}

object MemberAddMultipleData {
  @scala.inline
  def apply(members: js.Array[Address]): MemberAddMultipleData = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberAddMultipleData]
  }
  @scala.inline
  implicit class MemberAddMultipleDataOps[Self <: MemberAddMultipleData] (val x: Self) extends AnyVal {
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
    def setMembersVarargs(value: Address*): Self = this.set("members", js.Array(value :_*))
    @scala.inline
    def setMembers(value: js.Array[Address]): Self = this.set("members", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpsert(value: Boolean): Self = this.set("upsert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpsert: Self = this.set("upsert", js.undefined)
  }
  
}

