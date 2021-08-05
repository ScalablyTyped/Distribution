package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liveLikeResponseMod {
  
  trait LiveLikeResponseRootObject extends StObject {
    
    var burst_likes: Double
    
    var likes: Double
    
    var status: String
  }
  object LiveLikeResponseRootObject {
    
    inline def apply(burst_likes: Double, likes: Double, status: String): LiveLikeResponseRootObject = {
      val __obj = js.Dynamic.literal(burst_likes = burst_likes.asInstanceOf[js.Any], likes = likes.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveLikeResponseRootObject]
    }
    
    extension [Self <: LiveLikeResponseRootObject](x: Self) {
      
      inline def setBurst_likes(value: Double): Self = StObject.set(x, "burst_likes", value.asInstanceOf[js.Any])
      
      inline def setLikes(value: Double): Self = StObject.set(x, "likes", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
