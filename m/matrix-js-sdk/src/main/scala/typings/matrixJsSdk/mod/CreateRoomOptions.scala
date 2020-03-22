package typings.matrixJsSdk.mod

import typings.matrixJsSdk.matrixJsSdkStrings.`private`
import typings.matrixJsSdk.matrixJsSdkStrings.public
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRoomOptions extends js.Object {
  var invite: js.UndefOr[js.Array[String]] = js.undefined
    //  <string> A list of user IDs to invite to this room.
  var name: js.UndefOr[String] = js.undefined
           //  The name to give this room.
  var room_alias_name: js.UndefOr[String] = js.undefined
           //  The alias localpart to assign to this room.
  var topic: js.UndefOr[String] = js.undefined
           //  The topic to give this room.
  var visibility: js.UndefOr[public | `private`] = js.undefined
}

object CreateRoomOptions {
  @scala.inline
  def apply(
    invite: js.Array[String] = null,
    name: String = null,
    room_alias_name: String = null,
    topic: String = null,
    visibility: public | `private` = null
  ): CreateRoomOptions = {
    val __obj = js.Dynamic.literal()
    if (invite != null) __obj.updateDynamic("invite")(invite.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (room_alias_name != null) __obj.updateDynamic("room_alias_name")(room_alias_name.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRoomOptions]
  }
}

