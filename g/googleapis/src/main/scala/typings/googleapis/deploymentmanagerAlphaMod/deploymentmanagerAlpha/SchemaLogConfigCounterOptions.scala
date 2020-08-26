package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Increment a streamz counter with the specified metric and field names.
  * Metric names should start with a &#39;/&#39;, generally be lowercase-only,
  * and end in &quot;_count&quot;. Field names should not contain an initial
  * slash. The actual exported metric names will have &quot;/iam/policy&quot;
  * prepended.  Field names correspond to IAM request parameters and field
  * values are their respective values.  Supported field names: -
  * &quot;authority&quot;, which is &quot;[token]&quot; if IAMContext.token is
  * present, otherwise the value of IAMContext.authority_selector if present,
  * and otherwise a representation of IAMContext.principal; or -
  * &quot;iam_principal&quot;, a representation of IAMContext.principal even if
  * a token or authority selector is present; or - &quot;&quot; (empty string),
  * resulting in a counter with no fields.  Examples: counter { metric:
  * &quot;/debug_access_count&quot; field: &quot;iam_principal&quot; } ==&gt;
  * increment counter /iam/policy/backend_debug_access_count
  * {iam_principal=[value of IAMContext.principal]}  At this time we do not
  * support multiple field names (though this may be supported in the future).
  */
@js.native
trait SchemaLogConfigCounterOptions extends js.Object {
  /**
    * The field value to attribute.
    */
  var field: js.UndefOr[String] = js.native
  /**
    * The metric to update.
    */
  var metric: js.UndefOr[String] = js.native
}

object SchemaLogConfigCounterOptions {
  @scala.inline
  def apply(): SchemaLogConfigCounterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogConfigCounterOptions]
  }
  @scala.inline
  implicit class SchemaLogConfigCounterOptionsOps[Self <: SchemaLogConfigCounterOptions] (val x: Self) extends AnyVal {
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setMetric(value: String): Self = this.set("metric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetric: Self = this.set("metric", js.undefined)
  }
  
}

