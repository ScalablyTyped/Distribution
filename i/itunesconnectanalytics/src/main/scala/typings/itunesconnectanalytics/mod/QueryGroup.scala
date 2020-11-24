package typings.itunesconnectanalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryGroup extends js.Object {
  
  var dimension: typings.itunesconnectanalytics.mod.dimension = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var metric: js.UndefOr[measures] = js.native
  
  var rank: js.UndefOr[String] = js.native
}
object QueryGroup {
  
  @scala.inline
  def apply(dimension: dimension): QueryGroup = {
    val __obj = js.Dynamic.literal(dimension = dimension.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryGroup]
  }
  
  @scala.inline
  implicit class QueryGroupOps[Self <: QueryGroup] (val x: Self) extends AnyVal {
    
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
    def setDimension(value: dimension): Self = this.set("dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setMetric(value: measures): Self = this.set("metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric: Self = this.set("metric", js.undefined)
    
    @scala.inline
    def setRank(value: String): Self = this.set("rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRank: Self = this.set("rank", js.undefined)
  }
}
