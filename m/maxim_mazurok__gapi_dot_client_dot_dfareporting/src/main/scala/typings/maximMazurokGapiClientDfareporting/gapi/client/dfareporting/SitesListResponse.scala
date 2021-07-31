package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SitesListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#sitesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Site collection. */
  var sites: js.UndefOr[js.Array[Site]] = js.undefined
}
object SitesListResponse {
  
  @scala.inline
  def apply(): SitesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SitesListResponse]
  }
  
  @scala.inline
  implicit class SitesListResponseMutableBuilder[Self <: SitesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSites(value: js.Array[Site]): Self = StObject.set(x, "sites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSitesUndefined: Self = StObject.set(x, "sites", js.undefined)
    
    @scala.inline
    def setSitesVarargs(value: Site*): Self = StObject.set(x, "sites", js.Array(value :_*))
  }
}
