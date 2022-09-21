package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkEditAssignedInventorySourcesResponse extends StObject {
  
  /** The list of assigned inventory sources that have been successfully created. This list will be absent if empty. */
  var assignedInventorySources: js.UndefOr[js.Array[AssignedInventorySource]] = js.undefined
}
object BulkEditAssignedInventorySourcesResponse {
  
  inline def apply(): BulkEditAssignedInventorySourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEditAssignedInventorySourcesResponse]
  }
  
  extension [Self <: BulkEditAssignedInventorySourcesResponse](x: Self) {
    
    inline def setAssignedInventorySources(value: js.Array[AssignedInventorySource]): Self = StObject.set(x, "assignedInventorySources", value.asInstanceOf[js.Any])
    
    inline def setAssignedInventorySourcesUndefined: Self = StObject.set(x, "assignedInventorySources", js.undefined)
    
    inline def setAssignedInventorySourcesVarargs(value: AssignedInventorySource*): Self = StObject.set(x, "assignedInventorySources", js.Array(value*))
  }
}
