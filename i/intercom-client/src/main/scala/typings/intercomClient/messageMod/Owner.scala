package typings.intercomClient.messageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Owner extends js.Object {
  var avatar: Avatar
  var away_mode_enabled: Boolean
  var away_mode_reassign: Boolean
  var email: String
  var id: String
  var name: String
  var `type`: String
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
}

