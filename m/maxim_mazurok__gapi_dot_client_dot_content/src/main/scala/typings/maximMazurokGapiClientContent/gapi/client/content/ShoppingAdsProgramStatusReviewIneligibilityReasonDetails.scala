package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShoppingAdsProgramStatusReviewIneligibilityReasonDetails extends StObject {
  
  /** This timestamp represents end of cooldown period for review ineligbility reason `IN_COOLDOWN_PERIOD`. */
  var cooldownTime: js.UndefOr[String] = js.undefined
}
object ShoppingAdsProgramStatusReviewIneligibilityReasonDetails {
  
  inline def apply(): ShoppingAdsProgramStatusReviewIneligibilityReasonDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShoppingAdsProgramStatusReviewIneligibilityReasonDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShoppingAdsProgramStatusReviewIneligibilityReasonDetails] (val x: Self) extends AnyVal {
    
    inline def setCooldownTime(value: String): Self = StObject.set(x, "cooldownTime", value.asInstanceOf[js.Any])
    
    inline def setCooldownTimeUndefined: Self = StObject.set(x, "cooldownTime", js.undefined)
  }
}
