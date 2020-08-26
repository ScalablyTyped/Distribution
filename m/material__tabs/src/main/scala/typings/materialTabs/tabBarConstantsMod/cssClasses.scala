package typings.materialTabs.tabBarConstantsMod

import typings.materialTabs.materialTabsStrings.`mdc-tab-bar-upgraded`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MDCStrings * / any */ @js.native
trait cssClasses extends js.Object {
  var UPGRADED: `mdc-tab-bar-upgraded` = js.native
}

object cssClasses {
  @scala.inline
  def apply(UPGRADED: `mdc-tab-bar-upgraded`): cssClasses = {
    val __obj = js.Dynamic.literal(UPGRADED = UPGRADED.asInstanceOf[js.Any])
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
    def setUPGRADED(value: `mdc-tab-bar-upgraded`): Self = this.set("UPGRADED", value.asInstanceOf[js.Any])
  }
  
}

