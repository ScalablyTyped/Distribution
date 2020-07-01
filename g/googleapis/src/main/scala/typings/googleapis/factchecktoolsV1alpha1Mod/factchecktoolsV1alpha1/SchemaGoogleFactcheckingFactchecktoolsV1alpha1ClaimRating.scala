package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the claim rating.
  */
@js.native
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating extends js.Object {
  /**
    * For numeric ratings, the best value possible in the scale from worst to
    * best.&lt;br&gt; Corresponds to `ClaimReview.reviewRating.bestRating`.
    */
  var bestRating: js.UndefOr[Double] = js.native
  /**
    * Corresponds to `ClaimReview.reviewRating.image`.
    */
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * A numeric rating of this claim, in the range worstRating — bestRating
    * inclusive.&lt;br&gt; Corresponds to
    * `ClaimReview.reviewRating.ratingValue`.
    */
  var ratingValue: js.UndefOr[Double] = js.native
  /**
    * The truthfulness rating as a human-readible short word or
    * phrase.&lt;br&gt; Corresponds to
    * `ClaimReview.reviewRating.alternateName`.
    */
  var textualRating: js.UndefOr[String] = js.native
  /**
    * For numeric ratings, the worst value possible in the scale from worst to
    * best.&lt;br&gt; Corresponds to `ClaimReview.reviewRating.worstRating`.
    */
  var worstRating: js.UndefOr[Double] = js.native
}

object SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating {
  @scala.inline
  def apply(
    bestRating: js.UndefOr[Double] = js.undefined,
    imageUrl: String = null,
    ratingValue: js.UndefOr[Double] = js.undefined,
    textualRating: String = null,
    worstRating: js.UndefOr[Double] = js.undefined
  ): SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bestRating)) __obj.updateDynamic("bestRating")(bestRating.get.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(ratingValue)) __obj.updateDynamic("ratingValue")(ratingValue.get.asInstanceOf[js.Any])
    if (textualRating != null) __obj.updateDynamic("textualRating")(textualRating.asInstanceOf[js.Any])
    if (!js.isUndefined(worstRating)) __obj.updateDynamic("worstRating")(worstRating.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating]
  }
}

