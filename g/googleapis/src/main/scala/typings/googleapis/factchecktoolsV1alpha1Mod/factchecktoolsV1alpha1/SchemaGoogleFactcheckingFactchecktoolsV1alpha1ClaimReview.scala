package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReview extends StObject {
  
  /**
    * The language this review was written in. For instance, "en" or "de".
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The publisher of this claim review.
    */
  var publisher: js.UndefOr[SchemaGoogleFactcheckingFactchecktoolsV1alpha1Publisher] = js.undefined
  
  /**
    * The date the claim was reviewed.
    */
  var reviewDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Textual rating. For instance, "Mostly false".
    */
  var textualRating: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The title of this claim review, if it can be determined.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL of this claim review.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReview {
  
  inline def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReview]
  }
  
  extension [Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReview](x: Self) {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setPublisher(value: SchemaGoogleFactcheckingFactchecktoolsV1alpha1Publisher): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setReviewDate(value: String): Self = StObject.set(x, "reviewDate", value.asInstanceOf[js.Any])
    
    inline def setReviewDateNull: Self = StObject.set(x, "reviewDate", null)
    
    inline def setReviewDateUndefined: Self = StObject.set(x, "reviewDate", js.undefined)
    
    inline def setTextualRating(value: String): Self = StObject.set(x, "textualRating", value.asInstanceOf[js.Any])
    
    inline def setTextualRatingNull: Self = StObject.set(x, "textualRating", null)
    
    inline def setTextualRatingUndefined: Self = StObject.set(x, "textualRating", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
