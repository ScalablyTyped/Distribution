package typings.jupyterlabServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  var code: String
  var cursor_pos: Double
}

object Code {
  @scala.inline
  def apply(code: String, cursor_pos: Double): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], cursor_pos = cursor_pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
}

