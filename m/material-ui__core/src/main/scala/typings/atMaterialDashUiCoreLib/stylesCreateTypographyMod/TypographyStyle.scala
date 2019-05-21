package typings
package atMaterialDashUiCoreLib.stylesCreateTypographyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties, 'fontFamily' | 'fontSize' | 'fontWeight' | 'color'>> & std.Partial<std.Pick<@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties, 'letterSpacing' | 'lineHeight' | 'textTransform'>> */
trait TypographyStyle extends js.Object {
  var color: csstypeLib.csstypeMod.ColorProperty
  var fontFamily: csstypeLib.csstypeMod.FontFamilyProperty
  var fontSize: csstypeLib.csstypeMod.FontSizeProperty[scala.Double | java.lang.String]
  var fontWeight: csstypeLib.csstypeMod.FontWeightProperty
  var letterSpacing: js.UndefOr[csstypeLib.csstypeMod.LetterSpacingProperty[scala.Double | java.lang.String]] = js.undefined
  var lineHeight: js.UndefOr[csstypeLib.csstypeMod.LineHeightProperty[scala.Double | java.lang.String]] = js.undefined
  var textTransform: js.UndefOr[csstypeLib.csstypeMod.TextTransformProperty] = js.undefined
}

object TypographyStyle {
  @scala.inline
  def apply(
    color: csstypeLib.csstypeMod.ColorProperty,
    fontFamily: csstypeLib.csstypeMod.FontFamilyProperty,
    fontSize: csstypeLib.csstypeMod.FontSizeProperty[scala.Double | java.lang.String],
    fontWeight: csstypeLib.csstypeMod.FontWeightProperty,
    letterSpacing: csstypeLib.csstypeMod.LetterSpacingProperty[scala.Double | java.lang.String] = null,
    lineHeight: csstypeLib.csstypeMod.LineHeightProperty[scala.Double | java.lang.String] = null,
    textTransform: csstypeLib.csstypeMod.TextTransformProperty = null
  ): TypographyStyle = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform)
    __obj.asInstanceOf[TypographyStyle]
  }
}

