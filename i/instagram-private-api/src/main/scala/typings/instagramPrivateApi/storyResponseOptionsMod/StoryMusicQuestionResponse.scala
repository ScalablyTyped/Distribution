package typings.instagramPrivateApi.storyResponseOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryMusicQuestionResponse extends StoryResponseOptions {
  
  var audio_asset_id: String = js.native
  
  var music_browse_session_id: js.UndefOr[String] = js.native
}
object StoryMusicQuestionResponse {
  
  @scala.inline
  def apply(audio_asset_id: String): StoryMusicQuestionResponse = {
    val __obj = js.Dynamic.literal(audio_asset_id = audio_asset_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryMusicQuestionResponse]
  }
  
  @scala.inline
  implicit class StoryMusicQuestionResponseOps[Self <: StoryMusicQuestionResponse] (val x: Self) extends AnyVal {
    
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
    def setAudio_asset_id(value: String): Self = this.set("audio_asset_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMusic_browse_session_id(value: String): Self = this.set("music_browse_session_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMusic_browse_session_id: Self = this.set("music_browse_session_id", js.undefined)
  }
}
