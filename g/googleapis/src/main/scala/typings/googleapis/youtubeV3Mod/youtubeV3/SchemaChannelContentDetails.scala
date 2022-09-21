package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.googleapis.anon.Favorites
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChannelContentDetails extends StObject {
  
  var relatedPlaylists: js.UndefOr[Favorites | Null] = js.undefined
}
object SchemaChannelContentDetails {
  
  inline def apply(): SchemaChannelContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelContentDetails]
  }
  
  extension [Self <: SchemaChannelContentDetails](x: Self) {
    
    inline def setRelatedPlaylists(value: Favorites): Self = StObject.set(x, "relatedPlaylists", value.asInstanceOf[js.Any])
    
    inline def setRelatedPlaylistsNull: Self = StObject.set(x, "relatedPlaylists", null)
    
    inline def setRelatedPlaylistsUndefined: Self = StObject.set(x, "relatedPlaylists", js.undefined)
  }
}
