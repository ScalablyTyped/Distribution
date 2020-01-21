package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLatitudeLongitude extends js.Object {
  var Latitude: Double
  var Longitude: Double
}

object AnonLatitudeLongitude {
  @scala.inline
  def apply(Latitude: Double, Longitude: Double): AnonLatitudeLongitude = {
    val __obj = js.Dynamic.literal(Latitude = Latitude.asInstanceOf[js.Any], Longitude = Longitude.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLatitudeLongitude]
  }
}

