package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.`private`
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.public
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.trusted_private_chat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRoomOptions extends js.Object {
      // Either 'public' or 'private'.
  var invite: js.Array[String]
  var is_direct: js.UndefOr[Boolean] = js.undefined
                  // A list of user IDs to invite to this room.
  var name: js.UndefOr[String] = js.undefined
  var preset: js.UndefOr[trusted_private_chat] = js.undefined
  var room_alias_name: js.UndefOr[String] = js.undefined
                    // The name to give this room.
  var topic: js.UndefOr[String] = js.undefined
                    // The alias localpart to assign to this room.
  var visibility: public | `private`
}

object CreateRoomOptions {
  @scala.inline
  def apply(
    invite: js.Array[String],
    visibility: public | `private`,
    is_direct: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    preset: trusted_private_chat = null,
    room_alias_name: String = null,
    topic: String = null
  ): CreateRoomOptions = {
    val __obj = js.Dynamic.literal(invite = invite.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    if (!js.isUndefined(is_direct)) __obj.updateDynamic("is_direct")(is_direct.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (preset != null) __obj.updateDynamic("preset")(preset.asInstanceOf[js.Any])
    if (room_alias_name != null) __obj.updateDynamic("room_alias_name")(room_alias_name.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRoomOptions]
  }
}

