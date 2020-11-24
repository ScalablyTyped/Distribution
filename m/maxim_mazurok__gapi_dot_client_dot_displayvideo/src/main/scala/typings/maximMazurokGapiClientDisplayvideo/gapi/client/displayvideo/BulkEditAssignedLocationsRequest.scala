package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkEditAssignedLocationsRequest extends js.Object {
  
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
  implicit class BulkEditAssignedLocationsRequestOps[Self <: BulkEditAssignedLocationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreatedAssignedLocationsVarargs(value: AssignedLocation*): Self = this.set("createdAssignedLocations", js.Array(value :_*))
    
    @scala.inline
    def setCreatedAssignedLocations(value: js.Array[AssignedLocation]): Self = this.set("createdAssignedLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAssignedLocations: Self = this.set("createdAssignedLocations", js.undefined)
    
    @scala.inline
    def setDeletedAssignedLocationsVarargs(value: String*): Self = this.set("deletedAssignedLocations", js.Array(value :_*))
    
    @scala.inline
    def setDeletedAssignedLocations(value: js.Array[String]): Self = this.set("deletedAssignedLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletedAssignedLocations: Self = this.set("deletedAssignedLocations", js.undefined)
  }
}
