package typings.materialMenuSurface.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ANCHOR extends js.Object {
  var ANCHOR: String = js.native
  var ANIMATING_CLOSED: String = js.native
  var ANIMATING_OPEN: String = js.native
  var FIXED: String = js.native
  var IS_OPEN_BELOW: String = js.native
  var OPEN: String = js.native
  var ROOT: String = js.native
}

object ANCHOR {
  @scala.inline
  def apply(
    ANCHOR: String,
    ANIMATING_CLOSED: String,
    ANIMATING_OPEN: String,
    FIXED: String,
    IS_OPEN_BELOW: String,
    OPEN: String,
    ROOT: String
  ): ANCHOR = {
    val __obj = js.Dynamic.literal(ANCHOR = ANCHOR.asInstanceOf[js.Any], ANIMATING_CLOSED = ANIMATING_CLOSED.asInstanceOf[js.Any], ANIMATING_OPEN = ANIMATING_OPEN.asInstanceOf[js.Any], FIXED = FIXED.asInstanceOf[js.Any], IS_OPEN_BELOW = IS_OPEN_BELOW.asInstanceOf[js.Any], OPEN = OPEN.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
    __obj.asInstanceOf[ANCHOR]
  }
  @scala.inline
  implicit class ANCHOROps[Self <: ANCHOR] (val x: Self) extends AnyVal {
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
    def setANCHOR(value: String): Self = this.set("ANCHOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setANIMATING_CLOSED(value: String): Self = this.set("ANIMATING_CLOSED", value.asInstanceOf[js.Any])
    @scala.inline
    def setANIMATING_OPEN(value: String): Self = this.set("ANIMATING_OPEN", value.asInstanceOf[js.Any])
    @scala.inline
    def setFIXED(value: String): Self = this.set("FIXED", value.asInstanceOf[js.Any])
    @scala.inline
    def setIS_OPEN_BELOW(value: String): Self = this.set("IS_OPEN_BELOW", value.asInstanceOf[js.Any])
    @scala.inline
    def setOPEN(value: String): Self = this.set("OPEN", value.asInstanceOf[js.Any])
    @scala.inline
    def setROOT(value: String): Self = this.set("ROOT", value.asInstanceOf[js.Any])
  }
  
}

