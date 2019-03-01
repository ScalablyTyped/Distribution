package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitAgency extends js.Object {
  var name: java.lang.String
  var phone: java.lang.String
  var url: java.lang.String
}

object TransitAgency {
  @scala.inline
  def apply(name: java.lang.String, phone: java.lang.String, url: java.lang.String): TransitAgency = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("phone")(phone)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[TransitAgency]
  }
}

