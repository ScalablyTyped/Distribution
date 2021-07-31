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
  
  @scala.inline
  def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponseMutableBuilder[Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClaimReviewMarkupPages(value: js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]): Self = StObject.set(x, "claimReviewMarkupPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimReviewMarkupPagesUndefined: Self = StObject.set(x, "claimReviewMarkupPages", js.undefined)
    
    @scala.inline
    def setClaimReviewMarkupPagesVarargs(value: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage*): Self = StObject.set(x, "claimReviewMarkupPages", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
