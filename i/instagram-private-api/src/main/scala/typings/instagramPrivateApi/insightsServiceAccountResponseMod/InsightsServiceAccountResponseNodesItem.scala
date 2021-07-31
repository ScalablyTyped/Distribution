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
  
  @scala.inline
  def apply(): InsightsServiceAccountResponseNodesItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsightsServiceAccountResponseNodesItem]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseNodesItemMutableBuilder[Self <: InsightsServiceAccountResponseNodesItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData_points(value: js.Array[InsightsServiceAccountResponseDataPointsItem]): Self = StObject.set(x, "data_points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData_pointsUndefined: Self = StObject.set(x, "data_points", js.undefined)
    
    @scala.inline
    def setData_pointsVarargs(value: InsightsServiceAccountResponseDataPointsItem*): Self = StObject.set(x, "data_points", js.Array(value :_*))
    
    @scala.inline
    def setGraph_name(value: String): Self = StObject.set(x, "graph_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraph_nameUndefined: Self = StObject.set(x, "graph_name", js.undefined)
    
    @scala.inline
    def setOrganic(value: InsightsServiceAccountResponseOrganic): Self = StObject.set(x, "organic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganicUndefined: Self = StObject.set(x, "organic", js.undefined)
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    @scala.inline
    def set__typename(value: String): Self = StObject.set(x, "__typename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__typenameUndefined: Self = StObject.set(x, "__typename", js.undefined)
  }
}
