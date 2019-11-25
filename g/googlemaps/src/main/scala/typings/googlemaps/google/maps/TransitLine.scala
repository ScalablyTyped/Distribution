package typings.googlemaps.google.maps

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
    val __obj = js.Dynamic.literal(agencies = agencies.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], vehicle = vehicle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransitLine]
  }
}

