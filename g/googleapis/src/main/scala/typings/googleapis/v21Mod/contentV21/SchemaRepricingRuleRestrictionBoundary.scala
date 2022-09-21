package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRepricingRuleRestrictionBoundary extends StObject {
  
  /**
    * The percentage delta relative to the offer selling price. This field is signed. It must be negative in floor. When it is used in floor, it should be \> -100. For example, if an offer is selling at $10 and this field is -30 in floor, the repricing rule only applies if the calculated new price is \>= $7.
    */
  var percentageDelta: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The price micros relative to the offer selling price. This field is signed. It must be negative in floor. For example, if an offer is selling at $10 and this field is -$2 in floor, the repricing rule only applies if the calculated new price is \>= $8.
    */
  var priceDelta: js.UndefOr[String | Null] = js.undefined
}
object SchemaRepricingRuleRestrictionBoundary {
  
  inline def apply(): SchemaRepricingRuleRestrictionBoundary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepricingRuleRestrictionBoundary]
  }
  
  extension [Self <: SchemaRepricingRuleRestrictionBoundary](x: Self) {
    
    inline def setPercentageDelta(value: Double): Self = StObject.set(x, "percentageDelta", value.asInstanceOf[js.Any])
    
    inline def setPercentageDeltaNull: Self = StObject.set(x, "percentageDelta", null)
    
    inline def setPercentageDeltaUndefined: Self = StObject.set(x, "percentageDelta", js.undefined)
    
    inline def setPriceDelta(value: String): Self = StObject.set(x, "priceDelta", value.asInstanceOf[js.Any])
    
    inline def setPriceDeltaNull: Self = StObject.set(x, "priceDelta", null)
    
    inline def setPriceDeltaUndefined: Self = StObject.set(x, "priceDelta", js.undefined)
  }
}
