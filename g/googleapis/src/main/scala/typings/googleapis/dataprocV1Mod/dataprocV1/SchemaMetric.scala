package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetric extends StObject {
  
  /**
    * Optional. Specify one or more available OSS metrics (https://cloud.google.com/dataproc/docs/guides/monitoring#available_oss_metrics) to collect for the metric course (for the SPARK metric source, any Spark metric (https://spark.apache.org/docs/latest/monitoring.html#metrics) can be specified).Provide metrics in the following format: METRIC_SOURCE: INSTANCE:GROUP:METRIC Use camelcase as appropriate.Examples: yarn:ResourceManager:QueueMetrics:AppsCompleted spark:driver:DAGScheduler:job.allJobs sparkHistoryServer:JVM:Memory:NonHeapMemoryUsage.committed hiveserver2:JVM:Memory:NonHeapMemoryUsage.used Notes: Only the specified overridden metrics will be collected for the metric source. For example, if one or more spark:executive metrics are listed as metric overrides, other SPARK metrics will not be collected. The collection of the default metrics for other OSS metric sources is unaffected. For example, if both SPARK andd YARN metric sources are enabled, and overrides are provided for Spark metrics only, all default YARN metrics will be collected.
    */
  var metricOverrides: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. Default metrics are collected unless metricOverrides are specified for the metric source (see Available OSS metrics (https://cloud.google.com/dataproc/docs/guides/monitoring#available_oss_metrics) for more information).
    */
  var metricSource: js.UndefOr[String | Null] = js.undefined
}
object SchemaMetric {
  
  inline def apply(): SchemaMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetric]
  }
  
  extension [Self <: SchemaMetric](x: Self) {
    
    inline def setMetricOverrides(value: js.Array[String]): Self = StObject.set(x, "metricOverrides", value.asInstanceOf[js.Any])
    
    inline def setMetricOverridesNull: Self = StObject.set(x, "metricOverrides", null)
    
    inline def setMetricOverridesUndefined: Self = StObject.set(x, "metricOverrides", js.undefined)
    
    inline def setMetricOverridesVarargs(value: String*): Self = StObject.set(x, "metricOverrides", js.Array(value*))
    
    inline def setMetricSource(value: String): Self = StObject.set(x, "metricSource", value.asInstanceOf[js.Any])
    
    inline def setMetricSourceNull: Self = StObject.set(x, "metricSource", null)
    
    inline def setMetricSourceUndefined: Self = StObject.set(x, "metricSource", js.undefined)
  }
}
