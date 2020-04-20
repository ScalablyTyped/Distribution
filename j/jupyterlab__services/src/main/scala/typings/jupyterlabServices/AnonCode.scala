package typings.jupyterlabServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCode extends js.Object {
  var code: String
  var cursor_pos: Double
}

object AnonCode {
  @scala.inline
  def apply(code: String, cursor_pos: Double): AnonCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], cursor_pos = cursor_pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCode]
  }
}

