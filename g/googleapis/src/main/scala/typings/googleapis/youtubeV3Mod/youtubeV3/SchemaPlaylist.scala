package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A playlist resource represents a YouTube playlist. A playlist is a
  * collection of videos that can be viewed sequentially and shared with other
  * users. A playlist can contain up to 200 videos, and YouTube does not limit
  * the number of playlists that each user creates. By default, playlists are
  * publicly visible to other users, but playlists can be public or private.
  * YouTube also uses playlists to identify special collections of videos for a
  * channel, such as:   - uploaded videos  - favorite videos  - positively
  * rated (liked) videos  - watch history  - watch later  To be more specific,
  * these lists are associated with a channel, which is a collection of a
  * person, group, or company&#39;s videos, playlists, and other YouTube
  * information. You can retrieve the playlist IDs for each of these lists from
  * the  channel resource for a given channel.  You can then use the
  * playlistItems.list method to retrieve any of those lists. You can also add
  * or remove items from those lists by calling the   playlistItems.insert and
  * playlistItems.delete methods.
  */
trait SchemaPlaylist extends StObject {
  
  /**
    * The contentDetails object contains information like video count.
    */
  var contentDetails: js.UndefOr[SchemaPlaylistContentDetails] = js.undefined
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The ID that YouTube uses to uniquely identify the playlist.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#playlist&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Localizations for different languages
    */
  var localizations: js.UndefOr[StringDictionary[SchemaPlaylistLocalization]] = js.undefined
  
  /**
    * The player object contains information that you would use to play the
    * playlist in an embedded player.
    */
  var player: js.UndefOr[SchemaPlaylistPlayer] = js.undefined
  
  /**
    * The snippet object contains basic details about the playlist, such as its
    * title and description.
    */
  var snippet: js.UndefOr[SchemaPlaylistSnippet] = js.undefined
  
  /**
    * The status object contains status information for the playlist.
    */
  var status: js.UndefOr[SchemaPlaylistStatus] = js.undefined
}
object SchemaPlaylist {
  
  inline def apply(): SchemaPlaylist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaylist]
  }
  
  extension [Self <: SchemaPlaylist](x: Self) {
    
    inline def setContentDetails(value: SchemaPlaylistContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
    
    inline def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLocalizations(value: StringDictionary[SchemaPlaylistLocalization]): Self = StObject.set(x, "localizations", value.asInstanceOf[js.Any])
    
    inline def setLocalizationsUndefined: Self = StObject.set(x, "localizations", js.undefined)
    
    inline def setPlayer(value: SchemaPlaylistPlayer): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
    
    inline def setPlayerUndefined: Self = StObject.set(x, "player", js.undefined)
    
    inline def setSnippet(value: SchemaPlaylistSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    inline def setStatus(value: SchemaPlaylistStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
