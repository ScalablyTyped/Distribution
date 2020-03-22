package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US
import typings.mangopay2NodejsSdk.mod.address.AddressType
import typings.mangopay2NodejsSdk.mod.bankAccount.USDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.BankAccountDetailsUS")
@js.native
class BankAccountDetailsUS protected ()
  extends BankAccountDetails
     with USDetails {
  def this(data: js.Any) = this()
  /**
    * The ABA of the bank account. Must be numbers only, and 9 digits long
    */
  /* CompleteClass */
  override var ABA: String = js.native
  /**
    * The account number of the bank account. US account numbers must be digits only.
    */
  /* CompleteClass */
  override var AccountNumber: String = js.native
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
  override var Type: US = js.native
}

