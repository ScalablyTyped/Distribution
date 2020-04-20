package typings.gun

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrString extends js.Object {
  var err: String
}

object AnonErrString {
  @scala.inline
  def apply(err: String): AnonErrString = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrString]
  }
}

