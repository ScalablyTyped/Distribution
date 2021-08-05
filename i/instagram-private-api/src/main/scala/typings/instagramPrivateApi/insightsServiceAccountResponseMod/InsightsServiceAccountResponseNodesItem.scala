package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServiceAccountResponseNodesItem extends StObject {
  
  var __typename: js.UndefOr[String] = js.undefined
  
  var data_points: js.UndefOr[js.Array[InsightsServiceAccountResponseDataPointsItem]] = js.undefined
  
  var delta: js.UndefOr[Null] = js.undefined
  
  var graph_name: js.UndefOr[String] = js.undefined
  
  var organic: js.UndefOr[InsightsServiceAccountResponseOrganic] = js.undefined
  
  var total: js.UndefOr[Double] = js.undefined
}
object InsightsServiceAccountResponseNodesItem {
  
  inline def apply(): InsightsServiceAccountResponseNodesItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsightsServiceAccountResponseNodesItem]
  }
  
  extension [Self <: InsightsServiceAccountResponseNodesItem](x: Self) {
    
    inline def setData_points(value: js.Array[InsightsServiceAccountResponseDataPointsItem]): Self = StObject.set(x, "data_points", value.asInstanceOf[js.Any])
    
    inline def setData_pointsUndefined: Self = StObject.set(x, "data_points", js.undefined)
    
    inline def setData_pointsVarargs(value: InsightsServiceAccountResponseDataPointsItem*): Self = StObject.set(x, "data_points", js.Array(value :_*))
    
    inline def setGraph_name(value: String): Self = StObject.set(x, "graph_name", value.asInstanceOf[js.Any])
    
    inline def setGraph_nameUndefined: Self = StObject.set(x, "graph_name", js.undefined)
    
    inline def setOrganic(value: InsightsServiceAccountResponseOrganic): Self = StObject.set(x, "organic", value.asInstanceOf[js.Any])
    
    inline def setOrganicUndefined: Self = StObject.set(x, "organic", js.undefined)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def set__typename(value: String): Self = StObject.set(x, "__typename", value.asInstanceOf[js.Any])
    
    inline def set__typenameUndefined: Self = StObject.set(x, "__typename", js.undefined)
  }
}
