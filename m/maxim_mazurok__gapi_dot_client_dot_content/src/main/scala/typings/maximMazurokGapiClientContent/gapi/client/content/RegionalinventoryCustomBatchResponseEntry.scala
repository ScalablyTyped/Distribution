package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionalinventoryCustomBatchResponseEntry extends StObject {
  
  /** The ID of the request entry this entry responds to. */
  var batchId: js.UndefOr[Double] = js.undefined
  
  /** A list of errors defined if and only if the request failed. */
  var errors: js.UndefOr[Errors] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#regionalinventoryCustomBatchResponseEntry". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Price and availability of the product. */
  var regionalInventory: js.UndefOr[RegionalInventory] = js.undefined
}
object RegionalinventoryCustomBatchResponseEntry {
  
  inline def apply(): RegionalinventoryCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionalinventoryCustomBatchResponseEntry]
  }
  
  extension [Self <: RegionalinventoryCustomBatchResponseEntry](x: Self) {
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    inline def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRegionalInventory(value: RegionalInventory): Self = StObject.set(x, "regionalInventory", value.asInstanceOf[js.Any])
    
    inline def setRegionalInventoryUndefined: Self = StObject.set(x, "regionalInventory", js.undefined)
  }
}
