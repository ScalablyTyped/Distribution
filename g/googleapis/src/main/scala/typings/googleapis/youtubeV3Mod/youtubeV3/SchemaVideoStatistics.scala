package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Statistics about the video, such as the number of times the video was
  * viewed or liked.
  */
trait SchemaVideoStatistics extends StObject {
  
  /**
    * The number of comments for the video.
    */
  var commentCount: js.UndefOr[String] = js.undefined
  
  /**
    * The number of users who have indicated that they disliked the video by
    * giving it a negative rating.
    */
  var dislikeCount: js.UndefOr[String] = js.undefined
  
  /**
    * The number of users who currently have the video marked as a favorite
    * video.
    */
  var favoriteCount: js.UndefOr[String] = js.undefined
  
  /**
    * The number of users who have indicated that they liked the video by
    * giving it a positive rating.
    */
  var likeCount: js.UndefOr[String] = js.undefined
  
  /**
    * The number of times the video has been viewed.
    */
  var viewCount: js.UndefOr[String] = js.undefined
}
object SchemaVideoStatistics {
  
  @scala.inline
  def apply(): SchemaVideoStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoStatistics]
  }
  
  @scala.inline
  implicit class SchemaVideoStatisticsMutableBuilder[Self <: SchemaVideoStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommentCount(value: String): Self = StObject.set(x, "commentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentCountUndefined: Self = StObject.set(x, "commentCount", js.undefined)
    
    @scala.inline
    def setDislikeCount(value: String): Self = StObject.set(x, "dislikeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDislikeCountUndefined: Self = StObject.set(x, "dislikeCount", js.undefined)
    
    @scala.inline
    def setFavoriteCount(value: String): Self = StObject.set(x, "favoriteCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFavoriteCountUndefined: Self = StObject.set(x, "favoriteCount", js.undefined)
    
    @scala.inline
    def setLikeCount(value: String): Self = StObject.set(x, "likeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLikeCountUndefined: Self = StObject.set(x, "likeCount", js.undefined)
    
    @scala.inline
    def setViewCount(value: String): Self = StObject.set(x, "viewCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewCountUndefined: Self = StObject.set(x, "viewCount", js.undefined)
  }
}
