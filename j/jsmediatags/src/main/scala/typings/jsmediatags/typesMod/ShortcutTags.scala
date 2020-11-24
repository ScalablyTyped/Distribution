package typings.jsmediatags.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShortcutTags extends js.Object {
  
  var album: js.UndefOr[String] = js.native
  
  var artist: js.UndefOr[String] = js.native
  
  var comment: js.UndefOr[String] = js.native
  
  var genre: js.UndefOr[String] = js.native
  
  var lyrics: js.UndefOr[String] = js.native
  
  var picture: js.UndefOr[PictureType] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var track: js.UndefOr[String] = js.native
  
  var year: js.UndefOr[String] = js.native
}
object ShortcutTags {
  
  @scala.inline
  def apply(): ShortcutTags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShortcutTags]
  }
  
  @scala.inline
  implicit class ShortcutTagsOps[Self <: ShortcutTags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlbum(value: String): Self = this.set("album", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlbum: Self = this.set("album", js.undefined)
    
    @scala.inline
    def setArtist(value: String): Self = this.set("artist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArtist: Self = this.set("artist", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setGenre(value: String): Self = this.set("genre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenre: Self = this.set("genre", js.undefined)
    
    @scala.inline
    def setLyrics(value: String): Self = this.set("lyrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLyrics: Self = this.set("lyrics", js.undefined)
    
    @scala.inline
    def setPicture(value: PictureType): Self = this.set("picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePicture: Self = this.set("picture", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTrack(value: String): Self = this.set("track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrack: Self = this.set("track", js.undefined)
    
    @scala.inline
    def setYear(value: String): Self = this.set("year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
  }
}
