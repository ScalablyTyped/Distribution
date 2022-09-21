package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRepricingRuleEligibleOfferMatcherStringMatcher extends StObject {
  
  /**
    * String attributes, as long as such attribute of an offer is one of the string attribute values, the offer is considered as passing the matcher. The string matcher checks an offer for inclusivity in the string attributes, not equality. Only literal string matching is supported, no regex.
    */
  var strAttributes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaRepricingRuleEligibleOfferMatcherStringMatcher {
  
  inline def apply(): SchemaRepricingRuleEligibleOfferMatcherStringMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepricingRuleEligibleOfferMatcherStringMatcher]
  }
  
  extension [Self <: SchemaRepricingRuleEligibleOfferMatcherStringMatcher](x: Self) {
    
    inline def setStrAttributes(value: js.Array[String]): Self = StObject.set(x, "strAttributes", value.asInstanceOf[js.Any])
    
    inline def setStrAttributesNull: Self = StObject.set(x, "strAttributes", null)
    
    inline def setStrAttributesUndefined: Self = StObject.set(x, "strAttributes", js.undefined)
    
    inline def setStrAttributesVarargs(value: String*): Self = StObject.set(x, "strAttributes", js.Array(value*))
  }
}
