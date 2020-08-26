package typings.mangopay2NodejsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.address.AddressData> */
@js.native
trait PartialAddressData extends js.Object {
  var AddressLine1: js.UndefOr[String] = js.native
  var AddressLine2: js.UndefOr[String] = js.native
  var City: js.UndefOr[String] = js.native
  var Country: js.UndefOr[String] = js.native
  var PostalCode: js.UndefOr[String] = js.native
  var Region: js.UndefOr[String] = js.native
}

object PartialAddressData {
  @scala.inline
  def apply(): PartialAddressData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAddressData]
  }
  @scala.inline
  implicit class PartialAddressDataOps[Self <: PartialAddressData] (val x: Self) extends AnyVal {
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
    def deleteAddressLine1: Self = this.set("AddressLine1", js.undefined)
    @scala.inline
    def setAddressLine2(value: String): Self = this.set("AddressLine2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressLine2: Self = this.set("AddressLine2", js.undefined)
    @scala.inline
    def setCity(value: String): Self = this.set("City", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCity: Self = this.set("City", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("Country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("Country", js.undefined)
    @scala.inline
    def setPostalCode(value: String): Self = this.set("PostalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostalCode: Self = this.set("PostalCode", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("Region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
  }
  
}

