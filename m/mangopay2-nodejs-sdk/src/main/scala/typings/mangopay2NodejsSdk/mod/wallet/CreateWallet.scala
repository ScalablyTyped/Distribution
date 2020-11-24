package typings.mangopay2NodejsSdk.mod.wallet

import typings.mangopay2NodejsSdk.typesMod.CurrencyISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.wallet.UpdateWallet & std.Pick<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.wallet.WalletData, 'Owners' | 'Currency' | 'Description'> */
@js.native
trait CreateWallet extends js.Object {
  
  var Currency: CurrencyISO = js.native
  
  var Description: js.UndefOr[String] with String = js.native
  
  var Owners: js.Array[String] = js.native
  
  var Tag: js.UndefOr[String] = js.native
}
object CreateWallet {
  
  @scala.inline
  def apply(Currency: CurrencyISO, Description: js.UndefOr[String] with String, Owners: js.Array[String]): CreateWallet = {
    val __obj = js.Dynamic.literal(Currency = Currency.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Owners = Owners.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWallet]
  }
  
  @scala.inline
  implicit class CreateWalletOps[Self <: CreateWallet] (val x: Self) extends AnyVal {
    
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
    def setCurrency(value: CurrencyISO): Self = this.set("Currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: js.UndefOr[String] with String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnersVarargs(value: String*): Self = this.set("Owners", js.Array(value :_*))
    
    @scala.inline
    def setOwners(value: js.Array[String]): Self = this.set("Owners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
}
