package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSearchApplicationQueryStatsResponse extends StObject {
  
  /** Query stats per date for a search application. */
  var stats: js.UndefOr[js.Array[SearchApplicationQueryStats]] = js.undefined
  
  /** Total successful query count (status code 200) for the given date range. */
  var totalQueryCount: js.UndefOr[String] = js.undefined
}
object GetSearchApplicationQueryStatsResponse {
  
  inline def apply(): GetSearchApplicationQueryStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSearchApplicationQueryStatsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSearchApplicationQueryStatsResponse] (val x: Self) extends AnyVal {
    
    inline def setStats(value: js.Array[SearchApplicationQueryStats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setStatsVarargs(value: SearchApplicationQueryStats*): Self = StObject.set(x, "stats", js.Array(value*))
    
    inline def setTotalQueryCount(value: String): Self = StObject.set(x, "totalQueryCount", value.asInstanceOf[js.Any])
    
    inline def setTotalQueryCountUndefined: Self = StObject.set(x, "totalQueryCount", js.undefined)
  }
}
