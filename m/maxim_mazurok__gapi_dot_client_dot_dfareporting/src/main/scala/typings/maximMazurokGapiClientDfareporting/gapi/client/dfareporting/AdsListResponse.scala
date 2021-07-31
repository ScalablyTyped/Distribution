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
  
  @scala.inline
  def apply(): AdsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdsListResponse]
  }
  
  @scala.inline
  implicit class AdsListResponseMutableBuilder[Self <: AdsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAds(value: js.Array[Ad]): Self = StObject.set(x, "ads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdsUndefined: Self = StObject.set(x, "ads", js.undefined)
    
    @scala.inline
    def setAdsVarargs(value: Ad*): Self = StObject.set(x, "ads", js.Array(value :_*))
    
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
