package typings.googleapis.loggingV2beta1Mod.loggingV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a metric type and its schema. Once a metric descriptor is created,
  * deleting or altering it stops data collection and makes the metric
  * type&#39;s existing data unusable.
  */
@js.native
trait SchemaMetricDescriptor extends js.Object {
  /**
    * A detailed description of the metric, which can be used in documentation.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A concise name for the metric, which can be displayed in user interfaces.
    * Use sentence case without an ending period, for example &quot;Request
    * count&quot;. This field is optional but it is recommended to be set for
    * any metrics associated with user-visible concepts, such as Quota.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The set of labels that can be used to describe a specific instance of
    * this metric type. For example, the
    * appengine.googleapis.com/http/server/response_latencies metric type has a
    * label for the HTTP response code, response_code, so you can look at
    * latencies for successful responses or just for responses that failed.
    */
  var labels: js.UndefOr[js.Array[SchemaLabelDescriptor]] = js.native
  /**
    * Optional. Metadata which can be used to guide usage of the metric.
    */
  var metadata: js.UndefOr[SchemaMetricDescriptorMetadata] = js.native
  /**
    * Whether the metric records instantaneous values, changes to a value, etc.
    * Some combinations of metric_kind and value_type might not be supported.
    */
  var metricKind: js.UndefOr[String] = js.native
  /**
    * The resource name of the metric descriptor.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The metric type, including its DNS name prefix. The type is not
    * URL-encoded. All user-defined metric types have the DNS name
    * custom.googleapis.com or external.googleapis.com. Metric types should use
    * a natural hierarchical grouping. For example:
    * &quot;custom.googleapis.com/invoice/paid/amount&quot;
    * &quot;external.googleapis.com/prometheus/up&quot;
    * &quot;appengine.googleapis.com/http/server/response_latencies&quot;
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The unit in which the metric value is reported. It is only applicable if
    * the value_type is INT64, DOUBLE, or DISTRIBUTION. The supported units are
    * a subset of The Unified Code for Units of Measure
    * (http://unitsofmeasure.org/ucum.html) standard:Basic units (UNIT) bit bit
    * By byte s second min minute h hour d dayPrefixes (PREFIX) k kilo (10**3)
    * M mega (10**6) G giga (10**9) T tera (10**12) P peta (10**15) E exa
    * (10**18) Z zetta (10**21) Y yotta (10**24) m milli (10**-3) u micro
    * (10**-6) n nano (10**-9) p pico (10**-12) f femto (10**-15) a atto
    * (10**-18) z zepto (10**-21) y yocto (10**-24) Ki kibi (2**10) Mi mebi
    * (2**20) Gi gibi (2**30) Ti tebi (2**40)GrammarThe grammar also includes
    * these connectors: / division (as an infix operator, e.g. 1/s). .
    * multiplication (as an infix operator, e.g. GBy.d)The grammar for a unit
    * is as follows: Expression = Component { &quot;.&quot; Component } {
    * &quot;/&quot; Component } ;  Component = ( [ PREFIX ] UNIT |
    * &quot;%&quot; ) [ Annotation ]           | Annotation           |
    * &quot;1&quot;           ;  Annotation = &quot;{&quot; NAME &quot;}&quot;
    * ; Notes: Annotation is just a comment if it follows a UNIT and is
    * equivalent to 1 if it is used alone. For examples,  {requests}/s == 1/s,
    * By{transmitted}/s == By/s. NAME is a sequence of non-blank printable
    * ASCII characters not  containing &#39;{&#39; or &#39;}&#39;. 1 represents
    * dimensionless value 1, such as in 1/s. % represents dimensionless value
    * 1/100, and annotates values giving  a percentage.
    */
  var unit: js.UndefOr[String] = js.native
  /**
    * Whether the measurement is an integer, a floating-point number, etc. Some
    * combinations of metric_kind and value_type might not be supported.
    */
  var valueType: js.UndefOr[String] = js.native
}

object SchemaMetricDescriptor {
  @scala.inline
  def apply(
    description: String = null,
    displayName: String = null,
    labels: js.Array[SchemaLabelDescriptor] = null,
    metadata: SchemaMetricDescriptorMetadata = null,
    metricKind: String = null,
    name: String = null,
    `type`: String = null,
    unit: String = null,
    valueType: String = null
  ): SchemaMetricDescriptor = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (metricKind != null) __obj.updateDynamic("metricKind")(metricKind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (valueType != null) __obj.updateDynamic("valueType")(valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMetricDescriptor]
  }
}

