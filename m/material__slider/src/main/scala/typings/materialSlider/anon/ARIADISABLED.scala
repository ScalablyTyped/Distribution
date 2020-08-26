package typings.materialSlider.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ARIADISABLED extends js.Object {
  var ARIA_DISABLED: String = js.native
  var ARIA_VALUEMAX: String = js.native
  var ARIA_VALUEMIN: String = js.native
  var ARIA_VALUENOW: String = js.native
  var CHANGE_EVENT: String = js.native
  var INPUT_EVENT: String = js.native
  var PIN_VALUE_MARKER_SELECTOR: String = js.native
  var STEP_DATA_ATTR: String = js.native
  var THUMB_CONTAINER_SELECTOR: String = js.native
  var TRACK_MARKER_CONTAINER_SELECTOR: String = js.native
  var TRACK_SELECTOR: String = js.native
}

object ARIADISABLED {
  @scala.inline
  def apply(
    ARIA_DISABLED: String,
    ARIA_VALUEMAX: String,
    ARIA_VALUEMIN: String,
    ARIA_VALUENOW: String,
    CHANGE_EVENT: String,
    INPUT_EVENT: String,
    PIN_VALUE_MARKER_SELECTOR: String,
    STEP_DATA_ATTR: String,
    THUMB_CONTAINER_SELECTOR: String,
    TRACK_MARKER_CONTAINER_SELECTOR: String,
    TRACK_SELECTOR: String
  ): ARIADISABLED = {
    val __obj = js.Dynamic.literal(ARIA_DISABLED = ARIA_DISABLED.asInstanceOf[js.Any], ARIA_VALUEMAX = ARIA_VALUEMAX.asInstanceOf[js.Any], ARIA_VALUEMIN = ARIA_VALUEMIN.asInstanceOf[js.Any], ARIA_VALUENOW = ARIA_VALUENOW.asInstanceOf[js.Any], CHANGE_EVENT = CHANGE_EVENT.asInstanceOf[js.Any], INPUT_EVENT = INPUT_EVENT.asInstanceOf[js.Any], PIN_VALUE_MARKER_SELECTOR = PIN_VALUE_MARKER_SELECTOR.asInstanceOf[js.Any], STEP_DATA_ATTR = STEP_DATA_ATTR.asInstanceOf[js.Any], THUMB_CONTAINER_SELECTOR = THUMB_CONTAINER_SELECTOR.asInstanceOf[js.Any], TRACK_MARKER_CONTAINER_SELECTOR = TRACK_MARKER_CONTAINER_SELECTOR.asInstanceOf[js.Any], TRACK_SELECTOR = TRACK_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIADISABLED]
  }
  @scala.inline
  implicit class ARIADISABLEDOps[Self <: ARIADISABLED] (val x: Self) extends AnyVal {
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
    def setARIA_DISABLED(value: String): Self = this.set("ARIA_DISABLED", value.asInstanceOf[js.Any])
    @scala.inline
    def setARIA_VALUEMAX(value: String): Self = this.set("ARIA_VALUEMAX", value.asInstanceOf[js.Any])
    @scala.inline
    def setARIA_VALUEMIN(value: String): Self = this.set("ARIA_VALUEMIN", value.asInstanceOf[js.Any])
    @scala.inline
    def setARIA_VALUENOW(value: String): Self = this.set("ARIA_VALUENOW", value.asInstanceOf[js.Any])
    @scala.inline
    def setCHANGE_EVENT(value: String): Self = this.set("CHANGE_EVENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setINPUT_EVENT(value: String): Self = this.set("INPUT_EVENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setPIN_VALUE_MARKER_SELECTOR(value: String): Self = this.set("PIN_VALUE_MARKER_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setSTEP_DATA_ATTR(value: String): Self = this.set("STEP_DATA_ATTR", value.asInstanceOf[js.Any])
    @scala.inline
    def setTHUMB_CONTAINER_SELECTOR(value: String): Self = this.set("THUMB_CONTAINER_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setTRACK_MARKER_CONTAINER_SELECTOR(value: String): Self = this.set("TRACK_MARKER_CONTAINER_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setTRACK_SELECTOR(value: String): Self = this.set("TRACK_SELECTOR", value.asInstanceOf[js.Any])
  }
  
}

