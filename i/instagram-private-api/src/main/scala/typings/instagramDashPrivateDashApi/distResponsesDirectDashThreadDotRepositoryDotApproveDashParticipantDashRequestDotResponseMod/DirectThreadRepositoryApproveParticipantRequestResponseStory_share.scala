package typings.instagramDashPrivateDashApi.distResponsesDirectDashThreadDotRepositoryDotApproveDashParticipantDashRequestDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadRepositoryApproveParticipantRequestResponseStory_share extends js.Object {
  var is_reel_persisted: Boolean
  var media: DirectThreadRepositoryApproveParticipantRequestResponseMedia
  var reel_id: Double
  var reel_type: String
  var story_share_type: String
  var text: Null
}

object DirectThreadRepositoryApproveParticipantRequestResponseStory_share {
  @scala.inline
  def apply(
    is_reel_persisted: Boolean,
    media: DirectThreadRepositoryApproveParticipantRequestResponseMedia,
    reel_id: Double,
    reel_type: String,
    story_share_type: String,
    text: Null
  ): DirectThreadRepositoryApproveParticipantRequestResponseStory_share = {
    val __obj = js.Dynamic.literal(is_reel_persisted = is_reel_persisted.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], reel_id = reel_id.asInstanceOf[js.Any], reel_type = reel_type.asInstanceOf[js.Any], story_share_type = story_share_type.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DirectThreadRepositoryApproveParticipantRequestResponseStory_share]
  }
}

