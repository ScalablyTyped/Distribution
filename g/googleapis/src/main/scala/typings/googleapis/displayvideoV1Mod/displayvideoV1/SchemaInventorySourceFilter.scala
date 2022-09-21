package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInventorySourceFilter extends StObject {
  
  /**
    * Inventory Sources to download by ID. All IDs must belong to the same Advertiser or Partner specified in CreateSdfDownloadTaskRequest. Leave empty to download all Inventory Sources for the selected Advertiser or Partner.
    */
  var inventorySourceIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaInventorySourceFilter {
  
  inline def apply(): SchemaInventorySourceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventorySourceFilter]
  }
  
  extension [Self <: SchemaInventorySourceFilter](x: Self) {
    
    inline def setInventorySourceIds(value: js.Array[String]): Self = StObject.set(x, "inventorySourceIds", value.asInstanceOf[js.Any])
    
    inline def setInventorySourceIdsNull: Self = StObject.set(x, "inventorySourceIds", null)
    
    inline def setInventorySourceIdsUndefined: Self = StObject.set(x, "inventorySourceIds", js.undefined)
    
    inline def setInventorySourceIdsVarargs(value: String*): Self = StObject.set(x, "inventorySourceIds", js.Array(value*))
  }
}
