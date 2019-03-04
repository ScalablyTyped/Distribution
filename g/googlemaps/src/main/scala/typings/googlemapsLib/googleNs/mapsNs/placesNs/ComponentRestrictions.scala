package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentRestrictions extends js.Object {
  var country: java.lang.String | js.Array[java.lang.String]
}

object ComponentRestrictions {
  @scala.inline
  def apply(country: java.lang.String | js.Array[java.lang.String]): ComponentRestrictions = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ComponentRestrictions]
  }
}

