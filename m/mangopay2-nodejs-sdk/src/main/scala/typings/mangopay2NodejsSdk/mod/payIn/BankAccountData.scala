package typings.mangopay2NodejsSdk.mod.payIn

import typings.mangopay2NodejsSdk.mod.IBankAccountType
import typings.mangopay2NodejsSdk.typesMod.ValueOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BankAccountData extends js.Object {
  /**
    * The BIC of the bank account
    */
  var BIC: String
  /**
    * The IBAN of the bank account
    */
  var IBAN: String
  /**
    * The address of the owner of the bank account
    */
  var OwnerAddress: String
  /**
    * The name of the owner of the bank account
    */
  var OwnerName: String
  /**
    * The type of bank account
    */
  var Type: ValueOf[IBankAccountType]
}

object BankAccountData {
  @scala.inline
  def apply(
    BIC: String,
    IBAN: String,
    OwnerAddress: String,
    OwnerName: String,
    Type: ValueOf[IBankAccountType]
  ): BankAccountData = {
    val __obj = js.Dynamic.literal(BIC = BIC.asInstanceOf[js.Any], IBAN = IBAN.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BankAccountData]
  }
}

