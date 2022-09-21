package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim extends StObject {
  
  /**
    * The date that the claim was made.
    */
  var claimDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * One or more reviews of this claim (namely, a fact-checking article).
    */
  var claimReview: js.UndefOr[js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReview]] = js.undefined
  
  /**
    * A person or organization stating the claim. For instance, "John Doe".
    */
  var claimant: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The claim text. For instance, "Crime has doubled in the last 2 years."
    */
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim {
  
  inline def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim]
  }
  
  extension [Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim](x: Self) {
    
    inline def setClaimDate(value: String): Self = StObject.set(x, "claimDate", value.asInstanceOf[js.Any])
    
    inline def setClaimDateNull: Self = StObject.set(x, "claimDate", null)
    
    inline def setClaimDateUndefined: Self = StObject.set(x, "claimDate", js.undefined)
    
    inline def setClaimReview(value: js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReview]): Self = StObject.set(x, "claimReview", value.asInstanceOf[js.Any])
    
    inline def setClaimReviewUndefined: Self = StObject.set(x, "claimReview", js.undefined)
    
    inline def setClaimReviewVarargs(value: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReview*): Self = StObject.set(x, "claimReview", js.Array(value*))
    
    inline def setClaimant(value: String): Self = StObject.set(x, "claimant", value.asInstanceOf[js.Any])
    
    inline def setClaimantNull: Self = StObject.set(x, "claimant", null)
    
    inline def setClaimantUndefined: Self = StObject.set(x, "claimant", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
