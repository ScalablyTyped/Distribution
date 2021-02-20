package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liveAddPostLiveToIgtvResponseMod {
  
  @js.native
  trait LiveAddPostLiveToIgtvResponseRootObject extends StObject {
    
    var igtv_post_id: Double = js.native
    
    var status: String = js.native
    
    var success: Boolean = js.native
  }
  object LiveAddPostLiveToIgtvResponseRootObject {
    
    @scala.inline
    def apply(igtv_post_id: Double, status: String, success: Boolean): LiveAddPostLiveToIgtvResponseRootObject = {
      val __obj = js.Dynamic.literal(igtv_post_id = igtv_post_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveAddPostLiveToIgtvResponseRootObject]
    }
    
    @scala.inline
    implicit class LiveAddPostLiveToIgtvResponseRootObjectMutableBuilder[Self <: LiveAddPostLiveToIgtvResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgtv_post_id(value: Double): Self = StObject.set(x, "igtv_post_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
}
