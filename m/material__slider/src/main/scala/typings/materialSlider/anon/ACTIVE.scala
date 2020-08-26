package typings.materialSlider.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ACTIVE extends js.Object {
  var ACTIVE: String = js.native
  var DISABLED: String = js.native
  var DISABLE_TOUCH_ACTION: String = js.native
  var DISCRETE: String = js.native
  var FOCUS: String = js.native
  var HAS_TRACK_MARKER: String = js.native
  var IN_TRANSIT: String = js.native
  var IS_DISCRETE: String = js.native
}

object ACTIVE {
  @scala.inline
  def apply(
    ACTIVE: String,
    DISABLED: String,
    DISABLE_TOUCH_ACTION: String,
    DISCRETE: String,
    FOCUS: String,
    HAS_TRACK_MARKER: String,
    IN_TRANSIT: String,
    IS_DISCRETE: String
  ): ACTIVE = {
    val __obj = js.Dynamic.literal(ACTIVE = ACTIVE.asInstanceOf[js.Any], DISABLED = DISABLED.asInstanceOf[js.Any], DISABLE_TOUCH_ACTION = DISABLE_TOUCH_ACTION.asInstanceOf[js.Any], DISCRETE = DISCRETE.asInstanceOf[js.Any], FOCUS = FOCUS.asInstanceOf[js.Any], HAS_TRACK_MARKER = HAS_TRACK_MARKER.asInstanceOf[js.Any], IN_TRANSIT = IN_TRANSIT.asInstanceOf[js.Any], IS_DISCRETE = IS_DISCRETE.asInstanceOf[js.Any])
    __obj.asInstanceOf[ACTIVE]
  }
  @scala.inline
  implicit class ACTIVEOps[Self <: ACTIVE] (val x: Self) extends AnyVal {
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
    def setACTIVE(value: String): Self = this.set("ACTIVE", value.asInstanceOf[js.Any])
    @scala.inline
    def setDISABLED(value: String): Self = this.set("DISABLED", value.asInstanceOf[js.Any])
    @scala.inline
    def setDISABLE_TOUCH_ACTION(value: String): Self = this.set("DISABLE_TOUCH_ACTION", value.asInstanceOf[js.Any])
    @scala.inline
    def setDISCRETE(value: String): Self = this.set("DISCRETE", value.asInstanceOf[js.Any])
    @scala.inline
    def setFOCUS(value: String): Self = this.set("FOCUS", value.asInstanceOf[js.Any])
    @scala.inline
    def setHAS_TRACK_MARKER(value: String): Self = this.set("HAS_TRACK_MARKER", value.asInstanceOf[js.Any])
    @scala.inline
    def setIN_TRANSIT(value: String): Self = this.set("IN_TRANSIT", value.asInstanceOf[js.Any])
    @scala.inline
    def setIS_DISCRETE(value: String): Self = this.set("IS_DISCRETE", value.asInstanceOf[js.Any])
  }
  
}

