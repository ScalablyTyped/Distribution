package typings.mangopay2NodejsSdk.mod.bankAccount

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
import typings.mangopay2NodejsSdk.mod.address.AddressType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBANDetails extends CreationDetails {
  /**
    * The BIC of the bank account
    */
  var BIC: js.UndefOr[String] = js.undefined
  /**
    * The IBAN of the bank account
    */
  var IBAN: String
  /**
    * The address of the owner of the bank account
    */
  var OwnerAddress: AddressType
  /**
    * The name of the owner of the bank account
    */
  var OwnerName: String
  var Type: IBAN
}

object IBANDetails {
  @scala.inline
  def apply(IBAN: String, OwnerAddress: AddressType, OwnerName: String, Type: IBAN, BIC: String = null): IBANDetails = {
    val __obj = js.Dynamic.literal(IBAN = IBAN.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (BIC != null) __obj.updateDynamic("BIC")(BIC.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBANDetails]
  }
}

