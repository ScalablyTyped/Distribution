package typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response containing a partial list of resources and a page token used to
  * build the next request if the request has been truncated.
  */
trait SchemaResourcesListResponse extends StObject {
  
  /**
    * A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
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
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResources(value: js.Array[SchemaResource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: SchemaResource*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
