package typings
package atMaterialDashUiCoreLib.stylesCreateTypographyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Required<{  fontFamily  :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontFamily'],   fontSize  :number,   fontWeightLight  :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontWeight'],   fontWeightRegular  :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontWeight'],   fontWeightMedium  :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontWeight']}> */
trait FontStyle extends js.Object {
  var fontFamily: js.UndefOr[csstypeLib.csstypeMod.FontFamilyProperty]
  var fontSize: scala.Double
  var fontWeightLight: js.UndefOr[csstypeLib.csstypeMod.FontWeightProperty]
  var fontWeightMedium: js.UndefOr[csstypeLib.csstypeMod.FontWeightProperty]
  var fontWeightRegular: js.UndefOr[csstypeLib.csstypeMod.FontWeightProperty]
}

object FontStyle {
  @scala.inline
  def apply(
    fontSize: scala.Double,
    fontFamily: csstypeLib.csstypeMod.FontFamilyProperty = null,
    fontWeightLight: csstypeLib.csstypeMod.FontWeightProperty = null,
    fontWeightMedium: csstypeLib.csstypeMod.FontWeightProperty = null,
    fontWeightRegular: csstypeLib.csstypeMod.FontWeightProperty = null
  ): FontStyle = {
    val __obj = js.Dynamic.literal(fontSize = fontSize)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontWeightLight != null) __obj.updateDynamic("fontWeightLight")(fontWeightLight.asInstanceOf[js.Any])
    if (fontWeightMedium != null) __obj.updateDynamic("fontWeightMedium")(fontWeightMedium.asInstanceOf[js.Any])
    if (fontWeightRegular != null) __obj.updateDynamic("fontWeightRegular")(fontWeightRegular.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontStyle]
  }
}

