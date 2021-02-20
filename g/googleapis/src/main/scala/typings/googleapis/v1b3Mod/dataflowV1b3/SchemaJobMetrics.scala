package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JobMetrics contains a collection of metrics describing the detailed
  * progress of a Dataflow job. Metrics correspond to user-defined and
  * system-defined metrics in the job.  This resource captures only the most
  * recent values of each metric; time-series data can be queried for them
  * (under the same metric names) from Cloud Monitoring.
  */
@js.native
trait SchemaJobMetrics extends StObject {
  
  /**
    * Timestamp as of which metric values are current.
    */
  var metricTime: js.UndefOr[String] = js.native
  
  /**
    * All metrics for this job.
    */
  var metrics: js.UndefOr[js.Array[SchemaMetricUpdate]] = js.native
}
object SchemaJobMetrics {
  
  @scala.inline
  def apply(): SchemaJobMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobMetrics]
  }
  
  @scala.inline
  implicit class SchemaJobMetricsMutableBuilder[Self <: SchemaJobMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricTime(value: String): Self = StObject.set(x, "metricTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricTimeUndefined: Self = StObject.set(x, "metricTime", js.undefined)
    
    @scala.inline
    def setMetrics(value: js.Array[SchemaMetricUpdate]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: SchemaMetricUpdate*): Self = StObject.set(x, "metrics", js.Array(value :_*))
  }
}
