package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServiceAccountResponseDaysHourlyFollowersGraphsItem extends StObject {
  
  var data_points: js.Array[InsightsServiceAccountResponseDataPointsItem]
  
  var name: String
}
object InsightsServiceAccountResponseDaysHourlyFollowersGraphsItem {
  
  inline def apply(data_points: js.Array[InsightsServiceAccountResponseDataPointsItem], name: String): InsightsServiceAccountResponseDaysHourlyFollowersGraphsItem = {
    val __obj = js.Dynamic.literal(data_points = data_points.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseDaysHourlyFollowersGraphsItem]
  }
  
  extension [Self <: InsightsServiceAccountResponseDaysHourlyFollowersGraphsItem](x: Self) {
    
    inline def setData_points(value: js.Array[InsightsServiceAccountResponseDataPointsItem]): Self = StObject.set(x, "data_points", value.asInstanceOf[js.Any])
    
    inline def setData_pointsVarargs(value: InsightsServiceAccountResponseDataPointsItem*): Self = StObject.set(x, "data_points", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
