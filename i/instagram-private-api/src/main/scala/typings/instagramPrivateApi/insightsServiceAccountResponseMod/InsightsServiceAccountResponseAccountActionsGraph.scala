package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponseAccountActionsGraph extends js.Object {
  
  var total_count_graph: InsightsServiceAccountResponseTotalCountGraph = js.native
}
object InsightsServiceAccountResponseAccountActionsGraph {
  
  @scala.inline
  def apply(total_count_graph: InsightsServiceAccountResponseTotalCountGraph): InsightsServiceAccountResponseAccountActionsGraph = {
    val __obj = js.Dynamic.literal(total_count_graph = total_count_graph.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseAccountActionsGraph]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseAccountActionsGraphOps[Self <: InsightsServiceAccountResponseAccountActionsGraph] (val x: Self) extends AnyVal {
    
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
    def setTotal_count_graph(value: InsightsServiceAccountResponseTotalCountGraph): Self = this.set("total_count_graph", value.asInstanceOf[js.Any])
  }
}
