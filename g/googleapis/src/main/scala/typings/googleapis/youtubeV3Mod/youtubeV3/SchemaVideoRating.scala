package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaVideoRating extends StObject {
  
  var rating: js.UndefOr[String] = js.native
  
  var videoId: js.UndefOr[String] = js.native
}
object SchemaVideoRating {
  
  @scala.inline
  def apply(): SchemaVideoRating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoRating]
  }
  
  @scala.inline
  implicit class SchemaVideoRatingMutableBuilder[Self <: SchemaVideoRating] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
    
    @scala.inline
    def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
  }
}
