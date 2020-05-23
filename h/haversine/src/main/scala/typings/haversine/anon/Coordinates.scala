package typings.haversine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coordinates extends js.Object {
  var coordinates: js.Array[Double]
}

object Coordinates {
  @scala.inline
  def apply(coordinates: js.Array[Double]): Coordinates = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinates]
  }
}

