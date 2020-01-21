package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Holds one or more instances of `ClaimReview` markup for a webpage.
  */
@js.native
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage extends js.Object {
  /**
    * Info about the author of this claim review. Similar to the above,
    * semantically these are page-level fields, and each `ClaimReview` on this
    * page will contain the same values.
    */
  var claimReviewAuthor: js.UndefOr[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor] = js.native
  /**
    * A list of individual claim reviews for this page. Each item in the list
    * corresponds to one `ClaimReview` element.
    */
  var claimReviewMarkups: js.UndefOr[js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup]] = js.native
  /**
    * The name of this `ClaimReview` markup page resource, in the form of
    * `pages/{page_id}`. Except for update requests, this field is output-only
    * and should not be set by the user.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The URL of the page associated with this `ClaimReview` markup. While
    * every individual `ClaimReview` has its own URL field, semantically this
    * is a page-level field, and each `ClaimReview` on this page will use this
    * value unless individually overridden.&lt;br&gt; Corresponds to
    * `ClaimReview.url`
    */
  var pageUrl: js.UndefOr[String] = js.native
  /**
    * The date when the fact check was published. Similar to the URL,
    * semantically this is a page-level field, and each `ClaimReview` on this
    * page will contain the same value.&lt;br&gt; Corresponds to
    * `ClaimReview.datePublished`
    */
  var publishDate: js.UndefOr[String] = js.native
  /**
    * The version ID for this markup. Except for update requests, this field is
    * output-only and should not be set by the user.
    */
  var versionId: js.UndefOr[String] = js.native
}

object SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage {
  @scala.inline
  def apply(
    claimReviewAuthor: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor = null,
    claimReviewMarkups: js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup] = null,
    name: String = null,
    pageUrl: String = null,
    publishDate: String = null,
    versionId: String = null
  ): SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage = {
    val __obj = js.Dynamic.literal()
    if (claimReviewAuthor != null) __obj.updateDynamic("claimReviewAuthor")(claimReviewAuthor.asInstanceOf[js.Any])
    if (claimReviewMarkups != null) __obj.updateDynamic("claimReviewMarkups")(claimReviewMarkups.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pageUrl != null) __obj.updateDynamic("pageUrl")(pageUrl.asInstanceOf[js.Any])
    if (publishDate != null) __obj.updateDynamic("publishDate")(publishDate.asInstanceOf[js.Any])
    if (versionId != null) __obj.updateDynamic("versionId")(versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
  }
}

