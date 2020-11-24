package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricMetadata extends js.Object {
  
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
  implicit class MetricMetadataOps[Self <: MetricMetadata] (val x: Self) extends AnyVal {
    
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
    def setApiName(value: String): Self = this.set("apiName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiName: Self = this.set("apiName", js.undefined)
    
    @scala.inline
    def setCustomDefinition(value: Boolean): Self = this.set("customDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomDefinition: Self = this.set("customDefinition", js.undefined)
    
    @scala.inline
    def setDeprecatedApiNamesVarargs(value: String*): Self = this.set("deprecatedApiNames", js.Array(value :_*))
    
    @scala.inline
    def setDeprecatedApiNames(value: js.Array[String]): Self = this.set("deprecatedApiNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecatedApiNames: Self = this.set("deprecatedApiNames", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUiName(value: String): Self = this.set("uiName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUiName: Self = this.set("uiName", js.undefined)
  }
}
