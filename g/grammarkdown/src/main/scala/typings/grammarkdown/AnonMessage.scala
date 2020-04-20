package typings.grammarkdown

import typings.grammarkdown.grammarkdownBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessage extends js.Object {
  var code: Double
  var message: String
  var warning: `true`
}

object AnonMessage {
  @scala.inline
  def apply(code: Double, message: String, warning: `true`): AnonMessage = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMessage]
  }
}

