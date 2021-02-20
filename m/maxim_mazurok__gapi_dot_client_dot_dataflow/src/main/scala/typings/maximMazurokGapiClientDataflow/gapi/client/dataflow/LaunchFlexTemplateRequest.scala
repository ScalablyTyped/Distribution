package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchFlexTemplateRequest extends StObject {
  
  /** Required. Parameter to launch a job form Flex Template. */
  var launchParameter: js.UndefOr[LaunchFlexTemplateParameter] = js.native
  
  /** If true, the request is validated but not actually executed. Defaults to false. */
  var validateOnly: js.UndefOr[Boolean] = js.native
}
object LaunchFlexTemplateRequest {
  
  @scala.inline
  def apply(): LaunchFlexTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchFlexTemplateRequest]
  }
  
  @scala.inline
  implicit class LaunchFlexTemplateRequestMutableBuilder[Self <: LaunchFlexTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLaunchParameter(value: LaunchFlexTemplateParameter): Self = StObject.set(x, "launchParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchParameterUndefined: Self = StObject.set(x, "launchParameter", js.undefined)
    
    @scala.inline
    def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
