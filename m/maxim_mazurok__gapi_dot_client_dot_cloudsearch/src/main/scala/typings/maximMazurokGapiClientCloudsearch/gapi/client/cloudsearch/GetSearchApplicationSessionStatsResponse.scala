package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSearchApplicationSessionStatsResponse extends StObject {
  
  var stats: js.UndefOr[js.Array[SearchApplicationSessionStats]] = js.native
}
object GetSearchApplicationSessionStatsResponse {
  
  @scala.inline
  def apply(): GetSearchApplicationSessionStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSearchApplicationSessionStatsResponse]
  }
  
  @scala.inline
  implicit class GetSearchApplicationSessionStatsResponseMutableBuilder[Self <: GetSearchApplicationSessionStatsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStats(value: js.Array[SearchApplicationSessionStats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    @scala.inline
    def setStatsVarargs(value: SearchApplicationSessionStats*): Self = StObject.set(x, "stats", js.Array(value :_*))
  }
}
