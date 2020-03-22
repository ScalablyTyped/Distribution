package typings.mangopay2NodejsSdk.mod.bankAccount

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA
import typings.mangopay2NodejsSdk.mod.address.AddressType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CADetails extends CreationDetails {
  /**
    * The account number of the bank account. Must be numbers only. Canadian account numbers must be a maximum of 20 digits.
    */
  var AccountNumber: String
  /**
    * The name of the bank where the account is held. Must be letters or numbers only and maximum 50 characters long.
    */
  var BankName: String
  /**
    * The branch code of the bank where the bank account. Must be numbers only, and 5 digits long
    */
  var BranchCode: String
  /**
    * The institution number of the bank account. Must be numbers only, and 3 or 4 digits long
    */
  var InstitutionNumber: String
  /**
    * The address of the owner of the bank account
    */
  var OwnerAddress: AddressType
  /**
    * The name of the owner of the bank account
    */
  var OwnerName: String
  var Type: CA
}

object CADetails {
  @scala.inline
  def apply(
    AccountNumber: String,
    BankName: String,
    BranchCode: String,
    InstitutionNumber: String,
    OwnerAddress: AddressType,
    OwnerName: String,
    Type: CA
  ): CADetails = {
    val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], BankName = BankName.asInstanceOf[js.Any], BranchCode = BranchCode.asInstanceOf[js.Any], InstitutionNumber = InstitutionNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CADetails]
  }
}

