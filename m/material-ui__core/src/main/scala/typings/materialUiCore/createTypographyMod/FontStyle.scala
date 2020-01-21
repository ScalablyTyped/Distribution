package typings.materialUiCore.createTypographyMod

import typings.csstype.mod.FontFamilyProperty
import typings.csstype.mod.FontWeightProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Required<{  fontFamily  :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontFamily'],   fontSize  :number,   fontWeightLight  :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontWeight'],   fontWeightRegular  :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontWeight'],   fontWeightMedium  :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontWeight']}> */
@js.native
trait FontStyle extends js.Object {
  var fontFamily: FontFamilyProperty = js.native
  var fontSize: Double = js.native
  var fontWeightLight: FontWeightProperty = js.native
  var fontWeightMedium: FontWeightProperty = js.native
  var fontWeightRegular: FontWeightProperty = js.native
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

