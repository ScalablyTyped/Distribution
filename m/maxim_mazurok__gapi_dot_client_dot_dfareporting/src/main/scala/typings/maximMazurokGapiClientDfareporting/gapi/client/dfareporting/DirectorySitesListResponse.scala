package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectorySitesListResponse extends StObject {
  
  /** Directory site collection. */
  var directorySites: js.UndefOr[js.Array[DirectorySite]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#directorySitesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object DirectorySitesListResponse {
  
  inline def apply(): DirectorySitesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectorySitesListResponse]
  }
  
  extension [Self <: DirectorySitesListResponse](x: Self) {
    
    inline def setDirectorySites(value: js.Array[DirectorySite]): Self = StObject.set(x, "directorySites", value.asInstanceOf[js.Any])
    
    inline def setDirectorySitesUndefined: Self = StObject.set(x, "directorySites", js.undefined)
    
    inline def setDirectorySitesVarargs(value: DirectorySite*): Self = StObject.set(x, "directorySites", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
