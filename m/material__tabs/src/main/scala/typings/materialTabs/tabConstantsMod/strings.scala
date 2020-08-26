package typings.materialTabs.tabConstantsMod

import typings.materialTabs.materialTabsStrings.MDCTabColonselected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MDCStrings * / any */ @js.native
trait strings extends js.Object {
  var SELECTED_EVENT: MDCTabColonselected = js.native
}

object strings {
  @scala.inline
  def apply(SELECTED_EVENT: MDCTabColonselected): strings = {
    val __obj = js.Dynamic.literal(SELECTED_EVENT = SELECTED_EVENT.asInstanceOf[js.Any])
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
    def setSELECTED_EVENT(value: MDCTabColonselected): Self = this.set("SELECTED_EVENT", value.asInstanceOf[js.Any])
  }
  
}

