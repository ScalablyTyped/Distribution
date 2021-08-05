package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreativeGroupsListResponse extends StObject {
  
  /** Creative group collection. */
  var creativeGroups: js.UndefOr[js.Array[CreativeGroup]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#creativeGroupsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object CreativeGroupsListResponse {
  
  inline def apply(): CreativeGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeGroupsListResponse]
  }
  
  extension [Self <: CreativeGroupsListResponse](x: Self) {
    
    inline def setCreativeGroups(value: js.Array[CreativeGroup]): Self = StObject.set(x, "creativeGroups", value.asInstanceOf[js.Any])
    
    inline def setCreativeGroupsUndefined: Self = StObject.set(x, "creativeGroups", js.undefined)
    
    inline def setCreativeGroupsVarargs(value: CreativeGroup*): Self = StObject.set(x, "creativeGroups", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
