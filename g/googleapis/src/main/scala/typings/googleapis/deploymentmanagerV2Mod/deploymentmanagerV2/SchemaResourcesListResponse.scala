package typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response containing a partial list of resources and a page token used to
  * build the next request if the request has been truncated.
  */
@js.native
trait SchemaResourcesListResponse extends StObject {
  
  /**
    * A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Resources contained in this list response.
    */
  var resources: js.UndefOr[js.Array[SchemaResource]] = js.native
}
object SchemaResourcesListResponse {
  
  @scala.inline
  def apply(): SchemaResourcesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcesListResponse]
  }
  
  @scala.inline
  implicit class SchemaResourcesListResponseMutableBuilder[Self <: SchemaResourcesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setResources(value: js.Array[SchemaResource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: SchemaResource*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
