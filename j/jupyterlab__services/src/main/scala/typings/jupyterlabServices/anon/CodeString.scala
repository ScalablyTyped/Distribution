package typings.jupyterlabServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeString extends js.Object {
  var code: String
}

object CodeString {
  @scala.inline
  def apply(code: String): CodeString = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeString]
  }
}

