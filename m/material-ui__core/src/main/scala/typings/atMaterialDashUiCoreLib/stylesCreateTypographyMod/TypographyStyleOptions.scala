package typings
package atMaterialDashUiCoreLib.stylesCreateTypographyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@material-ui/core.@material-ui/core/styles/createTypography.TypographyStyle> */
trait TypographyStyleOptions extends js.Object {
  var color: js.UndefOr[csstypeLib.csstypeMod.ColorProperty] = js.undefined
  var fontFamily: js.UndefOr[csstypeLib.csstypeMod.FontFamilyProperty] = js.undefined
  var fontSize: js.UndefOr[csstypeLib.csstypeMod.FontSizeProperty[scala.Double | java.lang.String]] = js.undefined
  var fontWeight: js.UndefOr[csstypeLib.csstypeMod.FontWeightProperty] = js.undefined
  var letterSpacing: js.UndefOr[csstypeLib.csstypeMod.LetterSpacingProperty[scala.Double | java.lang.String]] = js.undefined
  var lineHeight: js.UndefOr[csstypeLib.csstypeMod.LineHeightProperty[scala.Double | java.lang.String]] = js.undefined
  var textTransform: js.UndefOr[csstypeLib.csstypeMod.TextTransformProperty] = js.undefined
}

object TypographyStyleOptions {
  @scala.inline
  def apply(
    color: csstypeLib.csstypeMod.ColorProperty = null,
    fontFamily: csstypeLib.csstypeMod.FontFamilyProperty = null,
    fontSize: csstypeLib.csstypeMod.FontSizeProperty[scala.Double | java.lang.String] = null,
    fontWeight: csstypeLib.csstypeMod.FontWeightProperty = null,
    letterSpacing: csstypeLib.csstypeMod.LetterSpacingProperty[scala.Double | java.lang.String] = null,
    lineHeight: csstypeLib.csstypeMod.LineHeightProperty[scala.Double | java.lang.String] = null,
    textTransform: csstypeLib.csstypeMod.TextTransformProperty = null
  ): TypographyStyleOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform)
    __obj.asInstanceOf[TypographyStyleOptions]
  }
}

