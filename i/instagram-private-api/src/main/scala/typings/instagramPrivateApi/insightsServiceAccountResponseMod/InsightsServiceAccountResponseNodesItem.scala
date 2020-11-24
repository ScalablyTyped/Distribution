package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponseNodesItem extends js.Object {
  
  var __typename: js.UndefOr[String] = js.native
  
  var data_points: js.UndefOr[js.Array[InsightsServiceAccountResponseDataPointsItem]] = js.native
  
  var delta: js.UndefOr[Null] = js.native
  
  var graph_name: js.UndefOr[String] = js.native
  
  var organic: js.UndefOr[InsightsServiceAccountResponseOrganic] = js.native
  
  var total: js.UndefOr[Double] = js.native
}
object InsightsServiceAccountResponseNodesItem {
  
  @scala.inline
  def apply(): InsightsServiceAccountResponseNodesItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsightsServiceAccountResponseNodesItem]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseNodesItemOps[Self <: InsightsServiceAccountResponseNodesItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set__typename(value: String): Self = this.set("__typename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__typename: Self = this.set("__typename", js.undefined)
    
    @scala.inline
    def setData_pointsVarargs(value: InsightsServiceAccountResponseDataPointsItem*): Self = this.set("data_points", js.Array(value :_*))
    
    @scala.inline
    def setData_points(value: js.Array[InsightsServiceAccountResponseDataPointsItem]): Self = this.set("data_points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData_points: Self = this.set("data_points", js.undefined)
    
    @scala.inline
    def setGraph_name(value: String): Self = this.set("graph_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraph_name: Self = this.set("graph_name", js.undefined)
    
    @scala.inline
    def setOrganic(value: InsightsServiceAccountResponseOrganic): Self = this.set("organic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganic: Self = this.set("organic", js.undefined)
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
}
