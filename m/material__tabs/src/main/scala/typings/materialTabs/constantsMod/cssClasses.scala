package typings.materialTabs.constantsMod

import typings.materialTabs.materialTabsStrings.`mdc-tab-bar-scroller__indicator--back`
import typings.materialTabs.materialTabsStrings.`mdc-tab-bar-scroller__indicator--enabled`
import typings.materialTabs.materialTabsStrings.`mdc-tab-bar-scroller__indicator--forward`
import typings.materialTabs.materialTabsStrings.`mdc-tab`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MDCStrings * / any */ @js.native
trait cssClasses extends js.Object {
  var INDICATOR_BACK: `mdc-tab-bar-scroller__indicator--back` = js.native
  var INDICATOR_ENABLED: `mdc-tab-bar-scroller__indicator--enabled` = js.native
  var INDICATOR_FORWARD: `mdc-tab-bar-scroller__indicator--forward` = js.native
  var TAB: `mdc-tab` = js.native
}

object cssClasses {
  @scala.inline
  def apply(
    INDICATOR_BACK: `mdc-tab-bar-scroller__indicator--back`,
    INDICATOR_ENABLED: `mdc-tab-bar-scroller__indicator--enabled`,
    INDICATOR_FORWARD: `mdc-tab-bar-scroller__indicator--forward`,
    TAB: `mdc-tab`
  ): cssClasses = {
    val __obj = js.Dynamic.literal(INDICATOR_BACK = INDICATOR_BACK.asInstanceOf[js.Any], INDICATOR_ENABLED = INDICATOR_ENABLED.asInstanceOf[js.Any], INDICATOR_FORWARD = INDICATOR_FORWARD.asInstanceOf[js.Any], TAB = TAB.asInstanceOf[js.Any])
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
    def setINDICATOR_BACK(value: `mdc-tab-bar-scroller__indicator--back`): Self = this.set("INDICATOR_BACK", value.asInstanceOf[js.Any])
    @scala.inline
    def setINDICATOR_ENABLED(value: `mdc-tab-bar-scroller__indicator--enabled`): Self = this.set("INDICATOR_ENABLED", value.asInstanceOf[js.Any])
    @scala.inline
    def setINDICATOR_FORWARD(value: `mdc-tab-bar-scroller__indicator--forward`): Self = this.set("INDICATOR_FORWARD", value.asInstanceOf[js.Any])
    @scala.inline
    def setTAB(value: `mdc-tab`): Self = this.set("TAB", value.asInstanceOf[js.Any])
  }
  
}

