package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liveAddPostLiveToIgtvResponseMod {
  
  trait LiveAddPostLiveToIgtvResponseRootObject extends StObject {
    
    var igtv_post_id: Double
    
    var status: String
    
    var success: Boolean
  }
  object LiveAddPostLiveToIgtvResponseRootObject {
    
    inline def apply(igtv_post_id: Double, status: String, success: Boolean): LiveAddPostLiveToIgtvResponseRootObject = {
      val __obj = js.Dynamic.literal(igtv_post_id = igtv_post_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveAddPostLiveToIgtvResponseRootObject]
    }
    
    extension [Self <: LiveAddPostLiveToIgtvResponseRootObject](x: Self) {
      
      inline def setIgtv_post_id(value: Double): Self = StObject.set(x, "igtv_post_id", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
}
