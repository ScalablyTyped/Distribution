package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepricingRuleRestriction extends StObject {
  
  /** The inclusive floor lower bound. The repricing rule only applies when new price >= floor. */
  var floor: js.UndefOr[RepricingRuleRestrictionBoundary] = js.undefined
  
  /**
    * If true, use the AUTO_PRICING_MIN_PRICE offer attribute as the lower bound of the rule. If use_auto_pricing_min_price is true, then only offers with `AUTO_PRICING_MIN_PRICE`
    * existing on the offer will get Repricer treatment, even if a floor value is set on the rule. Also, if use_auto_pricing_min_price is true, the floor restriction will be ignored.
    */
  var useAutoPricingMinPrice: js.UndefOr[Boolean] = js.undefined
}
object RepricingRuleRestriction {
  
  inline def apply(): RepricingRuleRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepricingRuleRestriction]
  }
  
  extension [Self <: RepricingRuleRestriction](x: Self) {
    
    inline def setFloor(value: RepricingRuleRestrictionBoundary): Self = StObject.set(x, "floor", value.asInstanceOf[js.Any])
    
    inline def setFloorUndefined: Self = StObject.set(x, "floor", js.undefined)
    
    inline def setUseAutoPricingMinPrice(value: Boolean): Self = StObject.set(x, "useAutoPricingMinPrice", value.asInstanceOf[js.Any])
    
    inline def setUseAutoPricingMinPriceUndefined: Self = StObject.set(x, "useAutoPricingMinPrice", js.undefined)
  }
}
