package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liveLikeCountResponseMod {
  
  trait LiveLikeCountResponseRootObject extends StObject {
    
    var burst_likes: Double
    
    var like_ts: Double
    
    var likers: js.Array[js.Any]
    
    var likes: Double
    
    var status: String
  }
  object LiveLikeCountResponseRootObject {
    
    inline def apply(burst_likes: Double, like_ts: Double, likers: js.Array[js.Any], likes: Double, status: String): LiveLikeCountResponseRootObject = {
      val __obj = js.Dynamic.literal(burst_likes = burst_likes.asInstanceOf[js.Any], like_ts = like_ts.asInstanceOf[js.Any], likers = likers.asInstanceOf[js.Any], likes = likes.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveLikeCountResponseRootObject]
    }
    
    extension [Self <: LiveLikeCountResponseRootObject](x: Self) {
      
      inline def setBurst_likes(value: Double): Self = StObject.set(x, "burst_likes", value.asInstanceOf[js.Any])
      
      inline def setLike_ts(value: Double): Self = StObject.set(x, "like_ts", value.asInstanceOf[js.Any])
      
      inline def setLikers(value: js.Array[js.Any]): Self = StObject.set(x, "likers", value.asInstanceOf[js.Any])
      
      inline def setLikersVarargs(value: js.Any*): Self = StObject.set(x, "likers", js.Array(value :_*))
      
      inline def setLikes(value: Double): Self = StObject.set(x, "likes", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
