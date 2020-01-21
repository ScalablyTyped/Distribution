package typings.materialUiCore.createTypographyMod

import typings.csstype.mod.ColorProperty
import typings.csstype.mod.FontFamilyProperty
import typings.csstype.mod.FontSizeProperty
import typings.csstype.mod.FontWeightProperty
import typings.csstype.mod.LetterSpacingProperty
import typings.csstype.mod.LineHeightProperty
import typings.csstype.mod.TextTransformProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@material-ui/core.@material-ui/core/styles/createTypography.TypographyStyle> */
@js.native
trait TypographyStyleOptions extends js.Object {
  var color: js.UndefOr[ColorProperty] = js.native
  var fontFamily: js.UndefOr[FontFamilyProperty] = js.native
  var fontSize: js.UndefOr[FontSizeProperty[Double | String]] = js.native
  var fontWeight: js.UndefOr[FontWeightProperty] = js.native
  var letterSpacing: js.UndefOr[LetterSpacingProperty[Double | String]] = js.native
  var lineHeight: js.UndefOr[LineHeightProperty[Double | String]] = js.native
  var textTransform: js.UndefOr[TextTransformProperty] = js.native
}

object TypographyStyleOptions {
  @scala.inline
  def apply(
    color: ColorProperty = null,
    fontFamily: FontFamilyProperty = null,
    fontSize: FontSizeProperty[Double | String] = null,
    fontWeight: FontWeightProperty = null,
    letterSpacing: LetterSpacingProperty[Double | String] = null,
    lineHeight: LineHeightProperty[Double | String] = null,
    textTransform: TextTransformProperty = null
  ): TypographyStyleOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypographyStyleOptions]
  }
}

