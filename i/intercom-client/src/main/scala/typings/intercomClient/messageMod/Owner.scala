package typings.intercomClient.messageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Owner extends js.Object {
  var avatar: Avatar = js.native
  var away_mode_enabled: Boolean = js.native
  var away_mode_reassign: Boolean = js.native
  var email: String = js.native
  var id: String = js.native
  var name: String = js.native
  var `type`: String = js.native
}

object Owner {
  @scala.inline
  def apply(
    avatar: Avatar,
    away_mode_enabled: Boolean,
    away_mode_reassign: Boolean,
    email: String,
    id: String,
    name: String,
    `type`: String
  ): Owner = {
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], away_mode_enabled = away_mode_enabled.asInstanceOf[js.Any], away_mode_reassign = away_mode_reassign.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Owner]
  }
  @scala.inline
  implicit class OwnerOps[Self <: Owner] (val x: Self) extends AnyVal {
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
    def setAvatar(value: Avatar): Self = this.set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def setAway_mode_enabled(value: Boolean): Self = this.set("away_mode_enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setAway_mode_reassign(value: Boolean): Self = this.set("away_mode_reassign", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

