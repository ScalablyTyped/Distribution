package typings.materialMenu.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FOCUSROOTINDEX extends js.Object {
  var FOCUS_ROOT_INDEX: Double = js.native
}

object FOCUSROOTINDEX {
  @scala.inline
  def apply(FOCUS_ROOT_INDEX: Double): FOCUSROOTINDEX = {
    val __obj = js.Dynamic.literal(FOCUS_ROOT_INDEX = FOCUS_ROOT_INDEX.asInstanceOf[js.Any])
    __obj.asInstanceOf[FOCUSROOTINDEX]
  }
  @scala.inline
  implicit class FOCUSROOTINDEXOps[Self <: FOCUSROOTINDEX] (val x: Self) extends AnyVal {
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
    def setFOCUS_ROOT_INDEX(value: Double): Self = this.set("FOCUS_ROOT_INDEX", value.asInstanceOf[js.Any])
  }
  
}

