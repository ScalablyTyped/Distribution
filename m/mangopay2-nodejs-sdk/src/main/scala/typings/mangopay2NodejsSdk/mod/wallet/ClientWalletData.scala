package typings.mangopay2NodejsSdk.mod.wallet

import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.typesMod.CurrencyISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.Omit<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.wallet.WalletData, 'Owners' | 'Description'> */
@js.native
trait ClientWalletData extends js.Object {
  
  var Balance: MoneyData = js.native
  
  var CreationDate: Double = js.native
  
  var Currency: CurrencyISO = js.native
  
  var FundsType: ClientFundsType = js.native
  
  var Id: String = js.native
  
  var Tag: String = js.native
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
  
  @scala.inline
  implicit class ClientWalletDataOps[Self <: ClientWalletData] (val x: Self) extends AnyVal {
    
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
    def setBalance(value: MoneyData): Self = this.set("Balance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDate(value: Double): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: CurrencyISO): Self = this.set("Currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFundsType(value: ClientFundsType): Self = this.set("FundsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
  }
}
