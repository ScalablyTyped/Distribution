package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRepricingRuleCostOfGoodsSaleRule extends StObject {
  
  /**
    * The percent change against the COGS. Ex: 20 would mean to set the adjusted price 1.2X of the COGS data.
    */
  var percentageDelta: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The price delta against the COGS. E.g. 2 means $2 more of the COGS.
    */
  var priceDelta: js.UndefOr[String | Null] = js.undefined
}
object SchemaRepricingRuleCostOfGoodsSaleRule {
  
  inline def apply(): SchemaRepricingRuleCostOfGoodsSaleRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepricingRuleCostOfGoodsSaleRule]
  }
  
  extension [Self <: SchemaRepricingRuleCostOfGoodsSaleRule](x: Self) {
    
    inline def setPercentageDelta(value: Double): Self = StObject.set(x, "percentageDelta", value.asInstanceOf[js.Any])
    
    inline def setPercentageDeltaNull: Self = StObject.set(x, "percentageDelta", null)
    
    inline def setPercentageDeltaUndefined: Self = StObject.set(x, "percentageDelta", js.undefined)
    
    inline def setPriceDelta(value: String): Self = StObject.set(x, "priceDelta", value.asInstanceOf[js.Any])
    
    inline def setPriceDeltaNull: Self = StObject.set(x, "priceDelta", null)
    
    inline def setPriceDeltaUndefined: Self = StObject.set(x, "priceDelta", js.undefined)
  }
}
