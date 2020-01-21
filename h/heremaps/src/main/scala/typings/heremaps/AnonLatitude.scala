package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLatitude extends js.Object {
  var latitude: Double
  var longitude: Double
}

object AnonLatitude {
  @scala.inline
  def apply(latitude: Double, longitude: Double): AnonLatitude = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLatitude]
  }
}

