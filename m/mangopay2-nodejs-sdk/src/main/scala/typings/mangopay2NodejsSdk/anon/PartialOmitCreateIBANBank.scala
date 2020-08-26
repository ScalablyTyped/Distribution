package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.Omit<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankingAlias.CreateIBANBankingAlias, 'CreditedUserId'>> */
@js.native
trait PartialOmitCreateIBANBank extends js.Object {
  var Country: js.UndefOr[CountryISO] = js.native
  var OwnerName: js.UndefOr[String] = js.native
  var Tag: js.UndefOr[String] = js.native
}

object PartialOmitCreateIBANBank {
  @scala.inline
  def apply(): PartialOmitCreateIBANBank = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOmitCreateIBANBank]
  }
  @scala.inline
  implicit class PartialOmitCreateIBANBankOps[Self <: PartialOmitCreateIBANBank] (val x: Self) extends AnyVal {
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
    def setCountry(value: CountryISO): Self = this.set("Country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("Country", js.undefined)
    @scala.inline
    def setOwnerName(value: String): Self = this.set("OwnerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerName: Self = this.set("OwnerName", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
  
}

