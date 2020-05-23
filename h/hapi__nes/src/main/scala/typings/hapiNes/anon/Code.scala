package typings.hapiNes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  var code: Double
  var explanation: String
  var reason: String
  var wasClean: Boolean
}

object Code {
  @scala.inline
  def apply(code: Double, explanation: String, reason: String, wasClean: Boolean): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], explanation = explanation.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], wasClean = wasClean.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
}

