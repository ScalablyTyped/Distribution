package typings.matrixAppserviceBridge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRoomalias extends js.Object {
  var room_alias: js.UndefOr[String] = js.undefined
  var room_id: String
}

object AnonRoomalias {
  @scala.inline
  def apply(room_id: String, room_alias: String = null): AnonRoomalias = {
    val __obj = js.Dynamic.literal(room_id = room_id.asInstanceOf[js.Any])
    if (room_alias != null) __obj.updateDynamic("room_alias")(room_alias.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRoomalias]
  }
}

