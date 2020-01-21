package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fields for an individual `ClaimReview` element. Except for sub-messages
  * that group fields together, each of these fields correspond those in
  * https://schema.org/ClaimReview. We list the precise mapping for each field.
  */
@js.native
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup extends js.Object {
  /**
    * A list of links to works in which this claim appears, aside from the one
    * specified in `claim_first_appearance`.&lt;br&gt; Corresponds to
    * `ClaimReview.itemReviewed[@type=Claim].appearance.url`.
    */
  var claimAppearances: js.UndefOr[js.Array[String]] = js.native
  /**
    * Info about the author of this claim.
    */
  var claimAuthor: js.UndefOr[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor] = js.native
  /**
    * The date when the claim was made or entered public discourse.&lt;br&gt;
    * Corresponds to `ClaimReview.itemReviewed.datePublished`.
    */
  var claimDate: js.UndefOr[String] = js.native
  /**
    * A link to a work in which this claim first appears.&lt;br&gt; Corresponds
    * to `ClaimReview.itemReviewed[@type=Claim].firstAppearance.url`.
    */
  var claimFirstAppearance: js.UndefOr[String] = js.native
  /**
    * The location where this claim was made.&lt;br&gt; Corresponds to
    * `ClaimReview.itemReviewed.name`.
    */
  var claimLocation: js.UndefOr[String] = js.native
  /**
    * A short summary of the claim being evaluated.&lt;br&gt; Corresponds to
    * `ClaimReview.claimReviewed`.
    */
  var claimReviewed: js.UndefOr[String] = js.native
  /**
    * Info about the rating of this claim review.
    */
  var rating: js.UndefOr[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating] = js.native
  /**
    * This field is optional, and will default to the page URL. We provide this
    * field to allow you the override the default value, but the only permitted
    * override is the page URL plus an optional anchor link (&quot;page
    * jump&quot;).&lt;br&gt; Corresponds to `ClaimReview.url`
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup {
  @scala.inline
  def apply(
    claimAppearances: js.Array[String] = null,
    claimAuthor: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor = null,
    claimDate: String = null,
    claimFirstAppearance: String = null,
    claimLocation: String = null,
    claimReviewed: String = null,
    rating: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating = null,
    url: String = null
  ): SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup = {
    val __obj = js.Dynamic.literal()
    if (claimAppearances != null) __obj.updateDynamic("claimAppearances")(claimAppearances.asInstanceOf[js.Any])
    if (claimAuthor != null) __obj.updateDynamic("claimAuthor")(claimAuthor.asInstanceOf[js.Any])
    if (claimDate != null) __obj.updateDynamic("claimDate")(claimDate.asInstanceOf[js.Any])
    if (claimFirstAppearance != null) __obj.updateDynamic("claimFirstAppearance")(claimFirstAppearance.asInstanceOf[js.Any])
    if (claimLocation != null) __obj.updateDynamic("claimLocation")(claimLocation.asInstanceOf[js.Any])
    if (claimReviewed != null) __obj.updateDynamic("claimReviewed")(claimReviewed.asInstanceOf[js.Any])
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup]
  }
}

