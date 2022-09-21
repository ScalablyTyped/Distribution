package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGrafeasV1beta1DeploymentDetails extends StObject {
  
  /**
    * Required. Deployment history for the resource.
    */
  var deployment: js.UndefOr[SchemaDeployment] = js.undefined
}
object SchemaGrafeasV1beta1DeploymentDetails {
  
  inline def apply(): SchemaGrafeasV1beta1DeploymentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrafeasV1beta1DeploymentDetails]
  }
  
  extension [Self <: SchemaGrafeasV1beta1DeploymentDetails](x: Self) {
    
    inline def setDeployment(value: SchemaDeployment): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    inline def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
  }
}
