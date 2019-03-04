package typings
package atMaterialDashUiCoreLib.stylesCreatePaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeText extends js.Object {
  var disabled: java.lang.String
  var hint: java.lang.String
  var primary: java.lang.String
  var secondary: java.lang.String
}

object TypeText {
  @scala.inline
  def apply(
    disabled: java.lang.String,
    hint: java.lang.String,
    primary: java.lang.String,
    secondary: java.lang.String
  ): TypeText = {
    val __obj = js.Dynamic.literal(disabled = disabled, hint = hint, primary = primary, secondary = secondary)
  
    __obj.asInstanceOf[TypeText]
  }
}

