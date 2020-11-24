package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepricingRuleEligibleOfferMatcherStringMatcher extends js.Object {
  
  /**
    * String attributes, as long as such attribute of an offer is one of the string attribute values, the offer is considered as passing the matcher. The string matcher checks an offer
    * for inclusivity in the string attributes, not equality. Only literal string matching is supported, no regex.
    */
  var strAttributes: js.UndefOr[js.Array[String]] = js.native
}
object RepricingRuleEligibleOfferMatcherStringMatcher {
  
  @scala.inline
  def apply(): RepricingRuleEligibleOfferMatcherStringMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepricingRuleEligibleOfferMatcherStringMatcher]
  }
  
  @scala.inline
  implicit class RepricingRuleEligibleOfferMatcherStringMatcherOps[Self <: RepricingRuleEligibleOfferMatcherStringMatcher] (val x: Self) extends AnyVal {
    
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
    def setStrAttributesVarargs(value: String*): Self = this.set("strAttributes", js.Array(value :_*))
    
    @scala.inline
    def setStrAttributes(value: js.Array[String]): Self = this.set("strAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrAttributes: Self = this.set("strAttributes", js.undefined)
  }
}
