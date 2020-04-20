package typings.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonThrows extends js.Object {
  var throws: Boolean
  var validate: Boolean
}

object AnonThrows {
  @scala.inline
  def apply(throws: Boolean, validate: Boolean): AnonThrows = {
    val __obj = js.Dynamic.literal(throws = throws.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonThrows]
  }
}

