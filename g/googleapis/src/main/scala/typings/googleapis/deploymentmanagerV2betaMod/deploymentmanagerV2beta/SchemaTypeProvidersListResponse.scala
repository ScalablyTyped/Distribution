package typings.googleapis.deploymentmanagerV2betaMod.deploymentmanagerV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTypeProvidersListResponse extends StObject {
  
  /**
    * A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A list of resource type providers supported by Deployment Manager.
    */
  var typeProviders: js.UndefOr[js.Array[SchemaTypeProvider]] = js.undefined
}
object SchemaTypeProvidersListResponse {
  
  inline def apply(): SchemaTypeProvidersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTypeProvidersListResponse]
  }
  
  extension [Self <: SchemaTypeProvidersListResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTypeProviders(value: js.Array[SchemaTypeProvider]): Self = StObject.set(x, "typeProviders", value.asInstanceOf[js.Any])
    
    inline def setTypeProvidersUndefined: Self = StObject.set(x, "typeProviders", js.undefined)
    
    inline def setTypeProvidersVarargs(value: SchemaTypeProvider*): Self = StObject.set(x, "typeProviders", js.Array(value*))
  }
}
