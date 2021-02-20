package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liveSwitchCommentsResponseMod {
  
  @js.native
  trait LiveSwitchCommentsResponseRootObject extends StObject {
    
    var comment_muted: Double = js.native
    
    var status: String = js.native
  }
  object LiveSwitchCommentsResponseRootObject {
    
    @scala.inline
    def apply(comment_muted: Double, status: String): LiveSwitchCommentsResponseRootObject = {
      val __obj = js.Dynamic.literal(comment_muted = comment_muted.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveSwitchCommentsResponseRootObject]
    }
    
    @scala.inline
    implicit class LiveSwitchCommentsResponseRootObjectMutableBuilder[Self <: LiveSwitchCommentsResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComment_muted(value: Double): Self = StObject.set(x, "comment_muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
