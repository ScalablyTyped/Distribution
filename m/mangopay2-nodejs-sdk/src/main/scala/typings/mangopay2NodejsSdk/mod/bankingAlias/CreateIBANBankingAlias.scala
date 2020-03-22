package typings.mangopay2NodejsSdk.mod.bankingAlias

import typings.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankingAlias.IBANBankingAliasData, 'Tag' | 'CreditedUserId', 'OwnerName' | 'Country'> */
trait CreateIBANBankingAlias extends js.Object {
  var Country: CountryISO
  var CreditedUserId: js.UndefOr[String] = js.undefined
  var OwnerName: String
  var Tag: js.UndefOr[String] = js.undefined
}

object CreateIBANBankingAlias {
  @scala.inline
  def apply(Country: CountryISO, OwnerName: String, CreditedUserId: String = null, Tag: String = null): CreateIBANBankingAlias = {
    val __obj = js.Dynamic.literal(Country = Country.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any])
    if (CreditedUserId != null) __obj.updateDynamic("CreditedUserId")(CreditedUserId.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIBANBankingAlias]
  }
}

