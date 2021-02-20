package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreconfiguredWafSet extends StObject {
  
  /** List of entities that are currently supported for WAF rules. */
  var expressionSets: js.UndefOr[js.Array[WafExpressionSet]] = js.native
}
object PreconfiguredWafSet {
  
  @scala.inline
  def apply(): PreconfiguredWafSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreconfiguredWafSet]
  }
  
  @scala.inline
  implicit class PreconfiguredWafSetMutableBuilder[Self <: PreconfiguredWafSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpressionSets(value: js.Array[WafExpressionSet]): Self = StObject.set(x, "expressionSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionSetsUndefined: Self = StObject.set(x, "expressionSets", js.undefined)
    
    @scala.inline
    def setExpressionSetsVarargs(value: WafExpressionSet*): Self = StObject.set(x, "expressionSets", js.Array(value :_*))
  }
}
