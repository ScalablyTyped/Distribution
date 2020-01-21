package typings.instagramPrivateApi.musicRepositoryLyricsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MusicRepositoryLyricsResponsePhrasesItem extends js.Object {
  var phrase: String
  var start_time_in_ms: Double
}

object MusicRepositoryLyricsResponsePhrasesItem {
  @scala.inline
  def apply(phrase: String, start_time_in_ms: Double): MusicRepositoryLyricsResponsePhrasesItem = {
    val __obj = js.Dynamic.literal(phrase = phrase.asInstanceOf[js.Any], start_time_in_ms = start_time_in_ms.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MusicRepositoryLyricsResponsePhrasesItem]
  }
}

