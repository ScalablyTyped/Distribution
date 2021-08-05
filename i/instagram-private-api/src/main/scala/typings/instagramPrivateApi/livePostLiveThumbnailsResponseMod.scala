package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object livePostLiveThumbnailsResponseMod {
  
  trait LivePostLiveThumbnailsResponseRootObject extends StObject {
    
    var status: String
    
    var thumbnails: js.Array[String]
  }
  object LivePostLiveThumbnailsResponseRootObject {
    
    inline def apply(status: String, thumbnails: js.Array[String]): LivePostLiveThumbnailsResponseRootObject = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], thumbnails = thumbnails.asInstanceOf[js.Any])
      __obj.asInstanceOf[LivePostLiveThumbnailsResponseRootObject]
    }
    
    extension [Self <: LivePostLiveThumbnailsResponseRootObject](x: Self) {
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setThumbnails(value: js.Array[String]): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
      
      inline def setThumbnailsVarargs(value: String*): Self = StObject.set(x, "thumbnails", js.Array(value :_*))
    }
  }
}
