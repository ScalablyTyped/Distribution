package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepricingRuleEligibleOfferMatcherStringMatcher extends StObject {
  
  /**
    * String attributes, as long as such attribute of an offer is one of the string attribute values, the offer is considered as passing the matcher. The string matcher checks an offer
    * for inclusivity in the string attributes, not equality. Only literal string matching is supported, no regex.
    */
  var strAttributes: js.UndefOr[js.Array[String]] = js.undefined
}
object RepricingRuleEligibleOfferMatcherStringMatcher {
  
  @scala.inline
  def apply(): RepricingRuleEligibleOfferMatcherStringMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepricingRuleEligibleOfferMatcherStringMatcher]
  }
  
  @scala.inline
  implicit class RepricingRuleEligibleOfferMatcherStringMatcherMutableBuilder[Self <: RepricingRuleEligibleOfferMatcherStringMatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStrAttributes(value: js.Array[String]): Self = StObject.set(x, "strAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrAttributesUndefined: Self = StObject.set(x, "strAttributes", js.undefined)
    
    @scala.inline
    def setStrAttributesVarargs(value: String*): Self = StObject.set(x, "strAttributes", js.Array(value :_*))
  }
}
