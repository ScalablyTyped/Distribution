package typings.materialUiCore.createTypographyMod

import typings.csstype.mod.Property.FontFamily
import typings.csstype.mod.Property.FontWeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Record<@material-ui/core.@material-ui/core/styles/createTypography.ThemeStyle, @material-ui/core.@material-ui/core/styles/createTypography.TypographyStyle> */
/* Inlined parent @material-ui/core.@material-ui/core/styles/createTypography.FontStyle */
/* Inlined parent @material-ui/core.@material-ui/core/styles/createTypography.TypographyUtils */
@js.native
trait Typography extends js.Object {
  var body1: TypographyStyle = js.native
  var body2: TypographyStyle = js.native
  var button: TypographyStyle = js.native
  var caption: TypographyStyle = js.native
  var display1: TypographyStyle = js.native
  var display2: TypographyStyle = js.native
  var display3: TypographyStyle = js.native
  var display4: TypographyStyle = js.native
  var fontFamily: FontFamily = js.native
  var fontSize: Double = js.native
  var fontWeightLight: FontWeight = js.native
  var fontWeightMedium: FontWeight = js.native
  var fontWeightRegular: FontWeight = js.native
  var h1: TypographyStyle = js.native
  var h2: TypographyStyle = js.native
  var h3: TypographyStyle = js.native
  var h4: TypographyStyle = js.native
  var h5: TypographyStyle = js.native
  var h6: TypographyStyle = js.native
  var headline: TypographyStyle = js.native
  var overline: TypographyStyle = js.native
  var subheading: TypographyStyle = js.native
  var subtitle1: TypographyStyle = js.native
  var subtitle2: TypographyStyle = js.native
  var title: TypographyStyle = js.native
  def pxToRem(px: Double): String = js.native
}

object Typography {
  @scala.inline
  def apply(
    body1: TypographyStyle,
    body2: TypographyStyle,
    button: TypographyStyle,
    caption: TypographyStyle,
    display1: TypographyStyle,
    display2: TypographyStyle,
    display3: TypographyStyle,
    display4: TypographyStyle,
    fontFamily: FontFamily,
    fontSize: Double,
    fontWeightLight: FontWeight,
    fontWeightMedium: FontWeight,
    fontWeightRegular: FontWeight,
    h1: TypographyStyle,
    h2: TypographyStyle,
    h3: TypographyStyle,
    h4: TypographyStyle,
    h5: TypographyStyle,
    h6: TypographyStyle,
    headline: TypographyStyle,
    overline: TypographyStyle,
    pxToRem: Double => String,
    subheading: TypographyStyle,
    subtitle1: TypographyStyle,
    subtitle2: TypographyStyle,
    title: TypographyStyle
  ): Typography = {
    val __obj = js.Dynamic.literal(body1 = body1.asInstanceOf[js.Any], body2 = body2.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], display1 = display1.asInstanceOf[js.Any], display2 = display2.asInstanceOf[js.Any], display3 = display3.asInstanceOf[js.Any], display4 = display4.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeightLight = fontWeightLight.asInstanceOf[js.Any], fontWeightMedium = fontWeightMedium.asInstanceOf[js.Any], fontWeightRegular = fontWeightRegular.asInstanceOf[js.Any], h1 = h1.asInstanceOf[js.Any], h2 = h2.asInstanceOf[js.Any], h3 = h3.asInstanceOf[js.Any], h4 = h4.asInstanceOf[js.Any], h5 = h5.asInstanceOf[js.Any], h6 = h6.asInstanceOf[js.Any], headline = headline.asInstanceOf[js.Any], overline = overline.asInstanceOf[js.Any], pxToRem = js.Any.fromFunction1(pxToRem), subheading = subheading.asInstanceOf[js.Any], subtitle1 = subtitle1.asInstanceOf[js.Any], subtitle2 = subtitle2.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typography]
  }
  @scala.inline
  implicit class TypographyOps[Self <: Typography] (val x: Self) extends AnyVal {
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
    def setBody1(value: TypographyStyle): Self = this.set("body1", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody2(value: TypographyStyle): Self = this.set("body2", value.asInstanceOf[js.Any])
    @scala.inline
    def setButton(value: TypographyStyle): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaption(value: TypographyStyle): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplay1(value: TypographyStyle): Self = this.set("display1", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplay2(value: TypographyStyle): Self = this.set("display2", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplay3(value: TypographyStyle): Self = this.set("display3", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplay4(value: TypographyStyle): Self = this.set("display4", value.asInstanceOf[js.Any])
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
    @scala.inline
    def setH1(value: TypographyStyle): Self = this.set("h1", value.asInstanceOf[js.Any])
    @scala.inline
    def setH2(value: TypographyStyle): Self = this.set("h2", value.asInstanceOf[js.Any])
    @scala.inline
    def setH3(value: TypographyStyle): Self = this.set("h3", value.asInstanceOf[js.Any])
    @scala.inline
    def setH4(value: TypographyStyle): Self = this.set("h4", value.asInstanceOf[js.Any])
    @scala.inline
    def setH5(value: TypographyStyle): Self = this.set("h5", value.asInstanceOf[js.Any])
    @scala.inline
    def setH6(value: TypographyStyle): Self = this.set("h6", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeadline(value: TypographyStyle): Self = this.set("headline", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverline(value: TypographyStyle): Self = this.set("overline", value.asInstanceOf[js.Any])
    @scala.inline
    def setPxToRem(value: Double => String): Self = this.set("pxToRem", js.Any.fromFunction1(value))
    @scala.inline
    def setSubheading(value: TypographyStyle): Self = this.set("subheading", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubtitle1(value: TypographyStyle): Self = this.set("subtitle1", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubtitle2(value: TypographyStyle): Self = this.set("subtitle2", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: TypographyStyle): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

