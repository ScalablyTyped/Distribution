package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkpointResponseMod {
  
  trait CheckpointResponse extends StObject {
    
    var challenge: CheckpointResponseChallenge
    
    var error_type: String
    
    var message: String
    
    var status: String
  }
  object CheckpointResponse {
    
    @scala.inline
    def apply(challenge: CheckpointResponseChallenge, error_type: String, message: String, status: String): CheckpointResponse = {
      val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], error_type = error_type.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckpointResponse]
    }
    
    @scala.inline
    implicit class CheckpointResponseMutableBuilder[Self <: CheckpointResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChallenge(value: CheckpointResponseChallenge): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError_type(value: String): Self = StObject.set(x, "error_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait CheckpointResponseChallenge extends StObject {
    
    var api_path: String
    
    var hide_webview_header: Boolean
    
    var lock: Boolean
    
    var logout: Boolean
    
    var native_flow: Boolean
    
    var url: String
  }
  object CheckpointResponseChallenge {
    
    @scala.inline
    def apply(
      api_path: String,
      hide_webview_header: Boolean,
      lock: Boolean,
      logout: Boolean,
      native_flow: Boolean,
      url: String
    ): CheckpointResponseChallenge = {
      val __obj = js.Dynamic.literal(api_path = api_path.asInstanceOf[js.Any], hide_webview_header = hide_webview_header.asInstanceOf[js.Any], lock = lock.asInstanceOf[js.Any], logout = logout.asInstanceOf[js.Any], native_flow = native_flow.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckpointResponseChallenge]
    }
    
    @scala.inline
    implicit class CheckpointResponseChallengeMutableBuilder[Self <: CheckpointResponseChallenge] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi_path(value: String): Self = StObject.set(x, "api_path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHide_webview_header(value: Boolean): Self = StObject.set(x, "hide_webview_header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLock(value: Boolean): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogout(value: Boolean): Self = StObject.set(x, "logout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNative_flow(value: Boolean): Self = StObject.set(x, "native_flow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
