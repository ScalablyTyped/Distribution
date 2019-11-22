package typings.instagramDashPrivateDashApi.distResponsesDirectDashThreadDotRepositoryDotAddDashUserDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadRepositoryAddUserResponseRootObject extends js.Object {
  var status: String
  var thread: DirectThreadRepositoryAddUserResponseThread
}

object DirectThreadRepositoryAddUserResponseRootObject {
  @scala.inline
  def apply(status: String, thread: DirectThreadRepositoryAddUserResponseThread): DirectThreadRepositoryAddUserResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status, thread = thread)
  
    __obj.asInstanceOf[DirectThreadRepositoryAddUserResponseRootObject]
  }
}

