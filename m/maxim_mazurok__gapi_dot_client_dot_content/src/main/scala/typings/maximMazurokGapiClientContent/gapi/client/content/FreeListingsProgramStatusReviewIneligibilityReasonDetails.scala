package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FreeListingsProgramStatusReviewIneligibilityReasonDetails extends StObject {
  
  /** This timestamp represents end of cooldown period for review ineligbility reason `IN_COOLDOWN_PERIOD`. */
  var cooldownTime: js.UndefOr[String] = js.undefined
}
object FreeListingsProgramStatusReviewIneligibilityReasonDetails {
  
  inline def apply(): FreeListingsProgramStatusReviewIneligibilityReasonDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreeListingsProgramStatusReviewIneligibilityReasonDetails]
  }
  
  extension [Self <: FreeListingsProgramStatusReviewIneligibilityReasonDetails](x: Self) {
    
    inline def setCooldownTime(value: String): Self = StObject.set(x, "cooldownTime", value.asInstanceOf[js.Any])
    
    inline def setCooldownTimeUndefined: Self = StObject.set(x, "cooldownTime", js.undefined)
  }
}
