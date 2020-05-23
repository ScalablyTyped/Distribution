package typings.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Longitude extends js.Object {
  var Latitude: Double
  var Longitude: Double
}

object Longitude {
  @scala.inline
  def apply(Latitude: Double, Longitude: Double): Longitude = {
    val __obj = js.Dynamic.literal(Latitude = Latitude.asInstanceOf[js.Any], Longitude = Longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Longitude]
  }
}

