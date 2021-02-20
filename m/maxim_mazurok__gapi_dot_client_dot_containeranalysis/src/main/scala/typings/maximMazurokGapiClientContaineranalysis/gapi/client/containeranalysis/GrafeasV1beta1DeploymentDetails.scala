package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrafeasV1beta1DeploymentDetails extends StObject {
  
  /** Required. Deployment history for the resource. */
  var deployment: js.UndefOr[Deployment] = js.native
}
object GrafeasV1beta1DeploymentDetails {
  
  @scala.inline
  def apply(): GrafeasV1beta1DeploymentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrafeasV1beta1DeploymentDetails]
  }
  
  @scala.inline
  implicit class GrafeasV1beta1DeploymentDetailsMutableBuilder[Self <: GrafeasV1beta1DeploymentDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeployment(value: Deployment): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
  }
}
