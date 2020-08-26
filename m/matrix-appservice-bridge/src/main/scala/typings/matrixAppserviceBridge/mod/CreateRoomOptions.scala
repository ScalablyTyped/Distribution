package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.`private`
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.public
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.trusted_private_chat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRoomOptions extends js.Object {
      // Either 'public' or 'private'.
  var invite: js.Array[String] = js.native
  var is_direct: js.UndefOr[Boolean] = js.native
                  // A list of user IDs to invite to this room.
  var name: js.UndefOr[String] = js.native
  var preset: js.UndefOr[trusted_private_chat] = js.native
  var room_alias_name: js.UndefOr[String] = js.native
                    // The name to give this room.
  var topic: js.UndefOr[String] = js.native
                    // The alias localpart to assign to this room.
  var visibility: public | `private` = js.native
}

object CreateRoomOptions {
  @scala.inline
  def apply(invite: js.Array[String], visibility: public | `private`): CreateRoomOptions = {
    val __obj = js.Dynamic.literal(invite = invite.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
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
    def setVisibility(value: public | `private`): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_direct(value: Boolean): Self = this.set("is_direct", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIs_direct: Self = this.set("is_direct", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPreset(value: trusted_private_chat): Self = this.set("preset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreset: Self = this.set("preset", js.undefined)
    @scala.inline
    def setRoom_alias_name(value: String): Self = this.set("room_alias_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoom_alias_name: Self = this.set("room_alias_name", js.undefined)
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopic: Self = this.set("topic", js.undefined)
  }
  
}

