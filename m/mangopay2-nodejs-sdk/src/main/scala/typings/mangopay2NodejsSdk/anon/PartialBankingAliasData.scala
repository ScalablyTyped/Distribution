package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mod.bankingAlias.BankingAliasType
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankingAlias.BankingAliasData> */
@js.native
trait PartialBankingAliasData extends StObject {
  
  var Active: js.UndefOr[Boolean] = js.native
  
  var Country: js.UndefOr[CountryISO] = js.native
  
  var CreationDate: js.UndefOr[Double] = js.native
  
  var CreditedUserId: js.UndefOr[String] = js.native
  
  var Id: js.UndefOr[String] = js.native
  
  var OwnerName: js.UndefOr[String] = js.native
  
  var Tag: js.UndefOr[String] = js.native
  
  var Type: js.UndefOr[BankingAliasType] = js.native
  
  var WalletId: js.UndefOr[String] = js.native
}
object PartialBankingAliasData {
  
  @scala.inline
  def apply(): PartialBankingAliasData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBankingAliasData]
  }
  
  @scala.inline
  implicit class PartialBankingAliasDataMutableBuilder[Self <: PartialBankingAliasData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "Active", js.undefined)
    
    @scala.inline
    def setCountry(value: CountryISO): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditedUserIdUndefined: Self = StObject.set(x, "CreditedUserId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setOwnerName(value: String): Self = StObject.set(x, "OwnerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerNameUndefined: Self = StObject.set(x, "OwnerName", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    
    @scala.inline
    def setType(value: BankingAliasType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setWalletId(value: String): Self = StObject.set(x, "WalletId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWalletIdUndefined: Self = StObject.set(x, "WalletId", js.undefined)
  }
}
