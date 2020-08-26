package typings.mangopay2NodejsSdk.mod.bankingAlias

import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BankingAliasData extends EntityBaseData {
  /**
    * Whether the banking alias is active or not
    */
  var Active: Boolean = js.native
  /**
    * The Country of the Address
    */
  var Country: CountryISO = js.native
  /**
    * The user ID who is credited (defaults to the owner of the wallet)
    */
  var CreditedUserId: String = js.native
  /**
    * The owner of the wallet/banking alias
    */
  var OwnerName: String = js.native
  /**
    * The type of banking alias (note that only IBAN is available at present)
    */
  var Type: BankingAliasType = js.native
  /**
    * The ID of a wallet
    */
  var WalletId: String = js.native
}

object BankingAliasData {
  @scala.inline
  def apply(
    Active: Boolean,
    Country: CountryISO,
    CreationDate: Double,
    CreditedUserId: String,
    Id: String,
    OwnerName: String,
    Tag: String,
    Type: BankingAliasType,
    WalletId: String
  ): BankingAliasData = {
    val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], WalletId = WalletId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingAliasData]
  }
  @scala.inline
  implicit class BankingAliasDataOps[Self <: BankingAliasData] (val x: Self) extends AnyVal {
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
    def setCountry(value: CountryISO): Self = this.set("Country", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreditedUserId(value: String): Self = this.set("CreditedUserId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerName(value: String): Self = this.set("OwnerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: BankingAliasType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWalletId(value: String): Self = this.set("WalletId", value.asInstanceOf[js.Any])
  }
  
}

