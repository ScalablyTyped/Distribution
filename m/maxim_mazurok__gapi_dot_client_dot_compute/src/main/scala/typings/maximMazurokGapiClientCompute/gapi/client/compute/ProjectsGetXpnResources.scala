package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsGetXpnResources extends StObject {
  
  /** [Output Only] Type of resource. Always compute#projectsGetXpnResources for lists of service resources (a.k.a service projects) */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the
    * query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Service resources (a.k.a service projects) attached to this project as their shared VPC host. */
  var resources: js.UndefOr[js.Array[XpnResourceId]] = js.native
}
object ProjectsGetXpnResources {
  
  @scala.inline
  def apply(): ProjectsGetXpnResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectsGetXpnResources]
  }
  
  @scala.inline
  implicit class ProjectsGetXpnResourcesMutableBuilder[Self <: ProjectsGetXpnResources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setResources(value: js.Array[XpnResourceId]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: XpnResourceId*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
