package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlaylistPlayer extends StObject {
  
  /**
    * An <iframe\> tag that embeds a player that will play the playlist.
    */
  var embedHtml: js.UndefOr[String | Null] = js.undefined
}
object SchemaPlaylistPlayer {
  
  inline def apply(): SchemaPlaylistPlayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaylistPlayer]
  }
  
  extension [Self <: SchemaPlaylistPlayer](x: Self) {
    
    inline def setEmbedHtml(value: String): Self = StObject.set(x, "embedHtml", value.asInstanceOf[js.Any])
    
    inline def setEmbedHtmlNull: Self = StObject.set(x, "embedHtml", null)
    
    inline def setEmbedHtmlUndefined: Self = StObject.set(x, "embedHtml", js.undefined)
  }
}
