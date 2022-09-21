package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLiasettingsSetinventoryverificationcontact
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the account that manages the order. This cannot be a multi-client account.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The email of the inventory verification contact.
    */
  var contactEmail: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the inventory verification contact.
    */
  var contactName: js.UndefOr[String] = js.undefined
  
  /**
    * The country for which inventory verification is requested.
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * The language for which inventory verification is requested.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and `accountId` must be the ID of a sub-account of this account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
}
object ParamsResourceLiasettingsSetinventoryverificationcontact {
  
  inline def apply(): ParamsResourceLiasettingsSetinventoryverificationcontact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLiasettingsSetinventoryverificationcontact]
  }
  
  extension [Self <: ParamsResourceLiasettingsSetinventoryverificationcontact](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setContactEmail(value: String): Self = StObject.set(x, "contactEmail", value.asInstanceOf[js.Any])
    
    inline def setContactEmailUndefined: Self = StObject.set(x, "contactEmail", js.undefined)
    
    inline def setContactName(value: String): Self = StObject.set(x, "contactName", value.asInstanceOf[js.Any])
    
    inline def setContactNameUndefined: Self = StObject.set(x, "contactName", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
  }
}
