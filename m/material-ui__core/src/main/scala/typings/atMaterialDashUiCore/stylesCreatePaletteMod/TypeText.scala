package typings.atMaterialDashUiCore.stylesCreatePaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeText extends js.Object {
  var disabled: String
  var hint: String
  var primary: String
  var secondary: String
}

object TypeText {
  @scala.inline
  def apply(disabled: String, hint: String, primary: String, secondary: String): TypeText = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], hint = hint.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeText]
  }
}

