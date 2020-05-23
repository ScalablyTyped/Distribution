package typings.loopback.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Throws extends js.Object {
  var throws: Boolean
  var validate: Boolean
}

object Throws {
  @scala.inline
  def apply(throws: Boolean, validate: Boolean): Throws = {
    val __obj = js.Dynamic.literal(throws = throws.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Throws]
  }
}

