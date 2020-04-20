package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFound extends js.Object {
  var found: Boolean
  var index: Double
}

object AnonFound {
  @scala.inline
  def apply(found: Boolean, index: Double): AnonFound = {
    val __obj = js.Dynamic.literal(found = found.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFound]
  }
}

