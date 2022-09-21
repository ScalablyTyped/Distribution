package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPosCustomBatchResponseEntry extends StObject {
  
  /**
    * The ID of the request entry to which this entry responds.
    */
  var batchId: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A list of errors defined if, and only if, the request failed.
    */
  var errors: js.UndefOr[SchemaErrors] = js.undefined
  
  /**
    * The updated inventory information.
    */
  var inventory: js.UndefOr[SchemaPosInventory] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "`content#posCustomBatchResponseEntry`"
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
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
  
  inline def apply(): SchemaPosCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPosCustomBatchResponseEntry]
  }
  
  extension [Self <: SchemaPosCustomBatchResponseEntry](x: Self) {
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdNull: Self = StObject.set(x, "batchId", null)
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    inline def setErrors(value: SchemaErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setInventory(value: SchemaPosInventory): Self = StObject.set(x, "inventory", value.asInstanceOf[js.Any])
    
    inline def setInventoryUndefined: Self = StObject.set(x, "inventory", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSale(value: SchemaPosSale): Self = StObject.set(x, "sale", value.asInstanceOf[js.Any])
    
    inline def setSaleUndefined: Self = StObject.set(x, "sale", js.undefined)
    
    inline def setStore(value: SchemaPosStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
  }
}
