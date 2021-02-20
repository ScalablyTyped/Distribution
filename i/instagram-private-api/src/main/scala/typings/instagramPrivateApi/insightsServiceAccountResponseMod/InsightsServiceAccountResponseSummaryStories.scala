package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponseSummaryStories extends StObject {
  
  var count: Double = js.native
  
  var edges: js.Array[_] = js.native
}
object InsightsServiceAccountResponseSummaryStories {
  
  @scala.inline
  def apply(count: Double, edges: js.Array[_]): InsightsServiceAccountResponseSummaryStories = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseSummaryStories]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseSummaryStoriesMutableBuilder[Self <: InsightsServiceAccountResponseSummaryStories] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdges(value: js.Array[_]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgesVarargs(value: js.Any*): Self = StObject.set(x, "edges", js.Array(value :_*))
  }
}
