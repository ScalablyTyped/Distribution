package typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSasPortalListDeploymentsResponse extends StObject {
  
  /**
    * The deployments that match the request.
    */
  var deployments: js.UndefOr[js.Array[SchemaSasPortalDeployment]] = js.undefined
  
  /**
    * A pagination token returned from a previous call to ListDeployments that indicates from where listing should continue. If the field is missing or empty, it means there are no more deployments.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaSasPortalListDeploymentsResponse {
  
  inline def apply(): SchemaSasPortalListDeploymentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSasPortalListDeploymentsResponse]
  }
  
  extension [Self <: SchemaSasPortalListDeploymentsResponse](x: Self) {
    
    inline def setDeployments(value: js.Array[SchemaSasPortalDeployment]): Self = StObject.set(x, "deployments", value.asInstanceOf[js.Any])
    
    inline def setDeploymentsUndefined: Self = StObject.set(x, "deployments", js.undefined)
    
    inline def setDeploymentsVarargs(value: SchemaSasPortalDeployment*): Self = StObject.set(x, "deployments", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
