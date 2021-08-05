package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response containing a partial list of deployments and a page token used
  * to build the next request if the request has been truncated.
  */
trait SchemaDeploymentsListResponse extends StObject {
  
  /**
    * Output only. The deployments contained in this response.
    */
  var deployments: js.UndefOr[js.Array[SchemaDeployment]] = js.undefined
  
  /**
    * Output only. A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaDeploymentsListResponse {
  
  inline def apply(): SchemaDeploymentsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeploymentsListResponse]
  }
  
  extension [Self <: SchemaDeploymentsListResponse](x: Self) {
    
    inline def setDeployments(value: js.Array[SchemaDeployment]): Self = StObject.set(x, "deployments", value.asInstanceOf[js.Any])
    
    inline def setDeploymentsUndefined: Self = StObject.set(x, "deployments", js.undefined)
    
    inline def setDeploymentsVarargs(value: SchemaDeployment*): Self = StObject.set(x, "deployments", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
