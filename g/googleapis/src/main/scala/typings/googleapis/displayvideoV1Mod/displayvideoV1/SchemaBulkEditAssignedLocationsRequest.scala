package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBulkEditAssignedLocationsRequest extends StObject {
  
  /**
    * The assigned locations to create in bulk, specified as a list of AssignedLocations.
    */
  var createdAssignedLocations: js.UndefOr[js.Array[SchemaAssignedLocation]] = js.undefined
  
  /**
    * The IDs of the assigned locations to delete in bulk, specified as a list of assigned_location_ids.
    */
  var deletedAssignedLocations: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaBulkEditAssignedLocationsRequest {
  
  inline def apply(): SchemaBulkEditAssignedLocationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBulkEditAssignedLocationsRequest]
  }
  
  extension [Self <: SchemaBulkEditAssignedLocationsRequest](x: Self) {
    
    inline def setCreatedAssignedLocations(value: js.Array[SchemaAssignedLocation]): Self = StObject.set(x, "createdAssignedLocations", value.asInstanceOf[js.Any])
    
    inline def setCreatedAssignedLocationsUndefined: Self = StObject.set(x, "createdAssignedLocations", js.undefined)
    
    inline def setCreatedAssignedLocationsVarargs(value: SchemaAssignedLocation*): Self = StObject.set(x, "createdAssignedLocations", js.Array(value*))
    
    inline def setDeletedAssignedLocations(value: js.Array[String]): Self = StObject.set(x, "deletedAssignedLocations", value.asInstanceOf[js.Any])
    
    inline def setDeletedAssignedLocationsNull: Self = StObject.set(x, "deletedAssignedLocations", null)
    
    inline def setDeletedAssignedLocationsUndefined: Self = StObject.set(x, "deletedAssignedLocations", js.undefined)
    
    inline def setDeletedAssignedLocationsVarargs(value: String*): Self = StObject.set(x, "deletedAssignedLocations", js.Array(value*))
  }
}
