package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A condition type that compares a collection of time series against a
  * threshold.
  */
@js.native
trait SchemaMetricThreshold extends js.Object {
  /**
    * Specifies the alignment of data points in individual time series as well
    * as how to combine the retrieved time series together (such as when
    * aggregating multiple streams on each resource to a single stream for each
    * resource or when aggregating streams across all members of a group of
    * resrouces). Multiple aggregations are applied in the order specified.This
    * field is similar to the one in the MetricService.ListTimeSeries request.
    * It is advisable to use the ListTimeSeries method when debugging this
    * field.
    */
  var aggregations: js.UndefOr[js.Array[SchemaAggregation]] = js.native
  /**
    * The comparison to apply between the time series (indicated by filter and
    * aggregation) and the threshold (indicated by threshold_value). The
    * comparison is applied on each time series, with the time series on the
    * left-hand side and the threshold on the right-hand side.Only
    * COMPARISON_LT and COMPARISON_GT are supported currently.
    */
  var comparison: js.UndefOr[String] = js.native
  /**
    * Specifies the alignment of data points in individual time series selected
    * by denominatorFilter as well as how to combine the retrieved time series
    * together (such as when aggregating multiple streams on each resource to a
    * single stream for each resource or when aggregating streams across all
    * members of a group of resources).When computing ratios, the aggregations
    * and denominator_aggregations fields must use the same alignment period
    * and produce time series that have the same periodicity and labels.This
    * field is similar to the one in the MetricService.ListTimeSeries request.
    * It is advisable to use the ListTimeSeries method when debugging this
    * field.
    */
  var denominatorAggregations: js.UndefOr[js.Array[SchemaAggregation]] = js.native
  /**
    * A filter that identifies a time series that should be used as the
    * denominator of a ratio that will be compared with the threshold. If a
    * denominator_filter is specified, the time series specified by the filter
    * field will be used as the numerator.The filter is similar to the one that
    * is specified in the MetricService.ListTimeSeries request (that call is
    * useful to verify the time series that will be retrieved / processed) and
    * must specify the metric type and optionally may contain restrictions on
    * resource type, resource labels, and metric labels. This field may not
    * exceed 2048 Unicode characters in length.
    */
  var denominatorFilter: js.UndefOr[String] = js.native
  /**
    * The amount of time that a time series must violate the threshold to be
    * considered failing. Currently, only values that are a multiple of a
    * minute--e.g., 0, 60, 120, or 300 seconds--are supported. If an invalid
    * value is given, an error will be returned. When choosing a duration, it
    * is useful to keep in mind the frequency of the underlying time series
    * data (which may also be affected by any alignments specified in the
    * aggregations field); a good duration is long enough so that a single
    * outlier does not generate spurious alerts, but short enough that
    * unhealthy states are detected and alerted on quickly.
    */
  var duration: js.UndefOr[String] = js.native
  /**
    * A filter that identifies which time series should be compared with the
    * threshold.The filter is similar to the one that is specified in the
    * MetricService.ListTimeSeries request (that call is useful to verify the
    * time series that will be retrieved / processed) and must specify the
    * metric type and optionally may contain restrictions on resource type,
    * resource labels, and metric labels. This field may not exceed 2048
    * Unicode characters in length.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * A value against which to compare the time series.
    */
  var thresholdValue: js.UndefOr[Double] = js.native
  /**
    * The number/percent of time series for which the comparison must hold in
    * order for the condition to trigger. If unspecified, then the condition
    * will trigger if the comparison is true for any of the time series that
    * have been identified by filter and aggregations, or by the ratio, if
    * denominator_filter and denominator_aggregations are specified.
    */
  var trigger: js.UndefOr[SchemaTrigger] = js.native
}

object SchemaMetricThreshold {
  @scala.inline
  def apply(
    aggregations: js.Array[SchemaAggregation] = null,
    comparison: String = null,
    denominatorAggregations: js.Array[SchemaAggregation] = null,
    denominatorFilter: String = null,
    duration: String = null,
    filter: String = null,
    thresholdValue: js.UndefOr[Double] = js.undefined,
    trigger: SchemaTrigger = null
  ): SchemaMetricThreshold = {
    val __obj = js.Dynamic.literal()
    if (aggregations != null) __obj.updateDynamic("aggregations")(aggregations.asInstanceOf[js.Any])
    if (comparison != null) __obj.updateDynamic("comparison")(comparison.asInstanceOf[js.Any])
    if (denominatorAggregations != null) __obj.updateDynamic("denominatorAggregations")(denominatorAggregations.asInstanceOf[js.Any])
    if (denominatorFilter != null) __obj.updateDynamic("denominatorFilter")(denominatorFilter.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(thresholdValue)) __obj.updateDynamic("thresholdValue")(thresholdValue.get.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMetricThreshold]
  }
}

