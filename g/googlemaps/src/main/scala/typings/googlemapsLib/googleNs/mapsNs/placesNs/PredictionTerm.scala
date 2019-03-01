package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PredictionTerm extends js.Object {
  var offset: scala.Double
  var value: java.lang.String
}

object PredictionTerm {
  @scala.inline
  def apply(offset: scala.Double, value: java.lang.String): PredictionTerm = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PredictionTerm]
  }
}

