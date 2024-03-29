package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityPoliciesListPreconfiguredExpressionSetsResponse extends StObject {
  
  var preconfiguredExpressionSets: js.UndefOr[SecurityPoliciesWafConfig] = js.undefined
}
object SecurityPoliciesListPreconfiguredExpressionSetsResponse {
  
  inline def apply(): SecurityPoliciesListPreconfiguredExpressionSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityPoliciesListPreconfiguredExpressionSetsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityPoliciesListPreconfiguredExpressionSetsResponse] (val x: Self) extends AnyVal {
    
    inline def setPreconfiguredExpressionSets(value: SecurityPoliciesWafConfig): Self = StObject.set(x, "preconfiguredExpressionSets", value.asInstanceOf[js.Any])
    
    inline def setPreconfiguredExpressionSetsUndefined: Self = StObject.set(x, "preconfiguredExpressionSets", js.undefined)
  }
}
