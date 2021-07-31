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
  
  @scala.inline
  def apply(): ShortcutTags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShortcutTags]
  }
  
  @scala.inline
  implicit class ShortcutTagsMutableBuilder[Self <: ShortcutTags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlbum(value: String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbumUndefined: Self = StObject.set(x, "album", js.undefined)
    
    @scala.inline
    def setArtist(value: String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtistUndefined: Self = StObject.set(x, "artist", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setGenre(value: String): Self = StObject.set(x, "genre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenreUndefined: Self = StObject.set(x, "genre", js.undefined)
    
    @scala.inline
    def setLyrics(value: String): Self = StObject.set(x, "lyrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLyricsUndefined: Self = StObject.set(x, "lyrics", js.undefined)
    
    @scala.inline
    def setPicture(value: PictureType): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureUndefined: Self = StObject.set(x, "picture", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTrack(value: String): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    
    @scala.inline
    def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
