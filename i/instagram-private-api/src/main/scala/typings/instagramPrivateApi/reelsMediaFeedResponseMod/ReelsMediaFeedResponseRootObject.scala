package typings.instagramPrivateApi.reelsMediaFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReelsMediaFeedResponseRootObject extends StObject {
  
  var reels: ReelsMediaFeedResponseReels = js.native
  
  var status: String = js.native
}
object ReelsMediaFeedResponseRootObject {
  
  @scala.inline
  def apply(reels: ReelsMediaFeedResponseReels, status: String): ReelsMediaFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(reels = reels.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseRootObject]
  }
  
  @scala.inline
  implicit class ReelsMediaFeedResponseRootObjectMutableBuilder[Self <: ReelsMediaFeedResponseRootObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReels(value: ReelsMediaFeedResponseReels): Self = StObject.set(x, "reels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
