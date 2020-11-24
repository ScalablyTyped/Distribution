package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LastFetchTs extends js.Object {
  
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
  implicit class LastFetchTsOps[Self <: LastFetchTs] (val x: Self) extends AnyVal {
    
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
    def setBroadcastId(value: String): Self = this.set("broadcastId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastFetchTs(value: Double | String): Self = this.set("lastFetchTs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSeenTs(value: Double | String): Self = this.set("lastSeenTs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTotalCount(value: Double | String): Self = this.set("lastTotalCount", value.asInstanceOf[js.Any])
  }
}
