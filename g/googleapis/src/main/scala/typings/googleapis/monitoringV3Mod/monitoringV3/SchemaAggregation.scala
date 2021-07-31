package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes how to combine multiple time series to provide different views of
  * the data. Aggregation consists of an alignment step on individual time
  * series (alignment_period and per_series_aligner) followed by an optional
  * reduction step of the data across the aligned time series
  * (cross_series_reducer and group_by_fields). For more details, see
  * Aggregation.
  */
trait SchemaAggregation extends StObject {
  
  /**
    * The alignment period for per-time series alignment. If present,
    * alignmentPeriod must be at least 60 seconds. After per-time series
    * alignment, each time series will contain data points only on the period
    * boundaries. If perSeriesAligner is not specified or equals ALIGN_NONE,
    * then this field is ignored. If perSeriesAligner is specified and does not
    * equal ALIGN_NONE, then this field must be defined; otherwise an error is
    * returned.
    */
  var alignmentPeriod: js.UndefOr[String] = js.undefined
  
  /**
    * The approach to be used to combine time series. Not all reducer functions
    * may be applied to all time series, depending on the metric type and the
    * value type of the original time series. Reduction may change the metric
    * type of value type of the time series.Time series data must be aligned in
    * order to perform cross-time series reduction. If crossSeriesReducer is
    * specified, then perSeriesAligner must be specified and not equal
    * ALIGN_NONE and alignmentPeriod must be specified; otherwise, an error is
    * returned.
    */
  var crossSeriesReducer: js.UndefOr[String] = js.undefined
  
  /**
    * The set of fields to preserve when crossSeriesReducer is specified. The
    * groupByFields determine how the time series are partitioned into subsets
    * prior to applying the aggregation function. Each subset contains time
    * series that have the same value for each of the grouping fields. Each
    * individual time series is a member of exactly one subset. The
    * crossSeriesReducer is applied to each subset of time series. It is not
    * possible to reduce across different resource types, so this field
    * implicitly contains resource.type. Fields not specified in groupByFields
    * are aggregated away. If groupByFields is not specified and all the time
    * series have the same resource type, then the time series are aggregated
    * into a single output time series. If crossSeriesReducer is not defined,
    * this field is ignored.
    */
  var groupByFields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The approach to be used to align individual time series. Not all
    * alignment functions may be applied to all time series, depending on the
    * metric type and value type of the original time series. Alignment may
    * change the metric type or the value type of the time series.Time series
    * data must be aligned in order to perform cross-time series reduction. If
    * crossSeriesReducer is specified, then perSeriesAligner must be specified
    * and not equal ALIGN_NONE and alignmentPeriod must be specified;
    * otherwise, an error is returned.
    */
  var perSeriesAligner: js.UndefOr[String] = js.undefined
}
object SchemaAggregation {
  
  @scala.inline
  def apply(): SchemaAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAggregation]
  }
  
  @scala.inline
  implicit class SchemaAggregationMutableBuilder[Self <: SchemaAggregation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignmentPeriod(value: String): Self = StObject.set(x, "alignmentPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentPeriodUndefined: Self = StObject.set(x, "alignmentPeriod", js.undefined)
    
    @scala.inline
    def setCrossSeriesReducer(value: String): Self = StObject.set(x, "crossSeriesReducer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossSeriesReducerUndefined: Self = StObject.set(x, "crossSeriesReducer", js.undefined)
    
    @scala.inline
    def setGroupByFields(value: js.Array[String]): Self = StObject.set(x, "groupByFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByFieldsUndefined: Self = StObject.set(x, "groupByFields", js.undefined)
    
    @scala.inline
    def setGroupByFieldsVarargs(value: String*): Self = StObject.set(x, "groupByFields", js.Array(value :_*))
    
    @scala.inline
    def setPerSeriesAligner(value: String): Self = StObject.set(x, "perSeriesAligner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerSeriesAlignerUndefined: Self = StObject.set(x, "perSeriesAligner", js.undefined)
  }
}
