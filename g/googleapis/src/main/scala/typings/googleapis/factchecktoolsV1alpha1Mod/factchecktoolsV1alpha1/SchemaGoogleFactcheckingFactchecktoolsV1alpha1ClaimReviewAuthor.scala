package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the claim review author.
  */
@js.native
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor extends StObject {
  
  /**
    * Corresponds to `ClaimReview.author.image`.
    */
  var imageUrl: js.UndefOr[String] = js.native
  
  /**
    * Name of the organization that is publishing the fact check.&lt;br&gt;
    * Corresponds to `ClaimReview.author.name`.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor {
  
  @scala.inline
  def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor]
  }
  
  @scala.inline
  implicit class SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthorMutableBuilder[Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
