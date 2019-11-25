package typings.googlemaps.google.maps

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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransitAgency]
  }
}

