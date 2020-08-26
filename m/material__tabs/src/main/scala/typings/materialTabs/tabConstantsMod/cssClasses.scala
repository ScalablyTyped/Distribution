package typings.materialTabs.tabConstantsMod

import typings.materialTabs.materialTabsStrings.`mdc-tab--active`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MDCStrings * / any */ @js.native
trait cssClasses extends js.Object {
  var ACTIVE: `mdc-tab--active` = js.native
}

object cssClasses {
  @scala.inline
  def apply(ACTIVE: `mdc-tab--active`): cssClasses = {
    val __obj = js.Dynamic.literal(ACTIVE = ACTIVE.asInstanceOf[js.Any])
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
    def setACTIVE(value: `mdc-tab--active`): Self = this.set("ACTIVE", value.asInstanceOf[js.Any])
  }
  
}

