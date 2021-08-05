package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the claim review author.
  */
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor extends StObject {
  
  /**
    * Corresponds to `ClaimReview.author.image`.
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the organization that is publishing the fact check.&lt;br&gt;
    * Corresponds to `ClaimReview.author.name`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor {
  
  inline def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor]
  }
  
  extension [Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor](x: Self) {
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
