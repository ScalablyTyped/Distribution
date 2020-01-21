package typings.materialUiCore.createTypographyMod

import typings.csstype.mod.FontFamilyProperty
import typings.csstype.mod.FontWeightProperty
import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<std.Record<@material-ui/core.@material-ui/core/styles/createTypography.ThemeStyle, @material-ui/core.@material-ui/core/styles/createTypography.TypographyStyleOptions> & @material-ui/core.@material-ui/core/styles/createTypography.FontStyleOptions> */
@js.native
trait TypographyOptions extends js.Object {
  var allVariants: js.UndefOr[CSSProperties] = js.native
  var body1: js.UndefOr[TypographyStyleOptions] = js.native
  var body2: js.UndefOr[TypographyStyleOptions] = js.native
  var button: js.UndefOr[TypographyStyleOptions] = js.native
  var caption: js.UndefOr[TypographyStyleOptions] = js.native
  var display1: js.UndefOr[TypographyStyleOptions] = js.native
  var display2: js.UndefOr[TypographyStyleOptions] = js.native
  var display3: js.UndefOr[TypographyStyleOptions] = js.native
  var display4: js.UndefOr[TypographyStyleOptions] = js.native
  var fontFamily: js.UndefOr[FontFamilyProperty] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var fontWeightLight: js.UndefOr[FontWeightProperty] = js.native
  var fontWeightMedium: js.UndefOr[FontWeightProperty] = js.native
  var fontWeightRegular: js.UndefOr[FontWeightProperty] = js.native
  var h1: js.UndefOr[TypographyStyleOptions] = js.native
  var h2: js.UndefOr[TypographyStyleOptions] = js.native
  var h3: js.UndefOr[TypographyStyleOptions] = js.native
  var h4: js.UndefOr[TypographyStyleOptions] = js.native
  var h5: js.UndefOr[TypographyStyleOptions] = js.native
  var h6: js.UndefOr[TypographyStyleOptions] = js.native
  var headline: js.UndefOr[TypographyStyleOptions] = js.native
  var htmlFontSize: js.UndefOr[Double] = js.native
  var overline: js.UndefOr[TypographyStyleOptions] = js.native
  var subheading: js.UndefOr[TypographyStyleOptions] = js.native
  var subtitle1: js.UndefOr[TypographyStyleOptions] = js.native
  var subtitle2: js.UndefOr[TypographyStyleOptions] = js.native
  var title: js.UndefOr[TypographyStyleOptions] = js.native
  var useNextVariants: js.UndefOr[Boolean] = js.native
}

object TypographyOptions {
  @scala.inline
  def apply(
    allVariants: CSSProperties = null,
    body1: TypographyStyleOptions = null,
    body2: TypographyStyleOptions = null,
    button: TypographyStyleOptions = null,
    caption: TypographyStyleOptions = null,
    display1: TypographyStyleOptions = null,
    display2: TypographyStyleOptions = null,
    display3: TypographyStyleOptions = null,
    display4: TypographyStyleOptions = null,
    fontFamily: FontFamilyProperty = null,
    fontSize: Int | Double = null,
    fontWeightLight: FontWeightProperty = null,
    fontWeightMedium: FontWeightProperty = null,
    fontWeightRegular: FontWeightProperty = null,
    h1: TypographyStyleOptions = null,
    h2: TypographyStyleOptions = null,
    h3: TypographyStyleOptions = null,
    h4: TypographyStyleOptions = null,
    h5: TypographyStyleOptions = null,
    h6: TypographyStyleOptions = null,
    headline: TypographyStyleOptions = null,
    htmlFontSize: Int | Double = null,
    overline: TypographyStyleOptions = null,
    subheading: TypographyStyleOptions = null,
    subtitle1: TypographyStyleOptions = null,
    subtitle2: TypographyStyleOptions = null,
    title: TypographyStyleOptions = null,
    useNextVariants: js.UndefOr[Boolean] = js.undefined
  ): TypographyOptions = {
    val __obj = js.Dynamic.literal()
    if (allVariants != null) __obj.updateDynamic("allVariants")(allVariants.asInstanceOf[js.Any])
    if (body1 != null) __obj.updateDynamic("body1")(body1.asInstanceOf[js.Any])
    if (body2 != null) __obj.updateDynamic("body2")(body2.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (display1 != null) __obj.updateDynamic("display1")(display1.asInstanceOf[js.Any])
    if (display2 != null) __obj.updateDynamic("display2")(display2.asInstanceOf[js.Any])
    if (display3 != null) __obj.updateDynamic("display3")(display3.asInstanceOf[js.Any])
    if (display4 != null) __obj.updateDynamic("display4")(display4.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontWeightLight != null) __obj.updateDynamic("fontWeightLight")(fontWeightLight.asInstanceOf[js.Any])
    if (fontWeightMedium != null) __obj.updateDynamic("fontWeightMedium")(fontWeightMedium.asInstanceOf[js.Any])
    if (fontWeightRegular != null) __obj.updateDynamic("fontWeightRegular")(fontWeightRegular.asInstanceOf[js.Any])
    if (h1 != null) __obj.updateDynamic("h1")(h1.asInstanceOf[js.Any])
    if (h2 != null) __obj.updateDynamic("h2")(h2.asInstanceOf[js.Any])
    if (h3 != null) __obj.updateDynamic("h3")(h3.asInstanceOf[js.Any])
    if (h4 != null) __obj.updateDynamic("h4")(h4.asInstanceOf[js.Any])
    if (h5 != null) __obj.updateDynamic("h5")(h5.asInstanceOf[js.Any])
    if (h6 != null) __obj.updateDynamic("h6")(h6.asInstanceOf[js.Any])
    if (headline != null) __obj.updateDynamic("headline")(headline.asInstanceOf[js.Any])
    if (htmlFontSize != null) __obj.updateDynamic("htmlFontSize")(htmlFontSize.asInstanceOf[js.Any])
    if (overline != null) __obj.updateDynamic("overline")(overline.asInstanceOf[js.Any])
    if (subheading != null) __obj.updateDynamic("subheading")(subheading.asInstanceOf[js.Any])
    if (subtitle1 != null) __obj.updateDynamic("subtitle1")(subtitle1.asInstanceOf[js.Any])
    if (subtitle2 != null) __obj.updateDynamic("subtitle2")(subtitle2.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(useNextVariants)) __obj.updateDynamic("useNextVariants")(useNextVariants.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypographyOptions]
  }
}

