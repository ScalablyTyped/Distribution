package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liveStartBroadcastResponseMod {
  
  @js.native
  trait LiveStartBroadcastResponseRootObject extends StObject {
    
    var media_id: String = js.native
    
    var status: String = js.native
  }
  object LiveStartBroadcastResponseRootObject {
    
    @scala.inline
    def apply(media_id: String, status: String): LiveStartBroadcastResponseRootObject = {
      val __obj = js.Dynamic.literal(media_id = media_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveStartBroadcastResponseRootObject]
    }
    
    @scala.inline
    implicit class LiveStartBroadcastResponseRootObjectMutableBuilder[Self <: LiveStartBroadcastResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMedia_id(value: String): Self = StObject.set(x, "media_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
