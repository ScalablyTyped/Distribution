package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReviewsListResponse extends js.Object {
  
  /** Information about the current page. */
  var pageInfo: js.UndefOr[PageInfo] = js.native
  
  /** List of reviews. */
  var reviews: js.UndefOr[js.Array[Review]] = js.native
  
  /** Pagination token, to handle a number of products that is over one page. */
  var tokenPagination: js.UndefOr[TokenPagination] = js.native
}
object ReviewsListResponse {
  
  @scala.inline
  def apply(): ReviewsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReviewsListResponse]
  }
  
  @scala.inline
  implicit class ReviewsListResponseOps[Self <: ReviewsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPageInfo(value: PageInfo): Self = this.set("pageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageInfo: Self = this.set("pageInfo", js.undefined)
    
    @scala.inline
    def setReviewsVarargs(value: Review*): Self = this.set("reviews", js.Array(value :_*))
    
    @scala.inline
    def setReviews(value: js.Array[Review]): Self = this.set("reviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReviews: Self = this.set("reviews", js.undefined)
    
    @scala.inline
    def setTokenPagination(value: TokenPagination): Self = this.set("tokenPagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenPagination: Self = this.set("tokenPagination", js.undefined)
  }
}
