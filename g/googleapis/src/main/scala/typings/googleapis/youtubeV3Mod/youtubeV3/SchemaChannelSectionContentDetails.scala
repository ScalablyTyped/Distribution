package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details about a channelsection, including playlists and channels.
  */
trait SchemaChannelSectionContentDetails extends StObject {
  
  /**
    * The channel ids for type multiple_channels.
    */
  var channels: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The playlist ids for type single_playlist and multiple_playlists. For
    * singlePlaylist, only one playlistId is allowed.
    */
  var playlists: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaChannelSectionContentDetails {
  
  inline def apply(): SchemaChannelSectionContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelSectionContentDetails]
  }
  
  extension [Self <: SchemaChannelSectionContentDetails](x: Self) {
    
    inline def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value :_*))
    
    inline def setPlaylists(value: js.Array[String]): Self = StObject.set(x, "playlists", value.asInstanceOf[js.Any])
    
    inline def setPlaylistsUndefined: Self = StObject.set(x, "playlists", js.undefined)
    
    inline def setPlaylistsVarargs(value: String*): Self = StObject.set(x, "playlists", js.Array(value :_*))
  }
}
