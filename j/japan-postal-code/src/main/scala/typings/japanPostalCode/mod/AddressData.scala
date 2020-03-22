package typings.japanPostalCode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressData extends js.Object {
  var area: String
  var city: String
  var prefecture: String
  var street: String
}

object AddressData {
  @scala.inline
  def apply(area: String, city: String, prefecture: String, street: String): AddressData = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], prefecture = prefecture.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddressData]
  }
}

