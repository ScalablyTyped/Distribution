package typings.mapboxMapboxSdk.optimizationMod

import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.unlimited
import typings.mapboxMapboxSdk.mapiRequestMod.DirectionsApproach
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimizationWaypoint extends js.Object {
  /**
    * Used to indicate how requested routes consider from which side of the road to approach the waypoint.
    */
  var approach: js.UndefOr[DirectionsApproach] = js.undefined
  /**
    * Used to filter the road segment the waypoint will be placed on by direction and dictates the angle of approach.
    * This option should always be used in conjunction with a `radius`. The first value is an angle clockwise from true north between 0 and 360,
    * and the second is the range of degrees the angle can deviate by.
    */
  var bearing: js.UndefOr[js.Array[Double]] = js.undefined
  var coordinates: Double
  /**
    * Maximum distance in meters that the coordinate is allowed to move when snapped to a nearby road segment.
    */
  var radius: js.UndefOr[Double | unlimited] = js.undefined
}

object OptimizationWaypoint {
  @scala.inline
  def apply(
    coordinates: Double,
    approach: DirectionsApproach = null,
    bearing: js.Array[Double] = null,
    radius: Double | unlimited = null
  ): OptimizationWaypoint = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    if (approach != null) __obj.updateDynamic("approach")(approach.asInstanceOf[js.Any])
    if (bearing != null) __obj.updateDynamic("bearing")(bearing.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimizationWaypoint]
  }
}

