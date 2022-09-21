package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRepricingRuleReportsResponse extends StObject {
  
  /** A token for retrieving the next page. Its absence means there is no subsequent page. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Daily reports for the given Repricing rule. */
  var repricingRuleReports: js.UndefOr[js.Array[RepricingRuleReport]] = js.undefined
}
object ListRepricingRuleReportsResponse {
  
  inline def apply(): ListRepricingRuleReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRepricingRuleReportsResponse]
  }
  
  extension [Self <: ListRepricingRuleReportsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRepricingRuleReports(value: js.Array[RepricingRuleReport]): Self = StObject.set(x, "repricingRuleReports", value.asInstanceOf[js.Any])
    
    inline def setRepricingRuleReportsUndefined: Self = StObject.set(x, "repricingRuleReports", js.undefined)
    
    inline def setRepricingRuleReportsVarargs(value: RepricingRuleReport*): Self = StObject.set(x, "repricingRuleReports", js.Array(value*))
  }
}
