package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Ad List Response
  */
@js.native
trait SchemaAdsListResponse extends StObject {
  
  /**
    * Ad collection.
    */
  var ads: js.UndefOr[js.Array[SchemaAd]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#adsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaAdsListResponse {
  
  @scala.inline
  def apply(): SchemaAdsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdsListResponse]
  }
  
  @scala.inline
  implicit class SchemaAdsListResponseMutableBuilder[Self <: SchemaAdsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAds(value: js.Array[SchemaAd]): Self = StObject.set(x, "ads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdsUndefined: Self = StObject.set(x, "ads", js.undefined)
    
    @scala.inline
    def setAdsVarargs(value: SchemaAd*): Self = StObject.set(x, "ads", js.Array(value :_*))
    
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
