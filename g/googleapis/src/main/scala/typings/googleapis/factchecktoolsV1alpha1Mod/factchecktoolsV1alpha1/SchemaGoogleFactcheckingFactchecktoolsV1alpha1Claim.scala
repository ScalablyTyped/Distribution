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
  def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim]
  }
  @scala.inline
  implicit class SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimOps[Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim] (val x: Self) extends AnyVal {
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
    def setClaimDate(value: String): Self = this.set("claimDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClaimDate: Self = this.set("claimDate", js.undefined)
    @scala.inline
    def setClaimReviewVarargs(value: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReview*): Self = this.set("claimReview", js.Array(value :_*))
    @scala.inline
    def setClaimReview(value: js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReview]): Self = this.set("claimReview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClaimReview: Self = this.set("claimReview", js.undefined)
    @scala.inline
    def setClaimant(value: String): Self = this.set("claimant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClaimant: Self = this.set("claimant", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

