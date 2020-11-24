package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchApplicationQueryStats extends js.Object {
  
  /** Date for which query stats were calculated. Stats calculated on the next day close to midnight are returned. */
  var date: js.UndefOr[Date] = js.native
  
  var queryCountByStatus: js.UndefOr[js.Array[QueryCountByStatus]] = js.native
}
object SearchApplicationQueryStats {
  
  @scala.inline
  def apply(): SearchApplicationQueryStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchApplicationQueryStats]
  }
  
  @scala.inline
  implicit class SearchApplicationQueryStatsOps[Self <: SearchApplicationQueryStats] (val x: Self) extends AnyVal {
    
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
    def setQueryCountByStatusVarargs(value: QueryCountByStatus*): Self = this.set("queryCountByStatus", js.Array(value :_*))
    
    @scala.inline
    def setQueryCountByStatus(value: js.Array[QueryCountByStatus]): Self = this.set("queryCountByStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryCountByStatus: Self = this.set("queryCountByStatus", js.undefined)
  }
}
