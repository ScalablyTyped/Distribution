package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReviewsListResponse extends StObject {
  
  var pageInfo: js.UndefOr[SchemaPageInfo] = js.undefined
  
  var reviews: js.UndefOr[js.Array[SchemaReview]] = js.undefined
  
  var tokenPagination: js.UndefOr[SchemaTokenPagination] = js.undefined
}
object SchemaReviewsListResponse {
  
  inline def apply(): SchemaReviewsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReviewsListResponse]
  }
  
  extension [Self <: SchemaReviewsListResponse](x: Self) {
    
    inline def setPageInfo(value: SchemaPageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
    
    inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
    
    inline def setReviews(value: js.Array[SchemaReview]): Self = StObject.set(x, "reviews", value.asInstanceOf[js.Any])
    
    inline def setReviewsUndefined: Self = StObject.set(x, "reviews", js.undefined)
    
    inline def setReviewsVarargs(value: SchemaReview*): Self = StObject.set(x, "reviews", js.Array(value :_*))
    
    inline def setTokenPagination(value: SchemaTokenPagination): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
    
    inline def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
  }
}
