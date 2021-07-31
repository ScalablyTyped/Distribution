package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storyQuizParticipantsFeedResponseMod {
  
  trait StoryQuizParticipantsFeedResponseParticipantInfo extends StObject {
    
    var max_id: Null
    
    var more_available: Boolean
    
    var participants: js.Array[StoryQuizParticipantsFeedResponseParticipantsItem]
    
    var quiz_id: String
  }
  object StoryQuizParticipantsFeedResponseParticipantInfo {
    
    @scala.inline
    def apply(
      max_id: Null,
      more_available: Boolean,
      participants: js.Array[StoryQuizParticipantsFeedResponseParticipantsItem],
      quiz_id: String
    ): StoryQuizParticipantsFeedResponseParticipantInfo = {
      val __obj = js.Dynamic.literal(max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], participants = participants.asInstanceOf[js.Any], quiz_id = quiz_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryQuizParticipantsFeedResponseParticipantInfo]
    }
    
    @scala.inline
    implicit class StoryQuizParticipantsFeedResponseParticipantInfoMutableBuilder[Self <: StoryQuizParticipantsFeedResponseParticipantInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax_id(value: Null): Self = StObject.set(x, "max_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMore_available(value: Boolean): Self = StObject.set(x, "more_available", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParticipants(value: js.Array[StoryQuizParticipantsFeedResponseParticipantsItem]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParticipantsVarargs(value: StoryQuizParticipantsFeedResponseParticipantsItem*): Self = StObject.set(x, "participants", js.Array(value :_*))
      
      @scala.inline
      def setQuiz_id(value: String): Self = StObject.set(x, "quiz_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoryQuizParticipantsFeedResponseParticipantsItem extends StObject {
    
    var answer: Double
    
    var ts: Double
    
    var user: StoryQuizParticipantsFeedResponseUser
  }
  object StoryQuizParticipantsFeedResponseParticipantsItem {
    
    @scala.inline
    def apply(answer: Double, ts: Double, user: StoryQuizParticipantsFeedResponseUser): StoryQuizParticipantsFeedResponseParticipantsItem = {
      val __obj = js.Dynamic.literal(answer = answer.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryQuizParticipantsFeedResponseParticipantsItem]
    }
    
    @scala.inline
    implicit class StoryQuizParticipantsFeedResponseParticipantsItemMutableBuilder[Self <: StoryQuizParticipantsFeedResponseParticipantsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnswer(value: Double): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: StoryQuizParticipantsFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoryQuizParticipantsFeedResponseRootObject extends StObject {
    
    var participant_info: StoryQuizParticipantsFeedResponseParticipantInfo
    
    var status: String
  }
  object StoryQuizParticipantsFeedResponseRootObject {
    
    @scala.inline
    def apply(participant_info: StoryQuizParticipantsFeedResponseParticipantInfo, status: String): StoryQuizParticipantsFeedResponseRootObject = {
      val __obj = js.Dynamic.literal(participant_info = participant_info.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryQuizParticipantsFeedResponseRootObject]
    }
    
    @scala.inline
    implicit class StoryQuizParticipantsFeedResponseRootObjectMutableBuilder[Self <: StoryQuizParticipantsFeedResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParticipant_info(value: StoryQuizParticipantsFeedResponseParticipantInfo): Self = StObject.set(x, "participant_info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoryQuizParticipantsFeedResponseUser extends StObject {
    
    var full_name: String
    
    var is_private: Boolean
    
    var is_verified: Boolean
    
    var latest_reel_media: Double
    
    var pk: Double
    
    var profile_pic_id: String
    
    var profile_pic_url: String
    
    var username: String
  }
  object StoryQuizParticipantsFeedResponseUser {
    
    @scala.inline
    def apply(
      full_name: String,
      is_private: Boolean,
      is_verified: Boolean,
      latest_reel_media: Double,
      pk: Double,
      profile_pic_id: String,
      profile_pic_url: String,
      username: String
    ): StoryQuizParticipantsFeedResponseUser = {
      val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], latest_reel_media = latest_reel_media.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryQuizParticipantsFeedResponseUser]
    }
    
    @scala.inline
    implicit class StoryQuizParticipantsFeedResponseUserMutableBuilder[Self <: StoryQuizParticipantsFeedResponseUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatest_reel_media(value: Double): Self = StObject.set(x, "latest_reel_media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
