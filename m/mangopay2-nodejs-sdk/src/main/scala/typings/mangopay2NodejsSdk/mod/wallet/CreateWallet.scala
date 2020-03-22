package typings.mangopay2NodejsSdk.mod.wallet

import typings.mangopay2NodejsSdk.typesMod.CurrencyISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.wallet.UpdateWallet & std.Pick<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.wallet.WalletData, 'Owners' | 'Currency' | 'Description'> */
trait CreateWallet extends js.Object {
  var Currency: CurrencyISO
  var Description: js.UndefOr[String] = js.undefined
  var Owners: js.Array[String]
  var Tag: js.UndefOr[String] = js.undefined
}

object CreateWallet {
  @scala.inline
  def apply(Currency: CurrencyISO, Owners: js.Array[String], Description: String = null, Tag: String = null): CreateWallet = {
    val __obj = js.Dynamic.literal(Currency = Currency.asInstanceOf[js.Any], Owners = Owners.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWallet]
  }
}

