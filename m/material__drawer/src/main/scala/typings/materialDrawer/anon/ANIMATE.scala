package typings.materialDrawer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ANIMATE extends js.Object {
  var ANIMATE: String = js.native
  var CLOSING: String = js.native
  var DISMISSIBLE: String = js.native
  var MODAL: String = js.native
  var OPEN: String = js.native
  var OPENING: String = js.native
  var ROOT: String = js.native
}

object ANIMATE {
  @scala.inline
  def apply(
    ANIMATE: String,
    CLOSING: String,
    DISMISSIBLE: String,
    MODAL: String,
    OPEN: String,
    OPENING: String,
    ROOT: String
  ): ANIMATE = {
    val __obj = js.Dynamic.literal(ANIMATE = ANIMATE.asInstanceOf[js.Any], CLOSING = CLOSING.asInstanceOf[js.Any], DISMISSIBLE = DISMISSIBLE.asInstanceOf[js.Any], MODAL = MODAL.asInstanceOf[js.Any], OPEN = OPEN.asInstanceOf[js.Any], OPENING = OPENING.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
    __obj.asInstanceOf[ANIMATE]
  }
  @scala.inline
  implicit class ANIMATEOps[Self <: ANIMATE] (val x: Self) extends AnyVal {
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
    def setANIMATE(value: String): Self = this.set("ANIMATE", value.asInstanceOf[js.Any])
    @scala.inline
    def setCLOSING(value: String): Self = this.set("CLOSING", value.asInstanceOf[js.Any])
    @scala.inline
    def setDISMISSIBLE(value: String): Self = this.set("DISMISSIBLE", value.asInstanceOf[js.Any])
    @scala.inline
    def setMODAL(value: String): Self = this.set("MODAL", value.asInstanceOf[js.Any])
    @scala.inline
    def setOPEN(value: String): Self = this.set("OPEN", value.asInstanceOf[js.Any])
    @scala.inline
    def setOPENING(value: String): Self = this.set("OPENING", value.asInstanceOf[js.Any])
    @scala.inline
    def setROOT(value: String): Self = this.set("ROOT", value.asInstanceOf[js.Any])
  }
  
}

