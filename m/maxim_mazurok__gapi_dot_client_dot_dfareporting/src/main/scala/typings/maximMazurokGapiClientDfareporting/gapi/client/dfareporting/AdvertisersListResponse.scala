package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvertisersListResponse extends StObject {
  
  /** Advertiser collection. */
  var advertisers: js.UndefOr[js.Array[Advertiser]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#advertisersListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object AdvertisersListResponse {
  
  inline def apply(): AdvertisersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvertisersListResponse]
  }
  
  extension [Self <: AdvertisersListResponse](x: Self) {
    
    inline def setAdvertisers(value: js.Array[Advertiser]): Self = StObject.set(x, "advertisers", value.asInstanceOf[js.Any])
    
    inline def setAdvertisersUndefined: Self = StObject.set(x, "advertisers", js.undefined)
    
    inline def setAdvertisersVarargs(value: Advertiser*): Self = StObject.set(x, "advertisers", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
