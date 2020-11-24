package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepricingRuleRestrictionBoundary extends js.Object {
  
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
  implicit class RepricingRuleRestrictionBoundaryOps[Self <: RepricingRuleRestrictionBoundary] (val x: Self) extends AnyVal {
    
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
    def setPercentageDelta(value: Double): Self = this.set("percentageDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentageDelta: Self = this.set("percentageDelta", js.undefined)
    
    @scala.inline
    def setPriceDelta(value: String): Self = this.set("priceDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriceDelta: Self = this.set("priceDelta", js.undefined)
  }
}
