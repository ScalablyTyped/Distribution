package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response from listing `ClaimReview` markup.
  */
@js.native
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse extends js.Object {
  /**
    * The result list of pages of `ClaimReview` markup.
    */
  var claimReviewMarkupPages: js.UndefOr[js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]] = js.native
  /**
    * The next pagination token in the Search response. It should be used as
    * the `page_token` for the following request. An empty value means no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse {
  @scala.inline
  def apply(
    claimReviewMarkupPages: js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = null,
    nextPageToken: String = null
  ): SchemaGoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse = {
    val __obj = js.Dynamic.literal()
    if (claimReviewMarkupPages != null) __obj.updateDynamic("claimReviewMarkupPages")(claimReviewMarkupPages.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse]
  }
}

