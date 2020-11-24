package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponseSummaryStories extends js.Object {
  
  var count: Double = js.native
  
  var edges: js.Array[_] = js.native
}
object InsightsServiceAccountResponseSummaryStories {
  
  @scala.inline
  def apply(count: Double, edges: js.Array[_]): InsightsServiceAccountResponseSummaryStories = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseSummaryStories]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseSummaryStoriesOps[Self <: InsightsServiceAccountResponseSummaryStories] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgesVarargs(value: js.Any*): Self = this.set("edges", js.Array(value :_*))
    
    @scala.inline
    def setEdges(value: js.Array[_]): Self = this.set("edges", value.asInstanceOf[js.Any])
  }
}
