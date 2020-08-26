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
  def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating]
  }
  @scala.inline
  implicit class SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRatingOps[Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating] (val x: Self) extends AnyVal {
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
    def setBestRating(value: Double): Self = this.set("bestRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBestRating: Self = this.set("bestRating", js.undefined)
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    @scala.inline
    def setRatingValue(value: Double): Self = this.set("ratingValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRatingValue: Self = this.set("ratingValue", js.undefined)
    @scala.inline
    def setTextualRating(value: String): Self = this.set("textualRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextualRating: Self = this.set("textualRating", js.undefined)
    @scala.inline
    def setWorstRating(value: Double): Self = this.set("worstRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorstRating: Self = this.set("worstRating", js.undefined)
  }
  
}

