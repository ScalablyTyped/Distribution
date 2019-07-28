package typings.atMaterialDashUiCore.stylesCreateTypographyMod

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import typings.csstype.csstypeMod.FontFamilyProperty
import typings.csstype.csstypeMod.FontWeightProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@material-ui/core.@material-ui/core/styles/createTypography.FontStyle> */
trait FontStyleOptions extends js.Object {
  var allVariants: js.UndefOr[CSSProperties] = js.undefined
  var fontFamily: js.UndefOr[FontFamilyProperty] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var fontWeightLight: js.UndefOr[FontWeightProperty] = js.undefined
  var fontWeightMedium: js.UndefOr[FontWeightProperty] = js.undefined
  var fontWeightRegular: js.UndefOr[FontWeightProperty] = js.undefined
  var htmlFontSize: js.UndefOr[Double] = js.undefined
  var useNextVariants: js.UndefOr[Boolean] = js.undefined
}

object FontStyleOptions {
  @scala.inline
  def apply(
    allVariants: CSSProperties = null,
    fontFamily: FontFamilyProperty = null,
    fontSize: Int | Double = null,
    fontWeightLight: FontWeightProperty = null,
    fontWeightMedium: FontWeightProperty = null,
    fontWeightRegular: FontWeightProperty = null,
    htmlFontSize: Int | Double = null,
    useNextVariants: js.UndefOr[Boolean] = js.undefined
  ): FontStyleOptions = {
    val __obj = js.Dynamic.literal()
    if (allVariants != null) __obj.updateDynamic("allVariants")(allVariants)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontWeightLight != null) __obj.updateDynamic("fontWeightLight")(fontWeightLight.asInstanceOf[js.Any])
    if (fontWeightMedium != null) __obj.updateDynamic("fontWeightMedium")(fontWeightMedium.asInstanceOf[js.Any])
    if (fontWeightRegular != null) __obj.updateDynamic("fontWeightRegular")(fontWeightRegular.asInstanceOf[js.Any])
    if (htmlFontSize != null) __obj.updateDynamic("htmlFontSize")(htmlFontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(useNextVariants)) __obj.updateDynamic("useNextVariants")(useNextVariants)
    __obj.asInstanceOf[FontStyleOptions]
  }
}

