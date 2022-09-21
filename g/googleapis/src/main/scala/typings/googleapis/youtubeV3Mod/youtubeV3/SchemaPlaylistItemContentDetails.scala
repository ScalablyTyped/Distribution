package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlaylistItemContentDetails extends StObject {
  
  /**
    * The time, measured in seconds from the start of the video, when the video should stop playing. (The playlist owner can specify the times when the video should start and stop playing when the video is played in the context of the playlist.) By default, assume that the video.endTime is the end of the video.
    */
  var endAt: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A user-generated note for this item.
    */
  var note: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time, measured in seconds from the start of the video, when the video should start playing. (The playlist owner can specify the times when the video should start and stop playing when the video is played in the context of the playlist.) The default value is 0.
    */
  var startAt: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID that YouTube uses to uniquely identify a video. To retrieve the video resource, set the id query parameter to this value in your API request.
    */
  var videoId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The date and time that the video was published to YouTube.
    */
  var videoPublishedAt: js.UndefOr[String | Null] = js.undefined
}
object SchemaPlaylistItemContentDetails {
  
  inline def apply(): SchemaPlaylistItemContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaylistItemContentDetails]
  }
  
  extension [Self <: SchemaPlaylistItemContentDetails](x: Self) {
    
    inline def setEndAt(value: String): Self = StObject.set(x, "endAt", value.asInstanceOf[js.Any])
    
    inline def setEndAtNull: Self = StObject.set(x, "endAt", null)
    
    inline def setEndAtUndefined: Self = StObject.set(x, "endAt", js.undefined)
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteNull: Self = StObject.set(x, "note", null)
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setStartAt(value: String): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
    
    inline def setStartAtNull: Self = StObject.set(x, "startAt", null)
    
    inline def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
    
    inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    inline def setVideoIdNull: Self = StObject.set(x, "videoId", null)
    
    inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
    
    inline def setVideoPublishedAt(value: String): Self = StObject.set(x, "videoPublishedAt", value.asInstanceOf[js.Any])
    
    inline def setVideoPublishedAtNull: Self = StObject.set(x, "videoPublishedAt", null)
    
    inline def setVideoPublishedAtUndefined: Self = StObject.set(x, "videoPublishedAt", js.undefined)
  }
}
