package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaRepositoryBlockedResponseMod {
  
  trait MediaRepositoryBlockedResponse extends StObject {
    
    var media_ids: js.Array[String]
    
    var status: String
  }
  object MediaRepositoryBlockedResponse {
    
    inline def apply(media_ids: js.Array[String], status: String): MediaRepositoryBlockedResponse = {
      val __obj = js.Dynamic.literal(media_ids = media_ids.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaRepositoryBlockedResponse]
    }
    
    extension [Self <: MediaRepositoryBlockedResponse](x: Self) {
      
      inline def setMedia_ids(value: js.Array[String]): Self = StObject.set(x, "media_ids", value.asInstanceOf[js.Any])
      
      inline def setMedia_idsVarargs(value: String*): Self = StObject.set(x, "media_ids", js.Array(value :_*))
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
