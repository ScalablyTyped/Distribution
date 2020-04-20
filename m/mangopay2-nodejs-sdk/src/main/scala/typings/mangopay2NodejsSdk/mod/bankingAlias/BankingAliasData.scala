package typings.mangopay2NodejsSdk.mod.bankingAlias

import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BankingAliasData extends EntityBaseData {
  /**
    * Whether the banking alias is active or not
    */
  var Active: Boolean
  /**
    * The Country of the Address
    */
  var Country: CountryISO
  /**
    * The user ID who is credited (defaults to the owner of the wallet)
    */
  var CreditedUserId: String
  /**
    * The owner of the wallet/banking alias
    */
  var OwnerName: String
  /**
    * The type of banking alias (note that only IBAN is available at present)
    */
  var Type: BankingAliasType
  /**
    * The ID of a wallet
    */
  var WalletId: String
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
}

