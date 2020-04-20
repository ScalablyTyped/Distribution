package typings.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValidate extends js.Object {
  var validate: Boolean
}

object AnonValidate {
  @scala.inline
  def apply(validate: Boolean): AnonValidate = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValidate]
  }
}

