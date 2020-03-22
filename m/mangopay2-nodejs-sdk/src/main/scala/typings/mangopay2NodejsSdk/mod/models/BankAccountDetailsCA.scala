package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA
import typings.mangopay2NodejsSdk.mod.address.AddressType
import typings.mangopay2NodejsSdk.mod.bankAccount.CADetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.BankAccountDetailsCA")
@js.native
class BankAccountDetailsCA protected ()
  extends BankAccountDetails
     with CADetails {
  def this(data: js.Any) = this()
  /**
    * The account number of the bank account. Must be numbers only. Canadian account numbers must be a maximum of 20 digits.
    */
  /* CompleteClass */
  override var AccountNumber: String = js.native
  /**
    * The name of the bank where the account is held. Must be letters or numbers only and maximum 50 characters long.
    */
  /* CompleteClass */
  override var BankName: String = js.native
  /**
    * The branch code of the bank where the bank account. Must be numbers only, and 5 digits long
    */
  /* CompleteClass */
  override var BranchCode: String = js.native
  /**
    * The institution number of the bank account. Must be numbers only, and 3 or 4 digits long
    */
  /* CompleteClass */
  override var InstitutionNumber: String = js.native
  /**
    * The address of the owner of the bank account
    */
  /* CompleteClass */
  override var OwnerAddress: AddressType = js.native
  /**
    * The name of the owner of the bank account
    */
  /* CompleteClass */
  override var OwnerName: String = js.native
  /* CompleteClass */
  override var Type: CA = js.native
}

