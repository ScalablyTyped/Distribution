package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotOrderBy extends js.Object {
  
  /** In the response to order by, order rows by this column. Must be a metric name from the request. */
  var metricName: js.UndefOr[String] = js.native
  
  /**
    * Used to select a dimension name and value pivot. If multiple pivot selections are given, the sort occurs on rows where all pivot selection dimension name and value pairs match the
    * row's dimension name and value pair.
    */
  var pivotSelections: js.UndefOr[js.Array[PivotSelection]] = js.native
}
object PivotOrderBy {
  
  @scala.inline
  def apply(): PivotOrderBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotOrderBy]
  }
  
  @scala.inline
  implicit class PivotOrderByOps[Self <: PivotOrderBy] (val x: Self) extends AnyVal {
    
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
    def setMetricName(value: String): Self = this.set("metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricName: Self = this.set("metricName", js.undefined)
    
    @scala.inline
    def setPivotSelectionsVarargs(value: PivotSelection*): Self = this.set("pivotSelections", js.Array(value :_*))
    
    @scala.inline
    def setPivotSelections(value: js.Array[PivotSelection]): Self = this.set("pivotSelections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivotSelections: Self = this.set("pivotSelections", js.undefined)
  }
}
