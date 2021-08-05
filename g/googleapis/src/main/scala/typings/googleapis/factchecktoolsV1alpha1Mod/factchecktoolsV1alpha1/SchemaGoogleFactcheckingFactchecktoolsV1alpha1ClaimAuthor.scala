package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the claim author.
  */
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor extends StObject {
  
  /**
    * Corresponds to `ClaimReview.itemReviewed.author.image`.
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Corresponds to `ClaimReview.itemReviewed.author.jobTitle`.
    */
  var jobTitle: js.UndefOr[String] = js.undefined
  
  /**
    * A person or organization stating the claim. For instance, &quot;John
    * Doe&quot;.&lt;br&gt; Corresponds to
    * `ClaimReview.itemReviewed.author.name`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Corresponds to `ClaimReview.itemReviewed.author.sameAs`.
    */
  var sameAs: js.UndefOr[String] = js.undefined
}
object SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor {
  
  inline def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor]
  }
  
  extension [Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor](x: Self) {
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setJobTitle(value: String): Self = StObject.set(x, "jobTitle", value.asInstanceOf[js.Any])
    
    inline def setJobTitleUndefined: Self = StObject.set(x, "jobTitle", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSameAs(value: String): Self = StObject.set(x, "sameAs", value.asInstanceOf[js.Any])
    
    inline def setSameAsUndefined: Self = StObject.set(x, "sameAs", js.undefined)
  }
}
