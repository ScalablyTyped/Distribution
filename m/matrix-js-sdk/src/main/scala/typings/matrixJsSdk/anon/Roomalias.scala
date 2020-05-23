package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Roomalias extends js.Object {
  var room_alias: js.UndefOr[String] = js.undefined
  var room_id: String
}

object Roomalias {
  @scala.inline
  def apply(room_id: String, room_alias: String = null): Roomalias = {
    val __obj = js.Dynamic.literal(room_id = room_id.asInstanceOf[js.Any])
    if (room_alias != null) __obj.updateDynamic("room_alias")(room_alias.asInstanceOf[js.Any])
    __obj.asInstanceOf[Roomalias]
  }
}

