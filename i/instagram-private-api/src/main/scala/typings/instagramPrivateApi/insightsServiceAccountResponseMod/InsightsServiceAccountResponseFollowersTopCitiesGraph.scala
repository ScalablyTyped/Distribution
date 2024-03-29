package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServiceAccountResponseFollowersTopCitiesGraph extends StObject {
  
  var data_points: js.Array[InsightsServiceAccountResponseDataPointsItem]
}
object InsightsServiceAccountResponseFollowersTopCitiesGraph {
  
  inline def apply(data_points: js.Array[InsightsServiceAccountResponseDataPointsItem]): InsightsServiceAccountResponseFollowersTopCitiesGraph = {
    val __obj = js.Dynamic.literal(data_points = data_points.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseFollowersTopCitiesGraph]
  }
  
  extension [Self <: InsightsServiceAccountResponseFollowersTopCitiesGraph](x: Self) {
    
    inline def setData_points(value: js.Array[InsightsServiceAccountResponseDataPointsItem]): Self = StObject.set(x, "data_points", value.asInstanceOf[js.Any])
    
    inline def setData_pointsVarargs(value: InsightsServiceAccountResponseDataPointsItem*): Self = StObject.set(x, "data_points", js.Array(value :_*))
  }
}
