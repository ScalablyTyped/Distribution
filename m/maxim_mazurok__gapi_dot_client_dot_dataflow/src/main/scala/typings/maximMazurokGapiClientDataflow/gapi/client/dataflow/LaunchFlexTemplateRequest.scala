package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchFlexTemplateRequest extends StObject {
  
  /** Required. Parameter to launch a job form Flex Template. */
  var launchParameter: js.UndefOr[LaunchFlexTemplateParameter] = js.undefined
  
  /** If true, the request is validated but not actually executed. Defaults to false. */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object LaunchFlexTemplateRequest {
  
  inline def apply(): LaunchFlexTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchFlexTemplateRequest]
  }
  
  extension [Self <: LaunchFlexTemplateRequest](x: Self) {
    
    inline def setLaunchParameter(value: LaunchFlexTemplateParameter): Self = StObject.set(x, "launchParameter", value.asInstanceOf[js.Any])
    
    inline def setLaunchParameterUndefined: Self = StObject.set(x, "launchParameter", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
