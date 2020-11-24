package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCustomerUserStatsResponse extends js.Object {
  
  var stats: js.UndefOr[js.Array[CustomerUserStats]] = js.native
}
object GetCustomerUserStatsResponse {
  
  @scala.inline
  def apply(): GetCustomerUserStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCustomerUserStatsResponse]
  }
  
  @scala.inline
  implicit class GetCustomerUserStatsResponseOps[Self <: GetCustomerUserStatsResponse] (val x: Self) extends AnyVal {
    
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
    def setStatsVarargs(value: CustomerUserStats*): Self = this.set("stats", js.Array(value :_*))
    
    @scala.inline
    def setStats(value: js.Array[CustomerUserStats]): Self = this.set("stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
  }
}
