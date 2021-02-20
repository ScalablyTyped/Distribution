package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the claim.
  */
@js.native
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim extends StObject {
  
  /**
    * The date that the claim was made.
    */
  var claimDate: js.UndefOr[String] = js.native
  
  /**
    * One or more reviews of this claim (namely, a fact-checking article).
    */
  var claimReview: js.UndefOr[js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReview]] = js.native
  
  /**
    * A person or organization stating the claim. For instance, &quot;John
    * Doe&quot;.
    */
  var claimant: js.UndefOr[String] = js.native
  
  /**
    * The claim text. For instance, &quot;Crime has doubled in the last 2
    * years.&quot;
    */
  var text: js.UndefOr[String] = js.native
}
object SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim {
  
  @scala.inline
  def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim]
  }
  
  @scala.inline
  implicit class SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimMutableBuilder[Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClaimDate(value: String): Self = StObject.set(x, "claimDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimDateUndefined: Self = StObject.set(x, "claimDate", js.undefined)
    
    @scala.inline
    def setClaimReview(value: js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReview]): Self = StObject.set(x, "claimReview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimReviewUndefined: Self = StObject.set(x, "claimReview", js.undefined)
    
    @scala.inline
    def setClaimReviewVarargs(value: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReview*): Self = StObject.set(x, "claimReview", js.Array(value :_*))
    
    @scala.inline
    def setClaimant(value: String): Self = StObject.set(x, "claimant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimantUndefined: Self = StObject.set(x, "claimant", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
