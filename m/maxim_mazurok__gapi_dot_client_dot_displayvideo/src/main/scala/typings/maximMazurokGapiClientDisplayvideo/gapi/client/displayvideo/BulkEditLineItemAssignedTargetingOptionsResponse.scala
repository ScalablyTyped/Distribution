package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkEditLineItemAssignedTargetingOptionsResponse extends StObject {
  
  /** The list of assigned targeting options that have been successfully created. This list will be absent if empty. */
  var createdAssignedTargetingOptions: js.UndefOr[js.Array[AssignedTargetingOption]] = js.undefined
}
object BulkEditLineItemAssignedTargetingOptionsResponse {
  
  @scala.inline
  def apply(): BulkEditLineItemAssignedTargetingOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEditLineItemAssignedTargetingOptionsResponse]
  }
  
  @scala.inline
  implicit class BulkEditLineItemAssignedTargetingOptionsResponseMutableBuilder[Self <: BulkEditLineItemAssignedTargetingOptionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAssignedTargetingOptions(value: js.Array[AssignedTargetingOption]): Self = StObject.set(x, "createdAssignedTargetingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAssignedTargetingOptionsUndefined: Self = StObject.set(x, "createdAssignedTargetingOptions", js.undefined)
    
    @scala.inline
    def setCreatedAssignedTargetingOptionsVarargs(value: AssignedTargetingOption*): Self = StObject.set(x, "createdAssignedTargetingOptions", js.Array(value :_*))
  }
}
