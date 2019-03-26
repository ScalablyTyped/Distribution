package typings
package atMaterialDashUiCoreLib.stylesCreateTypographyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in @material-ui/core.@material-ui/core/styles/createTypography.ThemeStyle ]: @material-ui/core.@material-ui/core/styles/createTypography.TypographyStyle}
- Dropped {[ P in keyof @material-ui/core.Anon_FontFamily ]: -? @material-ui/core.Anon_FontFamily[P]} */ trait Typography extends TypographyUtils

object Typography {
  @scala.inline
  def apply(pxToRem: scala.Double => java.lang.String): Typography = {
    val __obj = js.Dynamic.literal(pxToRem = js.Any.fromFunction1(pxToRem))
  
    __obj.asInstanceOf[Typography]
  }
}

