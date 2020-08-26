package typings.materialCheckbox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ANIMCHECKEDINDETERMINATE extends js.Object {
  var ANIM_CHECKED_INDETERMINATE: String = js.native
  var ANIM_CHECKED_UNCHECKED: String = js.native
  var ANIM_INDETERMINATE_CHECKED: String = js.native
  var ANIM_INDETERMINATE_UNCHECKED: String = js.native
  var ANIM_UNCHECKED_CHECKED: String = js.native
  var ANIM_UNCHECKED_INDETERMINATE: String = js.native
  var BACKGROUND: String = js.native
  var CHECKED: String = js.native
  var CHECKMARK: String = js.native
  var CHECKMARK_PATH: String = js.native
  var DISABLED: String = js.native
  var INDETERMINATE: String = js.native
  var MIXEDMARK: String = js.native
  var NATIVE_CONTROL: String = js.native
  var ROOT: String = js.native
  var SELECTED: String = js.native
  var UPGRADED: String = js.native
}

object ANIMCHECKEDINDETERMINATE {
  @scala.inline
  def apply(
    ANIM_CHECKED_INDETERMINATE: String,
    ANIM_CHECKED_UNCHECKED: String,
    ANIM_INDETERMINATE_CHECKED: String,
    ANIM_INDETERMINATE_UNCHECKED: String,
    ANIM_UNCHECKED_CHECKED: String,
    ANIM_UNCHECKED_INDETERMINATE: String,
    BACKGROUND: String,
    CHECKED: String,
    CHECKMARK: String,
    CHECKMARK_PATH: String,
    DISABLED: String,
    INDETERMINATE: String,
    MIXEDMARK: String,
    NATIVE_CONTROL: String,
    ROOT: String,
    SELECTED: String,
    UPGRADED: String
  ): ANIMCHECKEDINDETERMINATE = {
    val __obj = js.Dynamic.literal(ANIM_CHECKED_INDETERMINATE = ANIM_CHECKED_INDETERMINATE.asInstanceOf[js.Any], ANIM_CHECKED_UNCHECKED = ANIM_CHECKED_UNCHECKED.asInstanceOf[js.Any], ANIM_INDETERMINATE_CHECKED = ANIM_INDETERMINATE_CHECKED.asInstanceOf[js.Any], ANIM_INDETERMINATE_UNCHECKED = ANIM_INDETERMINATE_UNCHECKED.asInstanceOf[js.Any], ANIM_UNCHECKED_CHECKED = ANIM_UNCHECKED_CHECKED.asInstanceOf[js.Any], ANIM_UNCHECKED_INDETERMINATE = ANIM_UNCHECKED_INDETERMINATE.asInstanceOf[js.Any], BACKGROUND = BACKGROUND.asInstanceOf[js.Any], CHECKED = CHECKED.asInstanceOf[js.Any], CHECKMARK = CHECKMARK.asInstanceOf[js.Any], CHECKMARK_PATH = CHECKMARK_PATH.asInstanceOf[js.Any], DISABLED = DISABLED.asInstanceOf[js.Any], INDETERMINATE = INDETERMINATE.asInstanceOf[js.Any], MIXEDMARK = MIXEDMARK.asInstanceOf[js.Any], NATIVE_CONTROL = NATIVE_CONTROL.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any], SELECTED = SELECTED.asInstanceOf[js.Any], UPGRADED = UPGRADED.asInstanceOf[js.Any])
    __obj.asInstanceOf[ANIMCHECKEDINDETERMINATE]
  }
  @scala.inline
  implicit class ANIMCHECKEDINDETERMINATEOps[Self <: ANIMCHECKEDINDETERMINATE] (val x: Self) extends AnyVal {
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
    def setANIM_CHECKED_INDETERMINATE(value: String): Self = this.set("ANIM_CHECKED_INDETERMINATE", value.asInstanceOf[js.Any])
    @scala.inline
    def setANIM_CHECKED_UNCHECKED(value: String): Self = this.set("ANIM_CHECKED_UNCHECKED", value.asInstanceOf[js.Any])
    @scala.inline
    def setANIM_INDETERMINATE_CHECKED(value: String): Self = this.set("ANIM_INDETERMINATE_CHECKED", value.asInstanceOf[js.Any])
    @scala.inline
    def setANIM_INDETERMINATE_UNCHECKED(value: String): Self = this.set("ANIM_INDETERMINATE_UNCHECKED", value.asInstanceOf[js.Any])
    @scala.inline
    def setANIM_UNCHECKED_CHECKED(value: String): Self = this.set("ANIM_UNCHECKED_CHECKED", value.asInstanceOf[js.Any])
    @scala.inline
    def setANIM_UNCHECKED_INDETERMINATE(value: String): Self = this.set("ANIM_UNCHECKED_INDETERMINATE", value.asInstanceOf[js.Any])
    @scala.inline
    def setBACKGROUND(value: String): Self = this.set("BACKGROUND", value.asInstanceOf[js.Any])
    @scala.inline
    def setCHECKED(value: String): Self = this.set("CHECKED", value.asInstanceOf[js.Any])
    @scala.inline
    def setCHECKMARK(value: String): Self = this.set("CHECKMARK", value.asInstanceOf[js.Any])
    @scala.inline
    def setCHECKMARK_PATH(value: String): Self = this.set("CHECKMARK_PATH", value.asInstanceOf[js.Any])
    @scala.inline
    def setDISABLED(value: String): Self = this.set("DISABLED", value.asInstanceOf[js.Any])
    @scala.inline
    def setINDETERMINATE(value: String): Self = this.set("INDETERMINATE", value.asInstanceOf[js.Any])
    @scala.inline
    def setMIXEDMARK(value: String): Self = this.set("MIXEDMARK", value.asInstanceOf[js.Any])
    @scala.inline
    def setNATIVE_CONTROL(value: String): Self = this.set("NATIVE_CONTROL", value.asInstanceOf[js.Any])
    @scala.inline
    def setROOT(value: String): Self = this.set("ROOT", value.asInstanceOf[js.Any])
    @scala.inline
    def setSELECTED(value: String): Self = this.set("SELECTED", value.asInstanceOf[js.Any])
    @scala.inline
    def setUPGRADED(value: String): Self = this.set("UPGRADED", value.asInstanceOf[js.Any])
  }
  
}

