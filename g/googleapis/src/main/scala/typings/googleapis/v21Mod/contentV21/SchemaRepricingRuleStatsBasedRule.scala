package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRepricingRuleStatsBasedRule extends StObject {
  
  /**
    * The percent change against the price target. Valid from 0 to 100 inclusively.
    */
  var percentageDelta: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The price delta against the above price target. A positive value means the price should be adjusted to be above statistical measure, and a negative value means below. Currency code must not be included.
    */
  var priceDelta: js.UndefOr[String | Null] = js.undefined
}
object SchemaRepricingRuleStatsBasedRule {
  
  inline def apply(): SchemaRepricingRuleStatsBasedRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepricingRuleStatsBasedRule]
  }
  
  extension [Self <: SchemaRepricingRuleStatsBasedRule](x: Self) {
    
    inline def setPercentageDelta(value: Double): Self = StObject.set(x, "percentageDelta", value.asInstanceOf[js.Any])
    
    inline def setPercentageDeltaNull: Self = StObject.set(x, "percentageDelta", null)
    
    inline def setPercentageDeltaUndefined: Self = StObject.set(x, "percentageDelta", js.undefined)
    
    inline def setPriceDelta(value: String): Self = StObject.set(x, "priceDelta", value.asInstanceOf[js.Any])
    
    inline def setPriceDeltaNull: Self = StObject.set(x, "priceDelta", null)
    
    inline def setPriceDeltaUndefined: Self = StObject.set(x, "priceDelta", js.undefined)
  }
}
