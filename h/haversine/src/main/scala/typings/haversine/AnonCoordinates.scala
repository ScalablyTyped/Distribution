package typings.haversine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCoordinates extends js.Object {
  var coordinates: js.Array[Double]
}

object AnonCoordinates {
  @scala.inline
  def apply(coordinates: js.Array[Double]): AnonCoordinates = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCoordinates]
  }
}

