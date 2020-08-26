package typings.mangopay2NodejsSdk.mod.bankAccount

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US
import typings.mangopay2NodejsSdk.mod.address.AddressType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait USDetails extends CreationDetails {
  /**
    * The ABA of the bank account. Must be numbers only, and 9 digits long
    */
  var ABA: String = js.native
  /**
    * The account number of the bank account. US account numbers must be digits only.
    */
  var AccountNumber: String = js.native
  /**
    * The type of account
    */
  var DepositAccountType: js.UndefOr[typings.mangopay2NodejsSdk.mod.bankAccount.DepositAccountType] = js.native
  /**
    * The address of the owner of the bank account
    */
  var OwnerAddress: AddressType = js.native
  /**
    * The name of the owner of the bank account
    */
  var OwnerName: String = js.native
  var Type: US = js.native
}

object USDetails {
  @scala.inline
  def apply(ABA: String, AccountNumber: String, OwnerAddress: AddressType, OwnerName: String, Type: US): USDetails = {
    val __obj = js.Dynamic.literal(ABA = ABA.asInstanceOf[js.Any], AccountNumber = AccountNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[USDetails]
  }
  @scala.inline
  implicit class USDetailsOps[Self <: USDetails] (val x: Self) extends AnyVal {
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
    def setABA(value: String): Self = this.set("ABA", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccountNumber(value: String): Self = this.set("AccountNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerAddress(value: AddressType): Self = this.set("OwnerAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerName(value: String): Self = this.set("OwnerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: US): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepositAccountType(value: DepositAccountType): Self = this.set("DepositAccountType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepositAccountType: Self = this.set("DepositAccountType", js.undefined)
  }
  
}

