package typings.materialUiCore.createTypographyMod

import typings.csstype.mod.FontFamilyProperty
import typings.csstype.mod.FontWeightProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var fontFamily: FontFamilyProperty = js.native
  var fontSize: Double = js.native
  var fontWeightLight: FontWeightProperty = js.native
  var fontWeightMedium: FontWeightProperty = js.native
  var fontWeightRegular: FontWeightProperty = js.native
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
    fontFamily: FontFamilyProperty,
    fontSize: Double,
    fontWeightLight: FontWeightProperty,
    fontWeightMedium: FontWeightProperty,
    fontWeightRegular: FontWeightProperty,
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
}

