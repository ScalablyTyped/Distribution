package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mod.bankingAlias.BankingAliasType
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankingAlias.BankingAliasData> */
trait PartialBankingAliasData extends js.Object {
  var Active: js.UndefOr[Boolean] = js.undefined
  var Country: js.UndefOr[CountryISO] = js.undefined
  var CreationDate: js.UndefOr[Double] = js.undefined
  var CreditedUserId: js.UndefOr[String] = js.undefined
  var Id: js.UndefOr[String] = js.undefined
  var OwnerName: js.UndefOr[String] = js.undefined
  var Tag: js.UndefOr[String] = js.undefined
  var Type: js.UndefOr[BankingAliasType] = js.undefined
  var WalletId: js.UndefOr[String] = js.undefined
}

object PartialBankingAliasData {
  @scala.inline
  def apply(
    Active: js.UndefOr[Boolean] = js.undefined,
    Country: CountryISO = null,
    CreationDate: js.UndefOr[Double] = js.undefined,
    CreditedUserId: String = null,
    Id: String = null,
    OwnerName: String = null,
    Tag: String = null,
    Type: BankingAliasType = null,
    WalletId: String = null
  ): PartialBankingAliasData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Active)) __obj.updateDynamic("Active")(Active.get.asInstanceOf[js.Any])
    if (Country != null) __obj.updateDynamic("Country")(Country.asInstanceOf[js.Any])
    if (!js.isUndefined(CreationDate)) __obj.updateDynamic("CreationDate")(CreationDate.get.asInstanceOf[js.Any])
    if (CreditedUserId != null) __obj.updateDynamic("CreditedUserId")(CreditedUserId.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (OwnerName != null) __obj.updateDynamic("OwnerName")(OwnerName.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (WalletId != null) __obj.updateDynamic("WalletId")(WalletId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialBankingAliasData]
  }
}

