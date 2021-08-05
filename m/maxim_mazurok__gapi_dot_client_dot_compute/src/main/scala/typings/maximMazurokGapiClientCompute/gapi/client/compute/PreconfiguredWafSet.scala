package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreconfiguredWafSet extends StObject {
  
  /** List of entities that are currently supported for WAF rules. */
  var expressionSets: js.UndefOr[js.Array[WafExpressionSet]] = js.undefined
}
object PreconfiguredWafSet {
  
  inline def apply(): PreconfiguredWafSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreconfiguredWafSet]
  }
  
  extension [Self <: PreconfiguredWafSet](x: Self) {
    
    inline def setExpressionSets(value: js.Array[WafExpressionSet]): Self = StObject.set(x, "expressionSets", value.asInstanceOf[js.Any])
    
    inline def setExpressionSetsUndefined: Self = StObject.set(x, "expressionSets", js.undefined)
    
    inline def setExpressionSetsVarargs(value: WafExpressionSet*): Self = StObject.set(x, "expressionSets", js.Array(value :_*))
  }
}
