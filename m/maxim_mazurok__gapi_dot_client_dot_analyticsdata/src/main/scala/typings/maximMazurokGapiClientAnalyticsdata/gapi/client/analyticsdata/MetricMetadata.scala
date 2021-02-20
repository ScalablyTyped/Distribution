package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricMetadata extends StObject {
  
  /** A metric name. Useable in [Metric](#Metric)'s `name`. For example, `eventCount`. */
  var apiName: js.UndefOr[String] = js.native
  
  /** True if the metric is a custom metric for this property. */
  var customDefinition: js.UndefOr[Boolean] = js.native
  
  /**
    * Still usable but deprecated names for this metric. If populated, this metric is available by either `apiName` or one of `deprecatedApiNames` for a period of time. After the
    * deprecation period, the metric will be available only by `apiName`.
    */
  var deprecatedApiNames: js.UndefOr[js.Array[String]] = js.native
  
  /** Description of how this metric is used and calculated. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The mathematical expression for this derived metric. Can be used in [Metric](#Metric)'s `expression` field for equivalent reports. Most metrics are not expressions, and for
    * non-expressions, this field is empty.
    */
  var expression: js.UndefOr[String] = js.native
  
  /** The type of this metric. */
  var `type`: js.UndefOr[String] = js.native
  
  /** This metric's name within the Google Analytics user interface. For example, `Event count`. */
  var uiName: js.UndefOr[String] = js.native
}
object MetricMetadata {
  
  @scala.inline
  def apply(): MetricMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricMetadata]
  }
  
  @scala.inline
  implicit class MetricMetadataMutableBuilder[Self <: MetricMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiName(value: String): Self = StObject.set(x, "apiName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiNameUndefined: Self = StObject.set(x, "apiName", js.undefined)
    
    @scala.inline
    def setCustomDefinition(value: Boolean): Self = StObject.set(x, "customDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDefinitionUndefined: Self = StObject.set(x, "customDefinition", js.undefined)
    
    @scala.inline
    def setDeprecatedApiNames(value: js.Array[String]): Self = StObject.set(x, "deprecatedApiNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedApiNamesUndefined: Self = StObject.set(x, "deprecatedApiNames", js.undefined)
    
    @scala.inline
    def setDeprecatedApiNamesVarargs(value: String*): Self = StObject.set(x, "deprecatedApiNames", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUiName(value: String): Self = StObject.set(x, "uiName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiNameUndefined: Self = StObject.set(x, "uiName", js.undefined)
  }
}
