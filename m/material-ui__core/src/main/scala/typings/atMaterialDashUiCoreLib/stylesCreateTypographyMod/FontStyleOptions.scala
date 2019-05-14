package typings
package atMaterialDashUiCoreLib.stylesCreateTypographyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@material-ui/core.@material-ui/core/styles/createTypography.FontStyle> */
trait FontStyleOptions extends js.Object {
  var allVariants: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var fontFamily: js.UndefOr[csstypeLib.csstypeMod.FontFamilyProperty] = js.undefined
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  var fontWeightLight: js.UndefOr[csstypeLib.csstypeMod.FontWeightProperty] = js.undefined
  var fontWeightMedium: js.UndefOr[csstypeLib.csstypeMod.FontWeightProperty] = js.undefined
  var fontWeightRegular: js.UndefOr[csstypeLib.csstypeMod.FontWeightProperty] = js.undefined
  var htmlFontSize: js.UndefOr[scala.Double] = js.undefined
  var useNextVariants: js.UndefOr[scala.Boolean] = js.undefined
}

object FontStyleOptions {
  @scala.inline
  def apply(
    allVariants: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    fontFamily: csstypeLib.csstypeMod.FontFamilyProperty = null,
    fontSize: scala.Int | scala.Double = null,
    fontWeightLight: csstypeLib.csstypeMod.FontWeightProperty = null,
    fontWeightMedium: csstypeLib.csstypeMod.FontWeightProperty = null,
    fontWeightRegular: csstypeLib.csstypeMod.FontWeightProperty = null,
    htmlFontSize: scala.Int | scala.Double = null,
    useNextVariants: js.UndefOr[scala.Boolean] = js.undefined
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

