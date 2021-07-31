package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import typings.maximMazurokGapiClientBigquery.anon.FriendlyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectList extends StObject {
  
  /** A hash of the page of results */
  var etag: js.UndefOr[String] = js.undefined
  
  /** The type of list. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** A token to request the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Projects to which you have at least READ access. */
  var projects: js.UndefOr[js.Array[FriendlyName]] = js.undefined
  
  /** The total number of projects in the list. */
  var totalItems: js.UndefOr[Double] = js.undefined
}
object ProjectList {
  
  @scala.inline
  def apply(): ProjectList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectList]
  }
  
  @scala.inline
  implicit class ProjectListMutableBuilder[Self <: ProjectList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setProjects(value: js.Array[FriendlyName]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
    
    @scala.inline
    def setProjectsVarargs(value: FriendlyName*): Self = StObject.set(x, "projects", js.Array(value :_*))
    
    @scala.inline
    def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
  }
}
