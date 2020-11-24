package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceIndexStats extends js.Object {
  
  /**
    * Date for which index stats were calculated. If the date of request is not the current date then stats calculated on the next day are returned. Stats are calculated close to mid
    * night in this case. If date of request is current date, then real time stats are returned.
    */
  var date: js.UndefOr[Date] = js.native
  
  /** Number of items aggregrated by status code. */
  var itemCountByStatus: js.UndefOr[js.Array[ItemCountByStatus]] = js.native
}
object DataSourceIndexStats {
  
  @scala.inline
  def apply(): DataSourceIndexStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceIndexStats]
  }
  
  @scala.inline
  implicit class DataSourceIndexStatsOps[Self <: DataSourceIndexStats] (val x: Self) extends AnyVal {
    
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
