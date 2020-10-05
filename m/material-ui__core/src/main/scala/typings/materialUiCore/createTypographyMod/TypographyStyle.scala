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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties, 'fontFamily' | 'fontSize' | 'fontWeight' | 'color'>> & std.Partial<std.Pick<@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties, 'letterSpacing' | 'lineHeight' | 'textTransform'>> */
@js.native
trait TypographyStyle extends js.Object {
  var color: Color = js.native
  var fontFamily: FontFamily = js.native
  var fontSize: FontSize[Double | String] = js.native
  var fontWeight: FontWeight = js.native
  var letterSpacing: js.UndefOr[LetterSpacing[Double | String]] = js.native
  var lineHeight: js.UndefOr[LineHeight[Double | String]] = js.native
  var textTransform: js.UndefOr[TextTransform] = js.native
}

object TypographyStyle {
  @scala.inline
  def apply(color: Color, fontFamily: FontFamily, fontSize: FontSize[Double | String], fontWeight: FontWeight): TypographyStyle = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypographyStyle]
  }
  @scala.inline
  implicit class TypographyStyleOps[Self <: TypographyStyle] (val x: Self) extends AnyVal {
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
    def setFontFamily(value: FontFamily): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSize(value: FontSize[Double | String]): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontWeight(value: FontWeight): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
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

