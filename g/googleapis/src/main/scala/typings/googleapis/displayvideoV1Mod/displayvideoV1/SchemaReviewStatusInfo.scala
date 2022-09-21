package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReviewStatusInfo extends StObject {
  
  /**
    * Represents the basic approval needed for a creative to begin serving. Summary of creative_and_landing_page_review_status and content_and_policy_review_status.
    */
  var approvalStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Content and policy review status for the creative.
    */
  var contentAndPolicyReviewStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Creative and landing page review status for the creative.
    */
  var creativeAndLandingPageReviewStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Exchange review statuses for the creative.
    */
  var exchangeReviewStatuses: js.UndefOr[js.Array[SchemaExchangeReviewStatus]] = js.undefined
  
  /**
    * Publisher review statuses for the creative.
    */
  var publisherReviewStatuses: js.UndefOr[js.Array[SchemaPublisherReviewStatus]] = js.undefined
}
object SchemaReviewStatusInfo {
  
  inline def apply(): SchemaReviewStatusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReviewStatusInfo]
  }
  
  extension [Self <: SchemaReviewStatusInfo](x: Self) {
    
    inline def setApprovalStatus(value: String): Self = StObject.set(x, "approvalStatus", value.asInstanceOf[js.Any])
    
    inline def setApprovalStatusNull: Self = StObject.set(x, "approvalStatus", null)
    
    inline def setApprovalStatusUndefined: Self = StObject.set(x, "approvalStatus", js.undefined)
    
    inline def setContentAndPolicyReviewStatus(value: String): Self = StObject.set(x, "contentAndPolicyReviewStatus", value.asInstanceOf[js.Any])
    
    inline def setContentAndPolicyReviewStatusNull: Self = StObject.set(x, "contentAndPolicyReviewStatus", null)
    
    inline def setContentAndPolicyReviewStatusUndefined: Self = StObject.set(x, "contentAndPolicyReviewStatus", js.undefined)
    
    inline def setCreativeAndLandingPageReviewStatus(value: String): Self = StObject.set(x, "creativeAndLandingPageReviewStatus", value.asInstanceOf[js.Any])
    
    inline def setCreativeAndLandingPageReviewStatusNull: Self = StObject.set(x, "creativeAndLandingPageReviewStatus", null)
    
    inline def setCreativeAndLandingPageReviewStatusUndefined: Self = StObject.set(x, "creativeAndLandingPageReviewStatus", js.undefined)
    
    inline def setExchangeReviewStatuses(value: js.Array[SchemaExchangeReviewStatus]): Self = StObject.set(x, "exchangeReviewStatuses", value.asInstanceOf[js.Any])
    
    inline def setExchangeReviewStatusesUndefined: Self = StObject.set(x, "exchangeReviewStatuses", js.undefined)
    
    inline def setExchangeReviewStatusesVarargs(value: SchemaExchangeReviewStatus*): Self = StObject.set(x, "exchangeReviewStatuses", js.Array(value*))
    
    inline def setPublisherReviewStatuses(value: js.Array[SchemaPublisherReviewStatus]): Self = StObject.set(x, "publisherReviewStatuses", value.asInstanceOf[js.Any])
    
    inline def setPublisherReviewStatusesUndefined: Self = StObject.set(x, "publisherReviewStatuses", js.undefined)
    
    inline def setPublisherReviewStatusesVarargs(value: SchemaPublisherReviewStatus*): Self = StObject.set(x, "publisherReviewStatuses", js.Array(value*))
  }
}
