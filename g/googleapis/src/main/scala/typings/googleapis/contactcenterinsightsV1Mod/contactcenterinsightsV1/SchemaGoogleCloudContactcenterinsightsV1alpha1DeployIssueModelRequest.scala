package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1alpha1DeployIssueModelRequest extends StObject {
  
  /**
    * Required. The issue model to deploy.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1alpha1DeployIssueModelRequest {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1alpha1DeployIssueModelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1alpha1DeployIssueModelRequest]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1alpha1DeployIssueModelRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
