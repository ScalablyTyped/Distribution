package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepricingRuleStatsBasedRule extends StObject {
  
  /** The percent change against the price target. Valid from 0 to 100 inclusively. */
  var percentageDelta: js.UndefOr[Double] = js.undefined
  
  /**
    * The price delta against the above price target. A positive value means the price should be adjusted to be above statistical measure, and a negative value means below. Currency code
    * must not be included.
    */
  var priceDelta: js.UndefOr[String] = js.undefined
}
object RepricingRuleStatsBasedRule {
  
  inline def apply(): RepricingRuleStatsBasedRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepricingRuleStatsBasedRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepricingRuleStatsBasedRule] (val x: Self) extends AnyVal {
    
    inline def setPercentageDelta(value: Double): Self = StObject.set(x, "percentageDelta", value.asInstanceOf[js.Any])
    
    inline def setPercentageDeltaUndefined: Self = StObject.set(x, "percentageDelta", js.undefined)
    
    inline def setPriceDelta(value: String): Self = StObject.set(x, "priceDelta", value.asInstanceOf[js.Any])
    
    inline def setPriceDeltaUndefined: Self = StObject.set(x, "priceDelta", js.undefined)
  }
}
