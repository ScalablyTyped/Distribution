package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSearchApplicationSessionStatsResponse extends StObject {
  
  var stats: js.UndefOr[js.Array[SearchApplicationSessionStats]] = js.undefined
}
object GetSearchApplicationSessionStatsResponse {
  
  inline def apply(): GetSearchApplicationSessionStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSearchApplicationSessionStatsResponse]
  }
  
  extension [Self <: GetSearchApplicationSessionStatsResponse](x: Self) {
    
    inline def setStats(value: js.Array[SearchApplicationSessionStats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setStatsVarargs(value: SearchApplicationSessionStats*): Self = StObject.set(x, "stats", js.Array(value :_*))
  }
}
