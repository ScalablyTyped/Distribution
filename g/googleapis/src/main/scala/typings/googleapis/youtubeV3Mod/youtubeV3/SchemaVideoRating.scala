package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoRating extends StObject {
  
  /**
    * Rating of a video.
    */
  var rating: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID that YouTube uses to uniquely identify the video.
    */
  var videoId: js.UndefOr[String | Null] = js.undefined
}
object SchemaVideoRating {
  
  inline def apply(): SchemaVideoRating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoRating]
  }
  
  extension [Self <: SchemaVideoRating](x: Self) {
    
    inline def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setRatingNull: Self = StObject.set(x, "rating", null)
    
    inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
    
    inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    inline def setVideoIdNull: Self = StObject.set(x, "videoId", null)
    
    inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
  }
}
