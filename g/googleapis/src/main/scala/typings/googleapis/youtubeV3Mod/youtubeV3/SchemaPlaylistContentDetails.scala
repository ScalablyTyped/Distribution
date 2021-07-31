package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlaylistContentDetails extends StObject {
  
  /**
    * The number of videos in the playlist.
    */
  var itemCount: js.UndefOr[Double] = js.undefined
}
object SchemaPlaylistContentDetails {
  
  @scala.inline
  def apply(): SchemaPlaylistContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaylistContentDetails]
  }
  
  @scala.inline
  implicit class SchemaPlaylistContentDetailsMutableBuilder[Self <: SchemaPlaylistContentDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemCount(value: Double): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
  }
}
