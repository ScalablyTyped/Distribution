package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListRepricingRuleReportsResponse extends StObject {
  
  /**
    * A token for retrieving the next page. Its absence means there is no subsequent page.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Daily reports for the given Repricing rule.
    */
  var repricingRuleReports: js.UndefOr[js.Array[SchemaRepricingRuleReport]] = js.undefined
}
object SchemaListRepricingRuleReportsResponse {
  
  inline def apply(): SchemaListRepricingRuleReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListRepricingRuleReportsResponse]
  }
  
  extension [Self <: SchemaListRepricingRuleReportsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRepricingRuleReports(value: js.Array[SchemaRepricingRuleReport]): Self = StObject.set(x, "repricingRuleReports", value.asInstanceOf[js.Any])
    
    inline def setRepricingRuleReportsUndefined: Self = StObject.set(x, "repricingRuleReports", js.undefined)
    
    inline def setRepricingRuleReportsVarargs(value: SchemaRepricingRuleReport*): Self = StObject.set(x, "repricingRuleReports", js.Array(value*))
  }
}
