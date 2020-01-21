package typings.jestImageSnapshot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessage extends js.Object {
  var pass: Boolean
  def message(): String
}

object AnonMessage {
  @scala.inline
  def apply(message: () => String, pass: Boolean): AnonMessage = {
    val __obj = js.Dynamic.literal(message = js.Any.fromFunction0(message), pass = pass.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMessage]
  }
}

