package typings.instagramPrivateApi.musicRepositoryLyricsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MusicRepositoryLyricsResponseRootObject extends js.Object {
  var lyrics: MusicRepositoryLyricsResponseLyrics
  var status: String
}

object MusicRepositoryLyricsResponseRootObject {
  @scala.inline
  def apply(lyrics: MusicRepositoryLyricsResponseLyrics, status: String): MusicRepositoryLyricsResponseRootObject = {
    val __obj = js.Dynamic.literal(lyrics = lyrics.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MusicRepositoryLyricsResponseRootObject]
  }
}

