package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkEditAdvertiserAssignedTargetingOptionsResponse extends js.Object {
  
  /** The list of assigned targeting options that have been successfully created. This list will be absent if empty. */
  var createdAssignedTargetingOptions: js.UndefOr[js.Array[AssignedTargetingOption]] = js.native
}
object BulkEditAdvertiserAssignedTargetingOptionsResponse {
  
  @scala.inline
  def apply(): BulkEditAdvertiserAssignedTargetingOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEditAdvertiserAssignedTargetingOptionsResponse]
  }
  
  @scala.inline
  implicit class BulkEditAdvertiserAssignedTargetingOptionsResponseOps[Self <: BulkEditAdvertiserAssignedTargetingOptionsResponse] (val x: Self) extends AnyVal {
    
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
    def setCreatedAssignedTargetingOptionsVarargs(value: AssignedTargetingOption*): Self = this.set("createdAssignedTargetingOptions", js.Array(value :_*))
    
    @scala.inline
    def setCreatedAssignedTargetingOptions(value: js.Array[AssignedTargetingOption]): Self = this.set("createdAssignedTargetingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAssignedTargetingOptions: Self = this.set("createdAssignedTargetingOptions", js.undefined)
  }
}
