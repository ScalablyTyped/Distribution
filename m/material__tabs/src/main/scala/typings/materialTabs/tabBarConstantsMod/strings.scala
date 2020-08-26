package typings.materialTabs.tabBarConstantsMod

import typings.materialTabs.materialTabsStrings.MDCTabBarColonchange
import typings.materialTabs.materialTabsStrings.`Dotmdc-tab-bar__indicator`
import typings.materialTabs.materialTabsStrings.`Dotmdc-tab`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MDCStrings * / any */ @js.native
trait strings extends js.Object {
  var CHANGE_EVENT: MDCTabBarColonchange = js.native
  var INDICATOR_SELECTOR: `Dotmdc-tab-bar__indicator` = js.native
  var TAB_SELECTOR: `Dotmdc-tab` = js.native
}

object strings {
  @scala.inline
  def apply(
    CHANGE_EVENT: MDCTabBarColonchange,
    INDICATOR_SELECTOR: `Dotmdc-tab-bar__indicator`,
    TAB_SELECTOR: `Dotmdc-tab`
  ): strings = {
    val __obj = js.Dynamic.literal(CHANGE_EVENT = CHANGE_EVENT.asInstanceOf[js.Any], INDICATOR_SELECTOR = INDICATOR_SELECTOR.asInstanceOf[js.Any], TAB_SELECTOR = TAB_SELECTOR.asInstanceOf[js.Any])
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
    def setCHANGE_EVENT(value: MDCTabBarColonchange): Self = this.set("CHANGE_EVENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setINDICATOR_SELECTOR(value: `Dotmdc-tab-bar__indicator`): Self = this.set("INDICATOR_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setTAB_SELECTOR(value: `Dotmdc-tab`): Self = this.set("TAB_SELECTOR", value.asInstanceOf[js.Any])
  }
  
}

