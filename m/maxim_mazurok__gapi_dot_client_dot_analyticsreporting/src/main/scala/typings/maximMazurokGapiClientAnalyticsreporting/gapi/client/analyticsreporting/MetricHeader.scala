package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricHeader extends StObject {
  
  /** Headers for the metrics in the response. */
  var metricHeaderEntries: js.UndefOr[js.Array[MetricHeaderEntry]] = js.native
  
  /** Headers for the pivots in the response. */
  var pivotHeaders: js.UndefOr[js.Array[PivotHeader]] = js.native
}
object MetricHeader {
  
  @scala.inline
  def apply(): MetricHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricHeader]
  }
  
  @scala.inline
  implicit class MetricHeaderMutableBuilder[Self <: MetricHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricHeaderEntries(value: js.Array[MetricHeaderEntry]): Self = StObject.set(x, "metricHeaderEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricHeaderEntriesUndefined: Self = StObject.set(x, "metricHeaderEntries", js.undefined)
    
    @scala.inline
    def setMetricHeaderEntriesVarargs(value: MetricHeaderEntry*): Self = StObject.set(x, "metricHeaderEntries", js.Array(value :_*))
    
    @scala.inline
    def setPivotHeaders(value: js.Array[PivotHeader]): Self = StObject.set(x, "pivotHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotHeadersUndefined: Self = StObject.set(x, "pivotHeaders", js.undefined)
    
    @scala.inline
    def setPivotHeadersVarargs(value: PivotHeader*): Self = StObject.set(x, "pivotHeaders", js.Array(value :_*))
  }
}
