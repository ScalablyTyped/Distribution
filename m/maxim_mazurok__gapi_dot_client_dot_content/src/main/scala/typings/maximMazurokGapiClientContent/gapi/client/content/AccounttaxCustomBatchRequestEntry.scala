package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccounttaxCustomBatchRequestEntry extends StObject {
  
  /** The ID of the account for which to get/update account tax settings. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** The account tax settings to update. Only defined if the method is `update`. */
  var accountTax: js.UndefOr[AccountTax] = js.undefined
  
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[Double] = js.undefined
  
  /** The ID of the managing account. */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /** The method of the batch entry. Acceptable values are: - "`get`" - "`update`" */
  var method: js.UndefOr[String] = js.undefined
}
object AccounttaxCustomBatchRequestEntry {
  
  inline def apply(): AccounttaxCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccounttaxCustomBatchRequestEntry]
  }
  
  extension [Self <: AccounttaxCustomBatchRequestEntry](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAccountTax(value: AccountTax): Self = StObject.set(x, "accountTax", value.asInstanceOf[js.Any])
    
    inline def setAccountTaxUndefined: Self = StObject.set(x, "accountTax", js.undefined)
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
  }
}
