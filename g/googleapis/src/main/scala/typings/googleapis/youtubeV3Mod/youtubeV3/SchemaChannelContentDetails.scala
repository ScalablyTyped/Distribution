package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.googleapis.anon.Favorites
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details about the content of a channel.
  */
trait SchemaChannelContentDetails extends StObject {
  
  var relatedPlaylists: js.UndefOr[Favorites] = js.undefined
}
object SchemaChannelContentDetails {
  
  @scala.inline
  def apply(): SchemaChannelContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelContentDetails]
  }
  
  @scala.inline
  implicit class SchemaChannelContentDetailsMutableBuilder[Self <: SchemaChannelContentDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelatedPlaylists(value: Favorites): Self = StObject.set(x, "relatedPlaylists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedPlaylistsUndefined: Self = StObject.set(x, "relatedPlaylists", js.undefined)
  }
}
