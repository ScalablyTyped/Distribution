package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mod.bankingAlias.BankingAliasType
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankingAlias.BankingAliasData> */
@js.native
trait PartialBankingAliasData extends js.Object {
  var Active: js.UndefOr[Boolean] = js.native
  var Country: js.UndefOr[CountryISO] = js.native
  var CreationDate: js.UndefOr[Double] = js.native
  var CreditedUserId: js.UndefOr[String] = js.native
  var Id: js.UndefOr[String] = js.native
  var OwnerName: js.UndefOr[String] = js.native
  var Tag: js.UndefOr[String] = js.native
  var Type: js.UndefOr[BankingAliasType] = js.native
  var WalletId: js.UndefOr[String] = js.native
}

object PartialBankingAliasData {
  @scala.inline
  def apply(): PartialBankingAliasData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBankingAliasData]
  }
  @scala.inline
  implicit class PartialBankingAliasDataOps[Self <: PartialBankingAliasData] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("Active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("Active", js.undefined)
    @scala.inline
    def setCountry(value: CountryISO): Self = this.set("Country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("Country", js.undefined)
    @scala.inline
    def setCreationDate(value: Double): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setCreditedUserId(value: String): Self = this.set("CreditedUserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreditedUserId: Self = this.set("CreditedUserId", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setOwnerName(value: String): Self = this.set("OwnerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerName: Self = this.set("OwnerName", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
    @scala.inline
    def setType(value: BankingAliasType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    @scala.inline
    def setWalletId(value: String): Self = this.set("WalletId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWalletId: Self = this.set("WalletId", js.undefined)
  }
  
}

