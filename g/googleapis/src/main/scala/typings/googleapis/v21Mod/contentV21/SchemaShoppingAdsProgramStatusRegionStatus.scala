package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShoppingAdsProgramStatusRegionStatus extends StObject {
  
  /**
    * Date by which eligibilityStatus will go from `WARNING` to `DISAPPROVED`. Only visible when your eligibilityStatus is WARNING. In [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DD`.
    */
  var disapprovalDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Eligibility status of the Shopping Ads program.
    */
  var eligibilityStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Issues that must be fixed to be eligible for review.
    */
  var onboardingIssues: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The two-letter [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) codes for all the regions with the same `eligibilityStatus` and `reviewEligibility`.
    */
  var regionCodes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * If a program is eligible for review in a specific region. Only visible if `eligibilityStatus` is `DISAPPROVED`.
    */
  var reviewEligibilityStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Review ineligibility reason if account is not eligible for review.
    */
  var reviewIneligibilityReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Reason a program in a specific region isn’t eligible for review. Only visible if `reviewEligibilityStatus` is `INELIGIBLE`.
    */
  var reviewIneligibilityReasonDescription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additional information for ineligibility. If `reviewIneligibilityReason` is `IN_COOLDOWN_PERIOD`, a timestamp for the end of the cooldown period is provided.
    */
  var reviewIneligibilityReasonDetails: js.UndefOr[SchemaShoppingAdsProgramStatusReviewIneligibilityReasonDetails] = js.undefined
  
  /**
    * Issues evaluated in the review process. Fix all issues before requesting a review.
    */
  var reviewIssues: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaShoppingAdsProgramStatusRegionStatus {
  
  inline def apply(): SchemaShoppingAdsProgramStatusRegionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShoppingAdsProgramStatusRegionStatus]
  }
  
  extension [Self <: SchemaShoppingAdsProgramStatusRegionStatus](x: Self) {
    
    inline def setDisapprovalDate(value: String): Self = StObject.set(x, "disapprovalDate", value.asInstanceOf[js.Any])
    
    inline def setDisapprovalDateNull: Self = StObject.set(x, "disapprovalDate", null)
    
    inline def setDisapprovalDateUndefined: Self = StObject.set(x, "disapprovalDate", js.undefined)
    
    inline def setEligibilityStatus(value: String): Self = StObject.set(x, "eligibilityStatus", value.asInstanceOf[js.Any])
    
    inline def setEligibilityStatusNull: Self = StObject.set(x, "eligibilityStatus", null)
    
    inline def setEligibilityStatusUndefined: Self = StObject.set(x, "eligibilityStatus", js.undefined)
    
    inline def setOnboardingIssues(value: js.Array[String]): Self = StObject.set(x, "onboardingIssues", value.asInstanceOf[js.Any])
    
    inline def setOnboardingIssuesNull: Self = StObject.set(x, "onboardingIssues", null)
    
    inline def setOnboardingIssuesUndefined: Self = StObject.set(x, "onboardingIssues", js.undefined)
    
    inline def setOnboardingIssuesVarargs(value: String*): Self = StObject.set(x, "onboardingIssues", js.Array(value*))
    
    inline def setRegionCodes(value: js.Array[String]): Self = StObject.set(x, "regionCodes", value.asInstanceOf[js.Any])
    
    inline def setRegionCodesNull: Self = StObject.set(x, "regionCodes", null)
    
    inline def setRegionCodesUndefined: Self = StObject.set(x, "regionCodes", js.undefined)
    
    inline def setRegionCodesVarargs(value: String*): Self = StObject.set(x, "regionCodes", js.Array(value*))
    
    inline def setReviewEligibilityStatus(value: String): Self = StObject.set(x, "reviewEligibilityStatus", value.asInstanceOf[js.Any])
    
    inline def setReviewEligibilityStatusNull: Self = StObject.set(x, "reviewEligibilityStatus", null)
    
    inline def setReviewEligibilityStatusUndefined: Self = StObject.set(x, "reviewEligibilityStatus", js.undefined)
    
    inline def setReviewIneligibilityReason(value: String): Self = StObject.set(x, "reviewIneligibilityReason", value.asInstanceOf[js.Any])
    
    inline def setReviewIneligibilityReasonDescription(value: String): Self = StObject.set(x, "reviewIneligibilityReasonDescription", value.asInstanceOf[js.Any])
    
    inline def setReviewIneligibilityReasonDescriptionNull: Self = StObject.set(x, "reviewIneligibilityReasonDescription", null)
    
    inline def setReviewIneligibilityReasonDescriptionUndefined: Self = StObject.set(x, "reviewIneligibilityReasonDescription", js.undefined)
    
    inline def setReviewIneligibilityReasonDetails(value: SchemaShoppingAdsProgramStatusReviewIneligibilityReasonDetails): Self = StObject.set(x, "reviewIneligibilityReasonDetails", value.asInstanceOf[js.Any])
    
    inline def setReviewIneligibilityReasonDetailsUndefined: Self = StObject.set(x, "reviewIneligibilityReasonDetails", js.undefined)
    
    inline def setReviewIneligibilityReasonNull: Self = StObject.set(x, "reviewIneligibilityReason", null)
    
    inline def setReviewIneligibilityReasonUndefined: Self = StObject.set(x, "reviewIneligibilityReason", js.undefined)
    
    inline def setReviewIssues(value: js.Array[String]): Self = StObject.set(x, "reviewIssues", value.asInstanceOf[js.Any])
    
    inline def setReviewIssuesNull: Self = StObject.set(x, "reviewIssues", null)
    
    inline def setReviewIssuesUndefined: Self = StObject.set(x, "reviewIssues", js.undefined)
    
    inline def setReviewIssuesVarargs(value: String*): Self = StObject.set(x, "reviewIssues", js.Array(value*))
  }
}
