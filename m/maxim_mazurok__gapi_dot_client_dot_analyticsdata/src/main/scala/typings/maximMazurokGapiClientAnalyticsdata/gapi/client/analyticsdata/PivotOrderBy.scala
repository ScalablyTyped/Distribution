package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotOrderBy extends StObject {
  
  /** In the response to order by, order rows by this column. Must be a metric name from the request. */
  var metricName: js.UndefOr[String] = js.undefined
  
  /**
    * Used to select a dimension name and value pivot. If multiple pivot selections are given, the sort occurs on rows where all pivot selection dimension name and value pairs match the
    * row's dimension name and value pair.
    */
  var pivotSelections: js.UndefOr[js.Array[PivotSelection]] = js.undefined
}
object PivotOrderBy {
  
  @scala.inline
  def apply(): PivotOrderBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotOrderBy]
  }
  
  @scala.inline
  implicit class PivotOrderByMutableBuilder[Self <: PivotOrderBy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
    
    @scala.inline
    def setPivotSelections(value: js.Array[PivotSelection]): Self = StObject.set(x, "pivotSelections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotSelectionsUndefined: Self = StObject.set(x, "pivotSelections", js.undefined)
    
    @scala.inline
    def setPivotSelectionsVarargs(value: PivotSelection*): Self = StObject.set(x, "pivotSelections", js.Array(value :_*))
  }
}
