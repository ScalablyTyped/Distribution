package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionalinventoryCustomBatchResponseEntry extends StObject {
  
  /**
    * The ID of the request entry this entry responds to.
    */
  var batchId: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A list of errors for failed custombatch entries. *Note:* Schema errors fail the whole request.
    */
  var errors: js.UndefOr[SchemaErrors] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "`content#regionalinventoryCustomBatchResponseEntry`".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Price and availability of the product.
    */
  var regionalInventory: js.UndefOr[SchemaRegionalInventory] = js.undefined
}
object SchemaRegionalinventoryCustomBatchResponseEntry {
  
  inline def apply(): SchemaRegionalinventoryCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionalinventoryCustomBatchResponseEntry]
  }
  
  extension [Self <: SchemaRegionalinventoryCustomBatchResponseEntry](x: Self) {
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdNull: Self = StObject.set(x, "batchId", null)
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    inline def setErrors(value: SchemaErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRegionalInventory(value: SchemaRegionalInventory): Self = StObject.set(x, "regionalInventory", value.asInstanceOf[js.Any])
    
    inline def setRegionalInventoryUndefined: Self = StObject.set(x, "regionalInventory", js.undefined)
  }
}
