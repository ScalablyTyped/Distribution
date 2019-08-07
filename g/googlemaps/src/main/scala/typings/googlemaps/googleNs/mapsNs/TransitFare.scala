package typings.googlemaps.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitFare extends js.Object {
  var currency: String
  var value: Double
}

object TransitFare {
  @scala.inline
  def apply(currency: String, value: Double): TransitFare = {
    val __obj = js.Dynamic.literal(currency = currency, value = value)
  
    __obj.asInstanceOf[TransitFare]
  }
}

