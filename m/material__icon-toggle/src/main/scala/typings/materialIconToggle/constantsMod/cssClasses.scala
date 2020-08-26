package typings.materialIconToggle.constantsMod

import typings.materialIconToggle.materialIconToggleStrings.`mdc-icon-toggle--disabled`
import typings.materialIconToggle.materialIconToggleStrings.`mdc-icon-toggle`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MDCStrings * / any */ @js.native
trait cssClasses extends js.Object {
  var DISABLED: `mdc-icon-toggle--disabled` = js.native
  var ROOT: `mdc-icon-toggle` = js.native
}

object cssClasses {
  @scala.inline
  def apply(DISABLED: `mdc-icon-toggle--disabled`, ROOT: `mdc-icon-toggle`): cssClasses = {
    val __obj = js.Dynamic.literal(DISABLED = DISABLED.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
    __obj.asInstanceOf[cssClasses]
  }
  @scala.inline
  implicit class cssClassesOps[Self <: cssClasses] (val x: Self) extends AnyVal {
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
    def setDISABLED(value: `mdc-icon-toggle--disabled`): Self = this.set("DISABLED", value.asInstanceOf[js.Any])
    @scala.inline
    def setROOT(value: `mdc-icon-toggle`): Self = this.set("ROOT", value.asInstanceOf[js.Any])
  }
  
}

