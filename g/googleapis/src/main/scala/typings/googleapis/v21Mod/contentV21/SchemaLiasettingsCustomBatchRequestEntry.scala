package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLiasettingsCustomBatchRequestEntry extends StObject {
  
  /**
    * The ID of the account for which to get/update account shipping settings.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double] = js.native
  
  /**
    * Inventory validation contact email. Required only for
    * SetInventoryValidationContact.
    */
  var contactEmail: js.UndefOr[String] = js.native
  
  /**
    * Inventory validation contact name. Required only for
    * SetInventoryValidationContact.
    */
  var contactName: js.UndefOr[String] = js.native
  
  /**
    * The country code. Required only for RequestInventoryVerification.
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * The GMB account. Required only for RequestGmbAccess.
    */
  var gmbEmail: js.UndefOr[String] = js.native
  
  /**
    * The account Lia settings to update. Only defined if the method is update.
    */
  var liaSettings: js.UndefOr[SchemaLiaSettings] = js.native
  
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  /**
    * The ID of POS data provider. Required only for SetPosProvider.
    */
  var posDataProviderId: js.UndefOr[String] = js.native
  
  /**
    * The account ID by which this merchant is known to the POS provider.
    */
  var posExternalAccountId: js.UndefOr[String] = js.native
}
object SchemaLiasettingsCustomBatchRequestEntry {
  
  @scala.inline
  def apply(): SchemaLiasettingsCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiasettingsCustomBatchRequestEntry]
  }
  
  @scala.inline
  implicit class SchemaLiasettingsCustomBatchRequestEntryMutableBuilder[Self <: SchemaLiasettingsCustomBatchRequestEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setContactEmail(value: String): Self = StObject.set(x, "contactEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactEmailUndefined: Self = StObject.set(x, "contactEmail", js.undefined)
    
    @scala.inline
    def setContactName(value: String): Self = StObject.set(x, "contactName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactNameUndefined: Self = StObject.set(x, "contactName", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setGmbEmail(value: String): Self = StObject.set(x, "gmbEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGmbEmailUndefined: Self = StObject.set(x, "gmbEmail", js.undefined)
    
    @scala.inline
    def setLiaSettings(value: SchemaLiaSettings): Self = StObject.set(x, "liaSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiaSettingsUndefined: Self = StObject.set(x, "liaSettings", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setPosDataProviderId(value: String): Self = StObject.set(x, "posDataProviderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosDataProviderIdUndefined: Self = StObject.set(x, "posDataProviderId", js.undefined)
    
    @scala.inline
    def setPosExternalAccountId(value: String): Self = StObject.set(x, "posExternalAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosExternalAccountIdUndefined: Self = StObject.set(x, "posExternalAccountId", js.undefined)
  }
}
