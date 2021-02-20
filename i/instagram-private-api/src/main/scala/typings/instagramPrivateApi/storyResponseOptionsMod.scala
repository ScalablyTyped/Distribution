package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storyResponseOptionsMod {
  
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
    implicit class StoryMusicQuestionResponseMutableBuilder[Self <: StoryMusicQuestionResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudio_asset_id(value: String): Self = StObject.set(x, "audio_asset_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMusic_browse_session_id(value: String): Self = StObject.set(x, "music_browse_session_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMusic_browse_session_idUndefined: Self = StObject.set(x, "music_browse_session_id", js.undefined)
    }
  }
  
  @js.native
  trait StoryResponseOptions extends StObject {
    
    var client_context: js.UndefOr[String] = js.native
    
    var mutation_token: js.UndefOr[String] = js.native
  }
  object StoryResponseOptions {
    
    @scala.inline
    def apply(): StoryResponseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StoryResponseOptions]
    }
    
    @scala.inline
    implicit class StoryResponseOptionsMutableBuilder[Self <: StoryResponseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient_context(value: String): Self = StObject.set(x, "client_context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_contextUndefined: Self = StObject.set(x, "client_context", js.undefined)
      
      @scala.inline
      def setMutation_token(value: String): Self = StObject.set(x, "mutation_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutation_tokenUndefined: Self = StObject.set(x, "mutation_token", js.undefined)
    }
  }
  
  @js.native
  trait StoryTextQuestionResponse extends StoryResponseOptions {
    
    var response: String = js.native
  }
  object StoryTextQuestionResponse {
    
    @scala.inline
    def apply(response: String): StoryTextQuestionResponse = {
      val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryTextQuestionResponse]
    }
    
    @scala.inline
    implicit class StoryTextQuestionResponseMutableBuilder[Self <: StoryTextQuestionResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
