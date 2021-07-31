package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportRow extends StObject {
  
  /** List of requested dimensions. */
  var dimensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /** List of metrics for each requested DateRange. */
  var metrics: js.UndefOr[js.Array[DateRangeValues]] = js.undefined
}
object ReportRow {
  
  @scala.inline
  def apply(): ReportRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportRow]
  }
  
  @scala.inline
  implicit class ReportRowMutableBuilder[Self <: ReportRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensions(value: js.Array[String]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: String*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
    
    @scala.inline
    def setMetrics(value: js.Array[DateRangeValues]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: DateRangeValues*): Self = StObject.set(x, "metrics", js.Array(value :_*))
  }
}
