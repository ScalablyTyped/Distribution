package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
import typings.mangopay2NodejsSdk.mod.address.AddressType
import typings.mangopay2NodejsSdk.mod.bankAccount.IBANDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.BankAccountDetailsIBAN")
@js.native
class BankAccountDetailsIBAN protected ()
  extends BankAccountDetails
     with IBANDetails {
  def this(data: js.Any) = this()
  /**
    * The IBAN of the bank account
    */
  /* CompleteClass */
  override var IBAN: String = js.native
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
  override var Type: IBAN = js.native
}

