package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the claim.
  */
@js.native
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim extends js.Object {
  /**
    * The date that the claim was made.
    */
  var claimDate: js.UndefOr[String] = js.native
  /**
    * One or more reviews of this claim (namely, a fact-checking article).
    */
  var claimReview: js.UndefOr[js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReview]] = js.native
  /**
    * A person or organization stating the claim. For instance, &quot;John
    * Doe&quot;.
    */
  var claimant: js.UndefOr[String] = js.native
  /**
    * The claim text. For instance, &quot;Crime has doubled in the last 2
    * years.&quot;
    */
  var text: js.UndefOr[String] = js.native
}

object SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim {
  @scala.inline
  def apply(
    claimDate: String = null,
    claimReview: js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReview] = null,
    claimant: String = null,
    text: String = null
  ): SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim = {
    val __obj = js.Dynamic.literal()
    if (claimDate != null) __obj.updateDynamic("claimDate")(claimDate.asInstanceOf[js.Any])
    if (claimReview != null) __obj.updateDynamic("claimReview")(claimReview.asInstanceOf[js.Any])
    if (claimant != null) __obj.updateDynamic("claimant")(claimant.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim]
  }
}

