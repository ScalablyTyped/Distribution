package typings.mangopay2NodejsSdk.mod.wallet

import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.typesMod.CurrencyISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalletData extends EntityBaseData {
  /**
    * The current balance of the wallet
    */
  var Balance: MoneyData
  /**
    * The currency - should be ISO_4217 format
    */
  var Currency: CurrencyISO
  /**
    * A desciption of the wallet
    */
  var Description: String
  /**
    * The type of funds in the wallet
    */
  var FundsType: typings.mangopay2NodejsSdk.mod.wallet.FundsType
  /**
    * An array of userIDs of who own's the wallet. For now, you only can set up a unique owner.
    */
  var Owners: js.Array[String]
}

object WalletData {
  @scala.inline
  def apply(
    Balance: MoneyData,
    CreationDate: Double,
    Currency: CurrencyISO,
    Description: String,
    FundsType: FundsType,
    Id: String,
    Owners: js.Array[String],
    Tag: String
  ): WalletData = {
    val __obj = js.Dynamic.literal(Balance = Balance.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Currency = Currency.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], FundsType = FundsType.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Owners = Owners.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WalletData]
  }
}

