package typings.maximMazurokGapiClientChromeuxreport.gapi.client.chromeuxreport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryRequest extends js.Object {
  
  /**
    * The effective connection type is a query dimension that specifies the effective network class that the record's data should belong to. This field uses the values ["offline",
    * "slow-2G", "2G", "3G", "4G"] as specified in: https://wicg.github.io/netinfo/#effective-connection-types Note: If no effective connection type is specified, then a special record
    * with aggregated data over all effective connection types will be returned.
    */
  var effectiveConnectionType: js.UndefOr[String] = js.native
  
  /**
    * The form factor is a query dimension that specifies the device class that the record's data should belong to. Note: If no form factor is specified, then a special record with
    * aggregated data over all form factors will be returned.
    */
  var formFactor: js.UndefOr[String] = js.native
  
  /**
    * The metrics that should be included in the response. If none are specified then any metrics found will be returned. Allowed values: ["first_contentful_paint", "first_input_delay",
    * "largest_contentful_paint", "cumulative_layout_shift"]
    */
  var metrics: js.UndefOr[js.Array[String]] = js.native
  
  /** The url pattern "origin" refers to a url pattern that is the origin of a website. Examples: "https://example.com", "https://cloud.google.com" */
  var origin: js.UndefOr[String] = js.native
  
  /** The url pattern "url" refers to a url pattern that is any arbitrary url. Examples: "https://example.com/", "https://cloud.google.com/why-google-cloud/" */
  var url: js.UndefOr[String] = js.native
}
object QueryRequest {
  
  @scala.inline
  def apply(): QueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRequest]
  }
  
  @scala.inline
  implicit class QueryRequestOps[Self <: QueryRequest] (val x: Self) extends AnyVal {
    
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
    def setEffectiveConnectionType(value: String): Self = this.set("effectiveConnectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveConnectionType: Self = this.set("effectiveConnectionType", js.undefined)
    
    @scala.inline
    def setFormFactor(value: String): Self = this.set("formFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormFactor: Self = this.set("formFactor", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: String*): Self = this.set("metrics", js.Array(value :_*))
    
    @scala.inline
    def setMetrics(value: js.Array[String]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
