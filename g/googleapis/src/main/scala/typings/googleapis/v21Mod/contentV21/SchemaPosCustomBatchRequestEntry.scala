package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPosCustomBatchRequestEntry extends StObject {
  
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double] = js.native
  
  /**
    * The inventory to submit. Set this only if the method is inventory.
    */
  var inventory: js.UndefOr[SchemaPosInventory] = js.native
  
  /**
    * The ID of the POS data provider.
    */
  var merchantId: js.UndefOr[String] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  /**
    * The sale information to submit. Set this only if the method is sale.
    */
  var sale: js.UndefOr[SchemaPosSale] = js.native
  
  /**
    * The store information to submit. Set this only if the method is insert.
    */
  var store: js.UndefOr[SchemaPosStore] = js.native
  
  /**
    * The store code. Set this only if the method is delete or get.
    */
  var storeCode: js.UndefOr[String] = js.native
  
  /**
    * The ID of the account for which to get/submit data.
    */
  var targetMerchantId: js.UndefOr[String] = js.native
}
object SchemaPosCustomBatchRequestEntry {
  
  @scala.inline
  def apply(): SchemaPosCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPosCustomBatchRequestEntry]
  }
  
  @scala.inline
  implicit class SchemaPosCustomBatchRequestEntryMutableBuilder[Self <: SchemaPosCustomBatchRequestEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setInventory(value: SchemaPosInventory): Self = StObject.set(x, "inventory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventoryUndefined: Self = StObject.set(x, "inventory", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setSale(value: SchemaPosSale): Self = StObject.set(x, "sale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaleUndefined: Self = StObject.set(x, "sale", js.undefined)
    
    @scala.inline
    def setStore(value: SchemaPosStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreCode(value: String): Self = StObject.set(x, "storeCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreCodeUndefined: Self = StObject.set(x, "storeCode", js.undefined)
    
    @scala.inline
    def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    @scala.inline
    def setTargetMerchantId(value: String): Self = StObject.set(x, "targetMerchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetMerchantIdUndefined: Self = StObject.set(x, "targetMerchantId", js.undefined)
  }
}
