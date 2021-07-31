package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServiceAccountResponseAllFollowersAgeGraph extends StObject {
  
  var data_points: js.Array[InsightsServiceAccountResponseDataPointsItem]
}
object InsightsServiceAccountResponseAllFollowersAgeGraph {
  
  @scala.inline
  def apply(data_points: js.Array[InsightsServiceAccountResponseDataPointsItem]): InsightsServiceAccountResponseAllFollowersAgeGraph = {
    val __obj = js.Dynamic.literal(data_points = data_points.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseAllFollowersAgeGraph]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseAllFollowersAgeGraphMutableBuilder[Self <: InsightsServiceAccountResponseAllFollowersAgeGraph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData_points(value: js.Array[InsightsServiceAccountResponseDataPointsItem]): Self = StObject.set(x, "data_points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData_pointsVarargs(value: InsightsServiceAccountResponseDataPointsItem*): Self = StObject.set(x, "data_points", js.Array(value :_*))
  }
}
