package typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceAccessControl extends js.Object {
  
  /** The GCP IAM Policy to set on the resource. */
  var gcpIamPolicy: js.UndefOr[String] = js.native
}
object ResourceAccessControl {
  
  @scala.inline
  def apply(): ResourceAccessControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceAccessControl]
  }
  
  @scala.inline
  implicit class ResourceAccessControlOps[Self <: ResourceAccessControl] (val x: Self) extends AnyVal {
    
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
    def setGcpIamPolicy(value: String): Self = this.set("gcpIamPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcpIamPolicy: Self = this.set("gcpIamPolicy", js.undefined)
  }
}
