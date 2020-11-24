package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Row extends js.Object {
  
  /** List of requested dimension values. In a PivotReport, dimension_values are only listed for dimensions included in a pivot. */
  var dimensionValues: js.UndefOr[js.Array[DimensionValue]] = js.native
  
  /** List of requested visible metric values. */
  var metricValues: js.UndefOr[js.Array[MetricValue]] = js.native
}
object Row {
  
  @scala.inline
  def apply(): Row = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Row]
  }
  
  @scala.inline
  implicit class RowOps[Self <: Row] (val x: Self) extends AnyVal {
    
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
    def setDimensionValuesVarargs(value: DimensionValue*): Self = this.set("dimensionValues", js.Array(value :_*))
    
    @scala.inline
    def setDimensionValues(value: js.Array[DimensionValue]): Self = this.set("dimensionValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionValues: Self = this.set("dimensionValues", js.undefined)
    
    @scala.inline
    def setMetricValuesVarargs(value: MetricValue*): Self = this.set("metricValues", js.Array(value :_*))
    
    @scala.inline
    def setMetricValues(value: js.Array[MetricValue]): Self = this.set("metricValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricValues: Self = this.set("metricValues", js.undefined)
  }
}
