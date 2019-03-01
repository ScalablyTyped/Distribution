package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitStop extends js.Object {
  var location: LatLng
  var name: java.lang.String
}

object TransitStop {
  @scala.inline
  def apply(location: LatLng, name: java.lang.String): TransitStop = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[TransitStop]
  }
}

