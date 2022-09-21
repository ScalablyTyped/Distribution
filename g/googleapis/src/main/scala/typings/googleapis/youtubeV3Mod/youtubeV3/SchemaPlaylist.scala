package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlaylist extends StObject {
  
  /**
    * The contentDetails object contains information like video count.
    */
  var contentDetails: js.UndefOr[SchemaPlaylistContentDetails] = js.undefined
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID that YouTube uses to uniquely identify the playlist.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "youtube#playlist".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Localizations for different languages
    */
  var localizations: js.UndefOr[StringDictionary[SchemaPlaylistLocalization] | Null] = js.undefined
  
  /**
    * The player object contains information that you would use to play the playlist in an embedded player.
    */
  var player: js.UndefOr[SchemaPlaylistPlayer] = js.undefined
  
  /**
    * The snippet object contains basic details about the playlist, such as its title and description.
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
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLocalizations(value: StringDictionary[SchemaPlaylistLocalization]): Self = StObject.set(x, "localizations", value.asInstanceOf[js.Any])
    
    inline def setLocalizationsNull: Self = StObject.set(x, "localizations", null)
    
    inline def setLocalizationsUndefined: Self = StObject.set(x, "localizations", js.undefined)
    
    inline def setPlayer(value: SchemaPlaylistPlayer): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
    
    inline def setPlayerUndefined: Self = StObject.set(x, "player", js.undefined)
    
    inline def setSnippet(value: SchemaPlaylistSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    inline def setStatus(value: SchemaPlaylistStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
