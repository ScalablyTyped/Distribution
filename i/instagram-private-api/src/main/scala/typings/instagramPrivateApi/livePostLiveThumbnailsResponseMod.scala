package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object livePostLiveThumbnailsResponseMod {
  
  @js.native
  trait LivePostLiveThumbnailsResponseRootObject extends StObject {
    
    var status: String = js.native
    
    var thumbnails: js.Array[String] = js.native
  }
  object LivePostLiveThumbnailsResponseRootObject {
    
    @scala.inline
    def apply(status: String, thumbnails: js.Array[String]): LivePostLiveThumbnailsResponseRootObject = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], thumbnails = thumbnails.asInstanceOf[js.Any])
      __obj.asInstanceOf[LivePostLiveThumbnailsResponseRootObject]
    }
    
    @scala.inline
    implicit class LivePostLiveThumbnailsResponseRootObjectMutableBuilder[Self <: LivePostLiveThumbnailsResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnails(value: js.Array[String]): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailsVarargs(value: String*): Self = StObject.set(x, "thumbnails", js.Array(value :_*))
    }
  }
}
