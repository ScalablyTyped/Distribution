package typings.googleapis.serviceusageV1Mod.serviceusageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional annotations that can be used to guide the usage of a metric.
  */
@js.native
trait SchemaMetricDescriptorMetadata extends js.Object {
  /**
    * The delay of data points caused by ingestion. Data points older than this
    * age are guaranteed to be ingested and available to be read, excluding
    * data loss due to errors.
    */
  var ingestDelay: js.UndefOr[String] = js.native
  /**
    * The launch stage of the metric definition.
    */
  var launchStage: js.UndefOr[String] = js.native
  /**
    * The sampling period of metric data points. For metrics which are written
    * periodically, consecutive data points are stored at this time interval,
    * excluding data loss due to errors. Metrics with a higher granularity have
    * a smaller sampling period.
    */
  var samplePeriod: js.UndefOr[String] = js.native
}

object SchemaMetricDescriptorMetadata {
  @scala.inline
  def apply(ingestDelay: String = null, launchStage: String = null, samplePeriod: String = null): SchemaMetricDescriptorMetadata = {
    val __obj = js.Dynamic.literal()
    if (ingestDelay != null) __obj.updateDynamic("ingestDelay")(ingestDelay.asInstanceOf[js.Any])
    if (launchStage != null) __obj.updateDynamic("launchStage")(launchStage.asInstanceOf[js.Any])
    if (samplePeriod != null) __obj.updateDynamic("samplePeriod")(samplePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMetricDescriptorMetadata]
  }
}

