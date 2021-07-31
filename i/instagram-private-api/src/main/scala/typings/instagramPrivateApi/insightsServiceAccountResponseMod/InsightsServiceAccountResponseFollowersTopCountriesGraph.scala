package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServiceAccountResponseFollowersTopCountriesGraph extends StObject {
  
  var data_points: js.Array[InsightsServiceAccountResponseDataPointsItem]
}
object InsightsServiceAccountResponseFollowersTopCountriesGraph {
  
  @scala.inline
  def apply(data_points: js.Array[InsightsServiceAccountResponseDataPointsItem]): InsightsServiceAccountResponseFollowersTopCountriesGraph = {
    val __obj = js.Dynamic.literal(data_points = data_points.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseFollowersTopCountriesGraph]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseFollowersTopCountriesGraphMutableBuilder[Self <: InsightsServiceAccountResponseFollowersTopCountriesGraph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData_points(value: js.Array[InsightsServiceAccountResponseDataPointsItem]): Self = StObject.set(x, "data_points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData_pointsVarargs(value: InsightsServiceAccountResponseDataPointsItem*): Self = StObject.set(x, "data_points", js.Array(value :_*))
  }
}
