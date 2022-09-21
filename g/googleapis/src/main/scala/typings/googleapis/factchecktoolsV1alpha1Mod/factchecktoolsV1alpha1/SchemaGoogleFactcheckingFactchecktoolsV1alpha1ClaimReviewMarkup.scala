package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup extends StObject {
  
  /**
    * A list of links to works in which this claim appears, aside from the one specified in `claim_first_appearance`. Corresponds to `ClaimReview.itemReviewed[@type=Claim].appearance.url`.
    */
  var claimAppearances: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Info about the author of this claim.
    */
  var claimAuthor: js.UndefOr[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor] = js.undefined
  
  /**
    * The date when the claim was made or entered public discourse. Corresponds to `ClaimReview.itemReviewed.datePublished`.
    */
  var claimDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A link to a work in which this claim first appears. Corresponds to `ClaimReview.itemReviewed[@type=Claim].firstAppearance.url`.
    */
  var claimFirstAppearance: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The location where this claim was made. Corresponds to `ClaimReview.itemReviewed.name`.
    */
  var claimLocation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A short summary of the claim being evaluated. Corresponds to `ClaimReview.claimReviewed`.
    */
  var claimReviewed: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Info about the rating of this claim review.
    */
  var rating: js.UndefOr[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating] = js.undefined
  
  /**
    * This field is optional, and will default to the page URL. We provide this field to allow you the override the default value, but the only permitted override is the page URL plus an optional anchor link ("page jump"). Corresponds to `ClaimReview.url`
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup {
  
  inline def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup]
  }
  
  extension [Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup](x: Self) {
    
    inline def setClaimAppearances(value: js.Array[String]): Self = StObject.set(x, "claimAppearances", value.asInstanceOf[js.Any])
    
    inline def setClaimAppearancesNull: Self = StObject.set(x, "claimAppearances", null)
    
    inline def setClaimAppearancesUndefined: Self = StObject.set(x, "claimAppearances", js.undefined)
    
    inline def setClaimAppearancesVarargs(value: String*): Self = StObject.set(x, "claimAppearances", js.Array(value*))
    
    inline def setClaimAuthor(value: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor): Self = StObject.set(x, "claimAuthor", value.asInstanceOf[js.Any])
    
    inline def setClaimAuthorUndefined: Self = StObject.set(x, "claimAuthor", js.undefined)
    
    inline def setClaimDate(value: String): Self = StObject.set(x, "claimDate", value.asInstanceOf[js.Any])
    
    inline def setClaimDateNull: Self = StObject.set(x, "claimDate", null)
    
    inline def setClaimDateUndefined: Self = StObject.set(x, "claimDate", js.undefined)
    
    inline def setClaimFirstAppearance(value: String): Self = StObject.set(x, "claimFirstAppearance", value.asInstanceOf[js.Any])
    
    inline def setClaimFirstAppearanceNull: Self = StObject.set(x, "claimFirstAppearance", null)
    
    inline def setClaimFirstAppearanceUndefined: Self = StObject.set(x, "claimFirstAppearance", js.undefined)
    
    inline def setClaimLocation(value: String): Self = StObject.set(x, "claimLocation", value.asInstanceOf[js.Any])
    
    inline def setClaimLocationNull: Self = StObject.set(x, "claimLocation", null)
    
    inline def setClaimLocationUndefined: Self = StObject.set(x, "claimLocation", js.undefined)
    
    inline def setClaimReviewed(value: String): Self = StObject.set(x, "claimReviewed", value.asInstanceOf[js.Any])
    
    inline def setClaimReviewedNull: Self = StObject.set(x, "claimReviewed", null)
    
    inline def setClaimReviewedUndefined: Self = StObject.set(x, "claimReviewed", js.undefined)
    
    inline def setRating(value: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
