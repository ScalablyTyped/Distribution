package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceGroupManagersSetInstanceTemplateRequest extends StObject {
  
  /**
    * The URL of the instance template that is specified for this managed instance group. The group uses this template to create all new instances in the managed instance group. The
    * templates for existing instances in the group do not change unless you run recreateInstances, run applyUpdatesToInstances, or set the group's updatePolicy.type to PROACTIVE.
    */
  var instanceTemplate: js.UndefOr[String] = js.undefined
}
object InstanceGroupManagersSetInstanceTemplateRequest {
  
  inline def apply(): InstanceGroupManagersSetInstanceTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupManagersSetInstanceTemplateRequest]
  }
  
  extension [Self <: InstanceGroupManagersSetInstanceTemplateRequest](x: Self) {
    
    inline def setInstanceTemplate(value: String): Self = StObject.set(x, "instanceTemplate", value.asInstanceOf[js.Any])
    
    inline def setInstanceTemplateUndefined: Self = StObject.set(x, "instanceTemplate", js.undefined)
  }
}
