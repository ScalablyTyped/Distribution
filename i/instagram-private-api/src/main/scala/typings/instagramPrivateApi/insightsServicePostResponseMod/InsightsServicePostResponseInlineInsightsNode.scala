package typings.instagramPrivateApi.insightsServicePostResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServicePostResponseInlineInsightsNode extends StObject {
  
  var error: Null = js.native
  
  var metrics: InsightsServicePostResponseMetrics = js.native
  
  var state: String = js.native
}
object InsightsServicePostResponseInlineInsightsNode {
  
  @scala.inline
  def apply(error: Null, metrics: InsightsServicePostResponseMetrics, state: String): InsightsServicePostResponseInlineInsightsNode = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseInlineInsightsNode]
  }
  
  @scala.inline
  implicit class InsightsServicePostResponseInlineInsightsNodeMutableBuilder[Self <: InsightsServicePostResponseInlineInsightsNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Null): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetrics(value: InsightsServicePostResponseMetrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
