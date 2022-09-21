package typings.googletag.googletag

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object representing the reward associated with a [rewarded ad](https://support.google.com/admanager/answer/9116812).
  *
  * **See also**
  * - [Display a rewarded ad](https://developers.google.com/publisher-tag/samples/display-rewarded-ad)
  */
trait RewardedPayload extends StObject {
  
  /**
    * The number of items included in the reward.
    */
  var amount: Double
  
  /**
    * The type of item included in the reward (for example, "coin").
    */
  var `type`: String
}
object RewardedPayload {
  
  inline def apply(amount: Double, `type`: String): RewardedPayload = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RewardedPayload]
  }
  
  extension [Self <: RewardedPayload](x: Self) {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
