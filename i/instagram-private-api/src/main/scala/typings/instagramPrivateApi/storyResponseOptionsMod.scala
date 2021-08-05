package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storyResponseOptionsMod {
  
  trait StoryMusicQuestionResponse
    extends StObject
       with StoryResponseOptions {
    
    var audio_asset_id: String
    
    var music_browse_session_id: js.UndefOr[String] = js.undefined
  }
  object StoryMusicQuestionResponse {
    
    inline def apply(audio_asset_id: String): StoryMusicQuestionResponse = {
      val __obj = js.Dynamic.literal(audio_asset_id = audio_asset_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryMusicQuestionResponse]
    }
    
    extension [Self <: StoryMusicQuestionResponse](x: Self) {
      
      inline def setAudio_asset_id(value: String): Self = StObject.set(x, "audio_asset_id", value.asInstanceOf[js.Any])
      
      inline def setMusic_browse_session_id(value: String): Self = StObject.set(x, "music_browse_session_id", value.asInstanceOf[js.Any])
      
      inline def setMusic_browse_session_idUndefined: Self = StObject.set(x, "music_browse_session_id", js.undefined)
    }
  }
  
  trait StoryResponseOptions extends StObject {
    
    var client_context: js.UndefOr[String] = js.undefined
    
    var mutation_token: js.UndefOr[String] = js.undefined
  }
  object StoryResponseOptions {
    
    inline def apply(): StoryResponseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StoryResponseOptions]
    }
    
    extension [Self <: StoryResponseOptions](x: Self) {
      
      inline def setClient_context(value: String): Self = StObject.set(x, "client_context", value.asInstanceOf[js.Any])
      
      inline def setClient_contextUndefined: Self = StObject.set(x, "client_context", js.undefined)
      
      inline def setMutation_token(value: String): Self = StObject.set(x, "mutation_token", value.asInstanceOf[js.Any])
      
      inline def setMutation_tokenUndefined: Self = StObject.set(x, "mutation_token", js.undefined)
    }
  }
  
  trait StoryTextQuestionResponse
    extends StObject
       with StoryResponseOptions {
    
    var response: String
  }
  object StoryTextQuestionResponse {
    
    inline def apply(response: String): StoryTextQuestionResponse = {
      val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryTextQuestionResponse]
    }
    
    extension [Self <: StoryTextQuestionResponse](x: Self) {
      
      inline def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
