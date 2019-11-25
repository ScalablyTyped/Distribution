package typings.grammarkdown

import typings.grammarkdown.grammarkdownNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CodeMessage extends js.Object {
  var code: Double
  var message: String
  var warning: `true`
}

object Anon_CodeMessage {
  @scala.inline
  def apply(code: Double, message: String, warning: `true`): Anon_CodeMessage = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CodeMessage]
  }
}

