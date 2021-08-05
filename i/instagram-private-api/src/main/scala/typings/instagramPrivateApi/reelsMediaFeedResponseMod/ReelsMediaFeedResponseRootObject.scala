package typings.instagramPrivateApi.reelsMediaFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReelsMediaFeedResponseRootObject extends StObject {
  
  var reels: ReelsMediaFeedResponseReels
  
  var status: String
}
object ReelsMediaFeedResponseRootObject {
  
  inline def apply(reels: ReelsMediaFeedResponseReels, status: String): ReelsMediaFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(reels = reels.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseRootObject]
  }
  
  extension [Self <: ReelsMediaFeedResponseRootObject](x: Self) {
    
    inline def setReels(value: ReelsMediaFeedResponseReels): Self = StObject.set(x, "reels", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
