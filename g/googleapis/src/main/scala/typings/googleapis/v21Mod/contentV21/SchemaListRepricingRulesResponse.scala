package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListRepricingRulesResponse extends StObject {
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The rules from the specified merchant.
    */
  var repricingRules: js.UndefOr[js.Array[SchemaRepricingRule]] = js.undefined
}
object SchemaListRepricingRulesResponse {
  
  inline def apply(): SchemaListRepricingRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListRepricingRulesResponse]
  }
  
  extension [Self <: SchemaListRepricingRulesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRepricingRules(value: js.Array[SchemaRepricingRule]): Self = StObject.set(x, "repricingRules", value.asInstanceOf[js.Any])
    
    inline def setRepricingRulesUndefined: Self = StObject.set(x, "repricingRules", js.undefined)
    
    inline def setRepricingRulesVarargs(value: SchemaRepricingRule*): Self = StObject.set(x, "repricingRules", js.Array(value*))
  }
}
