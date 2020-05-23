package typings.localizedCountries.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  var code: String
  var label: String
}

object Code {
  @scala.inline
  def apply(code: String, label: String): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
}

