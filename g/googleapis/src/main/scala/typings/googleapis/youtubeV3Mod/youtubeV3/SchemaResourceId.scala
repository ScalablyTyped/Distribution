package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A resource id is a generic reference that points to another YouTube
  * resource.
  */
trait SchemaResourceId extends StObject {
  
  /**
    * The ID that YouTube uses to uniquely identify the referred resource, if
    * that resource is a channel. This property is only present if the
    * resourceId.kind value is youtube#channel.
    */
  var channelId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the API resource.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The ID that YouTube uses to uniquely identify the referred resource, if
    * that resource is a playlist. This property is only present if the
    * resourceId.kind value is youtube#playlist.
    */
  var playlistId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID that YouTube uses to uniquely identify the referred resource, if
    * that resource is a video. This property is only present if the
    * resourceId.kind value is youtube#video.
    */
  var videoId: js.UndefOr[String] = js.undefined
}
object SchemaResourceId {
  
  inline def apply(): SchemaResourceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceId]
  }
  
  extension [Self <: SchemaResourceId](x: Self) {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPlaylistId(value: String): Self = StObject.set(x, "playlistId", value.asInstanceOf[js.Any])
    
    inline def setPlaylistIdUndefined: Self = StObject.set(x, "playlistId", js.undefined)
    
    inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
  }
}
