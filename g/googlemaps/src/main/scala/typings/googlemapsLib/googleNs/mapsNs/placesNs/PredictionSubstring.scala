package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PredictionSubstring extends js.Object {
  var length: scala.Double
  var offset: scala.Double
}

object PredictionSubstring {
  @scala.inline
  def apply(length: scala.Double, offset: scala.Double): PredictionSubstring = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[PredictionSubstring]
  }
}

