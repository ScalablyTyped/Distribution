package typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcesListResponse extends StObject {
  
  /** A token used to continue a truncated list request. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Resources contained in this list response. */
  var resources: js.UndefOr[js.Array[Resource]] = js.undefined
}
object ResourcesListResponse {
  
  @scala.inline
  def apply(): ResourcesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcesListResponse]
  }
  
  @scala.inline
  implicit class ResourcesListResponseMutableBuilder[Self <: ResourcesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setResources(value: js.Array[Resource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: Resource*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
