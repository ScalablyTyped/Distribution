package typings.leafletGeosearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BingProviderResultPoint extends js.Object {
  var coordinates: PointTuple
  var `type`: String
}

object BingProviderResultPoint {
  @scala.inline
  def apply(coordinates: PointTuple, `type`: String): BingProviderResultPoint = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BingProviderResultPoint]
  }
}

