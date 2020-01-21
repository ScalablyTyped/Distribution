package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAccountBusinessInformation extends js.Object {
  /**
    * The address of the business.
    */
  var address: js.UndefOr[SchemaAccountAddress] = js.native
  /**
    * The customer service information of the business.
    */
  var customerService: js.UndefOr[SchemaAccountCustomerService] = js.native
  /**
    * The phone number of the business.
    */
  var phoneNumber: js.UndefOr[String] = js.native
}

object SchemaAccountBusinessInformation {
  @scala.inline
  def apply(
    address: SchemaAccountAddress = null,
    customerService: SchemaAccountCustomerService = null,
    phoneNumber: String = null
  ): SchemaAccountBusinessInformation = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (customerService != null) __obj.updateDynamic("customerService")(customerService.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccountBusinessInformation]
  }
}

