package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitVehicle extends js.Object {
  var icon: java.lang.String
  var local_icon: java.lang.String
  var name: java.lang.String
  var `type`: VehicleType
}

object TransitVehicle {
  @scala.inline
  def apply(icon: java.lang.String, local_icon: java.lang.String, name: java.lang.String, `type`: VehicleType): TransitVehicle = {
    val __obj = js.Dynamic.literal(icon = icon, local_icon = local_icon, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TransitVehicle]
  }
}

