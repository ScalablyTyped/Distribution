package typings.mapsjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor extends js.Object {
  var color: String
  var thickness: Double
}

object AnonColor {
  @scala.inline
  def apply(color: String, thickness: Double): AnonColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColor]
  }
}

