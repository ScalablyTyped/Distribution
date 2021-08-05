package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiveStreamSnippet extends StObject {
  
  /**
    * The ID that YouTube uses to uniquely identify the channel that is
    * transmitting the stream.
    */
  var channelId: js.UndefOr[String] = js.undefined
  
  /**
    * The stream&#39;s description. The value cannot be longer than 10000
    * characters.
    */
  var description: js.UndefOr[String] = js.undefined
  
  var isDefaultStream: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The date and time that the stream was created. The value is specified in
    * ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: js.UndefOr[String] = js.undefined
  
  /**
    * The stream&#39;s title. The value must be between 1 and 128 characters
    * long.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaLiveStreamSnippet {
  
  inline def apply(): SchemaLiveStreamSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveStreamSnippet]
  }
  
  extension [Self <: SchemaLiveStreamSnippet](x: Self) {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIsDefaultStream(value: Boolean): Self = StObject.set(x, "isDefaultStream", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultStreamUndefined: Self = StObject.set(x, "isDefaultStream", js.undefined)
    
    inline def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    inline def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
