package typings.instagramDashPrivateDashApi.distResponsesDirectDashThreadDotRepositoryDotGetDashByDashParticipantsDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadRepositoryGetByParticipantsResponseRootObject extends js.Object {
  var status: String
  var thread: DirectThreadRepositoryGetByParticipantsResponseThread
}

object DirectThreadRepositoryGetByParticipantsResponseRootObject {
  @scala.inline
  def apply(status: String, thread: DirectThreadRepositoryGetByParticipantsResponseThread): DirectThreadRepositoryGetByParticipantsResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], thread = thread.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DirectThreadRepositoryGetByParticipantsResponseRootObject]
  }
}

