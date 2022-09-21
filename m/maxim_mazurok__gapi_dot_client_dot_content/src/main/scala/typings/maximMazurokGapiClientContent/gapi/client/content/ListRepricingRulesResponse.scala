package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRepricingRulesResponse extends StObject {
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The rules from the specified merchant. */
  var repricingRules: js.UndefOr[js.Array[RepricingRule]] = js.undefined
}
object ListRepricingRulesResponse {
  
  inline def apply(): ListRepricingRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRepricingRulesResponse]
  }
  
  extension [Self <: ListRepricingRulesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRepricingRules(value: js.Array[RepricingRule]): Self = StObject.set(x, "repricingRules", value.asInstanceOf[js.Any])
    
    inline def setRepricingRulesUndefined: Self = StObject.set(x, "repricingRules", js.undefined)
    
    inline def setRepricingRulesVarargs(value: RepricingRule*): Self = StObject.set(x, "repricingRules", js.Array(value*))
  }
}
