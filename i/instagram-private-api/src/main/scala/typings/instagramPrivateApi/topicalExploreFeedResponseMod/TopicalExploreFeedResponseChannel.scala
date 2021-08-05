package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicalExploreFeedResponseChannel extends StObject {
  
  var channel_id: String
  
  var channel_type: String
  
  var context: String
  
  var header: String
  
  var media: TopicalExploreFeedResponseMedia
  
  var media_count: Double
  
  var title: String
}
object TopicalExploreFeedResponseChannel {
  
  inline def apply(
    channel_id: String,
    channel_type: String,
    context: String,
    header: String,
    media: TopicalExploreFeedResponseMedia,
    media_count: Double,
    title: String
  ): TopicalExploreFeedResponseChannel = {
    val __obj = js.Dynamic.literal(channel_id = channel_id.asInstanceOf[js.Any], channel_type = channel_type.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseChannel]
  }
  
  extension [Self <: TopicalExploreFeedResponseChannel](x: Self) {
    
    inline def setChannel_id(value: String): Self = StObject.set(x, "channel_id", value.asInstanceOf[js.Any])
    
    inline def setChannel_type(value: String): Self = StObject.set(x, "channel_type", value.asInstanceOf[js.Any])
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setMedia(value: TopicalExploreFeedResponseMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMedia_count(value: Double): Self = StObject.set(x, "media_count", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
