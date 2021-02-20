package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BroadcastId_ extends StObject {
  
  var broadcastId: String = js.native
  
  var commentsRequested: js.UndefOr[Double] = js.native
  
  var lastCommentTs: js.UndefOr[String | Double] = js.native
}
object BroadcastId_ {
  
  @scala.inline
  def apply(broadcastId: String): BroadcastId_ = {
    val __obj = js.Dynamic.literal(broadcastId = broadcastId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastId_]
  }
  
  @scala.inline
  implicit class BroadcastId_MutableBuilder[Self <: BroadcastId_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBroadcastId(value: String): Self = StObject.set(x, "broadcastId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsRequested(value: Double): Self = StObject.set(x, "commentsRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsRequestedUndefined: Self = StObject.set(x, "commentsRequested", js.undefined)
    
    @scala.inline
    def setLastCommentTs(value: String | Double): Self = StObject.set(x, "lastCommentTs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastCommentTsUndefined: Self = StObject.set(x, "lastCommentTs", js.undefined)
  }
}
