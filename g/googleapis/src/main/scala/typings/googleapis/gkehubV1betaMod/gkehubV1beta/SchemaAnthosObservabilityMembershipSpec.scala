package typings.googleapis.gkehubV1betaMod.gkehubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnthosObservabilityMembershipSpec extends StObject {
  
  /**
    * use full of metrics rather than optimized metrics. See https://cloud.google.com/anthos/clusters/docs/on-prem/1.8/concepts/logging-and-monitoring#optimized_metrics_default_metrics
    */
  var doNotOptimizeMetrics: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * enable collecting and reporting metrics and logs from user apps See go/onyx-application-metrics-logs-user-guide
    */
  var enableStackdriverOnApplications: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * the version of stackdriver operator used by this feature
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaAnthosObservabilityMembershipSpec {
  
  inline def apply(): SchemaAnthosObservabilityMembershipSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnthosObservabilityMembershipSpec]
  }
  
  extension [Self <: SchemaAnthosObservabilityMembershipSpec](x: Self) {
    
    inline def setDoNotOptimizeMetrics(value: Boolean): Self = StObject.set(x, "doNotOptimizeMetrics", value.asInstanceOf[js.Any])
    
    inline def setDoNotOptimizeMetricsNull: Self = StObject.set(x, "doNotOptimizeMetrics", null)
    
    inline def setDoNotOptimizeMetricsUndefined: Self = StObject.set(x, "doNotOptimizeMetrics", js.undefined)
    
    inline def setEnableStackdriverOnApplications(value: Boolean): Self = StObject.set(x, "enableStackdriverOnApplications", value.asInstanceOf[js.Any])
    
    inline def setEnableStackdriverOnApplicationsNull: Self = StObject.set(x, "enableStackdriverOnApplications", null)
    
    inline def setEnableStackdriverOnApplicationsUndefined: Self = StObject.set(x, "enableStackdriverOnApplications", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
