package typings.googleapis.loggingV2beta1Mod.loggingV2beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a logs-based metric. The value of the metric is the number of log
  * entries that match a logs filter in a given time interval.Logs-based metric
  * can also be used to extract values from logs and create a a distribution of
  * the values. The distribution records the statistics of the extracted values
  * along with an optional histogram of the values as specified by the bucket
  * options.
  */
@js.native
trait SchemaLogMetric extends StObject {
  
  /**
    * Optional. The bucket_options are required when the logs-based metric is
    * using a DISTRIBUTION value type and it describes the bucket boundaries
    * used to create a histogram of the extracted values.
    */
  var bucketOptions: js.UndefOr[SchemaBucketOptions] = js.native
  
  /**
    * Output only. The creation timestamp of the metric.This field may not be
    * present for older metrics.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Optional. A description of this metric, which is used in documentation.
    * The maximum length of the description is 8000 characters.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Required. An advanced logs filter which is used to match log entries.
    * Example: &quot;resource.type=gae_app AND severity&gt;=ERROR&quot; The
    * maximum length of the filter is 20000 characters.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Optional. A map from a label key string to an extractor expression which
    * is used to extract data from a log entry field and assign as the label
    * value. Each label key specified in the LabelDescriptor must have an
    * associated extractor expression in this map. The syntax of the extractor
    * expression is the same as for the value_extractor field.The extracted
    * value is converted to the type defined in the label descriptor. If the
    * either the extraction or the type conversion fails, the label will have a
    * default value. The default value for a string label is an empty string,
    * for an integer label its 0, and for a boolean label its false.Note that
    * there are upper bounds on the maximum number of labels and the number of
    * active time series that are allowed in a project.
    */
  var labelExtractors: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Optional. The metric descriptor associated with the logs-based metric. If
    * unspecified, it uses a default metric descriptor with a DELTA metric
    * kind, INT64 value type, with no labels and a unit of &quot;1&quot;. Such
    * a metric counts the number of log entries matching the filter
    * expression.The name, type, and description fields in the
    * metric_descriptor are output only, and is constructed using the name and
    * description field in the LogMetric.To create a logs-based metric that
    * records a distribution of log values, a DELTA metric kind with a
    * DISTRIBUTION value type must be used along with a value_extractor
    * expression in the LogMetric.Each label in the metric descriptor must have
    * a matching label name as the key and an extractor expression as the value
    * in the label_extractors map.The metric_kind and value_type fields in the
    * metric_descriptor cannot be updated once initially configured. New labels
    * can be added in the metric_descriptor, but existing labels cannot be
    * modified except for their description.
    */
  var metricDescriptor: js.UndefOr[SchemaMetricDescriptor] = js.native
  
  /**
    * Required. The client-assigned metric identifier. Examples:
    * &quot;error_count&quot;, &quot;nginx/requests&quot;.Metric identifiers
    * are limited to 100 characters and can include only the following
    * characters: A-Z, a-z, 0-9, and the special characters _-.,+!*&#39;,()%/.
    * The forward-slash character (/) denotes a hierarchy of name pieces, and
    * it cannot be the first character of the name.The metric identifier in
    * this field must not be URL-encoded
    * (https://en.wikipedia.org/wiki/Percent-encoding). However, when the
    * metric identifier appears as the [METRIC_ID] part of a metric_name API
    * parameter, then the metric identifier must be URL-encoded. Example:
    * &quot;projects/my-project/metrics/nginx%2Frequests&quot;.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Output only. The last update timestamp of the metric.This field may not
    * be present for older metrics.
    */
  var updateTime: js.UndefOr[String] = js.native
  
  /**
    * Optional. A value_extractor is required when using a distribution
    * logs-based metric to extract the values to record from a log entry. Two
    * functions are supported for value extraction: EXTRACT(field) or
    * REGEXP_EXTRACT(field, regex). The argument are:  1. field: The name of
    * the log entry field from which the value is to be  extracted.  2. regex:
    * A regular expression using the Google RE2 syntax
    * (https://github.com/google/re2/wiki/Syntax) with a single capture  group
    * to extract data from the specified log entry field. The value  of the
    * field is converted to a string before applying the regex.  It is an error
    * to specify a regex that does not include exactly one  capture group.The
    * result of the extraction must be convertible to a double type, as the
    * distribution always records double values. If either the extraction or
    * the conversion to double fails, then those values are not recorded in the
    * distribution.Example: REGEXP_EXTRACT(jsonPayload.request,
    * &quot;.*quantity=(\d+).*&quot;)
    */
  var valueExtractor: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. The API version that created or updated this metric. The v2
    * format is used by default and cannot be changed.
    */
  var version: js.UndefOr[String] = js.native
}
object SchemaLogMetric {
  
  @scala.inline
  def apply(): SchemaLogMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogMetric]
  }
  
  @scala.inline
  implicit class SchemaLogMetricMutableBuilder[Self <: SchemaLogMetric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketOptions(value: SchemaBucketOptions): Self = StObject.set(x, "bucketOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketOptionsUndefined: Self = StObject.set(x, "bucketOptions", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setLabelExtractors(value: StringDictionary[String]): Self = StObject.set(x, "labelExtractors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelExtractorsUndefined: Self = StObject.set(x, "labelExtractors", js.undefined)
    
    @scala.inline
    def setMetricDescriptor(value: SchemaMetricDescriptor): Self = StObject.set(x, "metricDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricDescriptorUndefined: Self = StObject.set(x, "metricDescriptor", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    @scala.inline
    def setValueExtractor(value: String): Self = StObject.set(x, "valueExtractor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueExtractorUndefined: Self = StObject.set(x, "valueExtractor", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
