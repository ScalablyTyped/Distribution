package typings.mangopay2NodejsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.address.AddressData> */
trait PartialAddressData extends js.Object {
  var AddressLine1: js.UndefOr[String] = js.undefined
  var AddressLine2: js.UndefOr[String] = js.undefined
  var City: js.UndefOr[String] = js.undefined
  var Country: js.UndefOr[String] = js.undefined
  var PostalCode: js.UndefOr[String] = js.undefined
  var Region: js.UndefOr[String] = js.undefined
}

object PartialAddressData {
  @scala.inline
  def apply(
    AddressLine1: String = null,
    AddressLine2: String = null,
    City: String = null,
    Country: String = null,
    PostalCode: String = null,
    Region: String = null
  ): PartialAddressData = {
    val __obj = js.Dynamic.literal()
    if (AddressLine1 != null) __obj.updateDynamic("AddressLine1")(AddressLine1.asInstanceOf[js.Any])
    if (AddressLine2 != null) __obj.updateDynamic("AddressLine2")(AddressLine2.asInstanceOf[js.Any])
    if (City != null) __obj.updateDynamic("City")(City.asInstanceOf[js.Any])
    if (Country != null) __obj.updateDynamic("Country")(Country.asInstanceOf[js.Any])
    if (PostalCode != null) __obj.updateDynamic("PostalCode")(PostalCode.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialAddressData]
  }
}

