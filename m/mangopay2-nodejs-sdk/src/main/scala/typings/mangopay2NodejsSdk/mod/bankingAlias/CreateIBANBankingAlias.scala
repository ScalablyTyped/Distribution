package typings.mangopay2NodejsSdk.mod.bankingAlias

import typings.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankingAlias.IBANBankingAliasData, 'Tag' | 'CreditedUserId', 'OwnerName' | 'Country'> */
@js.native
trait CreateIBANBankingAlias extends js.Object {
  
  var Country: CountryISO = js.native
  
  var CreditedUserId: js.UndefOr[String] = js.native
  
  var OwnerName: String = js.native
  
  var Tag: js.UndefOr[String] = js.native
}
object CreateIBANBankingAlias {
  
  @scala.inline
  def apply(Country: CountryISO, OwnerName: String): CreateIBANBankingAlias = {
    val __obj = js.Dynamic.literal(Country = Country.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIBANBankingAlias]
  }
  
  @scala.inline
  implicit class CreateIBANBankingAliasOps[Self <: CreateIBANBankingAlias] (val x: Self) extends AnyVal {
    
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
    def setCountry(value: CountryISO): Self = this.set("Country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerName(value: String): Self = this.set("OwnerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditedUserId(value: String): Self = this.set("CreditedUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreditedUserId: Self = this.set("CreditedUserId", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
}
