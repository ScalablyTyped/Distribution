package typings.instagramDashPrivateDashApi.distResponsesMediaDotRepositoryDotCheckDashOffensiveDashCommentDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaRepositoryCheckOffensiveCommentResponseRootObject extends js.Object {
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
    val __obj = js.Dynamic.literal(bully_classifier = bully_classifier, hate_classifier = hate_classifier, is_offensive = is_offensive, sexual_classifier = sexual_classifier, spam_classifier = spam_classifier, status = status)
  
    __obj.asInstanceOf[MediaRepositoryCheckOffensiveCommentResponseRootObject]
  }
}

