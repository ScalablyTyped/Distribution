package typings.gridfsStream.mod.GridFSStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Range extends js.Object {
  var endPos: Double = js.native
  var startPos: Double = js.native
}

object Range {
  @scala.inline
  def apply(endPos: Double, startPos: Double): Range = {
    val __obj = js.Dynamic.literal(endPos = endPos.asInstanceOf[js.Any], startPos = startPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  @scala.inline
  implicit class RangeOps[Self <: Range] (val x: Self) extends AnyVal {
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
    def setEndPos(value: Double): Self = this.set("endPos", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartPos(value: Double): Self = this.set("startPos", value.asInstanceOf[js.Any])
  }
  
}

