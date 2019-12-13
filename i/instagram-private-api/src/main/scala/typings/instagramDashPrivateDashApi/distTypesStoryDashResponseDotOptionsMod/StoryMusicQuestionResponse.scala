package typings.instagramDashPrivateDashApi.distTypesStoryDashResponseDotOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryMusicQuestionResponse extends StoryResponseOptions {
  var audio_asset_id: String
  var music_browse_session_id: js.UndefOr[String] = js.undefined
}

object StoryMusicQuestionResponse {
  @scala.inline
  def apply(
    audio_asset_id: String,
    client_context: String = null,
    music_browse_session_id: String = null,
    mutation_token: String = null
  ): StoryMusicQuestionResponse = {
    val __obj = js.Dynamic.literal(audio_asset_id = audio_asset_id.asInstanceOf[js.Any])
    if (client_context != null) __obj.updateDynamic("client_context")(client_context.asInstanceOf[js.Any])
    if (music_browse_session_id != null) __obj.updateDynamic("music_browse_session_id")(music_browse_session_id.asInstanceOf[js.Any])
    if (mutation_token != null) __obj.updateDynamic("mutation_token")(mutation_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryMusicQuestionResponse]
  }
}

