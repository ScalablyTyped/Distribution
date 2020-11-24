package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignedLocation extends js.Object {
  
  /** Output only. The unique ID of the assigned location. The ID is only unique within a location list. It may be reused in other contexts. */
  var assignedLocationId: js.UndefOr[String] = js.native
  
  /** Output only. The resource name of the assigned location. */
  var name: js.UndefOr[String] = js.native
  
  /** Required. The ID of the targeting option assigned to the location list. Must be of type TARGETING_TYPE_GEO_REGION. */
  var targetingOptionId: js.UndefOr[String] = js.native
}
object AssignedLocation {
  
  @scala.inline
  def apply(): AssignedLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignedLocation]
  }
  
  @scala.inline
  implicit class AssignedLocationOps[Self <: AssignedLocation] (val x: Self) extends AnyVal {
    
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
    def setAssignedLocationId(value: String): Self = this.set("assignedLocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignedLocationId: Self = this.set("assignedLocationId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTargetingOptionId(value: String): Self = this.set("targetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetingOptionId: Self = this.set("targetingOptionId", js.undefined)
  }
}
