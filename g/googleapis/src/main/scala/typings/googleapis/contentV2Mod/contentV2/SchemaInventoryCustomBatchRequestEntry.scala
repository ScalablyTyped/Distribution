package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A batch entry encoding a single non-batch inventory request.
  */
trait SchemaInventoryCustomBatchRequestEntry extends StObject {
  
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double] = js.undefined
  
  /**
    * Price and availability of the product.
    */
  var inventory: js.UndefOr[SchemaInventory] = js.undefined
  
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the product for which to update price and availability.
    */
  var productId: js.UndefOr[String] = js.undefined
  
  /**
    * The code of the store for which to update price and availability. Use
    * online to update price and availability of an online product.
    */
  var storeCode: js.UndefOr[String] = js.undefined
}
object SchemaInventoryCustomBatchRequestEntry {
  
  @scala.inline
  def apply(): SchemaInventoryCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventoryCustomBatchRequestEntry]
  }
  
  @scala.inline
  implicit class SchemaInventoryCustomBatchRequestEntryMutableBuilder[Self <: SchemaInventoryCustomBatchRequestEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setInventory(value: SchemaInventory): Self = StObject.set(x, "inventory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventoryUndefined: Self = StObject.set(x, "inventory", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    @scala.inline
    def setStoreCode(value: String): Self = StObject.set(x, "storeCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreCodeUndefined: Self = StObject.set(x, "storeCode", js.undefined)
  }
}
