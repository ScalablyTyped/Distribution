package typings.atMaterialDashUiCore.stylesCreateTypographyMod

import typings.csstype.csstypeMod.ColorProperty
import typings.csstype.csstypeMod.FontFamilyProperty
import typings.csstype.csstypeMod.FontSizeProperty
import typings.csstype.csstypeMod.FontWeightProperty
import typings.csstype.csstypeMod.LetterSpacingProperty
import typings.csstype.csstypeMod.LineHeightProperty
import typings.csstype.csstypeMod.TextTransformProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties, 'fontFamily' | 'fontSize' | 'fontWeight' | 'color'>> & std.Partial<std.Pick<@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties, 'letterSpacing' | 'lineHeight' | 'textTransform'>> */
trait TypographyStyle extends js.Object {
  var color: ColorProperty
  var fontFamily: FontFamilyProperty
  var fontSize: FontSizeProperty[Double | String]
  var fontWeight: FontWeightProperty
  var letterSpacing: js.UndefOr[LetterSpacingProperty[Double | String]] = js.undefined
  var lineHeight: js.UndefOr[LineHeightProperty[Double | String]] = js.undefined
  var textTransform: js.UndefOr[TextTransformProperty] = js.undefined
}

object TypographyStyle {
  @scala.inline
  def apply(
    color: ColorProperty,
    fontFamily: FontFamilyProperty,
    fontSize: FontSizeProperty[Double | String],
    fontWeight: FontWeightProperty,
    letterSpacing: LetterSpacingProperty[Double | String] = null,
    lineHeight: LineHeightProperty[Double | String] = null,
    textTransform: TextTransformProperty = null
  ): TypographyStyle = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform)
    __obj.asInstanceOf[TypographyStyle]
  }
}

