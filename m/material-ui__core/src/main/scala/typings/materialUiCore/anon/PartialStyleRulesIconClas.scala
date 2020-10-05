package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Icon.IconClassKey>> */
@js.native
trait PartialStyleRulesIconClas extends js.Object {
  var colorAction: js.UndefOr[CSSProperties] = js.native
  var colorDisabled: js.UndefOr[CSSProperties] = js.native
  var colorError: js.UndefOr[CSSProperties] = js.native
  var colorPrimary: js.UndefOr[CSSProperties] = js.native
  var colorSecondary: js.UndefOr[CSSProperties] = js.native
  var fontSizeInherit: js.UndefOr[CSSProperties] = js.native
  var fontSizeLarge: js.UndefOr[CSSProperties] = js.native
  var fontSizeSmall: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesIconClas {
  @scala.inline
  def apply(): PartialStyleRulesIconClas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesIconClas]
  }
  @scala.inline
  implicit class PartialStyleRulesIconClasOps[Self <: PartialStyleRulesIconClas] (val x: Self) extends AnyVal {
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
    def setColorAction(value: CSSProperties): Self = this.set("colorAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorAction: Self = this.set("colorAction", js.undefined)
    @scala.inline
    def setColorDisabled(value: CSSProperties): Self = this.set("colorDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorDisabled: Self = this.set("colorDisabled", js.undefined)
    @scala.inline
    def setColorError(value: CSSProperties): Self = this.set("colorError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorError: Self = this.set("colorError", js.undefined)
    @scala.inline
    def setColorPrimary(value: CSSProperties): Self = this.set("colorPrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorPrimary: Self = this.set("colorPrimary", js.undefined)
    @scala.inline
    def setColorSecondary(value: CSSProperties): Self = this.set("colorSecondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorSecondary: Self = this.set("colorSecondary", js.undefined)
    @scala.inline
    def setFontSizeInherit(value: CSSProperties): Self = this.set("fontSizeInherit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSizeInherit: Self = this.set("fontSizeInherit", js.undefined)
    @scala.inline
    def setFontSizeLarge(value: CSSProperties): Self = this.set("fontSizeLarge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSizeLarge: Self = this.set("fontSizeLarge", js.undefined)
    @scala.inline
    def setFontSizeSmall(value: CSSProperties): Self = this.set("fontSizeSmall", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSizeSmall: Self = this.set("fontSizeSmall", js.undefined)
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

