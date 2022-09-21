package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListDeploymentsResponse extends StObject {
  
  /**
    * The list of deployments.
    */
  var deployments: js.UndefOr[js.Array[SchemaDeployment]] = js.undefined
  
  /**
    * The token that can be used in the next call to get the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListDeploymentsResponse {
  
  inline def apply(): SchemaListDeploymentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDeploymentsResponse]
  }
  
  extension [Self <: SchemaListDeploymentsResponse](x: Self) {
    
    inline def setDeployments(value: js.Array[SchemaDeployment]): Self = StObject.set(x, "deployments", value.asInstanceOf[js.Any])
    
    inline def setDeploymentsUndefined: Self = StObject.set(x, "deployments", js.undefined)
    
    inline def setDeploymentsVarargs(value: SchemaDeployment*): Self = StObject.set(x, "deployments", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
