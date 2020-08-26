package typings.materialIconButton.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ARIALABEL extends js.Object {
  var ARIA_LABEL: String = js.native
  var ARIA_PRESSED: String = js.native
  var CHANGE_EVENT: String = js.native
  var DATA_ARIA_LABEL_OFF: String = js.native
  var DATA_ARIA_LABEL_ON: String = js.native
}

object ARIALABEL {
  @scala.inline
  def apply(
    ARIA_LABEL: String,
    ARIA_PRESSED: String,
    CHANGE_EVENT: String,
    DATA_ARIA_LABEL_OFF: String,
    DATA_ARIA_LABEL_ON: String
  ): ARIALABEL = {
    val __obj = js.Dynamic.literal(ARIA_LABEL = ARIA_LABEL.asInstanceOf[js.Any], ARIA_PRESSED = ARIA_PRESSED.asInstanceOf[js.Any], CHANGE_EVENT = CHANGE_EVENT.asInstanceOf[js.Any], DATA_ARIA_LABEL_OFF = DATA_ARIA_LABEL_OFF.asInstanceOf[js.Any], DATA_ARIA_LABEL_ON = DATA_ARIA_LABEL_ON.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIALABEL]
  }
  @scala.inline
  implicit class ARIALABELOps[Self <: ARIALABEL] (val x: Self) extends AnyVal {
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
    def setARIA_LABEL(value: String): Self = this.set("ARIA_LABEL", value.asInstanceOf[js.Any])
    @scala.inline
    def setARIA_PRESSED(value: String): Self = this.set("ARIA_PRESSED", value.asInstanceOf[js.Any])
    @scala.inline
    def setCHANGE_EVENT(value: String): Self = this.set("CHANGE_EVENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setDATA_ARIA_LABEL_OFF(value: String): Self = this.set("DATA_ARIA_LABEL_OFF", value.asInstanceOf[js.Any])
    @scala.inline
    def setDATA_ARIA_LABEL_ON(value: String): Self = this.set("DATA_ARIA_LABEL_ON", value.asInstanceOf[js.Any])
  }
  
}

