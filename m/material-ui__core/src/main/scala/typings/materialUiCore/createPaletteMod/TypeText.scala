package typings.materialUiCore.createPaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeText extends js.Object {
  var disabled: String = js.native
  var hint: String = js.native
  var primary: String = js.native
  var secondary: String = js.native
}

object TypeText {
  @scala.inline
  def apply(disabled: String, hint: String, primary: String, secondary: String): TypeText = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], hint = hint.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeText]
  }
}

