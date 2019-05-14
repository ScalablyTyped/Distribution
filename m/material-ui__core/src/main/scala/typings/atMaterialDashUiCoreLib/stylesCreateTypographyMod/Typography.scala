package typings
package atMaterialDashUiCoreLib.stylesCreateTypographyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Record<@material-ui/core.@material-ui/core/styles/createTypography.ThemeStyle, @material-ui/core.@material-ui/core/styles/createTypography.TypographyStyle> */
/* Inlined parent @material-ui/core.@material-ui/core/styles/createTypography.FontStyle */
/* Inlined parent @material-ui/core.@material-ui/core/styles/createTypography.TypographyUtils */
trait Typography extends js.Object {
  var body1: TypographyStyle
  var body2: TypographyStyle
  var button: TypographyStyle
  var caption: TypographyStyle
  var display1: TypographyStyle
  var display2: TypographyStyle
  var display3: TypographyStyle
  var display4: TypographyStyle
  var fontFamily: js.UndefOr[csstypeLib.csstypeMod.FontFamilyProperty]
  var fontSize: scala.Double
  var fontWeightLight: js.UndefOr[csstypeLib.csstypeMod.FontWeightProperty]
  var fontWeightMedium: js.UndefOr[csstypeLib.csstypeMod.FontWeightProperty]
  var fontWeightRegular: js.UndefOr[csstypeLib.csstypeMod.FontWeightProperty]
  var h1: TypographyStyle
  var h2: TypographyStyle
  var h3: TypographyStyle
  var h4: TypographyStyle
  var h5: TypographyStyle
  var h6: TypographyStyle
  var headline: TypographyStyle
  var overline: TypographyStyle
  var subheading: TypographyStyle
  var subtitle1: TypographyStyle
  var subtitle2: TypographyStyle
  var title: TypographyStyle
  def pxToRem(px: scala.Double): java.lang.String
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
    fontSize: scala.Double,
    h1: TypographyStyle,
    h2: TypographyStyle,
    h3: TypographyStyle,
    h4: TypographyStyle,
    h5: TypographyStyle,
    h6: TypographyStyle,
    headline: TypographyStyle,
    overline: TypographyStyle,
    pxToRem: scala.Double => java.lang.String,
    subheading: TypographyStyle,
    subtitle1: TypographyStyle,
    subtitle2: TypographyStyle,
    title: TypographyStyle,
    fontFamily: csstypeLib.csstypeMod.FontFamilyProperty = null,
    fontWeightLight: csstypeLib.csstypeMod.FontWeightProperty = null,
    fontWeightMedium: csstypeLib.csstypeMod.FontWeightProperty = null,
    fontWeightRegular: csstypeLib.csstypeMod.FontWeightProperty = null
  ): Typography = {
    val __obj = js.Dynamic.literal(body1 = body1, body2 = body2, button = button, caption = caption, display1 = display1, display2 = display2, display3 = display3, display4 = display4, fontSize = fontSize, h1 = h1, h2 = h2, h3 = h3, h4 = h4, h5 = h5, h6 = h6, headline = headline, overline = overline, pxToRem = js.Any.fromFunction1(pxToRem), subheading = subheading, subtitle1 = subtitle1, subtitle2 = subtitle2, title = title)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontWeightLight != null) __obj.updateDynamic("fontWeightLight")(fontWeightLight.asInstanceOf[js.Any])
    if (fontWeightMedium != null) __obj.updateDynamic("fontWeightMedium")(fontWeightMedium.asInstanceOf[js.Any])
    if (fontWeightRegular != null) __obj.updateDynamic("fontWeightRegular")(fontWeightRegular.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typography]
  }
}

