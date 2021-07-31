package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details of a deployment occurrence.
  */
trait SchemaGrafeasV1beta1DeploymentDetails extends StObject {
  
  /**
    * Required. Deployment history for the resource.
    */
  var deployment: js.UndefOr[SchemaDeployment] = js.undefined
}
object SchemaGrafeasV1beta1DeploymentDetails {
  
  @scala.inline
  def apply(): SchemaGrafeasV1beta1DeploymentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrafeasV1beta1DeploymentDetails]
  }
  
  @scala.inline
  implicit class SchemaGrafeasV1beta1DeploymentDetailsMutableBuilder[Self <: SchemaGrafeasV1beta1DeploymentDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeployment(value: SchemaDeployment): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
  }
}
