package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of data points that describes the time-varying values of a
  * metric. A time series is identified by a combination of a fully-specified
  * monitored resource and a fully-specified metric. This type is used for both
  * listing and creating time series.
  */
@js.native
trait SchemaTimeSeries extends js.Object {
  /**
    * Output only. The associated monitored resource metadata. When reading a a
    * timeseries, this field will include metadata labels that are explicitly
    * named in the reduction. When creating a timeseries, this field is
    * ignored.
    */
  var metadata: js.UndefOr[SchemaMonitoredResourceMetadata] = js.native
  /**
    * The associated metric. A fully-specified metric used to identify the time
    * series.
    */
  var metric: js.UndefOr[SchemaMetric] = js.native
  /**
    * The metric kind of the time series. When listing time series, this metric
    * kind might be different from the metric kind of the associated metric if
    * this time series is an alignment or reduction of other time series.When
    * creating a time series, this field is optional. If present, it must be
    * the same as the metric kind of the associated metric. If the associated
    * metric&#39;s descriptor must be auto-created, then this field specifies
    * the metric kind of the new descriptor and must be either GAUGE (the
    * default) or CUMULATIVE.
    */
  var metricKind: js.UndefOr[String] = js.native
  /**
    * The data points of this time series. When listing time series, points are
    * returned in reverse time order.When creating a time series, this field
    * must contain exactly one point and the point&#39;s type must be the same
    * as the value type of the associated metric. If the associated
    * metric&#39;s descriptor must be auto-created, then the value type of the
    * descriptor is determined by the point&#39;s type, which must be BOOL,
    * INT64, DOUBLE, or DISTRIBUTION.
    */
  var points: js.UndefOr[js.Array[SchemaPoint]] = js.native
  /**
    * The associated monitored resource. Custom metrics can use only certain
    * monitored resource types in their time series data.
    */
  var resource: js.UndefOr[SchemaMonitoredResource] = js.native
  /**
    * The value type of the time series. When listing time series, this value
    * type might be different from the value type of the associated metric if
    * this time series is an alignment or reduction of other time series.When
    * creating a time series, this field is optional. If present, it must be
    * the same as the type of the data in the points field.
    */
  var valueType: js.UndefOr[String] = js.native
}

object SchemaTimeSeries {
  @scala.inline
  def apply(
    metadata: SchemaMonitoredResourceMetadata = null,
    metric: SchemaMetric = null,
    metricKind: String = null,
    points: js.Array[SchemaPoint] = null,
    resource: SchemaMonitoredResource = null,
    valueType: String = null
  ): SchemaTimeSeries = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (metricKind != null) __obj.updateDynamic("metricKind")(metricKind.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (valueType != null) __obj.updateDynamic("valueType")(valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTimeSeries]
  }
}

