package typings.leafletDashGeosearch.leafletDashGeosearchMod

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
    val __obj = js.Dynamic.literal(coordinates = coordinates)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BingProviderResultPoint]
  }
}

