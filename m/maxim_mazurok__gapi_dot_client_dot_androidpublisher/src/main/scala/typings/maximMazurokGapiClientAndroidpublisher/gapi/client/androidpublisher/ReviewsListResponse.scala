package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReviewsListResponse extends StObject {
  
  /** Information about the current page. */
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
  
  /** List of reviews. */
  var reviews: js.UndefOr[js.Array[Review]] = js.undefined
  
  /** Pagination token, to handle a number of products that is over one page. */
  var tokenPagination: js.UndefOr[TokenPagination] = js.undefined
}
object ReviewsListResponse {
  
  @scala.inline
  def apply(): ReviewsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReviewsListResponse]
  }
  
  @scala.inline
  implicit class ReviewsListResponseMutableBuilder[Self <: ReviewsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageInfo(value: PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
    
    @scala.inline
    def setReviews(value: js.Array[Review]): Self = StObject.set(x, "reviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewsUndefined: Self = StObject.set(x, "reviews", js.undefined)
    
    @scala.inline
    def setReviewsVarargs(value: Review*): Self = StObject.set(x, "reviews", js.Array(value :_*))
    
    @scala.inline
    def setTokenPagination(value: TokenPagination): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
  }
}
