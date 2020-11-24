package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * `appengine.googleapis.com/http/server/response_latencies` metric type has
    * a label for the HTTP response code, `response_code`, so you can look at
    * latencies for successful responses or just for responses that failed.
    */
  var labels: js.UndefOr[js.Array[SchemaLabelDescriptor]] = js.native
  
  /**
    * Optional. Metadata which can be used to guide usage of the metric.
    */
  var metadata: js.UndefOr[SchemaMetricDescriptorMetadata] = js.native
  
  /**
    * Whether the metric records instantaneous values, changes to a value, etc.
    * Some combinations of `metric_kind` and `value_type` might not be
    * supported.
    */
  var metricKind: js.UndefOr[String] = js.native
  
  /**
    * The resource name of the metric descriptor.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The metric type, including its DNS name prefix. The type is not
    * URL-encoded.  All user-defined metric types have the DNS name
    * `custom.googleapis.com` or `external.googleapis.com`.  Metric types
    * should use a natural hierarchical grouping. For example:
    * &quot;custom.googleapis.com/invoice/paid/amount&quot;
    * &quot;external.googleapis.com/prometheus/up&quot;
    * &quot;appengine.googleapis.com/http/server/response_latencies&quot;
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The unit in which the metric value is reported. It is only applicable if
    * the `value_type` is `INT64`, `DOUBLE`, or `DISTRIBUTION`. The supported
    * units are a subset of [The Unified Code for Units of
    * Measure](http://unitsofmeasure.org/ucum.html) standard:  **Basic units
    * (UNIT)**  * `bit`   bit * `By`    byte * `s`     second * `min`   minute
    * * `h`     hour * `d`     day  **Prefixes (PREFIX)**  * `k`     kilo
    * (10**3) * `M`     mega    (10**6) * `G`     giga    (10**9) * `T` tera
    * (10**12) * `P`     peta    (10**15) * `E`     exa     (10**18) * `Z`
    * zetta   (10**21) * `Y`     yotta   (10**24) * `m`     milli   (10**-3) *
    * `u`     micro   (10**-6) * `n`     nano    (10**-9) * `p`     pico
    * (10**-12) * `f`     femto   (10**-15) * `a`     atto    (10**-18) * `z`
    * zepto   (10**-21) * `y`     yocto   (10**-24) * `Ki`    kibi    (2**10) *
    * `Mi`    mebi    (2**20) * `Gi`    gibi    (2**30) * `Ti`    tebi (2**40)
    * **Grammar**  The grammar also includes these connectors:  * `/` division
    * (as an infix operator, e.g. `1/s`). * `.`    multiplication (as an infix
    * operator, e.g. `GBy.d`)  The grammar for a unit is as follows: Expression
    * = Component { &quot;.&quot; Component } { &quot;/&quot; Component } ;
    * Component = ( [ PREFIX ] UNIT | &quot;%&quot; ) [ Annotation ] |
    * Annotation               | &quot;1&quot;               ;      Annotation
    * = &quot;{&quot; NAME &quot;}&quot; ;  Notes:  * `Annotation` is just a
    * comment if it follows a `UNIT` and is    equivalent to `1` if it is used
    * alone. For examples,    `{requests}/s == 1/s`, `By{transmitted}/s ==
    * By/s`. * `NAME` is a sequence of non-blank printable ASCII characters not
    * containing &#39;{&#39; or &#39;}&#39;. * `1` represents dimensionless
    * value 1, such as in `1/s`. * `%` represents dimensionless value 1/100,
    * and annotates values giving    a percentage.
    */
  var unit: js.UndefOr[String] = js.native
  
  /**
    * Whether the measurement is an integer, a floating-point number, etc. Some
    * combinations of `metric_kind` and `value_type` might not be supported.
    */
  var valueType: js.UndefOr[String] = js.native
}
object SchemaMetricDescriptor {
  
  @scala.inline
  def apply(): SchemaMetricDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricDescriptor]
  }
  
  @scala.inline
  implicit class SchemaMetricDescriptorOps[Self <: SchemaMetricDescriptor] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: SchemaLabelDescriptor*): Self = this.set("labels", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: js.Array[SchemaLabelDescriptor]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaMetricDescriptorMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setMetricKind(value: String): Self = this.set("metricKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricKind: Self = this.set("metricKind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    
    @scala.inline
    def setValueType(value: String): Self = this.set("valueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueType: Self = this.set("valueType", js.undefined)
  }
}
