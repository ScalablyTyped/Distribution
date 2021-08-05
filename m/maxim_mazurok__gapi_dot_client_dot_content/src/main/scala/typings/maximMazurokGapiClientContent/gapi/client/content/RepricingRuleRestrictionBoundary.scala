package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepricingRuleRestrictionBoundary extends StObject {
  
  /**
    * The percentage delta relative to the offer selling price. This field is signed. It must be negative in floor. When it is used in floor, it should be > -100. For example, if an offer
    * is selling at $10 and this field is -30 in floor, the repricing rule only applies if the calculated new price is >= $7.
    */
  var percentageDelta: js.UndefOr[Double] = js.undefined
  
  /**
    * The price micros relative to the offer selling price. This field is signed. It must be negative in floor. For example, if an offer is selling at $10 and this field is -$2 in floor,
    * the repricing rule only applies if the calculated new price is >= $8.
    */
  var priceDelta: js.UndefOr[String] = js.undefined
}
object RepricingRuleRestrictionBoundary {
  
  inline def apply(): RepricingRuleRestrictionBoundary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepricingRuleRestrictionBoundary]
  }
  
  extension [Self <: RepricingRuleRestrictionBoundary](x: Self) {
    
    inline def setPercentageDelta(value: Double): Self = StObject.set(x, "percentageDelta", value.asInstanceOf[js.Any])
    
    inline def setPercentageDeltaUndefined: Self = StObject.set(x, "percentageDelta", js.undefined)
    
    inline def setPriceDelta(value: String): Self = StObject.set(x, "priceDelta", value.asInstanceOf[js.Any])
    
    inline def setPriceDeltaUndefined: Self = StObject.set(x, "priceDelta", js.undefined)
  }
}
