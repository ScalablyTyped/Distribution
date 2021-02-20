package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponseAccountActionsGraph extends StObject {
  
  var total_count_graph: InsightsServiceAccountResponseTotalCountGraph = js.native
}
object InsightsServiceAccountResponseAccountActionsGraph {
  
  @scala.inline
  def apply(total_count_graph: InsightsServiceAccountResponseTotalCountGraph): InsightsServiceAccountResponseAccountActionsGraph = {
    val __obj = js.Dynamic.literal(total_count_graph = total_count_graph.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseAccountActionsGraph]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseAccountActionsGraphMutableBuilder[Self <: InsightsServiceAccountResponseAccountActionsGraph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTotal_count_graph(value: InsightsServiceAccountResponseTotalCountGraph): Self = StObject.set(x, "total_count_graph", value.asInstanceOf[js.Any])
  }
}
