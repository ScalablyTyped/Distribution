package typings.itunesconnectanalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsResult extends js.Object {
  
  var adamId: String = js.native
  
  var data: js.Array[AnalyticsDataPoint] = js.native
  
  var group: AnalyticsGroup | Null = js.native
  
  var meetsThreshold: Boolean = js.native
  
  var totals: AnalyticsTotals = js.native
}
object AnalyticsResult {
  
  @scala.inline
  def apply(
    adamId: String,
    data: js.Array[AnalyticsDataPoint],
    meetsThreshold: Boolean,
    totals: AnalyticsTotals
  ): AnalyticsResult = {
    val __obj = js.Dynamic.literal(adamId = adamId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], meetsThreshold = meetsThreshold.asInstanceOf[js.Any], totals = totals.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsResult]
  }
  
  @scala.inline
  implicit class AnalyticsResultOps[Self <: AnalyticsResult] (val x: Self) extends AnyVal {
    
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
    def setAdamId(value: String): Self = this.set("adamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: AnalyticsDataPoint*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[AnalyticsDataPoint]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeetsThreshold(value: Boolean): Self = this.set("meetsThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotals(value: AnalyticsTotals): Self = this.set("totals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: AnalyticsGroup): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNull: Self = this.set("group", null)
  }
}
