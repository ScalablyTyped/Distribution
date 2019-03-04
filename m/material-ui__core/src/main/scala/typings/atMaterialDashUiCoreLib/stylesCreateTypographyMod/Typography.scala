package typings
package atMaterialDashUiCoreLib.stylesCreateTypographyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in @material-ui/core.@material-ui/core/styles/createTypography.ThemeStyle ]: @material-ui/core.@material-ui/core/styles/createTypography.TypographyStyle}
- Dropped {[ P in keyof {  fontFamily  :csstype.csstype.FontFamilyProperty | undefined,   fontSize  :number,   fontWeightLight  :csstype.csstype.FontWeightProperty | undefined,   fontWeightRegular  :csstype.csstype.FontWeightProperty | undefined,   fontWeightMedium  :csstype.csstype.FontWeightProperty | undefined} ]: -? {  fontFamily  :csstype.csstype.FontFamilyProperty | undefined,   fontSize  :number,   fontWeightLight  :csstype.csstype.FontWeightProperty | undefined,   fontWeightRegular  :csstype.csstype.FontWeightProperty | undefined,   fontWeightMedium  :csstype.csstype.FontWeightProperty | undefined}[P]} */ trait Typography extends TypographyUtils

object Typography {
  @scala.inline
  def apply(pxToRem: js.Function1[scala.Double, java.lang.String]): Typography = {
    val __obj = js.Dynamic.literal(pxToRem = pxToRem)
  
    __obj.asInstanceOf[Typography]
  }
}

