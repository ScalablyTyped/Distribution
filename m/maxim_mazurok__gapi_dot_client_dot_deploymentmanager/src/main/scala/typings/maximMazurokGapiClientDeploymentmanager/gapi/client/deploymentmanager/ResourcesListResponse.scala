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
  
  inline def apply(): ResourcesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcesListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourcesListResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResources(value: js.Array[Resource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: Resource*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
