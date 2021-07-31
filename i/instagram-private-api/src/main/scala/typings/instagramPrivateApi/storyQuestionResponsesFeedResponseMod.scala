package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storyQuestionResponsesFeedResponseMod {
  
  trait StoryQuestionResponsesFeedResponseResponderInfo extends StObject {
    
    var background_color: String
    
    var latest_question_response_time: Double
    
    var max_id: Null
    
    var more_available: Boolean
    
    var question: String
    
    var question_id: String
    
    var question_response_count: Double
    
    var question_type: String
    
    var responders: js.Array[StoryQuestionResponsesFeedResponseRespondersItem]
    
    var text_color: String
    
    var unanswered_response_count: Double
  }
  object StoryQuestionResponsesFeedResponseResponderInfo {
    
    @scala.inline
    def apply(
      background_color: String,
      latest_question_response_time: Double,
      max_id: Null,
      more_available: Boolean,
      question: String,
      question_id: String,
      question_response_count: Double,
      question_type: String,
      responders: js.Array[StoryQuestionResponsesFeedResponseRespondersItem],
      text_color: String,
      unanswered_response_count: Double
    ): StoryQuestionResponsesFeedResponseResponderInfo = {
      val __obj = js.Dynamic.literal(background_color = background_color.asInstanceOf[js.Any], latest_question_response_time = latest_question_response_time.asInstanceOf[js.Any], max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], question_id = question_id.asInstanceOf[js.Any], question_response_count = question_response_count.asInstanceOf[js.Any], question_type = question_type.asInstanceOf[js.Any], responders = responders.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], unanswered_response_count = unanswered_response_count.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryQuestionResponsesFeedResponseResponderInfo]
    }
    
    @scala.inline
    implicit class StoryQuestionResponsesFeedResponseResponderInfoMutableBuilder[Self <: StoryQuestionResponsesFeedResponseResponderInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground_color(value: String): Self = StObject.set(x, "background_color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatest_question_response_time(value: Double): Self = StObject.set(x, "latest_question_response_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_id(value: Null): Self = StObject.set(x, "max_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMore_available(value: Boolean): Self = StObject.set(x, "more_available", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuestion(value: String): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuestion_id(value: String): Self = StObject.set(x, "question_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuestion_response_count(value: Double): Self = StObject.set(x, "question_response_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuestion_type(value: String): Self = StObject.set(x, "question_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponders(value: js.Array[StoryQuestionResponsesFeedResponseRespondersItem]): Self = StObject.set(x, "responders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRespondersVarargs(value: StoryQuestionResponsesFeedResponseRespondersItem*): Self = StObject.set(x, "responders", js.Array(value :_*))
      
      @scala.inline
      def setText_color(value: String): Self = StObject.set(x, "text_color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnanswered_response_count(value: Double): Self = StObject.set(x, "unanswered_response_count", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoryQuestionResponsesFeedResponseRespondersItem extends StObject {
    
    var has_shared_response: Boolean
    
    var id: String
    
    var response: String
    
    var ts: Double
    
    var user: StoryQuestionResponsesFeedResponseUser
  }
  object StoryQuestionResponsesFeedResponseRespondersItem {
    
    @scala.inline
    def apply(
      has_shared_response: Boolean,
      id: String,
      response: String,
      ts: Double,
      user: StoryQuestionResponsesFeedResponseUser
    ): StoryQuestionResponsesFeedResponseRespondersItem = {
      val __obj = js.Dynamic.literal(has_shared_response = has_shared_response.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryQuestionResponsesFeedResponseRespondersItem]
    }
    
    @scala.inline
    implicit class StoryQuestionResponsesFeedResponseRespondersItemMutableBuilder[Self <: StoryQuestionResponsesFeedResponseRespondersItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHas_shared_response(value: Boolean): Self = StObject.set(x, "has_shared_response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: StoryQuestionResponsesFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoryQuestionResponsesFeedResponseRootObject extends StObject {
    
    var responder_info: StoryQuestionResponsesFeedResponseResponderInfo
    
    var status: String
  }
  object StoryQuestionResponsesFeedResponseRootObject {
    
    @scala.inline
    def apply(responder_info: StoryQuestionResponsesFeedResponseResponderInfo, status: String): StoryQuestionResponsesFeedResponseRootObject = {
      val __obj = js.Dynamic.literal(responder_info = responder_info.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryQuestionResponsesFeedResponseRootObject]
    }
    
    @scala.inline
    implicit class StoryQuestionResponsesFeedResponseRootObjectMutableBuilder[Self <: StoryQuestionResponsesFeedResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResponder_info(value: StoryQuestionResponsesFeedResponseResponderInfo): Self = StObject.set(x, "responder_info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoryQuestionResponsesFeedResponseUser extends StObject {
    
    var full_name: String
    
    var is_private: Boolean
    
    var is_verified: Boolean
    
    var pk: Double
    
    var profile_pic_id: String
    
    var profile_pic_url: String
    
    var username: String
  }
  object StoryQuestionResponsesFeedResponseUser {
    
    @scala.inline
    def apply(
      full_name: String,
      is_private: Boolean,
      is_verified: Boolean,
      pk: Double,
      profile_pic_id: String,
      profile_pic_url: String,
      username: String
    ): StoryQuestionResponsesFeedResponseUser = {
      val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryQuestionResponsesFeedResponseUser]
    }
    
    @scala.inline
    implicit class StoryQuestionResponsesFeedResponseUserMutableBuilder[Self <: StoryQuestionResponsesFeedResponseUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
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
