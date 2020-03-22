package typings.matrixAppserviceBridge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var room_alias_name: String
  var topic: js.UndefOr[String] = js.undefined
}

object AnonName {
  @scala.inline
  def apply(room_alias_name: String, name: String = null, topic: String = null): AnonName = {
    val __obj = js.Dynamic.literal(room_alias_name = room_alias_name.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

