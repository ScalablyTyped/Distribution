package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRepricingRuleRestriction extends StObject {
  
  /**
    * The inclusive floor lower bound. The repricing rule only applies when new price \>= floor.
    */
  var floor: js.UndefOr[SchemaRepricingRuleRestrictionBoundary] = js.undefined
  
  /**
    * If true, use the AUTO_PRICING_MIN_PRICE offer attribute as the lower bound of the rule. If use_auto_pricing_min_price is true, then only offers with `AUTO_PRICING_MIN_PRICE` existing on the offer will get Repricer treatment, even if a floor value is set on the rule. Also, if use_auto_pricing_min_price is true, the floor restriction will be ignored.
    */
  var useAutoPricingMinPrice: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaRepricingRuleRestriction {
  
  inline def apply(): SchemaRepricingRuleRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepricingRuleRestriction]
  }
  
  extension [Self <: SchemaRepricingRuleRestriction](x: Self) {
    
    inline def setFloor(value: SchemaRepricingRuleRestrictionBoundary): Self = StObject.set(x, "floor", value.asInstanceOf[js.Any])
    
    inline def setFloorUndefined: Self = StObject.set(x, "floor", js.undefined)
    
    inline def setUseAutoPricingMinPrice(value: Boolean): Self = StObject.set(x, "useAutoPricingMinPrice", value.asInstanceOf[js.Any])
    
    inline def setUseAutoPricingMinPriceNull: Self = StObject.set(x, "useAutoPricingMinPrice", null)
    
    inline def setUseAutoPricingMinPriceUndefined: Self = StObject.set(x, "useAutoPricingMinPrice", js.undefined)
  }
}
