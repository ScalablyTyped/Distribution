package typings.mangopay2NodejsSdk.mod.address

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressData extends _AddressType {
  var AddressLine1: String
  var AddressLine2: String
  var City: String
  var Country: String
  var PostalCode: String
  var Region: String
}

object AddressData {
  @scala.inline
  def apply(
    AddressLine1: String,
    AddressLine2: String,
    City: String,
    Country: String,
    PostalCode: String,
    Region: String
  ): AddressData = {
    val __obj = js.Dynamic.literal(AddressLine1 = AddressLine1.asInstanceOf[js.Any], AddressLine2 = AddressLine2.asInstanceOf[js.Any], City = City.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], PostalCode = PostalCode.asInstanceOf[js.Any], Region = Region.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressData]
  }
}

