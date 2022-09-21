package typings.googleapis.deploymentmanagerV2betaMod.deploymentmanagerV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourcesListResponse extends StObject {
  
  /**
    * A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resources contained in this list response.
    */
  var resources: js.UndefOr[js.Array[SchemaResource]] = js.undefined
}
object SchemaResourcesListResponse {
  
  inline def apply(): SchemaResourcesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcesListResponse]
  }
  
  extension [Self <: SchemaResourcesListResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResources(value: js.Array[SchemaResource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: SchemaResource*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
