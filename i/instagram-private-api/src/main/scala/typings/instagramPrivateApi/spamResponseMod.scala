package typings.instagramPrivateApi

import typings.instagramPrivateApi.instagramPrivateApiBooleans.`true`
import typings.instagramPrivateApi.instagramPrivateApiStrings.fail
import typings.instagramPrivateApi.instagramPrivateApiStrings.feedback_required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spamResponseMod {
  
  @js.native
  trait SpamResponse extends StObject {
    
    var error_type: js.UndefOr[String] = js.native
    
    var feedback_action: String = js.native
    
    var feedback_appeal_label: String = js.native
    
    var feedback_ignore_label: String = js.native
    
    var feedback_message: String = js.native
    
    var feedback_title: String = js.native
    
    var feedback_url: String = js.native
    
    var message: feedback_required = js.native
    
    var spam: `true` = js.native
    
    var status: fail = js.native
  }
  object SpamResponse {
    
    @scala.inline
    def apply(
      feedback_action: String,
      feedback_appeal_label: String,
      feedback_ignore_label: String,
      feedback_message: String,
      feedback_title: String,
      feedback_url: String,
      message: feedback_required,
      spam: `true`,
      status: fail
    ): SpamResponse = {
      val __obj = js.Dynamic.literal(feedback_action = feedback_action.asInstanceOf[js.Any], feedback_appeal_label = feedback_appeal_label.asInstanceOf[js.Any], feedback_ignore_label = feedback_ignore_label.asInstanceOf[js.Any], feedback_message = feedback_message.asInstanceOf[js.Any], feedback_title = feedback_title.asInstanceOf[js.Any], feedback_url = feedback_url.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], spam = spam.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpamResponse]
    }
    
    @scala.inline
    implicit class SpamResponseMutableBuilder[Self <: SpamResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError_type(value: String): Self = StObject.set(x, "error_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError_typeUndefined: Self = StObject.set(x, "error_type", js.undefined)
      
      @scala.inline
      def setFeedback_action(value: String): Self = StObject.set(x, "feedback_action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeedback_appeal_label(value: String): Self = StObject.set(x, "feedback_appeal_label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeedback_ignore_label(value: String): Self = StObject.set(x, "feedback_ignore_label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeedback_message(value: String): Self = StObject.set(x, "feedback_message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeedback_title(value: String): Self = StObject.set(x, "feedback_title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeedback_url(value: String): Self = StObject.set(x, "feedback_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: feedback_required): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpam(value: `true`): Self = StObject.set(x, "spam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: fail): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
