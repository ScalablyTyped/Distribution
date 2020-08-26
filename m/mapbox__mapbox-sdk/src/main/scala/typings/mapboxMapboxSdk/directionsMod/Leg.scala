package typings.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Leg extends js.Object {
  /**
    * An annotations object that contains additional details about each line segment along the route geometry.
    * Each entry in an annotations field corresponds to a coordinate along the route geometry.
    */
  var annotation: js.Array[DirectionsAnnotation] = js.native
  /**
    * Number indicating the distance traveled in meters
    */
  var distance: Double = js.native
  /**
    * Number indicating the estimated travel time in seconds
    */
  var duration: Double = js.native
  /**
    * Depending on the steps parameter, either an Array of RouteStep objects (true, default) or an empty array (false)
    */
  var steps: js.Array[Step] = js.native
  /**
    * Depending on the summary parameter, either a String summarizing the route (true, default) or an empty String (false)
    */
  var summary: String = js.native
  var weight: Double = js.native
}

object Leg {
  @scala.inline
  def apply(
    annotation: js.Array[DirectionsAnnotation],
    distance: Double,
    duration: Double,
    steps: js.Array[Step],
    summary: String,
    weight: Double
  ): Leg = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Leg]
  }
  @scala.inline
  implicit class LegOps[Self <: Leg] (val x: Self) extends AnyVal {
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
    def setAnnotationVarargs(value: DirectionsAnnotation*): Self = this.set("annotation", js.Array(value :_*))
    @scala.inline
    def setAnnotation(value: js.Array[DirectionsAnnotation]): Self = this.set("annotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepsVarargs(value: Step*): Self = this.set("steps", js.Array(value :_*))
    @scala.inline
    def setSteps(value: js.Array[Step]): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
  }
  
}

