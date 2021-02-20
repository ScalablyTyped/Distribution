package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the claim author.
  */
@js.native
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor extends StObject {
  
  /**
    * Corresponds to `ClaimReview.itemReviewed.author.image`.
    */
  var imageUrl: js.UndefOr[String] = js.native
  
  /**
    * Corresponds to `ClaimReview.itemReviewed.author.jobTitle`.
    */
  var jobTitle: js.UndefOr[String] = js.native
  
  /**
    * A person or organization stating the claim. For instance, &quot;John
    * Doe&quot;.&lt;br&gt; Corresponds to
    * `ClaimReview.itemReviewed.author.name`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Corresponds to `ClaimReview.itemReviewed.author.sameAs`.
    */
  var sameAs: js.UndefOr[String] = js.native
}
object SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor {
  
  @scala.inline
  def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor]
  }
  
  @scala.inline
  implicit class SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthorMutableBuilder[Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    @scala.inline
    def setJobTitle(value: String): Self = StObject.set(x, "jobTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTitleUndefined: Self = StObject.set(x, "jobTitle", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSameAs(value: String): Self = StObject.set(x, "sameAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSameAsUndefined: Self = StObject.set(x, "sameAs", js.undefined)
  }
}
