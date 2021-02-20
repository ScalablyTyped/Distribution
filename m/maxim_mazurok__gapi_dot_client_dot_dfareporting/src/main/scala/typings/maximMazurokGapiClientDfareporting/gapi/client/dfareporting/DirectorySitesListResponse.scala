package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectorySitesListResponse extends StObject {
  
  /** Directory site collection. */
  var directorySites: js.UndefOr[js.Array[DirectorySite]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#directorySitesListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object DirectorySitesListResponse {
  
  @scala.inline
  def apply(): DirectorySitesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectorySitesListResponse]
  }
  
  @scala.inline
  implicit class DirectorySitesListResponseMutableBuilder[Self <: DirectorySitesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectorySites(value: js.Array[DirectorySite]): Self = StObject.set(x, "directorySites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectorySitesUndefined: Self = StObject.set(x, "directorySites", js.undefined)
    
    @scala.inline
    def setDirectorySitesVarargs(value: DirectorySite*): Self = StObject.set(x, "directorySites", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
