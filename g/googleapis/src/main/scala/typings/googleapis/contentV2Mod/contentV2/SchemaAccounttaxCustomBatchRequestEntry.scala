package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A batch entry encoding a single non-batch accounttax request.
  */
@js.native
trait SchemaAccounttaxCustomBatchRequestEntry extends StObject {
  
  /**
    * The ID of the account for which to get/update account tax settings.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * The account tax settings to update. Only defined if the method is update.
    */
  var accountTax: js.UndefOr[SchemaAccountTax] = js.native
  
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double] = js.native
  
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.native
  
  var method: js.UndefOr[String] = js.native
}
object SchemaAccounttaxCustomBatchRequestEntry {
  
  @scala.inline
  def apply(): SchemaAccounttaxCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccounttaxCustomBatchRequestEntry]
  }
  
  @scala.inline
  implicit class SchemaAccounttaxCustomBatchRequestEntryMutableBuilder[Self <: SchemaAccounttaxCustomBatchRequestEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAccountTax(value: SchemaAccountTax): Self = StObject.set(x, "accountTax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountTaxUndefined: Self = StObject.set(x, "accountTax", js.undefined)
    
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
  }
}
