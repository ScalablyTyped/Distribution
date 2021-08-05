package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrafeasV1beta1DeploymentDetails extends StObject {
  
  /** Required. Deployment history for the resource. */
  var deployment: js.UndefOr[Deployment] = js.undefined
}
object GrafeasV1beta1DeploymentDetails {
  
  inline def apply(): GrafeasV1beta1DeploymentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrafeasV1beta1DeploymentDetails]
  }
  
  extension [Self <: GrafeasV1beta1DeploymentDetails](x: Self) {
    
    inline def setDeployment(value: Deployment): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    inline def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
  }
}
