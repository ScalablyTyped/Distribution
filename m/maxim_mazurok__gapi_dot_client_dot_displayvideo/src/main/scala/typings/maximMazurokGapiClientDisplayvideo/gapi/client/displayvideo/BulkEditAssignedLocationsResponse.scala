package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkEditAssignedLocationsResponse extends js.Object {
  
  /** The list of assigned locations that have been successfully created. This list will be absent if empty. */
  var assignedLocations: js.UndefOr[js.Array[AssignedLocation]] = js.native
}
object BulkEditAssignedLocationsResponse {
  
  @scala.inline
  def apply(): BulkEditAssignedLocationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEditAssignedLocationsResponse]
  }
  
  @scala.inline
  implicit class BulkEditAssignedLocationsResponseOps[Self <: BulkEditAssignedLocationsResponse] (val x: Self) extends AnyVal {
    
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
    def setAssignedLocationsVarargs(value: AssignedLocation*): Self = this.set("assignedLocations", js.Array(value :_*))
    
    @scala.inline
    def setAssignedLocations(value: js.Array[AssignedLocation]): Self = this.set("assignedLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignedLocations: Self = this.set("assignedLocations", js.undefined)
  }
}
