package typings.matrixJsSdk.mod

import typings.matrixJsSdk.matrixJsSdkStrings.`private`
import typings.matrixJsSdk.matrixJsSdkStrings.public
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRoomOptions extends js.Object {
  var invite: js.UndefOr[js.Array[String]] = js.native
    //  <string> A list of user IDs to invite to this room.
  var name: js.UndefOr[String] = js.native
           //  The name to give this room.
  var room_alias_name: js.UndefOr[String] = js.native
           //  The alias localpart to assign to this room.
  var topic: js.UndefOr[String] = js.native
           //  The topic to give this room.
  var visibility: js.UndefOr[public | `private`] = js.native
}

object CreateRoomOptions {
  @scala.inline
  def apply(): CreateRoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRoomOptions]
  }
  @scala.inline
  implicit class CreateRoomOptionsOps[Self <: CreateRoomOptions] (val x: Self) extends AnyVal {
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
    def setInviteVarargs(value: String*): Self = this.set("invite", js.Array(value :_*))
    @scala.inline
    def setInvite(value: js.Array[String]): Self = this.set("invite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvite: Self = this.set("invite", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRoom_alias_name(value: String): Self = this.set("room_alias_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoom_alias_name: Self = this.set("room_alias_name", js.undefined)
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopic: Self = this.set("topic", js.undefined)
    @scala.inline
    def setVisibility(value: public | `private`): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
  
}

