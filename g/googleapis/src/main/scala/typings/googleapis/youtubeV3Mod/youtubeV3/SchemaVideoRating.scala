package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoRating extends StObject {
  
  var rating: js.UndefOr[String] = js.undefined
  
  var videoId: js.UndefOr[String] = js.undefined
}
object SchemaVideoRating {
  
  inline def apply(): SchemaVideoRating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoRating]
  }
  
  extension [Self <: SchemaVideoRating](x: Self) {
    
    inline def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
    
    inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
  }
}
