package typings.jsData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFound extends js.Object {
  var found: Boolean
  var index: js.Any
}

object AnonFound {
  @scala.inline
  def apply(found: Boolean, index: js.Any): AnonFound = {
    val __obj = js.Dynamic.literal(found = found.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFound]
  }
}

