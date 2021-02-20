package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepricingRuleRestrictionBoundary extends StObject {
  
  /**
    * The percentage delta relative to the offer selling price. This field is signed. It must be negative in floor. When it is used in floor, it should be > -100. For example, if an offer
    * is selling at $10 and this field is -30 in floor, the repricing rule only applies if the calculated new price is >= $7.
    */
  var percentageDelta: js.UndefOr[Double] = js.native
  
  /**
    * The price micros relative to the offer selling price. This field is signed. It must be negative in floor. For example, if an offer is selling at $10 and this field is -$2 in floor,
    * the repricing rule only applies if the calculated new price is >= $8.
    */
  var priceDelta: js.UndefOr[String] = js.native
}
object RepricingRuleRestrictionBoundary {
  
  @scala.inline
  def apply(): RepricingRuleRestrictionBoundary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepricingRuleRestrictionBoundary]
  }
  
  @scala.inline
  implicit class RepricingRuleRestrictionBoundaryMutableBuilder[Self <: RepricingRuleRestrictionBoundary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPercentageDelta(value: Double): Self = StObject.set(x, "percentageDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentageDeltaUndefined: Self = StObject.set(x, "percentageDelta", js.undefined)
    
    @scala.inline
    def setPriceDelta(value: String): Self = StObject.set(x, "priceDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceDeltaUndefined: Self = StObject.set(x, "priceDelta", js.undefined)
  }
}
