package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListPatchDeploymentsResponse extends StObject {
  
  /**
    * A pagination token that can be used to get the next page of patch deployments.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of patch deployments.
    */
  var patchDeployments: js.UndefOr[js.Array[SchemaPatchDeployment]] = js.undefined
}
object SchemaListPatchDeploymentsResponse {
  
  inline def apply(): SchemaListPatchDeploymentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPatchDeploymentsResponse]
  }
  
  extension [Self <: SchemaListPatchDeploymentsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPatchDeployments(value: js.Array[SchemaPatchDeployment]): Self = StObject.set(x, "patchDeployments", value.asInstanceOf[js.Any])
    
    inline def setPatchDeploymentsUndefined: Self = StObject.set(x, "patchDeployments", js.undefined)
    
    inline def setPatchDeploymentsVarargs(value: SchemaPatchDeployment*): Self = StObject.set(x, "patchDeployments", js.Array(value*))
  }
}
