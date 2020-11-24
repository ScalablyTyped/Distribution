package typings.instagramPrivateApi.musicRepositoryLyricsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MusicRepositoryLyricsResponseLyrics extends js.Object {
  
  var phrases: js.Array[MusicRepositoryLyricsResponsePhrasesItem] = js.native
}
object MusicRepositoryLyricsResponseLyrics {
  
  @scala.inline
  def apply(phrases: js.Array[MusicRepositoryLyricsResponsePhrasesItem]): MusicRepositoryLyricsResponseLyrics = {
    val __obj = js.Dynamic.literal(phrases = phrases.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicRepositoryLyricsResponseLyrics]
  }
  
  @scala.inline
  implicit class MusicRepositoryLyricsResponseLyricsOps[Self <: MusicRepositoryLyricsResponseLyrics] (val x: Self) extends AnyVal {
    
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
    def setPhrasesVarargs(value: MusicRepositoryLyricsResponsePhrasesItem*): Self = this.set("phrases", js.Array(value :_*))
    
    @scala.inline
    def setPhrases(value: js.Array[MusicRepositoryLyricsResponsePhrasesItem]): Self = this.set("phrases", value.asInstanceOf[js.Any])
  }
}
