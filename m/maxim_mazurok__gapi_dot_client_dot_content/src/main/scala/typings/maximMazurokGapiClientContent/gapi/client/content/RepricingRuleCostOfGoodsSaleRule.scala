package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepricingRuleCostOfGoodsSaleRule extends StObject {
  
  /** The percent change against the COGS. Ex: 20 would mean to set the adjusted price 1.2X of the COGS data. */
  var percentageDelta: js.UndefOr[Double] = js.undefined
  
  /** The price delta against the COGS. E.g. 2 means $2 more of the COGS. */
  var priceDelta: js.UndefOr[String] = js.undefined
}
object RepricingRuleCostOfGoodsSaleRule {
  
  inline def apply(): RepricingRuleCostOfGoodsSaleRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepricingRuleCostOfGoodsSaleRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepricingRuleCostOfGoodsSaleRule] (val x: Self) extends AnyVal {
    
    inline def setPercentageDelta(value: Double): Self = StObject.set(x, "percentageDelta", value.asInstanceOf[js.Any])
    
    inline def setPercentageDeltaUndefined: Self = StObject.set(x, "percentageDelta", js.undefined)
    
    inline def setPriceDelta(value: String): Self = StObject.set(x, "priceDelta", value.asInstanceOf[js.Any])
    
    inline def setPriceDeltaUndefined: Self = StObject.set(x, "priceDelta", js.undefined)
  }
}
