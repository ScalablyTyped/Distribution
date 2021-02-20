package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricOrderBy extends StObject {
  
  /** A metric name in the request to order by. */
  var metricName: js.UndefOr[String] = js.native
}
object MetricOrderBy {
  
  @scala.inline
  def apply(): MetricOrderBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricOrderBy]
  }
  
  @scala.inline
  implicit class MetricOrderByMutableBuilder[Self <: MetricOrderBy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
  }
}
