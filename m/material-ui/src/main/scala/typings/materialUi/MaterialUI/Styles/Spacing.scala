package typings.materialUi.MaterialUI.Styles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Spacing extends js.Object {
  var desktopDropDownMenuFontSize: js.UndefOr[Double] = js.native
  var desktopDropDownMenuItemHeight: js.UndefOr[Double] = js.native
  var desktopGutter: js.UndefOr[Double] = js.native
  var desktopGutterLess: js.UndefOr[Double] = js.native
  var desktopGutterMini: js.UndefOr[Double] = js.native
  var desktopGutterMore: js.UndefOr[Double] = js.native
  var desktopKeylineIncrement: js.UndefOr[Double] = js.native
  var desktopLeftNavMenuItemHeight: js.UndefOr[Double] = js.native
  var desktopSubheaderHeight: js.UndefOr[Double] = js.native
  var desktopToolbarHeight: js.UndefOr[Double] = js.native
  var iconSize: js.UndefOr[Double] = js.native
}

object Spacing {
  @scala.inline
  def apply(): Spacing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Spacing]
  }
  @scala.inline
  implicit class SpacingOps[Self <: Spacing] (val x: Self) extends AnyVal {
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
    def setDesktopDropDownMenuFontSize(value: Double): Self = this.set("desktopDropDownMenuFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesktopDropDownMenuFontSize: Self = this.set("desktopDropDownMenuFontSize", js.undefined)
    @scala.inline
    def setDesktopDropDownMenuItemHeight(value: Double): Self = this.set("desktopDropDownMenuItemHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesktopDropDownMenuItemHeight: Self = this.set("desktopDropDownMenuItemHeight", js.undefined)
    @scala.inline
    def setDesktopGutter(value: Double): Self = this.set("desktopGutter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesktopGutter: Self = this.set("desktopGutter", js.undefined)
    @scala.inline
    def setDesktopGutterLess(value: Double): Self = this.set("desktopGutterLess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesktopGutterLess: Self = this.set("desktopGutterLess", js.undefined)
    @scala.inline
    def setDesktopGutterMini(value: Double): Self = this.set("desktopGutterMini", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesktopGutterMini: Self = this.set("desktopGutterMini", js.undefined)
    @scala.inline
    def setDesktopGutterMore(value: Double): Self = this.set("desktopGutterMore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesktopGutterMore: Self = this.set("desktopGutterMore", js.undefined)
    @scala.inline
    def setDesktopKeylineIncrement(value: Double): Self = this.set("desktopKeylineIncrement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesktopKeylineIncrement: Self = this.set("desktopKeylineIncrement", js.undefined)
    @scala.inline
    def setDesktopLeftNavMenuItemHeight(value: Double): Self = this.set("desktopLeftNavMenuItemHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesktopLeftNavMenuItemHeight: Self = this.set("desktopLeftNavMenuItemHeight", js.undefined)
    @scala.inline
    def setDesktopSubheaderHeight(value: Double): Self = this.set("desktopSubheaderHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesktopSubheaderHeight: Self = this.set("desktopSubheaderHeight", js.undefined)
    @scala.inline
    def setDesktopToolbarHeight(value: Double): Self = this.set("desktopToolbarHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesktopToolbarHeight: Self = this.set("desktopToolbarHeight", js.undefined)
    @scala.inline
    def setIconSize(value: Double): Self = this.set("iconSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconSize: Self = this.set("iconSize", js.undefined)
  }
  
}

