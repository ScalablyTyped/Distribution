package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFreeListingsProgramStatusReviewIneligibilityReasonDetails extends StObject {
  
  /**
    * This timestamp represents end of cooldown period for review ineligbility reason `IN_COOLDOWN_PERIOD`.
    */
  var cooldownTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaFreeListingsProgramStatusReviewIneligibilityReasonDetails {
  
  inline def apply(): SchemaFreeListingsProgramStatusReviewIneligibilityReasonDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFreeListingsProgramStatusReviewIneligibilityReasonDetails]
  }
  
  extension [Self <: SchemaFreeListingsProgramStatusReviewIneligibilityReasonDetails](x: Self) {
    
    inline def setCooldownTime(value: String): Self = StObject.set(x, "cooldownTime", value.asInstanceOf[js.Any])
    
    inline def setCooldownTimeNull: Self = StObject.set(x, "cooldownTime", null)
    
    inline def setCooldownTimeUndefined: Self = StObject.set(x, "cooldownTime", js.undefined)
  }
}
