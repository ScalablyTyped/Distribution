package typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceAccessControl extends StObject {
  
  /** The GCP IAM Policy to set on the resource. */
  var gcpIamPolicy: js.UndefOr[String] = js.undefined
}
object ResourceAccessControl {
  
  @scala.inline
  def apply(): ResourceAccessControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceAccessControl]
  }
  
  @scala.inline
  implicit class ResourceAccessControlMutableBuilder[Self <: ResourceAccessControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGcpIamPolicy(value: String): Self = StObject.set(x, "gcpIamPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcpIamPolicyUndefined: Self = StObject.set(x, "gcpIamPolicy", js.undefined)
  }
}
