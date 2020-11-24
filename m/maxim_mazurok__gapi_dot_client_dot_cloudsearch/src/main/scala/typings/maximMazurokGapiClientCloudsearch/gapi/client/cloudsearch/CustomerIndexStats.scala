package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomerIndexStats extends js.Object {
  
  /** Date for which statistics were calculated. */
  var date: js.UndefOr[Date] = js.native
  
  /** Number of items aggregrated by status code. */
  var itemCountByStatus: js.UndefOr[js.Array[ItemCountByStatus]] = js.native
}
object CustomerIndexStats {
  
  @scala.inline
  def apply(): CustomerIndexStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerIndexStats]
  }
  
  @scala.inline
  implicit class CustomerIndexStatsOps[Self <: CustomerIndexStats] (val x: Self) extends AnyVal {
    
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
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setItemCountByStatusVarargs(value: ItemCountByStatus*): Self = this.set("itemCountByStatus", js.Array(value :_*))
    
    @scala.inline
    def setItemCountByStatus(value: js.Array[ItemCountByStatus]): Self = this.set("itemCountByStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemCountByStatus: Self = this.set("itemCountByStatus", js.undefined)
  }
}
