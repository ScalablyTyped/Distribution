package typings.instagramPrivateApi.mediaRepositoryCheckOffensiveCommentResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaRepositoryCheckOffensiveCommentResponseRootObject extends js.Object {
  
  var bully_classifier: String = js.native
  
  var hate_classifier: String = js.native
  
  var is_offensive: Boolean = js.native
  
  var sexual_classifier: String = js.native
  
  var spam_classifier: String = js.native
  
  var status: String = js.native
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
  implicit class MediaRepositoryCheckOffensiveCommentResponseRootObjectOps[Self <: MediaRepositoryCheckOffensiveCommentResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setBully_classifier(value: String): Self = this.set("bully_classifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHate_classifier(value: String): Self = this.set("hate_classifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_offensive(value: Boolean): Self = this.set("is_offensive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSexual_classifier(value: String): Self = this.set("sexual_classifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpam_classifier(value: String): Self = this.set("spam_classifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
