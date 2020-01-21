package typings.mapboxMapboxSdk.mapMatchingMod

import typings.mapboxMapboxSdk.directionsMod.Leg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matching extends js.Object {
  /**
    * a number between 0 (low) and 1 (high) indicating level of confidence in the returned match
    */
  var confidence: Double
  var distance: Double
  var duration: Double
  var geometry: String
  var legs: js.Array[Leg]
  var weight: Double
  var weight_name: String
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
}

