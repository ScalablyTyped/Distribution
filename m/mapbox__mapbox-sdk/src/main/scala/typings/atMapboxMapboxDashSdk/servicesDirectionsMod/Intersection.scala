package typings.atMapboxMapboxDashSdk.servicesDirectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Intersection extends js.Object {
  /**
    * A list of bearing values (for example [0,90,180,270]) that are available at the intersection.
    * The bearings describe all available roads at the intersection.
    */
  var bearings: js.Array[Double]
  /**
    * An array of strings signifying the classes of the road exiting the intersection.
    */
  var classes: js.UndefOr[js.Array[DirectionsClass]] = js.undefined
  /**
    * A list of entry flags, corresponding in a 1:1 relationship to the bearings.
    * A value of true indicates that the respective road could be entered on a valid route.
    * false indicates that the turn onto the respective road would violate a restriction.
    */
  var entry: js.Array[Boolean]
  /**
    * Index into bearings/entry array. Used to calculate the bearing before the turn. Namely, the clockwise angle from true
    * north to the direction of travel before the maneuver/passing the intersection. To get the bearing in the direction of driving,
    * the bearing has to be rotated by a value of 180. The value is not supplied for departure maneuvers.
    */
  var in: js.UndefOr[Double] = js.undefined
  /**
    * Array of Lane objects that represent the available turn lanes at the intersection.
    * If no lane information is available for an intersection, the lanes property will not be present.
    */
  var lanes: js.Array[Lane]
  /**
    * A [longitude, latitude] pair describing the location of the turn.
    */
  var location: js.Array[Double]
  /**
    * Index into the bearings/entry array. Used to extract the bearing after the turn. Namely, The clockwise angle from true north to
    * the direction of travel after the maneuver/passing the intersection.
    * The value is not supplied for arrive maneuvers.
    */
  var out: js.UndefOr[Double] = js.undefined
}

object Intersection {
  @scala.inline
  def apply(
    bearings: js.Array[Double],
    entry: js.Array[Boolean],
    lanes: js.Array[Lane],
    location: js.Array[Double],
    classes: js.Array[DirectionsClass] = null,
    in: Int | Double = null,
    out: Int | Double = null
  ): Intersection = {
    val __obj = js.Dynamic.literal(bearings = bearings, entry = entry, lanes = lanes, location = location)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (in != null) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (out != null) __obj.updateDynamic("out")(out.asInstanceOf[js.Any])
    __obj.asInstanceOf[Intersection]
  }
}

