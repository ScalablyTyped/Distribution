package typings.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentRestrictions extends js.Object {
  var country: String | js.Array[String]
}

object ComponentRestrictions {
  @scala.inline
  def apply(country: String | js.Array[String]): ComponentRestrictions = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentRestrictions]
  }
}

