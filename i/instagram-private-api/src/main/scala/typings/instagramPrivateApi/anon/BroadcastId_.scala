package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BroadcastId_ extends StObject {
  
  var broadcastId: String
  
  var commentsRequested: js.UndefOr[Double] = js.undefined
  
  var lastCommentTs: js.UndefOr[String | Double] = js.undefined
}
object BroadcastId_ {
  
  inline def apply(broadcastId: String): BroadcastId_ = {
    val __obj = js.Dynamic.literal(broadcastId = broadcastId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastId_]
  }
  
  extension [Self <: BroadcastId_](x: Self) {
    
    inline def setBroadcastId(value: String): Self = StObject.set(x, "broadcastId", value.asInstanceOf[js.Any])
    
    inline def setCommentsRequested(value: Double): Self = StObject.set(x, "commentsRequested", value.asInstanceOf[js.Any])
    
    inline def setCommentsRequestedUndefined: Self = StObject.set(x, "commentsRequested", js.undefined)
    
    inline def setLastCommentTs(value: String | Double): Self = StObject.set(x, "lastCommentTs", value.asInstanceOf[js.Any])
    
    inline def setLastCommentTsUndefined: Self = StObject.set(x, "lastCommentTs", js.undefined)
  }
}
