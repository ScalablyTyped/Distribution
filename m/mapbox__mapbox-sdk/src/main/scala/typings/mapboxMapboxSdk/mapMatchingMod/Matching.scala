package typings.mapboxMapboxSdk.mapMatchingMod

import typings.mapboxMapboxSdk.directionsMod.Leg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matching extends js.Object {
  /**
    * a number between 0 (low) and 1 (high) indicating level of confidence in the returned match
    */
  var confidence: Double = js.native
  var distance: Double = js.native
  var duration: Double = js.native
  var geometry: String = js.native
  var legs: js.Array[Leg] = js.native
  var weight: Double = js.native
  var weight_name: String = js.native
}

object Matching {
  @scala.inline
  def apply(
    confidence: Double,
    distance: Double,
    duration: Double,
    geometry: String,
    legs: js.Array[Leg],
    weight: Double,
    weight_name: String
  ): Matching = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], legs = legs.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any], weight_name = weight_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matching]
  }
  @scala.inline
  implicit class MatchingOps[Self <: Matching] (val x: Self) extends AnyVal {
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
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeometry(value: String): Self = this.set("geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def setLegsVarargs(value: Leg*): Self = this.set("legs", js.Array(value :_*))
    @scala.inline
    def setLegs(value: js.Array[Leg]): Self = this.set("legs", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeight_name(value: String): Self = this.set("weight_name", value.asInstanceOf[js.Any])
  }
  
}

