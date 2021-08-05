package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiasettingsCustomBatchRequestEntry extends StObject {
  
  /**
    * The ID of the account for which to get/update account shipping settings.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double] = js.undefined
  
  /**
    * Inventory validation contact email. Required only for
    * SetInventoryValidationContact.
    */
  var contactEmail: js.UndefOr[String] = js.undefined
  
  /**
    * Inventory validation contact name. Required only for
    * SetInventoryValidationContact.
    */
  var contactName: js.UndefOr[String] = js.undefined
  
  /**
    * The country code. Required only for RequestInventoryVerification.
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * The GMB account. Required only for RequestGmbAccess.
    */
  var gmbEmail: js.UndefOr[String] = js.undefined
  
  /**
    * The account Lia settings to update. Only defined if the method is update.
    */
  var liaSettings: js.UndefOr[SchemaLiaSettings] = js.undefined
  
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of POS data provider. Required only for SetPosProvider.
    */
  var posDataProviderId: js.UndefOr[String] = js.undefined
  
  /**
    * The account ID by which this merchant is known to the POS provider.
    */
  var posExternalAccountId: js.UndefOr[String] = js.undefined
}
object SchemaLiasettingsCustomBatchRequestEntry {
  
  inline def apply(): SchemaLiasettingsCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiasettingsCustomBatchRequestEntry]
  }
  
  extension [Self <: SchemaLiasettingsCustomBatchRequestEntry](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    inline def setContactEmail(value: String): Self = StObject.set(x, "contactEmail", value.asInstanceOf[js.Any])
    
    inline def setContactEmailUndefined: Self = StObject.set(x, "contactEmail", js.undefined)
    
    inline def setContactName(value: String): Self = StObject.set(x, "contactName", value.asInstanceOf[js.Any])
    
    inline def setContactNameUndefined: Self = StObject.set(x, "contactName", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setGmbEmail(value: String): Self = StObject.set(x, "gmbEmail", value.asInstanceOf[js.Any])
    
    inline def setGmbEmailUndefined: Self = StObject.set(x, "gmbEmail", js.undefined)
    
    inline def setLiaSettings(value: SchemaLiaSettings): Self = StObject.set(x, "liaSettings", value.asInstanceOf[js.Any])
    
    inline def setLiaSettingsUndefined: Self = StObject.set(x, "liaSettings", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPosDataProviderId(value: String): Self = StObject.set(x, "posDataProviderId", value.asInstanceOf[js.Any])
    
    inline def setPosDataProviderIdUndefined: Self = StObject.set(x, "posDataProviderId", js.undefined)
    
    inline def setPosExternalAccountId(value: String): Self = StObject.set(x, "posExternalAccountId", value.asInstanceOf[js.Any])
    
    inline def setPosExternalAccountIdUndefined: Self = StObject.set(x, "posExternalAccountId", js.undefined)
  }
}
