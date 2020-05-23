package typings.grammarkdown.anon

import typings.grammarkdown.grammarkdownBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var code: Double
  var message: String
  var warning: `true`
}

object Message {
  @scala.inline
  def apply(code: Double, message: String, warning: `true`): Message = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

