package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductsCustomBatchRequestEntry extends StObject {
  
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[Double] = js.native
  
  /** The Content API feed id. */
  var feedId: js.UndefOr[String] = js.native
  
  /** The ID of the managing account. */
  var merchantId: js.UndefOr[String] = js.native
  
  /** The method of the batch entry. Acceptable values are: - "`delete`" - "`get`" - "`insert`" */
  var method: js.UndefOr[String] = js.native
  
  /** The product to insert. Only required if the method is `insert`. */
  var product: js.UndefOr[Product] = js.native
  
  /** The ID of the product to get or delete. Only defined if the method is `get` or `delete`. */
  var productId: js.UndefOr[String] = js.native
}
object ProductsCustomBatchRequestEntry {
  
  @scala.inline
  def apply(): ProductsCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductsCustomBatchRequestEntry]
  }
  
  @scala.inline
  implicit class ProductsCustomBatchRequestEntryMutableBuilder[Self <: ProductsCustomBatchRequestEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setFeedId(value: String): Self = StObject.set(x, "feedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedIdUndefined: Self = StObject.set(x, "feedId", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setProduct(value: Product): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    @scala.inline
    def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
  }
}
