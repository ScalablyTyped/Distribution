package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Row extends StObject {
  
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
  implicit class RowMutableBuilder[Self <: Row] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensionValues(value: js.Array[DimensionValue]): Self = StObject.set(x, "dimensionValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionValuesUndefined: Self = StObject.set(x, "dimensionValues", js.undefined)
    
    @scala.inline
    def setDimensionValuesVarargs(value: DimensionValue*): Self = StObject.set(x, "dimensionValues", js.Array(value :_*))
    
    @scala.inline
    def setMetricValues(value: js.Array[MetricValue]): Self = StObject.set(x, "metricValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricValuesUndefined: Self = StObject.set(x, "metricValues", js.undefined)
    
    @scala.inline
    def setMetricValuesVarargs(value: MetricValue*): Self = StObject.set(x, "metricValues", js.Array(value :_*))
  }
}
