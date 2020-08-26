package typings.materialIconToggle.constantsMod

import typings.materialIconToggle.materialIconToggleStrings.MDCIconToggleColonchange
import typings.materialIconToggle.materialIconToggleStrings.`aria-disabled`
import typings.materialIconToggle.materialIconToggleStrings.`aria-label`
import typings.materialIconToggle.materialIconToggleStrings.`aria-pressed`
import typings.materialIconToggle.materialIconToggleStrings.`data-toggle-off`
import typings.materialIconToggle.materialIconToggleStrings.`data-toggle-on`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MDCStrings * / any */ @js.native
trait strings extends js.Object {
  var ARIA_DISABLED: `aria-disabled` = js.native
  var ARIA_LABEL: `aria-label` = js.native
  var ARIA_PRESSED: `aria-pressed` = js.native
  var CHANGE_EVENT: MDCIconToggleColonchange = js.native
  var DATA_TOGGLE_OFF: `data-toggle-off` = js.native
  var DATA_TOGGLE_ON: `data-toggle-on` = js.native
}

object strings {
  @scala.inline
  def apply(
    ARIA_DISABLED: `aria-disabled`,
    ARIA_LABEL: `aria-label`,
    ARIA_PRESSED: `aria-pressed`,
    CHANGE_EVENT: MDCIconToggleColonchange,
    DATA_TOGGLE_OFF: `data-toggle-off`,
    DATA_TOGGLE_ON: `data-toggle-on`
  ): strings = {
    val __obj = js.Dynamic.literal(ARIA_DISABLED = ARIA_DISABLED.asInstanceOf[js.Any], ARIA_LABEL = ARIA_LABEL.asInstanceOf[js.Any], ARIA_PRESSED = ARIA_PRESSED.asInstanceOf[js.Any], CHANGE_EVENT = CHANGE_EVENT.asInstanceOf[js.Any], DATA_TOGGLE_OFF = DATA_TOGGLE_OFF.asInstanceOf[js.Any], DATA_TOGGLE_ON = DATA_TOGGLE_ON.asInstanceOf[js.Any])
    __obj.asInstanceOf[strings]
  }
  @scala.inline
  implicit class stringsOps[Self <: strings] (val x: Self) extends AnyVal {
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
    def setARIA_DISABLED(value: `aria-disabled`): Self = this.set("ARIA_DISABLED", value.asInstanceOf[js.Any])
    @scala.inline
    def setARIA_LABEL(value: `aria-label`): Self = this.set("ARIA_LABEL", value.asInstanceOf[js.Any])
    @scala.inline
    def setARIA_PRESSED(value: `aria-pressed`): Self = this.set("ARIA_PRESSED", value.asInstanceOf[js.Any])
    @scala.inline
    def setCHANGE_EVENT(value: MDCIconToggleColonchange): Self = this.set("CHANGE_EVENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setDATA_TOGGLE_OFF(value: `data-toggle-off`): Self = this.set("DATA_TOGGLE_OFF", value.asInstanceOf[js.Any])
    @scala.inline
    def setDATA_TOGGLE_ON(value: `data-toggle-on`): Self = this.set("DATA_TOGGLE_ON", value.asInstanceOf[js.Any])
  }
  
}

