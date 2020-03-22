package typings.mangopay2NodejsSdk.mod.bankAccount

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US
import typings.mangopay2NodejsSdk.mod.address.AddressType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait USDetails extends CreationDetails {
  /**
    * The ABA of the bank account. Must be numbers only, and 9 digits long
    */
  var ABA: String
  /**
    * The account number of the bank account. US account numbers must be digits only.
    */
  var AccountNumber: String
  /**
    * The type of account
    */
  var DepositAccountType: js.UndefOr[typings.mangopay2NodejsSdk.mod.bankAccount.DepositAccountType] = js.undefined
  /**
    * The address of the owner of the bank account
    */
  var OwnerAddress: AddressType
  /**
    * The name of the owner of the bank account
    */
  var OwnerName: String
  var Type: US
}

object USDetails {
  @scala.inline
  def apply(
    ABA: String,
    AccountNumber: String,
    OwnerAddress: AddressType,
    OwnerName: String,
    Type: US,
    DepositAccountType: DepositAccountType = null
  ): USDetails = {
    val __obj = js.Dynamic.literal(ABA = ABA.asInstanceOf[js.Any], AccountNumber = AccountNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (DepositAccountType != null) __obj.updateDynamic("DepositAccountType")(DepositAccountType.asInstanceOf[js.Any])
    __obj.asInstanceOf[USDetails]
  }
}

