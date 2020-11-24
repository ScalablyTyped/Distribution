package typings.materialUiCore.createTypographyMod

import typings.csstype.mod.ColorProperty
import typings.csstype.mod.FontFamilyProperty
import typings.csstype.mod.FontSizeProperty
import typings.csstype.mod.FontWeightProperty
import typings.csstype.mod.LetterSpacingProperty
import typings.csstype.mod.LineHeightProperty
import typings.csstype.mod.TextTransformProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@material-ui/core.@material-ui/core/styles/createTypography.TypographyStyle> */
@js.native
trait TypographyStyleOptions extends js.Object {
  
  var color: js.UndefOr[ColorProperty] = js.native
  
  var fontFamily: js.UndefOr[FontFamilyProperty] = js.native
  
  var fontSize: js.UndefOr[FontSizeProperty[Double | String]] = js.native
  
  var fontWeight: js.UndefOr[FontWeightProperty] = js.native
  
  var letterSpacing: js.UndefOr[LetterSpacingProperty[Double | String]] = js.native
  
  var lineHeight: js.UndefOr[LineHeightProperty[Double | String]] = js.native
  
  var textTransform: js.UndefOr[TextTransformProperty] = js.native
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
    def setColor(value: ColorProperty): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFontFamily(value: FontFamilyProperty): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: FontSizeProperty[Double | String]): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontWeight(value: FontWeightProperty): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: LetterSpacingProperty[Double | String]): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    
    @scala.inline
    def setLineHeight(value: LineHeightProperty[Double | String]): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    
    @scala.inline
    def setTextTransform(value: TextTransformProperty): Self = this.set("textTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextTransform: Self = this.set("textTransform", js.undefined)
  }
}
