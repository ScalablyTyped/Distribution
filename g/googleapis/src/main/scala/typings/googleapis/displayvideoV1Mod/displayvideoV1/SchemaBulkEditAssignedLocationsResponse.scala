package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBulkEditAssignedLocationsResponse extends StObject {
  
  /**
    * The list of assigned locations that have been successfully created. This list will be absent if empty.
    */
  var assignedLocations: js.UndefOr[js.Array[SchemaAssignedLocation]] = js.undefined
}
object SchemaBulkEditAssignedLocationsResponse {
  
  inline def apply(): SchemaBulkEditAssignedLocationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBulkEditAssignedLocationsResponse]
  }
  
  extension [Self <: SchemaBulkEditAssignedLocationsResponse](x: Self) {
    
    inline def setAssignedLocations(value: js.Array[SchemaAssignedLocation]): Self = StObject.set(x, "assignedLocations", value.asInstanceOf[js.Any])
    
    inline def setAssignedLocationsUndefined: Self = StObject.set(x, "assignedLocations", js.undefined)
    
    inline def setAssignedLocationsVarargs(value: SchemaAssignedLocation*): Self = StObject.set(x, "assignedLocations", js.Array(value*))
  }
}
