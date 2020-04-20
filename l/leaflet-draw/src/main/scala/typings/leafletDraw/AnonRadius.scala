package typings.leafletDraw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRadius extends js.Object {
  var radius: String
  var tooltip: AnonStart
}

object AnonRadius {
  @scala.inline
  def apply(radius: String, tooltip: AnonStart): AnonRadius = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRadius]
  }
}

