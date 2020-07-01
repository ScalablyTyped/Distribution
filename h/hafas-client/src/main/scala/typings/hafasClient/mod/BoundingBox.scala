package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundingBox extends js.Object {
  var east: Double
  var north: Double
  var south: Double
  var west: Double
}

object BoundingBox {
  @scala.inline
  def apply(east: Double, north: Double, south: Double, west: Double): BoundingBox = {
    val __obj = js.Dynamic.literal(east = east.asInstanceOf[js.Any], north = north.asInstanceOf[js.Any], south = south.asInstanceOf[js.Any], west = west.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingBox]
  }
}

