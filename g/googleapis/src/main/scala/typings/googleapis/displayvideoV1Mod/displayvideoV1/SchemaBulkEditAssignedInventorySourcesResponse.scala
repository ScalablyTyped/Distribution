package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBulkEditAssignedInventorySourcesResponse extends StObject {
  
  /**
    * The list of assigned inventory sources that have been successfully created. This list will be absent if empty.
    */
  var assignedInventorySources: js.UndefOr[js.Array[SchemaAssignedInventorySource]] = js.undefined
}
object SchemaBulkEditAssignedInventorySourcesResponse {
  
  inline def apply(): SchemaBulkEditAssignedInventorySourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBulkEditAssignedInventorySourcesResponse]
  }
  
  extension [Self <: SchemaBulkEditAssignedInventorySourcesResponse](x: Self) {
    
    inline def setAssignedInventorySources(value: js.Array[SchemaAssignedInventorySource]): Self = StObject.set(x, "assignedInventorySources", value.asInstanceOf[js.Any])
    
    inline def setAssignedInventorySourcesUndefined: Self = StObject.set(x, "assignedInventorySources", js.undefined)
    
    inline def setAssignedInventorySourcesVarargs(value: SchemaAssignedInventorySource*): Self = StObject.set(x, "assignedInventorySources", js.Array(value*))
  }
}
