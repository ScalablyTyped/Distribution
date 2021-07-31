package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a new playlist item.
  */
trait SchemaActivityContentDetailsPlaylistItem extends StObject {
  
  /**
    * The value that YouTube uses to uniquely identify the playlist.
    */
  var playlistId: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the item within the playlist.
    */
  var playlistItemId: js.UndefOr[String] = js.undefined
  
  /**
    * The resourceId object contains information about the resource that was
    * added to the playlist.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.undefined
}
object SchemaActivityContentDetailsPlaylistItem {
  
  @scala.inline
  def apply(): SchemaActivityContentDetailsPlaylistItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivityContentDetailsPlaylistItem]
  }
  
  @scala.inline
  implicit class SchemaActivityContentDetailsPlaylistItemMutableBuilder[Self <: SchemaActivityContentDetailsPlaylistItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaylistId(value: String): Self = StObject.set(x, "playlistId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaylistIdUndefined: Self = StObject.set(x, "playlistId", js.undefined)
    
    @scala.inline
    def setPlaylistItemId(value: String): Self = StObject.set(x, "playlistItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaylistItemIdUndefined: Self = StObject.set(x, "playlistItemId", js.undefined)
    
    @scala.inline
    def setResourceId(value: SchemaResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
  }
}
