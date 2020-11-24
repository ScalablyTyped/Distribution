package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSearchApplicationQueryStatsResponse extends js.Object {
  
  var stats: js.UndefOr[js.Array[SearchApplicationQueryStats]] = js.native
}
object GetSearchApplicationQueryStatsResponse {
  
  @scala.inline
  def apply(): GetSearchApplicationQueryStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSearchApplicationQueryStatsResponse]
  }
  
  @scala.inline
  implicit class GetSearchApplicationQueryStatsResponseOps[Self <: GetSearchApplicationQueryStatsResponse] (val x: Self) extends AnyVal {
    
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
    def setStatsVarargs(value: SearchApplicationQueryStats*): Self = this.set("stats", js.Array(value :_*))
    
    @scala.inline
    def setStats(value: js.Array[SearchApplicationQueryStats]): Self = this.set("stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
  }
}
