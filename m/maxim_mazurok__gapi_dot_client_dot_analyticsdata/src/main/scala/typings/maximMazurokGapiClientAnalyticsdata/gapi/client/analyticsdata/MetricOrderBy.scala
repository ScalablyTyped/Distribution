package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricOrderBy extends StObject {
  
  /** A metric name in the request to order by. */
  var metricName: js.UndefOr[String] = js.undefined
}
object MetricOrderBy {
  
  inline def apply(): MetricOrderBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricOrderBy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricOrderBy] (val x: Self) extends AnyVal {
    
    inline def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
  }
}
