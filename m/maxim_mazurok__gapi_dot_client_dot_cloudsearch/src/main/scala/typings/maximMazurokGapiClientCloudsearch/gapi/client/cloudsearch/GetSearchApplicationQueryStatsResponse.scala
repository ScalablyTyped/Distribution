package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSearchApplicationQueryStatsResponse extends StObject {
  
  var stats: js.UndefOr[js.Array[SearchApplicationQueryStats]] = js.undefined
}
object GetSearchApplicationQueryStatsResponse {
  
  inline def apply(): GetSearchApplicationQueryStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSearchApplicationQueryStatsResponse]
  }
  
  extension [Self <: GetSearchApplicationQueryStatsResponse](x: Self) {
    
    inline def setStats(value: js.Array[SearchApplicationQueryStats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setStatsVarargs(value: SearchApplicationQueryStats*): Self = StObject.set(x, "stats", js.Array(value :_*))
  }
}
