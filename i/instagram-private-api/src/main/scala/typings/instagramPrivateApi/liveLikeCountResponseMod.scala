package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liveLikeCountResponseMod {
  
  @js.native
  trait LiveLikeCountResponseRootObject extends StObject {
    
    var burst_likes: Double = js.native
    
    var like_ts: Double = js.native
    
    var likers: js.Array[_] = js.native
    
    var likes: Double = js.native
    
    var status: String = js.native
  }
  object LiveLikeCountResponseRootObject {
    
    @scala.inline
    def apply(burst_likes: Double, like_ts: Double, likers: js.Array[_], likes: Double, status: String): LiveLikeCountResponseRootObject = {
      val __obj = js.Dynamic.literal(burst_likes = burst_likes.asInstanceOf[js.Any], like_ts = like_ts.asInstanceOf[js.Any], likers = likers.asInstanceOf[js.Any], likes = likes.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveLikeCountResponseRootObject]
    }
    
    @scala.inline
    implicit class LiveLikeCountResponseRootObjectMutableBuilder[Self <: LiveLikeCountResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBurst_likes(value: Double): Self = StObject.set(x, "burst_likes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLike_ts(value: Double): Self = StObject.set(x, "like_ts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLikers(value: js.Array[_]): Self = StObject.set(x, "likers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLikersVarargs(value: js.Any*): Self = StObject.set(x, "likers", js.Array(value :_*))
      
      @scala.inline
      def setLikes(value: Double): Self = StObject.set(x, "likes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
