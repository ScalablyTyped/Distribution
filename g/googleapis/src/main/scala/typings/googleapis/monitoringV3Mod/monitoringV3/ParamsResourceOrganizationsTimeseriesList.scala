package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsTimeseriesList
  extends StObject
     with StandardParameters {
  
  /**
    * The alignment_period specifies a time interval, in seconds, that is used to divide the data in all the time series into consistent blocks of time. This will be done before the per-series aligner can be applied to the data.The value must be at least 60 seconds. If a per-series aligner other than ALIGN_NONE is specified, this field is required or an error is returned. If no per-series aligner is specified, or the aligner ALIGN_NONE is specified, then this field is ignored.The maximum value of the alignment_period is 104 weeks (2 years) for charts, and 90,000 seconds (25 hours) for alerting policies.
    */
  @JSName("aggregation.alignmentPeriod")
  var aggregationDotalignmentPeriod: js.UndefOr[String] = js.undefined
  
  /**
    * The reduction operation to be used to combine time series into a single time series, where the value of each data point in the resulting series is a function of all the already aligned values in the input time series.Not all reducer operations can be applied to all time series. The valid choices depend on the metric_kind and the value_type of the original time series. Reduction can yield a time series with a different metric_kind or value_type than the input time series.Time series data must first be aligned (see per_series_aligner) in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified, and must not be ALIGN_NONE. An alignment_period must also be specified; otherwise, an error is returned.
    */
  @JSName("aggregation.crossSeriesReducer")
  var aggregationDotcrossSeriesReducer: js.UndefOr[String] = js.undefined
  
  /**
    * The set of fields to preserve when cross_series_reducer is specified. The group_by_fields determine how the time series are partitioned into subsets prior to applying the aggregation operation. Each subset contains time series that have the same value for each of the grouping fields. Each individual time series is a member of exactly one subset. The cross_series_reducer is applied to each subset of time series. It is not possible to reduce across different resource types, so this field implicitly contains resource.type. Fields not specified in group_by_fields are aggregated away. If group_by_fields is not specified and all the time series have the same resource type, then the time series are aggregated into a single output time series. If cross_series_reducer is not defined, this field is ignored.
    */
  @JSName("aggregation.groupByFields")
  var aggregationDotgroupByFields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An Aligner describes how to bring the data points in a single time series into temporal alignment. Except for ALIGN_NONE, all alignments cause all the data points in an alignment_period to be mathematically grouped together, resulting in a single data point for each alignment_period with end timestamp at the end of the period.Not all alignment operations may be applied to all time series. The valid choices depend on the metric_kind and value_type of the original time series. Alignment can change the metric_kind or the value_type of the time series.Time series data must be aligned in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified and not equal to ALIGN_NONE and alignment_period must be specified; otherwise, an error is returned.
    */
  @JSName("aggregation.perSeriesAligner")
  var aggregationDotperSeriesAligner: js.UndefOr[String] = js.undefined
  
  /**
    * Required. A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) that specifies which time series should be returned. The filter must specify a single metric type, and can additionally specify metric labels and other information. For example: metric.type = "compute.googleapis.com/instance/cpu/usage_time" AND metric.labels.instance_name = "my-instance-name"
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The end of the time interval.
    */
  @JSName("interval.endTime")
  var intervalDotendTime: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The beginning of the time interval. The default value for the start time is the end time. The start time must not be later than the end time.
    */
  @JSName("interval.startTime")
  var intervalDotstartTime: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The project (https://cloud.google.com/monitoring/api/v3#project_name), organization or folder on which to execute the request. The format is: projects/[PROJECT_ID_OR_NUMBER] organizations/[ORGANIZATION_ID] folders/[FOLDER_ID]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Unsupported: must be left blank. The points in each time series are currently returned in reverse time order (most recent to oldest).
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * A positive number that is the maximum number of results to return. If page_size is empty or more than 100,000 results, the effective page_size is 100,000 results. If view is set to FULL, this is the maximum number of Points returned. If view is set to HEADERS, this is the maximum number of TimeSeries returned.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * If this field is not empty then it must contain the nextPageToken value returned by a previous call to this method. Using this field causes the method to return additional results from the previous method call.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The alignment_period specifies a time interval, in seconds, that is used to divide the data in all the time series into consistent blocks of time. This will be done before the per-series aligner can be applied to the data.The value must be at least 60 seconds. If a per-series aligner other than ALIGN_NONE is specified, this field is required or an error is returned. If no per-series aligner is specified, or the aligner ALIGN_NONE is specified, then this field is ignored.The maximum value of the alignment_period is 104 weeks (2 years) for charts, and 90,000 seconds (25 hours) for alerting policies.
    */
  @JSName("secondaryAggregation.alignmentPeriod")
  var secondaryAggregationDotalignmentPeriod: js.UndefOr[String] = js.undefined
  
  /**
    * The reduction operation to be used to combine time series into a single time series, where the value of each data point in the resulting series is a function of all the already aligned values in the input time series.Not all reducer operations can be applied to all time series. The valid choices depend on the metric_kind and the value_type of the original time series. Reduction can yield a time series with a different metric_kind or value_type than the input time series.Time series data must first be aligned (see per_series_aligner) in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified, and must not be ALIGN_NONE. An alignment_period must also be specified; otherwise, an error is returned.
    */
  @JSName("secondaryAggregation.crossSeriesReducer")
  var secondaryAggregationDotcrossSeriesReducer: js.UndefOr[String] = js.undefined
  
  /**
    * The set of fields to preserve when cross_series_reducer is specified. The group_by_fields determine how the time series are partitioned into subsets prior to applying the aggregation operation. Each subset contains time series that have the same value for each of the grouping fields. Each individual time series is a member of exactly one subset. The cross_series_reducer is applied to each subset of time series. It is not possible to reduce across different resource types, so this field implicitly contains resource.type. Fields not specified in group_by_fields are aggregated away. If group_by_fields is not specified and all the time series have the same resource type, then the time series are aggregated into a single output time series. If cross_series_reducer is not defined, this field is ignored.
    */
  @JSName("secondaryAggregation.groupByFields")
  var secondaryAggregationDotgroupByFields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An Aligner describes how to bring the data points in a single time series into temporal alignment. Except for ALIGN_NONE, all alignments cause all the data points in an alignment_period to be mathematically grouped together, resulting in a single data point for each alignment_period with end timestamp at the end of the period.Not all alignment operations may be applied to all time series. The valid choices depend on the metric_kind and value_type of the original time series. Alignment can change the metric_kind or the value_type of the time series.Time series data must be aligned in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified and not equal to ALIGN_NONE and alignment_period must be specified; otherwise, an error is returned.
    */
  @JSName("secondaryAggregation.perSeriesAligner")
  var secondaryAggregationDotperSeriesAligner: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Specifies which information is returned about the time series.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsTimeseriesList {
  
  inline def apply(): ParamsResourceOrganizationsTimeseriesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsTimeseriesList]
  }
  
  extension [Self <: ParamsResourceOrganizationsTimeseriesList](x: Self) {
    
    inline def setAggregationDotalignmentPeriod(value: String): Self = StObject.set(x, "aggregation.alignmentPeriod", value.asInstanceOf[js.Any])
    
    inline def setAggregationDotalignmentPeriodUndefined: Self = StObject.set(x, "aggregation.alignmentPeriod", js.undefined)
    
    inline def setAggregationDotcrossSeriesReducer(value: String): Self = StObject.set(x, "aggregation.crossSeriesReducer", value.asInstanceOf[js.Any])
    
    inline def setAggregationDotcrossSeriesReducerUndefined: Self = StObject.set(x, "aggregation.crossSeriesReducer", js.undefined)
    
    inline def setAggregationDotgroupByFields(value: js.Array[String]): Self = StObject.set(x, "aggregation.groupByFields", value.asInstanceOf[js.Any])
    
    inline def setAggregationDotgroupByFieldsUndefined: Self = StObject.set(x, "aggregation.groupByFields", js.undefined)
    
    inline def setAggregationDotgroupByFieldsVarargs(value: String*): Self = StObject.set(x, "aggregation.groupByFields", js.Array(value*))
    
    inline def setAggregationDotperSeriesAligner(value: String): Self = StObject.set(x, "aggregation.perSeriesAligner", value.asInstanceOf[js.Any])
    
    inline def setAggregationDotperSeriesAlignerUndefined: Self = StObject.set(x, "aggregation.perSeriesAligner", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setIntervalDotendTime(value: String): Self = StObject.set(x, "interval.endTime", value.asInstanceOf[js.Any])
    
    inline def setIntervalDotendTimeUndefined: Self = StObject.set(x, "interval.endTime", js.undefined)
    
    inline def setIntervalDotstartTime(value: String): Self = StObject.set(x, "interval.startTime", value.asInstanceOf[js.Any])
    
    inline def setIntervalDotstartTimeUndefined: Self = StObject.set(x, "interval.startTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setSecondaryAggregationDotalignmentPeriod(value: String): Self = StObject.set(x, "secondaryAggregation.alignmentPeriod", value.asInstanceOf[js.Any])
    
    inline def setSecondaryAggregationDotalignmentPeriodUndefined: Self = StObject.set(x, "secondaryAggregation.alignmentPeriod", js.undefined)
    
    inline def setSecondaryAggregationDotcrossSeriesReducer(value: String): Self = StObject.set(x, "secondaryAggregation.crossSeriesReducer", value.asInstanceOf[js.Any])
    
    inline def setSecondaryAggregationDotcrossSeriesReducerUndefined: Self = StObject.set(x, "secondaryAggregation.crossSeriesReducer", js.undefined)
    
    inline def setSecondaryAggregationDotgroupByFields(value: js.Array[String]): Self = StObject.set(x, "secondaryAggregation.groupByFields", value.asInstanceOf[js.Any])
    
    inline def setSecondaryAggregationDotgroupByFieldsUndefined: Self = StObject.set(x, "secondaryAggregation.groupByFields", js.undefined)
    
    inline def setSecondaryAggregationDotgroupByFieldsVarargs(value: String*): Self = StObject.set(x, "secondaryAggregation.groupByFields", js.Array(value*))
    
    inline def setSecondaryAggregationDotperSeriesAligner(value: String): Self = StObject.set(x, "secondaryAggregation.perSeriesAligner", value.asInstanceOf[js.Any])
    
    inline def setSecondaryAggregationDotperSeriesAlignerUndefined: Self = StObject.set(x, "secondaryAggregation.perSeriesAligner", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
