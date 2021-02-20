package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSearchApplicationUserStatsResponse extends StObject {
  
  var stats: js.UndefOr[js.Array[SearchApplicationUserStats]] = js.native
}
object GetSearchApplicationUserStatsResponse {
  
  @scala.inline
  def apply(): GetSearchApplicationUserStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSearchApplicationUserStatsResponse]
  }
  
  @scala.inline
  implicit class GetSearchApplicationUserStatsResponseMutableBuilder[Self <: GetSearchApplicationUserStatsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStats(value: js.Array[SearchApplicationUserStats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    @scala.inline
    def setStatsVarargs(value: SearchApplicationUserStats*): Self = StObject.set(x, "stats", js.Array(value :_*))
  }
}
