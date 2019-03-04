package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitLine extends js.Object {
  var agencies: js.Array[TransitAgency]
  var color: java.lang.String
  var icon: java.lang.String
  var name: java.lang.String
  var short_name: java.lang.String
  var text_color: java.lang.String
  var url: java.lang.String
  var vehicle: TransitVehicle
}

object TransitLine {
  @scala.inline
  def apply(
    agencies: js.Array[TransitAgency],
    color: java.lang.String,
    icon: java.lang.String,
    name: java.lang.String,
    short_name: java.lang.String,
    text_color: java.lang.String,
    url: java.lang.String,
    vehicle: TransitVehicle
  ): TransitLine = {
    val __obj = js.Dynamic.literal(agencies = agencies, color = color, icon = icon, name = name, short_name = short_name, text_color = text_color, url = url, vehicle = vehicle)
  
    __obj.asInstanceOf[TransitLine]
  }
}

