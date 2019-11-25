package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitStop extends js.Object {
  var location: LatLng
  var name: String
}

object TransitStop {
  @scala.inline
  def apply(location: LatLng, name: String): TransitStop = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransitStop]
  }
}

