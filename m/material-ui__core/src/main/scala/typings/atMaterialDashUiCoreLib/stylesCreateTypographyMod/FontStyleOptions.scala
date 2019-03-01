package typings
package atMaterialDashUiCoreLib.stylesCreateTypographyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof @material-ui/core.@material-ui/core/styles/createTypography.FontStyle ]:? @material-ui/core.@material-ui/core/styles/createTypography.FontStyle[P]} */ trait FontStyleOptions extends js.Object {
  var allVariants: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var htmlFontSize: js.UndefOr[scala.Double] = js.undefined
  var useNextVariants: js.UndefOr[scala.Boolean] = js.undefined
}

object FontStyleOptions {
  @scala.inline
  def apply(
    allVariants: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    htmlFontSize: scala.Int | scala.Double = null,
    useNextVariants: js.UndefOr[scala.Boolean] = js.undefined
  ): FontStyleOptions = {
    val __obj = js.Dynamic.literal()
    if (allVariants != null) __obj.updateDynamic("allVariants")(allVariants)
    if (htmlFontSize != null) __obj.updateDynamic("htmlFontSize")(htmlFontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(useNextVariants)) __obj.updateDynamic("useNextVariants")(useNextVariants)
    __obj.asInstanceOf[FontStyleOptions]
  }
}

