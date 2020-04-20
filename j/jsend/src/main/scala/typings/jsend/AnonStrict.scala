package typings.jsend

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStrict extends js.Object {
  var strict: Boolean
}

object AnonStrict {
  @scala.inline
  def apply(strict: Boolean): AnonStrict = {
    val __obj = js.Dynamic.literal(strict = strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStrict]
  }
}

