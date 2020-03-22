package typings.mangopay2NodejsSdk.mod.bankAccount

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB
import typings.mangopay2NodejsSdk.mod.address.AddressType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GBDetails extends CreationDetails {
  /**
    * The account number of the bank account. Must be numbers only. GB account numbers must be 8 digits long.
    */
  var AccountNumber: String
  /**
    * The address of the owner of the bank account
    */
  var OwnerAddress: AddressType
  /**
    * The name of the owner of the bank account
    */
  var OwnerName: String
  /**
    * The sort code of the bank account. Must be numbers only, and 6 digits long
    */
  var SortCode: String
  var Type: GB
}

object GBDetails {
  @scala.inline
  def apply(AccountNumber: String, OwnerAddress: AddressType, OwnerName: String, SortCode: String, Type: GB): GBDetails = {
    val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], SortCode = SortCode.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GBDetails]
  }
}

