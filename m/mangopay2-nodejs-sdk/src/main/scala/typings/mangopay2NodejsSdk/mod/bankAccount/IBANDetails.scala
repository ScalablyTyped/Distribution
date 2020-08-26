package typings.mangopay2NodejsSdk.mod.bankAccount

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
import typings.mangopay2NodejsSdk.mod.address.AddressType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBANDetails extends CreationDetails {
  /**
    * The BIC of the bank account
    */
  var BIC: js.UndefOr[String] = js.native
  /**
    * The IBAN of the bank account
    */
  var IBAN: String = js.native
  /**
    * The address of the owner of the bank account
    */
  var OwnerAddress: AddressType = js.native
  /**
    * The name of the owner of the bank account
    */
  var OwnerName: String = js.native
  var Type: IBAN = js.native
}

object IBANDetails {
  @scala.inline
  def apply(IBAN: String, OwnerAddress: AddressType, OwnerName: String, Type: IBAN): IBANDetails = {
    val __obj = js.Dynamic.literal(IBAN = IBAN.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBANDetails]
  }
  @scala.inline
  implicit class IBANDetailsOps[Self <: IBANDetails] (val x: Self) extends AnyVal {
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
    def setIBAN(value: String): Self = this.set("IBAN", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerAddress(value: AddressType): Self = this.set("OwnerAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerName(value: String): Self = this.set("OwnerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: IBAN): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setBIC(value: String): Self = this.set("BIC", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBIC: Self = this.set("BIC", js.undefined)
  }
  
}

