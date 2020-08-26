package typings.markdownIt.stateInlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scanned extends js.Object {
  var can_close: Boolean = js.native
  var can_open: Boolean = js.native
  var length: Double = js.native
}

object Scanned {
  @scala.inline
  def apply(can_close: Boolean, can_open: Boolean, length: Double): Scanned = {
    val __obj = js.Dynamic.literal(can_close = can_close.asInstanceOf[js.Any], can_open = can_open.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scanned]
  }
  @scala.inline
  implicit class ScannedOps[Self <: Scanned] (val x: Self) extends AnyVal {
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
    def setCan_close(value: Boolean): Self = this.set("can_close", value.asInstanceOf[js.Any])
    @scala.inline
    def setCan_open(value: Boolean): Self = this.set("can_open", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
  }
  
}

