package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaRepositoryBlockedResponseMod {
  
  @js.native
  trait MediaRepositoryBlockedResponse extends StObject {
    
    var media_ids: js.Array[String] = js.native
    
    var status: String = js.native
  }
  object MediaRepositoryBlockedResponse {
    
    @scala.inline
    def apply(media_ids: js.Array[String], status: String): MediaRepositoryBlockedResponse = {
      val __obj = js.Dynamic.literal(media_ids = media_ids.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaRepositoryBlockedResponse]
    }
    
    @scala.inline
    implicit class MediaRepositoryBlockedResponseMutableBuilder[Self <: MediaRepositoryBlockedResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMedia_ids(value: js.Array[String]): Self = StObject.set(x, "media_ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_idsVarargs(value: String*): Self = StObject.set(x, "media_ids", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
