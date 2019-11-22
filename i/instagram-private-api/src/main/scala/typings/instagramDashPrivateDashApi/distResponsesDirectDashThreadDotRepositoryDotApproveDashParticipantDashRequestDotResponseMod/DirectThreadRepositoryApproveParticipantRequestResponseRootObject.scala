package typings.instagramDashPrivateDashApi.distResponsesDirectDashThreadDotRepositoryDotApproveDashParticipantDashRequestDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadRepositoryApproveParticipantRequestResponseRootObject extends js.Object {
  var status: String
  var thread: DirectThreadRepositoryApproveParticipantRequestResponseThread
}

object DirectThreadRepositoryApproveParticipantRequestResponseRootObject {
  @scala.inline
  def apply(status: String, thread: DirectThreadRepositoryApproveParticipantRequestResponseThread): DirectThreadRepositoryApproveParticipantRequestResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status, thread = thread)
  
    __obj.asInstanceOf[DirectThreadRepositoryApproveParticipantRequestResponseRootObject]
  }
}

