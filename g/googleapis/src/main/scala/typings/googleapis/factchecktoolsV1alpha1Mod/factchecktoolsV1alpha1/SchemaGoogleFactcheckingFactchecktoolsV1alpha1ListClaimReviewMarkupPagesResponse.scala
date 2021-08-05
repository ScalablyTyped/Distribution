package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response from listing `ClaimReview` markup.
  */
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse extends StObject {
  
  /**
    * The result list of pages of `ClaimReview` markup.
    */
  var claimReviewMarkupPages: js.UndefOr[js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]] = js.undefined
  
  /**
    * The next pagination token in the Search response. It should be used as
    * the `page_token` for the following request. An empty value means no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaGoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse {
  
  inline def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse]
  }
  
  extension [Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse](x: Self) {
    
    inline def setClaimReviewMarkupPages(value: js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]): Self = StObject.set(x, "claimReviewMarkupPages", value.asInstanceOf[js.Any])
    
    inline def setClaimReviewMarkupPagesUndefined: Self = StObject.set(x, "claimReviewMarkupPages", js.undefined)
    
    inline def setClaimReviewMarkupPagesVarargs(value: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage*): Self = StObject.set(x, "claimReviewMarkupPages", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
