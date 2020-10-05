package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Tabs.TabsClassKey>> */
@js.native
trait PartialStyleRulesTabsClas extends js.Object {
  var centered: js.UndefOr[CSSProperties] = js.native
  var fixed: js.UndefOr[CSSProperties] = js.native
  var flexContainer: js.UndefOr[CSSProperties] = js.native
  var indicator: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var scrollButtons: js.UndefOr[CSSProperties] = js.native
  var scrollButtonsAuto: js.UndefOr[CSSProperties] = js.native
  var scrollable: js.UndefOr[CSSProperties] = js.native
  var scroller: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesTabsClas {
  @scala.inline
  def apply(): PartialStyleRulesTabsClas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesTabsClas]
  }
  @scala.inline
  implicit class PartialStyleRulesTabsClasOps[Self <: PartialStyleRulesTabsClas] (val x: Self) extends AnyVal {
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
    def setCentered(value: CSSProperties): Self = this.set("centered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCentered: Self = this.set("centered", js.undefined)
    @scala.inline
    def setFixed(value: CSSProperties): Self = this.set("fixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    @scala.inline
    def setFlexContainer(value: CSSProperties): Self = this.set("flexContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexContainer: Self = this.set("flexContainer", js.undefined)
    @scala.inline
    def setIndicator(value: CSSProperties): Self = this.set("indicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicator: Self = this.set("indicator", js.undefined)
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setScrollButtons(value: CSSProperties): Self = this.set("scrollButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollButtons: Self = this.set("scrollButtons", js.undefined)
    @scala.inline
    def setScrollButtonsAuto(value: CSSProperties): Self = this.set("scrollButtonsAuto", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollButtonsAuto: Self = this.set("scrollButtonsAuto", js.undefined)
    @scala.inline
    def setScrollable(value: CSSProperties): Self = this.set("scrollable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollable: Self = this.set("scrollable", js.undefined)
    @scala.inline
    def setScroller(value: CSSProperties): Self = this.set("scroller", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScroller: Self = this.set("scroller", js.undefined)
  }
  
}

