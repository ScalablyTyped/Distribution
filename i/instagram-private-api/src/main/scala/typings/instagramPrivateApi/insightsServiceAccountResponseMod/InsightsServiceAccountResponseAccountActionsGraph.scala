package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServiceAccountResponseAccountActionsGraph extends StObject {
  
  var total_count_graph: InsightsServiceAccountResponseTotalCountGraph
}
object InsightsServiceAccountResponseAccountActionsGraph {
  
  inline def apply(total_count_graph: InsightsServiceAccountResponseTotalCountGraph): InsightsServiceAccountResponseAccountActionsGraph = {
    val __obj = js.Dynamic.literal(total_count_graph = total_count_graph.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseAccountActionsGraph]
  }
  
  extension [Self <: InsightsServiceAccountResponseAccountActionsGraph](x: Self) {
    
    inline def setTotal_count_graph(value: InsightsServiceAccountResponseTotalCountGraph): Self = StObject.set(x, "total_count_graph", value.asInstanceOf[js.Any])
  }
}
