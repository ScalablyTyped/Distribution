package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/SvgIcon/SvgIcon.SvgIconClassKey>> */
@js.native
trait PartialClassNameMapSvgIco extends js.Object {
  var colorAction: js.UndefOr[String] = js.native
  var colorDisabled: js.UndefOr[String] = js.native
  var colorError: js.UndefOr[String] = js.native
  var colorPrimary: js.UndefOr[String] = js.native
  var colorSecondary: js.UndefOr[String] = js.native
  var fontSizeInherit: js.UndefOr[String] = js.native
  var fontSizeLarge: js.UndefOr[String] = js.native
  var fontSizeSmall: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapSvgIco {
  @scala.inline
  def apply(): PartialClassNameMapSvgIco = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapSvgIco]
  }
  @scala.inline
  implicit class PartialClassNameMapSvgIcoOps[Self <: PartialClassNameMapSvgIco] (val x: Self) extends AnyVal {
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
    def setColorAction(value: String): Self = this.set("colorAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorAction: Self = this.set("colorAction", js.undefined)
    @scala.inline
    def setColorDisabled(value: String): Self = this.set("colorDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorDisabled: Self = this.set("colorDisabled", js.undefined)
    @scala.inline
    def setColorError(value: String): Self = this.set("colorError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorError: Self = this.set("colorError", js.undefined)
    @scala.inline
    def setColorPrimary(value: String): Self = this.set("colorPrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorPrimary: Self = this.set("colorPrimary", js.undefined)
    @scala.inline
    def setColorSecondary(value: String): Self = this.set("colorSecondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorSecondary: Self = this.set("colorSecondary", js.undefined)
    @scala.inline
    def setFontSizeInherit(value: String): Self = this.set("fontSizeInherit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSizeInherit: Self = this.set("fontSizeInherit", js.undefined)
    @scala.inline
    def setFontSizeLarge(value: String): Self = this.set("fontSizeLarge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSizeLarge: Self = this.set("fontSizeLarge", js.undefined)
    @scala.inline
    def setFontSizeSmall(value: String): Self = this.set("fontSizeSmall", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSizeSmall: Self = this.set("fontSizeSmall", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

