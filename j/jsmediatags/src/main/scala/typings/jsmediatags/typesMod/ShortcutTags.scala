package typings.jsmediatags.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShortcutTags extends StObject {
  
  var album: js.UndefOr[String] = js.undefined
  
  var artist: js.UndefOr[String] = js.undefined
  
  var comment: js.UndefOr[String] = js.undefined
  
  var genre: js.UndefOr[String] = js.undefined
  
  var lyrics: js.UndefOr[String] = js.undefined
  
  var picture: js.UndefOr[PictureType] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var track: js.UndefOr[String] = js.undefined
  
  var year: js.UndefOr[String] = js.undefined
}
object ShortcutTags {
  
  inline def apply(): ShortcutTags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShortcutTags]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShortcutTags] (val x: Self) extends AnyVal {
    
    inline def setAlbum(value: String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    inline def setAlbumUndefined: Self = StObject.set(x, "album", js.undefined)
    
    inline def setArtist(value: String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
    
    inline def setArtistUndefined: Self = StObject.set(x, "artist", js.undefined)
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setGenre(value: String): Self = StObject.set(x, "genre", value.asInstanceOf[js.Any])
    
    inline def setGenreUndefined: Self = StObject.set(x, "genre", js.undefined)
    
    inline def setLyrics(value: String): Self = StObject.set(x, "lyrics", value.asInstanceOf[js.Any])
    
    inline def setLyricsUndefined: Self = StObject.set(x, "lyrics", js.undefined)
    
    inline def setPicture(value: PictureType): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
    
    inline def setPictureUndefined: Self = StObject.set(x, "picture", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTrack(value: String): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    
    inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
