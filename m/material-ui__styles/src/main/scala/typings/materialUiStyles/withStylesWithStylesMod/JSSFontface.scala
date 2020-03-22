package typings.materialUiStyles.withStylesWithStylesMod

import typings.csstype.mod.FontFace
import typings.csstype.mod.FontFaceFontDisplayProperty
import typings.csstype.mod.FontFaceFontFeatureSettingsProperty
import typings.csstype.mod.FontFaceFontStretchProperty
import typings.csstype.mod.FontFaceFontStyleProperty
import typings.csstype.mod.FontFaceFontVariantProperty
import typings.csstype.mod.FontFaceFontVariationSettingsProperty
import typings.csstype.mod.FontFaceFontWeightProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined csstype.csstype.FontFace & {  fallbacks ? :std.Array<csstype.csstype.FontFace>} */
trait JSSFontface extends js.Object {
  var MozFontFeatureSettings: js.UndefOr[FontFaceFontFeatureSettingsProperty] = js.undefined
  var fallbacks: js.UndefOr[js.Array[FontFace]] = js.undefined
  var fontDisplay: js.UndefOr[FontFaceFontDisplayProperty] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontFeatureSettings: js.UndefOr[FontFaceFontFeatureSettingsProperty] = js.undefined
  var fontStretch: js.UndefOr[FontFaceFontStretchProperty] = js.undefined
  var fontStyle: js.UndefOr[FontFaceFontStyleProperty] = js.undefined
  var fontVariant: js.UndefOr[FontFaceFontVariantProperty] = js.undefined
  var fontVariationSettings: js.UndefOr[FontFaceFontVariationSettingsProperty] = js.undefined
  var fontWeight: js.UndefOr[FontFaceFontWeightProperty] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var unicodeRange: js.UndefOr[String] = js.undefined
}

object JSSFontface {
  @scala.inline
  def apply(
    MozFontFeatureSettings: FontFaceFontFeatureSettingsProperty = null,
    fallbacks: js.Array[FontFace] = null,
    fontDisplay: FontFaceFontDisplayProperty = null,
    fontFamily: String = null,
    fontFeatureSettings: FontFaceFontFeatureSettingsProperty = null,
    fontStretch: FontFaceFontStretchProperty = null,
    fontStyle: FontFaceFontStyleProperty = null,
    fontVariant: FontFaceFontVariantProperty = null,
    fontVariationSettings: FontFaceFontVariationSettingsProperty = null,
    fontWeight: FontFaceFontWeightProperty = null,
    src: String = null,
    unicodeRange: String = null
  ): JSSFontface = {
    val __obj = js.Dynamic.literal()
    if (MozFontFeatureSettings != null) __obj.updateDynamic("MozFontFeatureSettings")(MozFontFeatureSettings.asInstanceOf[js.Any])
    if (fallbacks != null) __obj.updateDynamic("fallbacks")(fallbacks.asInstanceOf[js.Any])
    if (fontDisplay != null) __obj.updateDynamic("fontDisplay")(fontDisplay.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontFeatureSettings != null) __obj.updateDynamic("fontFeatureSettings")(fontFeatureSettings.asInstanceOf[js.Any])
    if (fontStretch != null) __obj.updateDynamic("fontStretch")(fontStretch.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant.asInstanceOf[js.Any])
    if (fontVariationSettings != null) __obj.updateDynamic("fontVariationSettings")(fontVariationSettings.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (unicodeRange != null) __obj.updateDynamic("unicodeRange")(unicodeRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSSFontface]
  }
}

