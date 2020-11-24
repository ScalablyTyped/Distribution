package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaReviewsListResponse extends js.Object {
  
  var pageInfo: js.UndefOr[SchemaPageInfo] = js.native
  
  var reviews: js.UndefOr[js.Array[SchemaReview]] = js.native
  
  var tokenPagination: js.UndefOr[SchemaTokenPagination] = js.native
}
object SchemaReviewsListResponse {
  
  @scala.inline
  def apply(): SchemaReviewsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReviewsListResponse]
  }
  
  @scala.inline
  implicit class SchemaReviewsListResponseOps[Self <: SchemaReviewsListResponse] (val x: Self) extends AnyVal {
    
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
    def setPageInfo(value: SchemaPageInfo): Self = this.set("pageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageInfo: Self = this.set("pageInfo", js.undefined)
    
    @scala.inline
    def setReviewsVarargs(value: SchemaReview*): Self = this.set("reviews", js.Array(value :_*))
    
    @scala.inline
    def setReviews(value: js.Array[SchemaReview]): Self = this.set("reviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReviews: Self = this.set("reviews", js.undefined)
    
    @scala.inline
    def setTokenPagination(value: SchemaTokenPagination): Self = this.set("tokenPagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenPagination: Self = this.set("tokenPagination", js.undefined)
  }
}
