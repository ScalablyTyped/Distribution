package typings.materialUiCore.createTypographyMod

import typings.csstype.mod.Property.FontFamily
import typings.csstype.mod.Property.FontWeight
import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@material-ui/core.@material-ui/core/styles/createTypography.FontStyle> */
@js.native
trait FontStyleOptions extends js.Object {
  var allVariants: js.UndefOr[CSSProperties] = js.native
  var fontFamily: js.UndefOr[FontFamily] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var fontWeightLight: js.UndefOr[FontWeight] = js.native
  var fontWeightMedium: js.UndefOr[FontWeight] = js.native
  var fontWeightRegular: js.UndefOr[FontWeight] = js.native
  var htmlFontSize: js.UndefOr[Double] = js.native
  var useNextVariants: js.UndefOr[Boolean] = js.native
}

object FontStyleOptions {
  @scala.inline
  def apply(): FontStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontStyleOptions]
  }
  @scala.inline
  implicit class FontStyleOptionsOps[Self <: FontStyleOptions] (val x: Self) extends AnyVal {
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
    def setAllVariants(value: CSSProperties): Self = this.set("allVariants", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllVariants: Self = this.set("allVariants", js.undefined)
    @scala.inline
    def setFontFamily(value: FontFamily): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setFontWeightLight(value: FontWeight): Self = this.set("fontWeightLight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeightLight: Self = this.set("fontWeightLight", js.undefined)
    @scala.inline
    def setFontWeightMedium(value: FontWeight): Self = this.set("fontWeightMedium", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeightMedium: Self = this.set("fontWeightMedium", js.undefined)
    @scala.inline
    def setFontWeightRegular(value: FontWeight): Self = this.set("fontWeightRegular", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeightRegular: Self = this.set("fontWeightRegular", js.undefined)
    @scala.inline
    def setHtmlFontSize(value: Double): Self = this.set("htmlFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlFontSize: Self = this.set("htmlFontSize", js.undefined)
    @scala.inline
    def setUseNextVariants(value: Boolean): Self = this.set("useNextVariants", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseNextVariants: Self = this.set("useNextVariants", js.undefined)
  }
  
}

