package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponseTotalCountGraph extends StObject {
  
  var data_points: js.Array[InsightsServiceAccountResponseDataPointsItem] = js.native
  
  var graph_name: String = js.native
}
object InsightsServiceAccountResponseTotalCountGraph {
  
  @scala.inline
  def apply(data_points: js.Array[InsightsServiceAccountResponseDataPointsItem], graph_name: String): InsightsServiceAccountResponseTotalCountGraph = {
    val __obj = js.Dynamic.literal(data_points = data_points.asInstanceOf[js.Any], graph_name = graph_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseTotalCountGraph]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseTotalCountGraphMutableBuilder[Self <: InsightsServiceAccountResponseTotalCountGraph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData_points(value: js.Array[InsightsServiceAccountResponseDataPointsItem]): Self = StObject.set(x, "data_points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData_pointsVarargs(value: InsightsServiceAccountResponseDataPointsItem*): Self = StObject.set(x, "data_points", js.Array(value :_*))
    
    @scala.inline
    def setGraph_name(value: String): Self = StObject.set(x, "graph_name", value.asInstanceOf[js.Any])
  }
}
