package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liveSwitchCommentsResponseMod {
  
  trait LiveSwitchCommentsResponseRootObject extends StObject {
    
    var comment_muted: Double
    
    var status: String
  }
  object LiveSwitchCommentsResponseRootObject {
    
    inline def apply(comment_muted: Double, status: String): LiveSwitchCommentsResponseRootObject = {
      val __obj = js.Dynamic.literal(comment_muted = comment_muted.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveSwitchCommentsResponseRootObject]
    }
    
    extension [Self <: LiveSwitchCommentsResponseRootObject](x: Self) {
      
      inline def setComment_muted(value: Double): Self = StObject.set(x, "comment_muted", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
