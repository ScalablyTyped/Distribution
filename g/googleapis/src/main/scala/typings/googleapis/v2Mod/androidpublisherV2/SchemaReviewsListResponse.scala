package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaReviewsListResponse extends js.Object {
  var pageInfo: js.UndefOr[SchemaPageInfo] = js.native
  var reviews: js.UndefOr[js.Array[SchemaReview]] = js.native
  var tokenPagination: js.UndefOr[SchemaTokenPagination] = js.native
}

object SchemaReviewsListResponse {
  @scala.inline
  def apply(
    pageInfo: SchemaPageInfo = null,
    reviews: js.Array[SchemaReview] = null,
    tokenPagination: SchemaTokenPagination = null
  ): SchemaReviewsListResponse = {
    val __obj = js.Dynamic.literal()
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo.asInstanceOf[js.Any])
    if (reviews != null) __obj.updateDynamic("reviews")(reviews.asInstanceOf[js.Any])
    if (tokenPagination != null) __obj.updateDynamic("tokenPagination")(tokenPagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReviewsListResponse]
  }
}

