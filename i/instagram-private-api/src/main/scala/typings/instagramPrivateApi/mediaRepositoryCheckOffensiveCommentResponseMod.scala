package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaRepositoryCheckOffensiveCommentResponseMod {
  
  trait MediaRepositoryCheckOffensiveCommentResponseRootObject extends StObject {
    
    var bully_classifier: String
    
    var hate_classifier: String
    
    var is_offensive: Boolean
    
    var sexual_classifier: String
    
    var spam_classifier: String
    
    var status: String
  }
  object MediaRepositoryCheckOffensiveCommentResponseRootObject {
    
    @scala.inline
    def apply(
      bully_classifier: String,
      hate_classifier: String,
      is_offensive: Boolean,
      sexual_classifier: String,
      spam_classifier: String,
      status: String
    ): MediaRepositoryCheckOffensiveCommentResponseRootObject = {
      val __obj = js.Dynamic.literal(bully_classifier = bully_classifier.asInstanceOf[js.Any], hate_classifier = hate_classifier.asInstanceOf[js.Any], is_offensive = is_offensive.asInstanceOf[js.Any], sexual_classifier = sexual_classifier.asInstanceOf[js.Any], spam_classifier = spam_classifier.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaRepositoryCheckOffensiveCommentResponseRootObject]
    }
    
    @scala.inline
    implicit class MediaRepositoryCheckOffensiveCommentResponseRootObjectMutableBuilder[Self <: MediaRepositoryCheckOffensiveCommentResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBully_classifier(value: String): Self = StObject.set(x, "bully_classifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHate_classifier(value: String): Self = StObject.set(x, "hate_classifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_offensive(value: Boolean): Self = StObject.set(x, "is_offensive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSexual_classifier(value: String): Self = StObject.set(x, "sexual_classifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpam_classifier(value: String): Self = StObject.set(x, "spam_classifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
