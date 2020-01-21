package typings.mapboxMapboxSdk.mapMatchingMod

import typings.mapboxGl.mod.LngLatLike
import typings.mapboxMapboxSdk.mapiRequestMod.DirectionsApproach
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  /**
    * Used to indicate how requested routes consider from which side of the road to approach a waypoint.
    */
  var approach: js.UndefOr[DirectionsApproach] = js.undefined
  var coordinates: LngLatLike
}

object Point {
  @scala.inline
  def apply(coordinates: LngLatLike, approach: DirectionsApproach = null): Point = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    if (approach != null) __obj.updateDynamic("approach")(approach.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

