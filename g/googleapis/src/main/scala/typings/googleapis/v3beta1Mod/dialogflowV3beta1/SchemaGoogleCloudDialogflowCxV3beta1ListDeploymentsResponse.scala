package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1ListDeploymentsResponse extends StObject {
  
  /**
    * The list of deployments. There will be a maximum number of items returned based on the page_size field in the request. The list may in some cases be empty or contain fewer entries than page_size even if this isn't the last page.
    */
  var deployments: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1Deployment]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1ListDeploymentsResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1ListDeploymentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1ListDeploymentsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1ListDeploymentsResponse](x: Self) {
    
    inline def setDeployments(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1Deployment]): Self = StObject.set(x, "deployments", value.asInstanceOf[js.Any])
    
    inline def setDeploymentsUndefined: Self = StObject.set(x, "deployments", js.undefined)
    
    inline def setDeploymentsVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1Deployment*): Self = StObject.set(x, "deployments", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
