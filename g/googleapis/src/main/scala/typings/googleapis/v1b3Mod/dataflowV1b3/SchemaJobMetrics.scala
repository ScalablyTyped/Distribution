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
  def apply(): SchemaJobMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobMetrics]
  }
  @scala.inline
  implicit class SchemaJobMetricsOps[Self <: SchemaJobMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMetricTime(value: String): Self = this.set("metricTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricTime: Self = this.set("metricTime", js.undefined)
    @scala.inline
    def setMetricsVarargs(value: SchemaMetricUpdate*): Self = this.set("metrics", js.Array(value :_*))
    @scala.inline
    def setMetrics(value: js.Array[SchemaMetricUpdate]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
  }
  
}

