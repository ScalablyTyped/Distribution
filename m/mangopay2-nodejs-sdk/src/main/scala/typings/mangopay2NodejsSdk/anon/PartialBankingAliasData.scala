package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mod.bankingAlias.BankingAliasType
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankingAlias.BankingAliasData> */
trait PartialBankingAliasData extends StObject {
  
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
  
  inline def apply(): PartialBankingAliasData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBankingAliasData]
  }
  
  extension [Self <: PartialBankingAliasData](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "Active", js.undefined)
    
    inline def setCountry(value: CountryISO): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
    
    inline def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
    
    inline def setCreditedUserIdUndefined: Self = StObject.set(x, "CreditedUserId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setOwnerName(value: String): Self = StObject.set(x, "OwnerName", value.asInstanceOf[js.Any])
    
    inline def setOwnerNameUndefined: Self = StObject.set(x, "OwnerName", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    
    inline def setType(value: BankingAliasType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setWalletId(value: String): Self = StObject.set(x, "WalletId", value.asInstanceOf[js.Any])
    
    inline def setWalletIdUndefined: Self = StObject.set(x, "WalletId", js.undefined)
  }
}
