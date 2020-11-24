package typings.instagramPrivateApi.musicRepositoryLyricsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MusicRepositoryLyricsResponsePhrasesItem extends js.Object {
  
  var phrase: String = js.native
  
  var start_time_in_ms: Double = js.native
}
object MusicRepositoryLyricsResponsePhrasesItem {
  
  @scala.inline
  def apply(phrase: String, start_time_in_ms: Double): MusicRepositoryLyricsResponsePhrasesItem = {
    val __obj = js.Dynamic.literal(phrase = phrase.asInstanceOf[js.Any], start_time_in_ms = start_time_in_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicRepositoryLyricsResponsePhrasesItem]
  }
  
  @scala.inline
  implicit class MusicRepositoryLyricsResponsePhrasesItemOps[Self <: MusicRepositoryLyricsResponsePhrasesItem] (val x: Self) extends AnyVal {
    
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
    def setPhrase(value: String): Self = this.set("phrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_time_in_ms(value: Double): Self = this.set("start_time_in_ms", value.asInstanceOf[js.Any])
  }
}
