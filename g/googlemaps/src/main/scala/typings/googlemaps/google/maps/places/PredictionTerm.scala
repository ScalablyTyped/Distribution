package typings.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PredictionTerm extends js.Object {
  var offset: Double
  var value: String
}

object PredictionTerm {
  @scala.inline
  def apply(offset: Double, value: String): PredictionTerm = {
    val __obj = js.Dynamic.literal(offset = offset, value = value)
  
    __obj.asInstanceOf[PredictionTerm]
  }
}

