package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JobMetrics contains a collection of metrics describing the detailed
  * progress of a Dataflow job. Metrics correspond to user-defined and
  * system-defined metrics in the job.  This resource captures only the most
  * recent values of each metric; time-series data can be queried for them
  * (under the same metric names) from Cloud Monitoring.
  */
@js.native
trait SchemaJobMetrics extends js.Object {
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
  def apply(metricTime: String = null, metrics: js.Array[SchemaMetricUpdate] = null): SchemaJobMetrics = {
    val __obj = js.Dynamic.literal()
    if (metricTime != null) __obj.updateDynamic("metricTime")(metricTime.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaJobMetrics]
  }
}

