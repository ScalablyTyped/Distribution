package typings.leafletDraw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var error: String
  var tooltip: AnonCont
}

object AnonError {
  @scala.inline
  def apply(error: String, tooltip: AnonCont): AnonError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonError]
  }
}

