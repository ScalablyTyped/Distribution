package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup]
  }
  
  @scala.inline
  implicit class SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupOps[Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup] (val x: Self) extends AnyVal {
    
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
    def setClaimAppearancesVarargs(value: String*): Self = this.set("claimAppearances", js.Array(value :_*))
    
    @scala.inline
    def setClaimAppearances(value: js.Array[String]): Self = this.set("claimAppearances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaimAppearances: Self = this.set("claimAppearances", js.undefined)
    
    @scala.inline
    def setClaimAuthor(value: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor): Self = this.set("claimAuthor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaimAuthor: Self = this.set("claimAuthor", js.undefined)
    
    @scala.inline
    def setClaimDate(value: String): Self = this.set("claimDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaimDate: Self = this.set("claimDate", js.undefined)
    
    @scala.inline
    def setClaimFirstAppearance(value: String): Self = this.set("claimFirstAppearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaimFirstAppearance: Self = this.set("claimFirstAppearance", js.undefined)
    
    @scala.inline
    def setClaimLocation(value: String): Self = this.set("claimLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaimLocation: Self = this.set("claimLocation", js.undefined)
    
    @scala.inline
    def setClaimReviewed(value: String): Self = this.set("claimReviewed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaimReviewed: Self = this.set("claimReviewed", js.undefined)
    
    @scala.inline
    def setRating(value: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating): Self = this.set("rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRating: Self = this.set("rating", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
