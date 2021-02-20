package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liveGetQuestionsResponseMod {
  
  @js.native
  trait LiveGetQuestionsResponseQuestionsItem extends StObject {
    
    var qid: String = js.native
    
    var source: String = js.native
    
    var story_sticker_text: String = js.native
    
    var text: String = js.native
    
    var timestamp: Double = js.native
    
    var user: LiveGetQuestionsResponseUser = js.native
  }
  object LiveGetQuestionsResponseQuestionsItem {
    
    @scala.inline
    def apply(
      qid: String,
      source: String,
      story_sticker_text: String,
      text: String,
      timestamp: Double,
      user: LiveGetQuestionsResponseUser
    ): LiveGetQuestionsResponseQuestionsItem = {
      val __obj = js.Dynamic.literal(qid = qid.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], story_sticker_text = story_sticker_text.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveGetQuestionsResponseQuestionsItem]
    }
    
    @scala.inline
    implicit class LiveGetQuestionsResponseQuestionsItemMutableBuilder[Self <: LiveGetQuestionsResponseQuestionsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQid(value: String): Self = StObject.set(x, "qid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStory_sticker_text(value: String): Self = StObject.set(x, "story_sticker_text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: LiveGetQuestionsResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LiveGetQuestionsResponseRootObject extends StObject {
    
    var questions: js.Array[LiveGetQuestionsResponseQuestionsItem] = js.native
    
    var status: String = js.native
  }
  object LiveGetQuestionsResponseRootObject {
    
    @scala.inline
    def apply(questions: js.Array[LiveGetQuestionsResponseQuestionsItem], status: String): LiveGetQuestionsResponseRootObject = {
      val __obj = js.Dynamic.literal(questions = questions.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveGetQuestionsResponseRootObject]
    }
    
    @scala.inline
    implicit class LiveGetQuestionsResponseRootObjectMutableBuilder[Self <: LiveGetQuestionsResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuestions(value: js.Array[LiveGetQuestionsResponseQuestionsItem]): Self = StObject.set(x, "questions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuestionsVarargs(value: LiveGetQuestionsResponseQuestionsItem*): Self = StObject.set(x, "questions", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LiveGetQuestionsResponseUser extends StObject {
    
    var full_name: String = js.native
    
    var is_private: Boolean = js.native
    
    var is_verified: Boolean = js.native
    
    var pk: Double = js.native
    
    var profile_pic_id: String = js.native
    
    var profile_pic_url: String = js.native
    
    var username: String = js.native
  }
  object LiveGetQuestionsResponseUser {
    
    @scala.inline
    def apply(
      full_name: String,
      is_private: Boolean,
      is_verified: Boolean,
      pk: Double,
      profile_pic_id: String,
      profile_pic_url: String,
      username: String
    ): LiveGetQuestionsResponseUser = {
      val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveGetQuestionsResponseUser]
    }
    
    @scala.inline
    implicit class LiveGetQuestionsResponseUserMutableBuilder[Self <: LiveGetQuestionsResponseUser] (val x: Self) extends AnyVal {
      
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
