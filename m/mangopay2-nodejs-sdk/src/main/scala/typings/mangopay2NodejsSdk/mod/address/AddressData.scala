package typings.mangopay2NodejsSdk.mod.address

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressData extends _AddressType {
  var AddressLine1: String = js.native
  var AddressLine2: String = js.native
  var City: String = js.native
  var Country: String = js.native
  var PostalCode: String = js.native
  var Region: String = js.native
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
  @scala.inline
  implicit class AddressDataOps[Self <: AddressData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddressLine1(value: String): Self = this.set("AddressLine1", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddressLine2(value: String): Self = this.set("AddressLine2", value.asInstanceOf[js.Any])
    @scala.inline
    def setCity(value: String): Self = this.set("City", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry(value: String): Self = this.set("Country", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostalCode(value: String): Self = this.set("PostalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: String): Self = this.set("Region", value.asInstanceOf[js.Any])
  }
  
}

