package typings.mangopay2NodejsSdk.mod.wallet

import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.typesMod.CurrencyISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.Omit<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.wallet.WalletData, 'Owners' | 'Description'> */
trait ClientWalletData extends js.Object {
  var Balance: MoneyData
  var CreationDate: Double
  var Currency: CurrencyISO
  var FundsType: ClientFundsType
  var Id: String
  var Tag: String
}

object ClientWalletData {
  @scala.inline
  def apply(
    Balance: MoneyData,
    CreationDate: Double,
    Currency: CurrencyISO,
    FundsType: ClientFundsType,
    Id: String,
    Tag: String
  ): ClientWalletData = {
    val __obj = js.Dynamic.literal(Balance = Balance.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Currency = Currency.asInstanceOf[js.Any], FundsType = FundsType.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientWalletData]
  }
}

