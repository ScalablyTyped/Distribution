package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvertiserGroupsListResponse extends StObject {
  
  /** Advertiser group collection. */
  var advertiserGroups: js.UndefOr[js.Array[AdvertiserGroup]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#advertiserGroupsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object AdvertiserGroupsListResponse {
  
  inline def apply(): AdvertiserGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvertiserGroupsListResponse]
  }
  
  extension [Self <: AdvertiserGroupsListResponse](x: Self) {
    
    inline def setAdvertiserGroups(value: js.Array[AdvertiserGroup]): Self = StObject.set(x, "advertiserGroups", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserGroupsUndefined: Self = StObject.set(x, "advertiserGroups", js.undefined)
    
    inline def setAdvertiserGroupsVarargs(value: AdvertiserGroup*): Self = StObject.set(x, "advertiserGroups", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
