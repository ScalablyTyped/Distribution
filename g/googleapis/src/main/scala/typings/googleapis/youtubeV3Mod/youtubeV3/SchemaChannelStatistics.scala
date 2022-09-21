package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChannelStatistics extends StObject {
  
  /**
    * The number of comments for the channel.
    */
  var commentCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether or not the number of subscribers is shown for this user.
    */
  var hiddenSubscriberCount: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The number of subscribers that the channel has.
    */
  var subscriberCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of videos uploaded to the channel.
    */
  var videoCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of times the channel has been viewed.
    */
  var viewCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaChannelStatistics {
  
  inline def apply(): SchemaChannelStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelStatistics]
  }
  
  extension [Self <: SchemaChannelStatistics](x: Self) {
    
    inline def setCommentCount(value: String): Self = StObject.set(x, "commentCount", value.asInstanceOf[js.Any])
    
    inline def setCommentCountNull: Self = StObject.set(x, "commentCount", null)
    
    inline def setCommentCountUndefined: Self = StObject.set(x, "commentCount", js.undefined)
    
    inline def setHiddenSubscriberCount(value: Boolean): Self = StObject.set(x, "hiddenSubscriberCount", value.asInstanceOf[js.Any])
    
    inline def setHiddenSubscriberCountNull: Self = StObject.set(x, "hiddenSubscriberCount", null)
    
    inline def setHiddenSubscriberCountUndefined: Self = StObject.set(x, "hiddenSubscriberCount", js.undefined)
    
    inline def setSubscriberCount(value: String): Self = StObject.set(x, "subscriberCount", value.asInstanceOf[js.Any])
    
    inline def setSubscriberCountNull: Self = StObject.set(x, "subscriberCount", null)
    
    inline def setSubscriberCountUndefined: Self = StObject.set(x, "subscriberCount", js.undefined)
    
    inline def setVideoCount(value: String): Self = StObject.set(x, "videoCount", value.asInstanceOf[js.Any])
    
    inline def setVideoCountNull: Self = StObject.set(x, "videoCount", null)
    
    inline def setVideoCountUndefined: Self = StObject.set(x, "videoCount", js.undefined)
    
    inline def setViewCount(value: String): Self = StObject.set(x, "viewCount", value.asInstanceOf[js.Any])
    
    inline def setViewCountNull: Self = StObject.set(x, "viewCount", null)
    
    inline def setViewCountUndefined: Self = StObject.set(x, "viewCount", js.undefined)
  }
}
