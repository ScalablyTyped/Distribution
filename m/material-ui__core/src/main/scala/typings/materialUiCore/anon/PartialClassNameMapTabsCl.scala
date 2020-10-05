package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Tabs/Tabs.TabsClassKey>> */
@js.native
trait PartialClassNameMapTabsCl extends js.Object {
  var centered: js.UndefOr[String] = js.native
  var fixed: js.UndefOr[String] = js.native
  var flexContainer: js.UndefOr[String] = js.native
  var indicator: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var scrollButtons: js.UndefOr[String] = js.native
  var scrollButtonsAuto: js.UndefOr[String] = js.native
  var scrollable: js.UndefOr[String] = js.native
  var scroller: js.UndefOr[String] = js.native
}

object PartialClassNameMapTabsCl {
  @scala.inline
  def apply(): PartialClassNameMapTabsCl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapTabsCl]
  }
  @scala.inline
  implicit class PartialClassNameMapTabsClOps[Self <: PartialClassNameMapTabsCl] (val x: Self) extends AnyVal {
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
    def setCentered(value: String): Self = this.set("centered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCentered: Self = this.set("centered", js.undefined)
    @scala.inline
    def setFixed(value: String): Self = this.set("fixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    @scala.inline
    def setFlexContainer(value: String): Self = this.set("flexContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexContainer: Self = this.set("flexContainer", js.undefined)
    @scala.inline
    def setIndicator(value: String): Self = this.set("indicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicator: Self = this.set("indicator", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setScrollButtons(value: String): Self = this.set("scrollButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollButtons: Self = this.set("scrollButtons", js.undefined)
    @scala.inline
    def setScrollButtonsAuto(value: String): Self = this.set("scrollButtonsAuto", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollButtonsAuto: Self = this.set("scrollButtonsAuto", js.undefined)
    @scala.inline
    def setScrollable(value: String): Self = this.set("scrollable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollable: Self = this.set("scrollable", js.undefined)
    @scala.inline
    def setScroller(value: String): Self = this.set("scroller", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScroller: Self = this.set("scroller", js.undefined)
  }
  
}

