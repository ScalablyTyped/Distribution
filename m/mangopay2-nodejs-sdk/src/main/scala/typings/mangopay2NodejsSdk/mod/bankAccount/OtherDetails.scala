package typings.mangopay2NodejsSdk.mod.bankAccount

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
import typings.mangopay2NodejsSdk.mod.address.AddressType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OtherDetails extends CreationDetails {
  /**
    * The account number of the bank account. Must be numbers only. Canadian account numbers must be a maximum of 20 digits.
    */
  var AccountNumber: String = js.native
  /**
    * The BIC of the bank account
    */
  var BIC: String = js.native
  /**
    * The Country of the Address
    */
  var Country: String = js.native
  /**
    * The address of the owner of the bank account
    */
  var OwnerAddress: AddressType = js.native
  /**
    * The name of the owner of the bank account
    */
  var OwnerName: String = js.native
  var Type: OTHER = js.native
}

object OtherDetails {
  @scala.inline
  def apply(
    AccountNumber: String,
    BIC: String,
    Country: String,
    OwnerAddress: AddressType,
    OwnerName: String,
    Type: OTHER
  ): OtherDetails = {
    val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], BIC = BIC.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherDetails]
  }
  @scala.inline
  implicit class OtherDetailsOps[Self <: OtherDetails] (val x: Self) extends AnyVal {
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
    def setAccountNumber(value: String): Self = this.set("AccountNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setBIC(value: String): Self = this.set("BIC", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry(value: String): Self = this.set("Country", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerAddress(value: AddressType): Self = this.set("OwnerAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerName(value: String): Self = this.set("OwnerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: OTHER): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}

