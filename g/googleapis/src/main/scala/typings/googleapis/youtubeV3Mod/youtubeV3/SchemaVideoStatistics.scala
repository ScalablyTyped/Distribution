package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoStatistics extends StObject {
  
  /**
    * The number of comments for the video.
    */
  var commentCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of users who have indicated that they disliked the video by giving it a negative rating.
    */
  var dislikeCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of users who currently have the video marked as a favorite video.
    */
  var favoriteCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of users who have indicated that they liked the video by giving it a positive rating.
    */
  var likeCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of times the video has been viewed.
    */
  var viewCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaVideoStatistics {
  
  inline def apply(): SchemaVideoStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoStatistics]
  }
  
  extension [Self <: SchemaVideoStatistics](x: Self) {
    
    inline def setCommentCount(value: String): Self = StObject.set(x, "commentCount", value.asInstanceOf[js.Any])
    
    inline def setCommentCountNull: Self = StObject.set(x, "commentCount", null)
    
    inline def setCommentCountUndefined: Self = StObject.set(x, "commentCount", js.undefined)
    
    inline def setDislikeCount(value: String): Self = StObject.set(x, "dislikeCount", value.asInstanceOf[js.Any])
    
    inline def setDislikeCountNull: Self = StObject.set(x, "dislikeCount", null)
    
    inline def setDislikeCountUndefined: Self = StObject.set(x, "dislikeCount", js.undefined)
    
    inline def setFavoriteCount(value: String): Self = StObject.set(x, "favoriteCount", value.asInstanceOf[js.Any])
    
    inline def setFavoriteCountNull: Self = StObject.set(x, "favoriteCount", null)
    
    inline def setFavoriteCountUndefined: Self = StObject.set(x, "favoriteCount", js.undefined)
    
    inline def setLikeCount(value: String): Self = StObject.set(x, "likeCount", value.asInstanceOf[js.Any])
    
    inline def setLikeCountNull: Self = StObject.set(x, "likeCount", null)
    
    inline def setLikeCountUndefined: Self = StObject.set(x, "likeCount", js.undefined)
    
    inline def setViewCount(value: String): Self = StObject.set(x, "viewCount", value.asInstanceOf[js.Any])
    
    inline def setViewCountNull: Self = StObject.set(x, "viewCount", null)
    
    inline def setViewCountUndefined: Self = StObject.set(x, "viewCount", js.undefined)
  }
}
