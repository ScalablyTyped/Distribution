package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLongitude extends js.Object {
  var Latitude: Double
  var Longitude: Double
}

object AnonLongitude {
  @scala.inline
  def apply(Latitude: Double, Longitude: Double): AnonLongitude = {
    val __obj = js.Dynamic.literal(Latitude = Latitude.asInstanceOf[js.Any], Longitude = Longitude.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLongitude]
  }
}

