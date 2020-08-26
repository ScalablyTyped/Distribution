package typings.mangopay2NodejsSdk.mod.bankAccount

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB
import typings.mangopay2NodejsSdk.mod.address.AddressType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GBDetails extends CreationDetails {
  /**
    * The account number of the bank account. Must be numbers only. GB account numbers must be 8 digits long.
    */
  var AccountNumber: String = js.native
  /**
    * The address of the owner of the bank account
    */
  var OwnerAddress: AddressType = js.native
  /**
    * The name of the owner of the bank account
    */
  var OwnerName: String = js.native
  /**
    * The sort code of the bank account. Must be numbers only, and 6 digits long
    */
  var SortCode: String = js.native
  var Type: GB = js.native
}

object GBDetails {
  @scala.inline
  def apply(AccountNumber: String, OwnerAddress: AddressType, OwnerName: String, SortCode: String, Type: GB): GBDetails = {
    val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], SortCode = SortCode.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[GBDetails]
  }
  @scala.inline
  implicit class GBDetailsOps[Self <: GBDetails] (val x: Self) extends AnyVal {
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
    def setOwnerAddress(value: AddressType): Self = this.set("OwnerAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerName(value: String): Self = this.set("OwnerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortCode(value: String): Self = this.set("SortCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: GB): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}

