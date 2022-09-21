package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsIssuemodelsDeploy
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The issue model to deploy.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1DeployIssueModelRequest] = js.undefined
}
object ParamsResourceProjectsLocationsIssuemodelsDeploy {
  
  inline def apply(): ParamsResourceProjectsLocationsIssuemodelsDeploy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsIssuemodelsDeploy]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsIssuemodelsDeploy](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudContactcenterinsightsV1DeployIssueModelRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
