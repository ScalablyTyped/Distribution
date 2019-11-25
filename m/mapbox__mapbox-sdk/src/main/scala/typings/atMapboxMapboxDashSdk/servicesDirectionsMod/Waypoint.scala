package typings.atMapboxMapboxDashSdk.servicesDirectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Waypoint extends js.Object {
  /**
    * Used to filter the road segment the waypoint will be placed on by direction and dictates the angle of approach.
    * This option should always be used in conjunction with the  radiuses parameter. The parameter takes two values per waypoint.
    * The first value is an angle clockwise from true north between 0 and 360, and the second is the range of degrees the angle can deviate by.
    * The recommended value for the range is 45° or 90°, as bearing measurements tend to be inaccurate.
    * This is useful for making sure the new routes of rerouted vehicles continue traveling in their current direction.
    * A request that does this would provide bearing and radius values for the first waypoint and leave the remaining values empty.
    * If provided, the list of bearings must be the same length as the list of waypoints.
    * However, you can skip a coordinate and show its position in the list with the  ; separator.
    */
  var bearing: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Array of [ longitude, latitude ] for the snapped coordinate.
    */
  var location: js.Array[Double]
  /**
    * String with the name of the way the coordinate snapped to.
    */
  var name: String
  /**
    * Custom names for waypoints used for the arrival instruction in banners and voice instructions, each separated by  ; .
    * Values can be any string and total number of all characters cannot exceed 500. If provided, the list of waypoint_names must be the same
    * length as the list of waypoints, but you can skip a coordinate and show its position with the  ; separator.
    */
  var waypointName: js.UndefOr[String] = js.undefined
}

object Waypoint {
  @scala.inline
  def apply(
    location: js.Array[Double],
    name: String,
    bearing: js.Array[Double] = null,
    waypointName: String = null
  ): Waypoint = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (bearing != null) __obj.updateDynamic("bearing")(bearing.asInstanceOf[js.Any])
    if (waypointName != null) __obj.updateDynamic("waypointName")(waypointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Waypoint]
  }
}

