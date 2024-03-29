package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdsListResponse extends StObject {
  
  /**
    * Ad collection.
    */
  var ads: js.UndefOr[js.Array[SchemaAd]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#adsListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaAdsListResponse {
  
  inline def apply(): SchemaAdsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdsListResponse]
  }
  
  extension [Self <: SchemaAdsListResponse](x: Self) {
    
    inline def setAds(value: js.Array[SchemaAd]): Self = StObject.set(x, "ads", value.asInstanceOf[js.Any])
    
    inline def setAdsUndefined: Self = StObject.set(x, "ads", js.undefined)
    
    inline def setAdsVarargs(value: SchemaAd*): Self = StObject.set(x, "ads", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
