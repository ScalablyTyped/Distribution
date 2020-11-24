package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCustomerIndexStatsResponse extends js.Object {
  
  /** Summary of indexed item counts, one for each day in the requested range. */
  var stats: js.UndefOr[js.Array[CustomerIndexStats]] = js.native
}
object GetCustomerIndexStatsResponse {
  
  @scala.inline
  def apply(): GetCustomerIndexStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCustomerIndexStatsResponse]
  }
  
  @scala.inline
  implicit class GetCustomerIndexStatsResponseOps[Self <: GetCustomerIndexStatsResponse] (val x: Self) extends AnyVal {
    
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
    def setStatsVarargs(value: CustomerIndexStats*): Self = this.set("stats", js.Array(value :_*))
    
    @scala.inline
    def setStats(value: js.Array[CustomerIndexStats]): Self = this.set("stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
  }
}
