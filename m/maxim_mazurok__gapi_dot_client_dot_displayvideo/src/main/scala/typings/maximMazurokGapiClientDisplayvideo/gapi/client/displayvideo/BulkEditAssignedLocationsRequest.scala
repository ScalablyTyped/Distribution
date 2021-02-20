package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkEditAssignedLocationsRequest extends StObject {
  
  /** The assigned locations to create in bulk, specified as a list of AssignedLocations. */
  var createdAssignedLocations: js.UndefOr[js.Array[AssignedLocation]] = js.native
  
  /** The IDs of the assigned locations to delete in bulk, specified as a list of assigned_location_ids. */
  var deletedAssignedLocations: js.UndefOr[js.Array[String]] = js.native
}
object BulkEditAssignedLocationsRequest {
  
  @scala.inline
  def apply(): BulkEditAssignedLocationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEditAssignedLocationsRequest]
  }
  
  @scala.inline
  implicit class BulkEditAssignedLocationsRequestMutableBuilder[Self <: BulkEditAssignedLocationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAssignedLocations(value: js.Array[AssignedLocation]): Self = StObject.set(x, "createdAssignedLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAssignedLocationsUndefined: Self = StObject.set(x, "createdAssignedLocations", js.undefined)
    
    @scala.inline
    def setCreatedAssignedLocationsVarargs(value: AssignedLocation*): Self = StObject.set(x, "createdAssignedLocations", js.Array(value :_*))
    
    @scala.inline
    def setDeletedAssignedLocations(value: js.Array[String]): Self = StObject.set(x, "deletedAssignedLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedAssignedLocationsUndefined: Self = StObject.set(x, "deletedAssignedLocations", js.undefined)
    
    @scala.inline
    def setDeletedAssignedLocationsVarargs(value: String*): Self = StObject.set(x, "deletedAssignedLocations", js.Array(value :_*))
  }
}
