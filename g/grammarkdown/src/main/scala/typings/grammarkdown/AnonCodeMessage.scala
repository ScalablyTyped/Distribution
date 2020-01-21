package typings.grammarkdown

import typings.grammarkdown.grammarkdownBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCodeMessage extends js.Object {
  var code: Double
  var message: String
  var warning: `true`
}

object AnonCodeMessage {
  @scala.inline
  def apply(code: Double, message: String, warning: `true`): AnonCodeMessage = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCodeMessage]
  }
}

