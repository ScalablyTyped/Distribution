package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LastFetchTs extends StObject {
  
  var broadcastId: String = js.native
  
  var lastFetchTs: Double | String = js.native
  
  var lastSeenTs: Double | String = js.native
  
  var lastTotalCount: Double | String = js.native
}
object LastFetchTs {
  
  @scala.inline
  def apply(
    broadcastId: String,
    lastFetchTs: Double | String,
    lastSeenTs: Double | String,
    lastTotalCount: Double | String
  ): LastFetchTs = {
    val __obj = js.Dynamic.literal(broadcastId = broadcastId.asInstanceOf[js.Any], lastFetchTs = lastFetchTs.asInstanceOf[js.Any], lastSeenTs = lastSeenTs.asInstanceOf[js.Any], lastTotalCount = lastTotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastFetchTs]
  }
  
  @scala.inline
  implicit class LastFetchTsMutableBuilder[Self <: LastFetchTs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBroadcastId(value: String): Self = StObject.set(x, "broadcastId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastFetchTs(value: Double | String): Self = StObject.set(x, "lastFetchTs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSeenTs(value: Double | String): Self = StObject.set(x, "lastSeenTs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTotalCount(value: Double | String): Self = StObject.set(x, "lastTotalCount", value.asInstanceOf[js.Any])
  }
}
