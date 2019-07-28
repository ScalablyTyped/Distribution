package typings.googlemaps.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitLine extends js.Object {
  var agencies: js.Array[TransitAgency]
  var color: String
  var icon: String
  var name: String
  var short_name: String
  var text_color: String
  var url: String
  var vehicle: TransitVehicle
}

object TransitLine {
  @scala.inline
  def apply(
    agencies: js.Array[TransitAgency],
    color: String,
    icon: String,
    name: String,
    short_name: String,
    text_color: String,
    url: String,
    vehicle: TransitVehicle
  ): TransitLine = {
    val __obj = js.Dynamic.literal(agencies = agencies, color = color, icon = icon, name = name, short_name = short_name, text_color = text_color, url = url, vehicle = vehicle)
  
    __obj.asInstanceOf[TransitLine]
  }
}

