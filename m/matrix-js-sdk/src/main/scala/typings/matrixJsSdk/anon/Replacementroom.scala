package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Replacementroom extends js.Object {
  var replacement_room: js.Object = js.native
}

object Replacementroom {
  @scala.inline
  def apply(replacement_room: js.Object): Replacementroom = {
    val __obj = js.Dynamic.literal(replacement_room = replacement_room.asInstanceOf[js.Any])
    __obj.asInstanceOf[Replacementroom]
  }
  @scala.inline
  implicit class ReplacementroomOps[Self <: Replacementroom] (val x: Self) extends AnyVal {
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
    def setReplacement_room(value: js.Object): Self = this.set("replacement_room", value.asInstanceOf[js.Any])
  }
  
}

