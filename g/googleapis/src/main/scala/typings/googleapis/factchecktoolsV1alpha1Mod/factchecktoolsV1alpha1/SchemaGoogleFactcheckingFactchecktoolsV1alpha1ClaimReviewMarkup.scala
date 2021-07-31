package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fields for an individual `ClaimReview` element. Except for sub-messages
  * that group fields together, each of these fields correspond those in
  * https://schema.org/ClaimReview. We list the precise mapping for each field.
  */
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup extends StObject {
  
  /**
    * A list of links to works in which this claim appears, aside from the one
    * specified in `claim_first_appearance`.&lt;br&gt; Corresponds to
    * `ClaimReview.itemReviewed[@type=Claim].appearance.url`.
    */
  var claimAppearances: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Info about the author of this claim.
    */
  var claimAuthor: js.UndefOr[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor] = js.undefined
  
  /**
    * The date when the claim was made or entered public discourse.&lt;br&gt;
    * Corresponds to `ClaimReview.itemReviewed.datePublished`.
    */
  var claimDate: js.UndefOr[String] = js.undefined
  
  /**
    * A link to a work in which this claim first appears.&lt;br&gt; Corresponds
    * to `ClaimReview.itemReviewed[@type=Claim].firstAppearance.url`.
    */
  var claimFirstAppearance: js.UndefOr[String] = js.undefined
  
  /**
    * The location where this claim was made.&lt;br&gt; Corresponds to
    * `ClaimReview.itemReviewed.name`.
    */
  var claimLocation: js.UndefOr[String] = js.undefined
  
  /**
    * A short summary of the claim being evaluated.&lt;br&gt; Corresponds to
    * `ClaimReview.claimReviewed`.
    */
  var claimReviewed: js.UndefOr[String] = js.undefined
  
  /**
    * Info about the rating of this claim review.
    */
  var rating: js.UndefOr[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating] = js.undefined
  
  /**
    * This field is optional, and will default to the page URL. We provide this
    * field to allow you the override the default value, but the only permitted
    * override is the page URL plus an optional anchor link (&quot;page
    * jump&quot;).&lt;br&gt; Corresponds to `ClaimReview.url`
    */
  var url: js.UndefOr[String] = js.undefined
}
object SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup {
  
  @scala.inline
  def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup]
  }
  
  @scala.inline
  implicit class SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupMutableBuilder[Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClaimAppearances(value: js.Array[String]): Self = StObject.set(x, "claimAppearances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimAppearancesUndefined: Self = StObject.set(x, "claimAppearances", js.undefined)
    
    @scala.inline
    def setClaimAppearancesVarargs(value: String*): Self = StObject.set(x, "claimAppearances", js.Array(value :_*))
    
    @scala.inline
    def setClaimAuthor(value: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor): Self = StObject.set(x, "claimAuthor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimAuthorUndefined: Self = StObject.set(x, "claimAuthor", js.undefined)
    
    @scala.inline
    def setClaimDate(value: String): Self = StObject.set(x, "claimDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimDateUndefined: Self = StObject.set(x, "claimDate", js.undefined)
    
    @scala.inline
    def setClaimFirstAppearance(value: String): Self = StObject.set(x, "claimFirstAppearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimFirstAppearanceUndefined: Self = StObject.set(x, "claimFirstAppearance", js.undefined)
    
    @scala.inline
    def setClaimLocation(value: String): Self = StObject.set(x, "claimLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimLocationUndefined: Self = StObject.set(x, "claimLocation", js.undefined)
    
    @scala.inline
    def setClaimReviewed(value: String): Self = StObject.set(x, "claimReviewed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimReviewedUndefined: Self = StObject.set(x, "claimReviewed", js.undefined)
    
    @scala.inline
    def setRating(value: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
