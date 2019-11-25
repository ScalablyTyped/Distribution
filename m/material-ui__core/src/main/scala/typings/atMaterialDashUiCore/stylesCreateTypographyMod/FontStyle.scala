package typings.atMaterialDashUiCore.stylesCreateTypographyMod

import typings.csstype.csstypeMod.FontFamilyProperty
import typings.csstype.csstypeMod.FontWeightProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Required<{  fontFamily  :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontFamily'],   fontSize  :number,   fontWeightLight  :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontWeight'],   fontWeightRegular  :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontWeight'],   fontWeightMedium  :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontWeight']}> */
trait FontStyle extends js.Object {
  var fontFamily: FontFamilyProperty
  var fontSize: Double
  var fontWeightLight: FontWeightProperty
  var fontWeightMedium: FontWeightProperty
  var fontWeightRegular: FontWeightProperty
}

object FontStyle {
  @scala.inline
  def apply(
    fontFamily: FontFamilyProperty,
    fontSize: Double,
    fontWeightLight: FontWeightProperty,
    fontWeightMedium: FontWeightProperty,
    fontWeightRegular: FontWeightProperty
  ): FontStyle = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeightLight = fontWeightLight.asInstanceOf[js.Any], fontWeightMedium = fontWeightMedium.asInstanceOf[js.Any], fontWeightRegular = fontWeightRegular.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FontStyle]
  }
}

