package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkEditPartnerAssignedTargetingOptionsResponse extends StObject {
  
  /** The list of assigned targeting options that have been successfully created. This list will be absent if empty. */
  var createdAssignedTargetingOptions: js.UndefOr[js.Array[AssignedTargetingOption]] = js.native
}
object BulkEditPartnerAssignedTargetingOptionsResponse {
  
  @scala.inline
  def apply(): BulkEditPartnerAssignedTargetingOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEditPartnerAssignedTargetingOptionsResponse]
  }
  
  @scala.inline
  implicit class BulkEditPartnerAssignedTargetingOptionsResponseMutableBuilder[Self <: BulkEditPartnerAssignedTargetingOptionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAssignedTargetingOptions(value: js.Array[AssignedTargetingOption]): Self = StObject.set(x, "createdAssignedTargetingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAssignedTargetingOptionsUndefined: Self = StObject.set(x, "createdAssignedTargetingOptions", js.undefined)
    
    @scala.inline
    def setCreatedAssignedTargetingOptionsVarargs(value: AssignedTargetingOption*): Self = StObject.set(x, "createdAssignedTargetingOptions", js.Array(value :_*))
  }
}
