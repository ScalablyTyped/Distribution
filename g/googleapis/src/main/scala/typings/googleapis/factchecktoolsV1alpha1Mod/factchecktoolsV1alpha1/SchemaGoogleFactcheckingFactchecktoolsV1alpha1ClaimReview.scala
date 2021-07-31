package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a claim review.
  */
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReview extends StObject {
  
  /**
    * The language this review was written in. For instance, &quot;en&quot; or
    * &quot;de&quot;.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * The publisher of this claim review.
    */
  var publisher: js.UndefOr[SchemaGoogleFactcheckingFactchecktoolsV1alpha1Publisher] = js.undefined
  
  /**
    * The date the claim was reviewed.
    */
  var reviewDate: js.UndefOr[String] = js.undefined
  
  /**
    * Textual rating. For instance, &quot;Mostly false&quot;.
    */
  var textualRating: js.UndefOr[String] = js.undefined
  
  /**
    * The title of this claim review, if it can be determined.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of this claim review.
    */
  var url: js.UndefOr[String] = js.undefined
}
object SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReview {
  
  @scala.inline
  def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReview]
  }
  
  @scala.inline
  implicit class SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMutableBuilder[Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setPublisher(value: SchemaGoogleFactcheckingFactchecktoolsV1alpha1Publisher): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    @scala.inline
    def setReviewDate(value: String): Self = StObject.set(x, "reviewDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewDateUndefined: Self = StObject.set(x, "reviewDate", js.undefined)
    
    @scala.inline
    def setTextualRating(value: String): Self = StObject.set(x, "textualRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextualRatingUndefined: Self = StObject.set(x, "textualRating", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
