package typings.inputmask.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertPosition extends js.Object {
  /**
    * Character to insert.
    */
  var c: String = js.native
  /**
    * Position to insert.
    */
  var pos: Double = js.native
}

object InsertPosition {
  @scala.inline
  def apply(c: String, pos: Double): InsertPosition = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertPosition]
  }
  @scala.inline
  implicit class InsertPositionOps[Self <: InsertPosition] (val x: Self) extends AnyVal {
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
    def setC(value: String): Self = this.set("c", value.asInstanceOf[js.Any])
    @scala.inline
    def setPos(value: Double): Self = this.set("pos", value.asInstanceOf[js.Any])
  }
  
}

