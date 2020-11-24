package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchFlexTemplateRequest extends js.Object {
  
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
  implicit class LaunchFlexTemplateRequestOps[Self <: LaunchFlexTemplateRequest] (val x: Self) extends AnyVal {
    
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
    def setLaunchParameter(value: LaunchFlexTemplateParameter): Self = this.set("launchParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchParameter: Self = this.set("launchParameter", js.undefined)
    
    @scala.inline
    def setValidateOnly(value: Boolean): Self = this.set("validateOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateOnly: Self = this.set("validateOnly", js.undefined)
  }
}
