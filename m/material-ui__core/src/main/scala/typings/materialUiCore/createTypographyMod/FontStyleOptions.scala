package typings.materialUiCore.createTypographyMod

import typings.csstype.mod.FontFamilyProperty
import typings.csstype.mod.FontWeightProperty
import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@material-ui/core.@material-ui/core/styles/createTypography.FontStyle> */
@js.native
trait FontStyleOptions extends js.Object {
  var allVariants: js.UndefOr[CSSProperties] = js.native
  var fontFamily: js.UndefOr[FontFamilyProperty] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var fontWeightLight: js.UndefOr[FontWeightProperty] = js.native
  var fontWeightMedium: js.UndefOr[FontWeightProperty] = js.native
  var fontWeightRegular: js.UndefOr[FontWeightProperty] = js.native
  var htmlFontSize: js.UndefOr[Double] = js.native
  var useNextVariants: js.UndefOr[Boolean] = js.native
}

object FontStyleOptions {
  @scala.inline
  def apply(
    allVariants: CSSProperties = null,
    fontFamily: FontFamilyProperty = null,
    fontSize: js.UndefOr[Double] = js.undefined,
    fontWeightLight: FontWeightProperty = null,
    fontWeightMedium: FontWeightProperty = null,
    fontWeightRegular: FontWeightProperty = null,
    htmlFontSize: js.UndefOr[Double] = js.undefined,
    useNextVariants: js.UndefOr[Boolean] = js.undefined
  ): FontStyleOptions = {
    val __obj = js.Dynamic.literal()
    if (allVariants != null) __obj.updateDynamic("allVariants")(allVariants.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (fontWeightLight != null) __obj.updateDynamic("fontWeightLight")(fontWeightLight.asInstanceOf[js.Any])
    if (fontWeightMedium != null) __obj.updateDynamic("fontWeightMedium")(fontWeightMedium.asInstanceOf[js.Any])
    if (fontWeightRegular != null) __obj.updateDynamic("fontWeightRegular")(fontWeightRegular.asInstanceOf[js.Any])
    if (!js.isUndefined(htmlFontSize)) __obj.updateDynamic("htmlFontSize")(htmlFontSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useNextVariants)) __obj.updateDynamic("useNextVariants")(useNextVariants.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontStyleOptions]
  }
}

