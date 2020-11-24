package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAssignedTargetingOptionsRequest extends js.Object {
  
  /** Required. The assigned targeting options to create and add. */
  var assignedTargetingOptions: js.UndefOr[js.Array[AssignedTargetingOption]] = js.native
  
  /** Required. Identifies the type of this assigned targeting option. */
  var targetingType: js.UndefOr[String] = js.native
}
object CreateAssignedTargetingOptionsRequest {
  
  @scala.inline
  def apply(): CreateAssignedTargetingOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAssignedTargetingOptionsRequest]
  }
  
  @scala.inline
  implicit class CreateAssignedTargetingOptionsRequestOps[Self <: CreateAssignedTargetingOptionsRequest] (val x: Self) extends AnyVal {
    
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
    def setAssignedTargetingOptionsVarargs(value: AssignedTargetingOption*): Self = this.set("assignedTargetingOptions", js.Array(value :_*))
    
    @scala.inline
    def setAssignedTargetingOptions(value: js.Array[AssignedTargetingOption]): Self = this.set("assignedTargetingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignedTargetingOptions: Self = this.set("assignedTargetingOptions", js.undefined)
    
    @scala.inline
    def setTargetingType(value: String): Self = this.set("targetingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetingType: Self = this.set("targetingType", js.undefined)
  }
}
