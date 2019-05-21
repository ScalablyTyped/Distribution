package typings
package atMaterialDashUiCoreLib.stylesCreateTypographyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Required<{  fontFamily  :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontFamily'],   fontSize  :number,   fontWeightLight  :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontWeight'],   fontWeightRegular  :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontWeight'],   fontWeightMedium  :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontWeight']}> */
trait FontStyle extends js.Object {
  var fontFamily: csstypeLib.csstypeMod.FontFamilyProperty
  var fontSize: scala.Double
  var fontWeightLight: csstypeLib.csstypeMod.FontWeightProperty
  var fontWeightMedium: csstypeLib.csstypeMod.FontWeightProperty
  var fontWeightRegular: csstypeLib.csstypeMod.FontWeightProperty
}

object FontStyle {
  @scala.inline
  def apply(
    fontFamily: csstypeLib.csstypeMod.FontFamilyProperty,
    fontSize: scala.Double,
    fontWeightLight: csstypeLib.csstypeMod.FontWeightProperty,
    fontWeightMedium: csstypeLib.csstypeMod.FontWeightProperty,
    fontWeightRegular: csstypeLib.csstypeMod.FontWeightProperty
  ): FontStyle = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize, fontWeightLight = fontWeightLight.asInstanceOf[js.Any], fontWeightMedium = fontWeightMedium.asInstanceOf[js.Any], fontWeightRegular = fontWeightRegular.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FontStyle]
  }
}

