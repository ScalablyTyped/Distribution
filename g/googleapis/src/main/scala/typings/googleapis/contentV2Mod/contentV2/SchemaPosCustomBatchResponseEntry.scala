package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPosCustomBatchResponseEntry extends StObject {
  
  /**
    * The ID of the request entry to which this entry responds.
    */
  var batchId: js.UndefOr[Double] = js.undefined
  
  /**
    * A list of errors defined if, and only if, the request failed.
    */
  var errors: js.UndefOr[SchemaErrors] = js.undefined
  
  /**
    * The updated inventory information.
    */
  var inventory: js.UndefOr[SchemaPosInventory] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#posCustomBatchResponseEntry&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The updated sale information.
    */
  var sale: js.UndefOr[SchemaPosSale] = js.undefined
  
  /**
    * The retrieved or updated store information.
    */
  var store: js.UndefOr[SchemaPosStore] = js.undefined
}
object SchemaPosCustomBatchResponseEntry {
  
  @scala.inline
  def apply(): SchemaPosCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPosCustomBatchResponseEntry]
  }
  
  @scala.inline
  implicit class SchemaPosCustomBatchResponseEntryMutableBuilder[Self <: SchemaPosCustomBatchResponseEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setErrors(value: SchemaErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setInventory(value: SchemaPosInventory): Self = StObject.set(x, "inventory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventoryUndefined: Self = StObject.set(x, "inventory", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSale(value: SchemaPosSale): Self = StObject.set(x, "sale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaleUndefined: Self = StObject.set(x, "sale", js.undefined)
    
    @scala.inline
    def setStore(value: SchemaPosStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
  }
}
