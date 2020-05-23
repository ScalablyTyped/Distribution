package typings.leafletDraw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var error: String
  var tooltip: Cont
}

object Error {
  @scala.inline
  def apply(error: String, tooltip: Cont): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

