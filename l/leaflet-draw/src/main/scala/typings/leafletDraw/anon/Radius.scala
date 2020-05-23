package typings.leafletDraw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Radius extends js.Object {
  var radius: String
  var tooltip: Start
}

object Radius {
  @scala.inline
  def apply(radius: String, tooltip: Start): Radius = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Radius]
  }
}

