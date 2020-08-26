package typings.matrixAppserviceBridge.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Roomalias extends js.Object {
  var room_alias: js.UndefOr[String] = js.native
  var room_id: String = js.native
}

object Roomalias {
  @scala.inline
  def apply(room_id: String): Roomalias = {
    val __obj = js.Dynamic.literal(room_id = room_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Roomalias]
  }
  @scala.inline
  implicit class RoomaliasOps[Self <: Roomalias] (val x: Self) extends AnyVal {
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
    def setRoom_id(value: String): Self = this.set("room_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoom_alias(value: String): Self = this.set("room_alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoom_alias: Self = this.set("room_alias", js.undefined)
  }
  
}

