package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkEditAssignedLocationsResponse extends StObject {
  
  /** The list of assigned locations that have been successfully created. This list will be absent if empty. */
  var assignedLocations: js.UndefOr[js.Array[AssignedLocation]] = js.undefined
}
object BulkEditAssignedLocationsResponse {
  
  @scala.inline
  def apply(): BulkEditAssignedLocationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEditAssignedLocationsResponse]
  }
  
  @scala.inline
  implicit class BulkEditAssignedLocationsResponseMutableBuilder[Self <: BulkEditAssignedLocationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignedLocations(value: js.Array[AssignedLocation]): Self = StObject.set(x, "assignedLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedLocationsUndefined: Self = StObject.set(x, "assignedLocations", js.undefined)
    
    @scala.inline
    def setAssignedLocationsVarargs(value: AssignedLocation*): Self = StObject.set(x, "assignedLocations", js.Array(value :_*))
  }
}
