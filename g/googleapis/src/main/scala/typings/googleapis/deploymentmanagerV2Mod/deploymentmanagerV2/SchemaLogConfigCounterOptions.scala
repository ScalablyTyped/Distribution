package typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait SchemaLogConfigCounterOptions extends StObject {
  
  /**
    * The field value to attribute.
    */
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * The metric to update.
    */
  var metric: js.UndefOr[String] = js.undefined
}
object SchemaLogConfigCounterOptions {
  
  inline def apply(): SchemaLogConfigCounterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogConfigCounterOptions]
  }
  
  extension [Self <: SchemaLogConfigCounterOptions](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
  }
}
