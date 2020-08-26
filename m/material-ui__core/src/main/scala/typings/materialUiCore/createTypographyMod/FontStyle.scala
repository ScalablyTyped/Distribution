package typings.materialUiCore.createTypographyMod

import typings.csstype.mod.Property.FontFamily
import typings.csstype.mod.Property.FontWeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Required<{  fontFamily :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontFamily'],   fontSize :number,   fontWeightLight :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontWeight'],   fontWeightRegular :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontWeight'],   fontWeightMedium :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontWeight']}> */
@js.native
trait FontStyle extends js.Object {
  var fontFamily: FontFamily = js.native
  var fontSize: Double = js.native
  var fontWeightLight: FontWeight = js.native
  var fontWeightMedium: FontWeight = js.native
  var fontWeightRegular: FontWeight = js.native
}

object FontStyle {
  @scala.inline
  def apply(
    fontFamily: FontFamily,
    fontSize: Double,
    fontWeightLight: FontWeight,
    fontWeightMedium: FontWeight,
    fontWeightRegular: FontWeight
  ): FontStyle = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeightLight = fontWeightLight.asInstanceOf[js.Any], fontWeightMedium = fontWeightMedium.asInstanceOf[js.Any], fontWeightRegular = fontWeightRegular.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontStyle]
  }
  @scala.inline
  implicit class FontStyleOps[Self <: FontStyle] (val x: Self) extends AnyVal {
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
    def setFontFamily(value: FontFamily): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontWeightLight(value: FontWeight): Self = this.set("fontWeightLight", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontWeightMedium(value: FontWeight): Self = this.set("fontWeightMedium", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontWeightRegular(value: FontWeight): Self = this.set("fontWeightRegular", value.asInstanceOf[js.Any])
  }
  
}

