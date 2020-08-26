package typings.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Intersection extends js.Object {
  /**
    * A list of bearing values (for example [0,90,180,270]) that are available at the intersection.
    * The bearings describe all available roads at the intersection.
    */
  var bearings: js.Array[Double] = js.native
  /**
    * An array of strings signifying the classes of the road exiting the intersection.
    */
  var classes: js.UndefOr[js.Array[DirectionsClass]] = js.native
  /**
    * A list of entry flags, corresponding in a 1:1 relationship to the bearings.
    * A value of true indicates that the respective road could be entered on a valid route.
    * false indicates that the turn onto the respective road would violate a restriction.
    */
  var entry: js.Array[Boolean] = js.native
  /**
    * Index into bearings/entry array. Used to calculate the bearing before the turn. Namely, the clockwise angle from true
    * north to the direction of travel before the maneuver/passing the intersection. To get the bearing in the direction of driving,
    * the bearing has to be rotated by a value of 180. The value is not supplied for departure maneuvers.
    */
  var in: js.UndefOr[Double] = js.native
  /**
    * Array of Lane objects that represent the available turn lanes at the intersection.
    * If no lane information is available for an intersection, the lanes property will not be present.
    */
  var lanes: js.Array[Lane] = js.native
  /**
    * A [longitude, latitude] pair describing the location of the turn.
    */
  var location: js.Array[Double] = js.native
  /**
    * Index into the bearings/entry array. Used to extract the bearing after the turn. Namely, The clockwise angle from true north to
    * the direction of travel after the maneuver/passing the intersection.
    * The value is not supplied for arrive maneuvers.
    */
  var out: js.UndefOr[Double] = js.native
}

object Intersection {
  @scala.inline
  def apply(
    bearings: js.Array[Double],
    entry: js.Array[Boolean],
    lanes: js.Array[Lane],
    location: js.Array[Double]
  ): Intersection = {
    val __obj = js.Dynamic.literal(bearings = bearings.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Intersection]
  }
  @scala.inline
  implicit class IntersectionOps[Self <: Intersection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBearingsVarargs(value: Double*): Self = this.set("bearings", js.Array(value :_*))
    @scala.inline
    def setBearings(value: js.Array[Double]): Self = this.set("bearings", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntryVarargs(value: Boolean*): Self = this.set("entry", js.Array(value :_*))
    @scala.inline
    def setEntry(value: js.Array[Boolean]): Self = this.set("entry", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanesVarargs(value: Lane*): Self = this.set("lanes", js.Array(value :_*))
    @scala.inline
    def setLanes(value: js.Array[Lane]): Self = this.set("lanes", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationVarargs(value: Double*): Self = this.set("location", js.Array(value :_*))
    @scala.inline
    def setLocation(value: js.Array[Double]): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassesVarargs(value: DirectionsClass*): Self = this.set("classes", js.Array(value :_*))
    @scala.inline
    def setClasses(value: js.Array[DirectionsClass]): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setIn(value: Double): Self = this.set("in", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIn: Self = this.set("in", js.undefined)
    @scala.inline
    def setOut(value: Double): Self = this.set("out", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOut: Self = this.set("out", js.undefined)
  }
  
}

