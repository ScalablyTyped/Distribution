package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSearchApplicationQueryStatsResponse extends StObject {
  
  var stats: js.UndefOr[js.Array[SearchApplicationQueryStats]] = js.native
}
object GetSearchApplicationQueryStatsResponse {
  
  @scala.inline
  def apply(): GetSearchApplicationQueryStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSearchApplicationQueryStatsResponse]
  }
  
  @scala.inline
  implicit class GetSearchApplicationQueryStatsResponseMutableBuilder[Self <: GetSearchApplicationQueryStatsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStats(value: js.Array[SearchApplicationQueryStats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    @scala.inline
    def setStatsVarargs(value: SearchApplicationQueryStats*): Self = StObject.set(x, "stats", js.Array(value :_*))
  }
}
