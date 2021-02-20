package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalinventoryCustomBatchRequestEntry extends StObject {
  
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[Double] = js.native
  
  /** Local inventory of the product. */
  var localInventory: js.UndefOr[LocalInventory] = js.native
  
  /** The ID of the managing account. */
  var merchantId: js.UndefOr[String] = js.native
  
  /** Method of the batch request entry. Acceptable values are: - "`insert`" */
  var method: js.UndefOr[String] = js.native
  
  /** The ID of the product for which to update local inventory. */
  var productId: js.UndefOr[String] = js.native
}
object LocalinventoryCustomBatchRequestEntry {
  
  @scala.inline
  def apply(): LocalinventoryCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalinventoryCustomBatchRequestEntry]
  }
  
  @scala.inline
  implicit class LocalinventoryCustomBatchRequestEntryMutableBuilder[Self <: LocalinventoryCustomBatchRequestEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setLocalInventory(value: LocalInventory): Self = StObject.set(x, "localInventory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalInventoryUndefined: Self = StObject.set(x, "localInventory", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
