package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating extends StObject {
  
  /**
    * For numeric ratings, the best value possible in the scale from worst to best. Corresponds to `ClaimReview.reviewRating.bestRating`.
    */
  var bestRating: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Corresponds to `ClaimReview.reviewRating.image`.
    */
  var imageUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Corresponds to `ClaimReview.reviewRating.ratingExplanation`.
    */
  var ratingExplanation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A numeric rating of this claim, in the range worstRating — bestRating inclusive. Corresponds to `ClaimReview.reviewRating.ratingValue`.
    */
  var ratingValue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The truthfulness rating as a human-readible short word or phrase. Corresponds to `ClaimReview.reviewRating.alternateName`.
    */
  var textualRating: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For numeric ratings, the worst value possible in the scale from worst to best. Corresponds to `ClaimReview.reviewRating.worstRating`.
    */
  var worstRating: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating {
  
  inline def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating]
  }
  
  extension [Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating](x: Self) {
    
    inline def setBestRating(value: Double): Self = StObject.set(x, "bestRating", value.asInstanceOf[js.Any])
    
    inline def setBestRatingNull: Self = StObject.set(x, "bestRating", null)
    
    inline def setBestRatingUndefined: Self = StObject.set(x, "bestRating", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlNull: Self = StObject.set(x, "imageUrl", null)
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setRatingExplanation(value: String): Self = StObject.set(x, "ratingExplanation", value.asInstanceOf[js.Any])
    
    inline def setRatingExplanationNull: Self = StObject.set(x, "ratingExplanation", null)
    
    inline def setRatingExplanationUndefined: Self = StObject.set(x, "ratingExplanation", js.undefined)
    
    inline def setRatingValue(value: Double): Self = StObject.set(x, "ratingValue", value.asInstanceOf[js.Any])
    
    inline def setRatingValueNull: Self = StObject.set(x, "ratingValue", null)
    
    inline def setRatingValueUndefined: Self = StObject.set(x, "ratingValue", js.undefined)
    
    inline def setTextualRating(value: String): Self = StObject.set(x, "textualRating", value.asInstanceOf[js.Any])
    
    inline def setTextualRatingNull: Self = StObject.set(x, "textualRating", null)
    
    inline def setTextualRatingUndefined: Self = StObject.set(x, "textualRating", js.undefined)
    
    inline def setWorstRating(value: Double): Self = StObject.set(x, "worstRating", value.asInstanceOf[js.Any])
    
    inline def setWorstRatingNull: Self = StObject.set(x, "worstRating", null)
    
    inline def setWorstRatingUndefined: Self = StObject.set(x, "worstRating", js.undefined)
  }
}
