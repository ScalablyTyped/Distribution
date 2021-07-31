package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A batch entry encoding a single non-batch shippingsettings request.
  */
trait SchemaShippingsettingsCustomBatchRequestEntry extends StObject {
  
  /**
    * The ID of the account for which to get/update account shipping settings.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double] = js.undefined
  
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * The account shipping settings to update. Only defined if the method is
    * update.
    */
  var shippingSettings: js.UndefOr[SchemaShippingSettings] = js.undefined
}
object SchemaShippingsettingsCustomBatchRequestEntry {
  
  @scala.inline
  def apply(): SchemaShippingsettingsCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShippingsettingsCustomBatchRequestEntry]
  }
  
  @scala.inline
  implicit class SchemaShippingsettingsCustomBatchRequestEntryMutableBuilder[Self <: SchemaShippingsettingsCustomBatchRequestEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setShippingSettings(value: SchemaShippingSettings): Self = StObject.set(x, "shippingSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingSettingsUndefined: Self = StObject.set(x, "shippingSettings", js.undefined)
  }
}
