package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepricingRuleRestriction extends js.Object {
  
  /** The inclusive floor lower bound. The repricing rule only applies when new price >= floor. */
  var floor: js.UndefOr[RepricingRuleRestrictionBoundary] = js.native
  
  /**
    * If true, use the AUTO_PRICING_MIN_PRICE offer attribute as the lower bound of the rule. If use_auto_pricing_min_price is true, then only offers with `AUTO_PRICING_MIN_PRICE`
    * existing on the offer will get Repricer treatment, even if a floor value is set on the rule. Also, if use_auto_pricing_min_price is true, the floor restriction will be ignored.
    */
  var useAutoPricingMinPrice: js.UndefOr[Boolean] = js.native
}
object RepricingRuleRestriction {
  
  @scala.inline
  def apply(): RepricingRuleRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepricingRuleRestriction]
  }
  
  @scala.inline
  implicit class RepricingRuleRestrictionOps[Self <: RepricingRuleRestriction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFloor(value: RepricingRuleRestrictionBoundary): Self = this.set("floor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloor: Self = this.set("floor", js.undefined)
    
    @scala.inline
    def setUseAutoPricingMinPrice(value: Boolean): Self = this.set("useAutoPricingMinPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseAutoPricingMinPrice: Self = this.set("useAutoPricingMinPrice", js.undefined)
  }
}
