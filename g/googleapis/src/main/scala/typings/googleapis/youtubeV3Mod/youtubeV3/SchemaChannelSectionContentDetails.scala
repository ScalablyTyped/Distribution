package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details about a channelsection, including playlists and channels.
  */
@js.native
trait SchemaChannelSectionContentDetails extends StObject {
  
  /**
    * The channel ids for type multiple_channels.
    */
  var channels: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The playlist ids for type single_playlist and multiple_playlists. For
    * singlePlaylist, only one playlistId is allowed.
    */
  var playlists: js.UndefOr[js.Array[String]] = js.native
}
object SchemaChannelSectionContentDetails {
  
  @scala.inline
  def apply(): SchemaChannelSectionContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelSectionContentDetails]
  }
  
  @scala.inline
  implicit class SchemaChannelSectionContentDetailsMutableBuilder[Self <: SchemaChannelSectionContentDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    @scala.inline
    def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value :_*))
    
    @scala.inline
    def setPlaylists(value: js.Array[String]): Self = StObject.set(x, "playlists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaylistsUndefined: Self = StObject.set(x, "playlists", js.undefined)
    
    @scala.inline
    def setPlaylistsVarargs(value: String*): Self = StObject.set(x, "playlists", js.Array(value :_*))
  }
}
