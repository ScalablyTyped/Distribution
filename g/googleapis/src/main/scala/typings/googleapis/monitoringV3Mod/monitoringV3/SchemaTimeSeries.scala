package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of data points that describes the time-varying values of a
  * metric. A time series is identified by a combination of a fully-specified
  * monitored resource and a fully-specified metric. This type is used for both
  * listing and creating time series.
  */
@js.native
trait SchemaTimeSeries extends StObject {
  
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
  def apply(): SchemaTimeSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeSeries]
  }
  
  @scala.inline
  implicit class SchemaTimeSeriesMutableBuilder[Self <: SchemaTimeSeries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: SchemaMonitoredResourceMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setMetric(value: SchemaMetric): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricKind(value: String): Self = StObject.set(x, "metricKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricKindUndefined: Self = StObject.set(x, "metricKind", js.undefined)
    
    @scala.inline
    def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    @scala.inline
    def setPoints(value: js.Array[SchemaPoint]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: SchemaPoint*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setResource(value: SchemaMonitoredResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setValueType(value: String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
  }
}
