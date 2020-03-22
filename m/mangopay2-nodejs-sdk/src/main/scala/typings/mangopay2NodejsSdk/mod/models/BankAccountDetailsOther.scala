package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
import typings.mangopay2NodejsSdk.mod.address.AddressType
import typings.mangopay2NodejsSdk.mod.bankAccount.OtherDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.BankAccountDetailsOther")
@js.native
class BankAccountDetailsOther protected ()
  extends BankAccountDetails
     with OtherDetails {
  def this(data: js.Any) = this()
  /**
    * The account number of the bank account. Must be numbers only. Canadian account numbers must be a maximum of 20 digits.
    */
  /* CompleteClass */
  override var AccountNumber: String = js.native
  /**
    * The BIC of the bank account
    */
  /* CompleteClass */
  override var BIC: String = js.native
  /**
    * The Country of the Address
    */
  /* CompleteClass */
  override var Country: String = js.native
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
  override var Type: OTHER = js.native
}

