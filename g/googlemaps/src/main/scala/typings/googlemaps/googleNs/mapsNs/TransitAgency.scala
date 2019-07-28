package typings.googlemaps.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitAgency extends js.Object {
  var name: String
  var phone: String
  var url: String
}

object TransitAgency {
  @scala.inline
  def apply(name: String, phone: String, url: String): TransitAgency = {
    val __obj = js.Dynamic.literal(name = name, phone = phone, url = url)
  
    __obj.asInstanceOf[TransitAgency]
  }
}

