package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A playlistItem resource identifies another resource, such as a video, that
  * is included in a playlist. In addition, the playlistItem  resource contains
  * details about the included resource that pertain specifically to how that
  * resource is used in that playlist.  YouTube uses playlists to identify
  * special collections of videos for a channel, such as:   - uploaded videos
  * - favorite videos  - positively rated (liked) videos  - watch history  -
  * watch later  To be more specific, these lists are associated with a
  * channel, which is a collection of a person, group, or company&#39;s videos,
  * playlists, and other YouTube information.  You can retrieve the playlist
  * IDs for each of these lists from the  channel resource  for a given
  * channel. You can then use the   playlistItems.list method to retrieve any
  * of those lists. You can also add or remove items from those lists by
  * calling the   playlistItems.insert and   playlistItems.delete methods. For
  * example, if a user gives a positive rating to a video, you would insert
  * that video into the liked videos playlist for that user&#39;s channel.
  */
trait SchemaPlaylistItem extends StObject {
  
  /**
    * The contentDetails object is included in the resource if the included
    * item is a YouTube video. The object contains additional information about
    * the video.
    */
  var contentDetails: js.UndefOr[SchemaPlaylistItemContentDetails] = js.undefined
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The ID that YouTube uses to uniquely identify the playlist item.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#playlistItem&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The snippet object contains basic details about the playlist item, such
    * as its title and position in the playlist.
    */
  var snippet: js.UndefOr[SchemaPlaylistItemSnippet] = js.undefined
  
  /**
    * The status object contains information about the playlist item&#39;s
    * privacy status.
    */
  var status: js.UndefOr[SchemaPlaylistItemStatus] = js.undefined
}
object SchemaPlaylistItem {
  
  inline def apply(): SchemaPlaylistItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaylistItem]
  }
  
  extension [Self <: SchemaPlaylistItem](x: Self) {
    
    inline def setContentDetails(value: SchemaPlaylistItemContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
    
    inline def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSnippet(value: SchemaPlaylistItemSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    inline def setStatus(value: SchemaPlaylistItemStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
