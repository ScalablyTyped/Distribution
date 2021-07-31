package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the claim rating.
  */
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating extends StObject {
  
  /**
    * For numeric ratings, the best value possible in the scale from worst to
    * best.&lt;br&gt; Corresponds to `ClaimReview.reviewRating.bestRating`.
    */
  var bestRating: js.UndefOr[Double] = js.undefined
  
  /**
    * Corresponds to `ClaimReview.reviewRating.image`.
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  
  /**
    * A numeric rating of this claim, in the range worstRating — bestRating
    * inclusive.&lt;br&gt; Corresponds to
    * `ClaimReview.reviewRating.ratingValue`.
    */
  var ratingValue: js.UndefOr[Double] = js.undefined
  
  /**
    * The truthfulness rating as a human-readible short word or
    * phrase.&lt;br&gt; Corresponds to
    * `ClaimReview.reviewRating.alternateName`.
    */
  var textualRating: js.UndefOr[String] = js.undefined
  
  /**
    * For numeric ratings, the worst value possible in the scale from worst to
    * best.&lt;br&gt; Corresponds to `ClaimReview.reviewRating.worstRating`.
    */
  var worstRating: js.UndefOr[Double] = js.undefined
}
object SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating {
  
  @scala.inline
  def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating]
  }
  
  @scala.inline
  implicit class SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRatingMutableBuilder[Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBestRating(value: Double): Self = StObject.set(x, "bestRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBestRatingUndefined: Self = StObject.set(x, "bestRating", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    @scala.inline
    def setRatingValue(value: Double): Self = StObject.set(x, "ratingValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatingValueUndefined: Self = StObject.set(x, "ratingValue", js.undefined)
    
    @scala.inline
    def setTextualRating(value: String): Self = StObject.set(x, "textualRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextualRatingUndefined: Self = StObject.set(x, "textualRating", js.undefined)
    
    @scala.inline
    def setWorstRating(value: Double): Self = StObject.set(x, "worstRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorstRatingUndefined: Self = StObject.set(x, "worstRating", js.undefined)
  }
}
