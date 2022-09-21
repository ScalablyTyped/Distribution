package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricCompatibility extends StObject {
  
  /** The compatibility of this metric. If the compatibility is COMPATIBLE, this metric can be successfully added to the report. */
  var compatibility: js.UndefOr[String] = js.undefined
  
  /** The metric metadata contains the API name for this compatibility information. The metric metadata also contains other helpful information like the UI name and description. */
  var metricMetadata: js.UndefOr[MetricMetadata] = js.undefined
}
object MetricCompatibility {
  
  inline def apply(): MetricCompatibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricCompatibility]
  }
  
  extension [Self <: MetricCompatibility](x: Self) {
    
    inline def setCompatibility(value: String): Self = StObject.set(x, "compatibility", value.asInstanceOf[js.Any])
    
    inline def setCompatibilityUndefined: Self = StObject.set(x, "compatibility", js.undefined)
    
    inline def setMetricMetadata(value: MetricMetadata): Self = StObject.set(x, "metricMetadata", value.asInstanceOf[js.Any])
    
    inline def setMetricMetadataUndefined: Self = StObject.set(x, "metricMetadata", js.undefined)
  }
}
