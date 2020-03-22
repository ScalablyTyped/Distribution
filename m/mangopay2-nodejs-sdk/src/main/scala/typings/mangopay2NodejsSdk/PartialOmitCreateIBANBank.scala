package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.Omit<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankingAlias.CreateIBANBankingAlias, 'CreditedUserId'>> */
trait PartialOmitCreateIBANBank extends js.Object {
  var Country: js.UndefOr[CountryISO] = js.undefined
  var OwnerName: js.UndefOr[String] = js.undefined
  var Tag: js.UndefOr[String] = js.undefined
}

object PartialOmitCreateIBANBank {
  @scala.inline
  def apply(Country: CountryISO = null, OwnerName: String = null, Tag: String = null): PartialOmitCreateIBANBank = {
    val __obj = js.Dynamic.literal()
    if (Country != null) __obj.updateDynamic("Country")(Country.asInstanceOf[js.Any])
    if (OwnerName != null) __obj.updateDynamic("OwnerName")(OwnerName.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOmitCreateIBANBank]
  }
}

