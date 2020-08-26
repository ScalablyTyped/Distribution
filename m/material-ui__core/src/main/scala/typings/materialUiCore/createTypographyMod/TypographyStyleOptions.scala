package typings.materialUiCore.createTypographyMod

import typings.csstype.mod.Property.Color
import typings.csstype.mod.Property.FontFamily
import typings.csstype.mod.Property.FontSize
import typings.csstype.mod.Property.FontWeight
import typings.csstype.mod.Property.LetterSpacing
import typings.csstype.mod.Property.LineHeight
import typings.csstype.mod.Property.TextTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@material-ui/core.@material-ui/core/styles/createTypography.TypographyStyle> */
@js.native
trait TypographyStyleOptions extends js.Object {
  var color: js.UndefOr[Color] = js.native
  var fontFamily: js.UndefOr[FontFamily] = js.native
  var fontSize: js.UndefOr[FontSize[Double | String]] = js.native
  var fontWeight: js.UndefOr[FontWeight] = js.native
  var letterSpacing: js.UndefOr[LetterSpacing[Double | String]] = js.native
  var lineHeight: js.UndefOr[LineHeight[Double | String]] = js.native
  var textTransform: js.UndefOr[TextTransform] = js.native
}

object TypographyStyleOptions {
  @scala.inline
  def apply(): TypographyStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypographyStyleOptions]
  }
  @scala.inline
  implicit class TypographyStyleOptionsOps[Self <: TypographyStyleOptions] (val x: Self) extends AnyVal {
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
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFontFamily(value: FontFamily): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontSize(value: FontSize[Double | String]): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setFontWeight(value: FontWeight): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setLetterSpacing(value: LetterSpacing[Double | String]): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    @scala.inline
    def setLineHeight(value: LineHeight[Double | String]): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    @scala.inline
    def setTextTransform(value: TextTransform): Self = this.set("textTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextTransform: Self = this.set("textTransform", js.undefined)
  }
  
}

