package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdsListResponse extends StObject {
  
  /** Ad collection. */
  var ads: js.UndefOr[js.Array[Ad]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#adsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object AdsListResponse {
  
  inline def apply(): AdsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdsListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdsListResponse] (val x: Self) extends AnyVal {
    
    inline def setAds(value: js.Array[Ad]): Self = StObject.set(x, "ads", value.asInstanceOf[js.Any])
    
    inline def setAdsUndefined: Self = StObject.set(x, "ads", js.undefined)
    
    inline def setAdsVarargs(value: Ad*): Self = StObject.set(x, "ads", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
