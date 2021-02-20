package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAssignedTargetingOptionsRequest extends StObject {
  
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
  implicit class CreateAssignedTargetingOptionsRequestMutableBuilder[Self <: CreateAssignedTargetingOptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignedTargetingOptions(value: js.Array[AssignedTargetingOption]): Self = StObject.set(x, "assignedTargetingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedTargetingOptionsUndefined: Self = StObject.set(x, "assignedTargetingOptions", js.undefined)
    
    @scala.inline
    def setAssignedTargetingOptionsVarargs(value: AssignedTargetingOption*): Self = StObject.set(x, "assignedTargetingOptions", js.Array(value :_*))
    
    @scala.inline
    def setTargetingType(value: String): Self = StObject.set(x, "targetingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingTypeUndefined: Self = StObject.set(x, "targetingType", js.undefined)
  }
}
