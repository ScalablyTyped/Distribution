package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The protocol for the ListUptimeCheckConfigs response.
  */
@js.native
trait SchemaListUptimeCheckConfigsResponse extends js.Object {
  
  /**
    * This field represents the pagination token to retrieve the next page of
    * results. If the value is empty, it means no further results for the
    * request. To retrieve the next page of results, the value of the
    * next_page_token is passed to the subsequent List method call (in the
    * request message&#39;s page_token field).
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The total number of uptime check configurations for the project,
    * irrespective of any pagination.
    */
  var totalSize: js.UndefOr[Double] = js.native
  
  /**
    * The returned uptime check configurations.
    */
  var uptimeCheckConfigs: js.UndefOr[js.Array[SchemaUptimeCheckConfig]] = js.native
}
object SchemaListUptimeCheckConfigsResponse {
  
  @scala.inline
  def apply(): SchemaListUptimeCheckConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListUptimeCheckConfigsResponse]
  }
  
  @scala.inline
  implicit class SchemaListUptimeCheckConfigsResponseOps[Self <: SchemaListUptimeCheckConfigsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setTotalSize(value: Double): Self = this.set("totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalSize: Self = this.set("totalSize", js.undefined)
    
    @scala.inline
    def setUptimeCheckConfigsVarargs(value: SchemaUptimeCheckConfig*): Self = this.set("uptimeCheckConfigs", js.Array(value :_*))
    
    @scala.inline
    def setUptimeCheckConfigs(value: js.Array[SchemaUptimeCheckConfig]): Self = this.set("uptimeCheckConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUptimeCheckConfigs: Self = this.set("uptimeCheckConfigs", js.undefined)
  }
}
