package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitVehicle extends js.Object {
  var icon: String
  var local_icon: String
  var name: String
  var `type`: VehicleType
}

object TransitVehicle {
  @scala.inline
  def apply(icon: String, local_icon: String, name: String, `type`: VehicleType): TransitVehicle = {
    val __obj = js.Dynamic.literal(icon = icon, local_icon = local_icon, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TransitVehicle]
  }
}

