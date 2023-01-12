package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.typingsTypesMod.CountryISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/types.Omit<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/bankingAlias.bankingAlias.CreateIBANBankingAlias, 'CreditedUserId'>> */
trait PartialOmitCreateIBANBank extends StObject {
  
  var Country: js.UndefOr[CountryISO] = js.undefined
  
  var OwnerName: js.UndefOr[String] = js.undefined
  
  var Tag: js.UndefOr[String] = js.undefined
}
object PartialOmitCreateIBANBank {
  
  inline def apply(): PartialOmitCreateIBANBank = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOmitCreateIBANBank]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialOmitCreateIBANBank] (val x: Self) extends AnyVal {
    
    inline def setCountry(value: CountryISO): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
    
    inline def setOwnerName(value: String): Self = StObject.set(x, "OwnerName", value.asInstanceOf[js.Any])
    
    inline def setOwnerNameUndefined: Self = StObject.set(x, "OwnerName", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}
