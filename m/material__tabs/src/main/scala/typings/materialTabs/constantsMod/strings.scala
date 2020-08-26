package typings.materialTabs.constantsMod

import typings.materialTabs.materialTabsStrings.`Dotmdc-tab-bar-scroller__indicator--back`
import typings.materialTabs.materialTabsStrings.`Dotmdc-tab-bar-scroller__indicator--forward`
import typings.materialTabs.materialTabsStrings.`Dotmdc-tab-bar-scroller__scroll-frame__tabs`
import typings.materialTabs.materialTabsStrings.`Dotmdc-tab-bar-scroller__scroll-frame`
import typings.materialTabs.materialTabsStrings.`Dotmdc-tab`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MDCStrings * / any */ @js.native
trait strings extends js.Object {
  var FRAME_SELECTOR: `Dotmdc-tab-bar-scroller__scroll-frame` = js.native
  var INDICATOR_BACK_SELECTOR: `Dotmdc-tab-bar-scroller__indicator--back` = js.native
  var INDICATOR_FORWARD_SELECTOR: `Dotmdc-tab-bar-scroller__indicator--forward` = js.native
  var TABS_SELECTOR: `Dotmdc-tab-bar-scroller__scroll-frame__tabs` = js.native
  var TAB_SELECTOR: `Dotmdc-tab` = js.native
}

object strings {
  @scala.inline
  def apply(
    FRAME_SELECTOR: `Dotmdc-tab-bar-scroller__scroll-frame`,
    INDICATOR_BACK_SELECTOR: `Dotmdc-tab-bar-scroller__indicator--back`,
    INDICATOR_FORWARD_SELECTOR: `Dotmdc-tab-bar-scroller__indicator--forward`,
    TABS_SELECTOR: `Dotmdc-tab-bar-scroller__scroll-frame__tabs`,
    TAB_SELECTOR: `Dotmdc-tab`
  ): strings = {
    val __obj = js.Dynamic.literal(FRAME_SELECTOR = FRAME_SELECTOR.asInstanceOf[js.Any], INDICATOR_BACK_SELECTOR = INDICATOR_BACK_SELECTOR.asInstanceOf[js.Any], INDICATOR_FORWARD_SELECTOR = INDICATOR_FORWARD_SELECTOR.asInstanceOf[js.Any], TABS_SELECTOR = TABS_SELECTOR.asInstanceOf[js.Any], TAB_SELECTOR = TAB_SELECTOR.asInstanceOf[js.Any])
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
    def setFRAME_SELECTOR(value: `Dotmdc-tab-bar-scroller__scroll-frame`): Self = this.set("FRAME_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setINDICATOR_BACK_SELECTOR(value: `Dotmdc-tab-bar-scroller__indicator--back`): Self = this.set("INDICATOR_BACK_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setINDICATOR_FORWARD_SELECTOR(value: `Dotmdc-tab-bar-scroller__indicator--forward`): Self = this.set("INDICATOR_FORWARD_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setTABS_SELECTOR(value: `Dotmdc-tab-bar-scroller__scroll-frame__tabs`): Self = this.set("TABS_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setTAB_SELECTOR(value: `Dotmdc-tab`): Self = this.set("TAB_SELECTOR", value.asInstanceOf[js.Any])
  }
  
}

