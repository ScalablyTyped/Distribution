package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the claim review author.
  */
@js.native
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor extends js.Object {
  /**
    * Corresponds to `ClaimReview.author.image`.
    */
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * Name of the organization that is publishing the fact check.&lt;br&gt;
    * Corresponds to `ClaimReview.author.name`.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor {
  @scala.inline
  def apply(imageUrl: String = null, name: String = null): SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor = {
    val __obj = js.Dynamic.literal()
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor]
  }
}

