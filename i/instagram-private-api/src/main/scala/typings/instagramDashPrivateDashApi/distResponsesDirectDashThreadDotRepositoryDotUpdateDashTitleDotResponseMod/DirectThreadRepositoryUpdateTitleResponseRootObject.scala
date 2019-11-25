package typings.instagramDashPrivateDashApi.distResponsesDirectDashThreadDotRepositoryDotUpdateDashTitleDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadRepositoryUpdateTitleResponseRootObject extends js.Object {
  var status: String
  var thread: DirectThreadRepositoryUpdateTitleResponseThread
}

object DirectThreadRepositoryUpdateTitleResponseRootObject {
  @scala.inline
  def apply(status: String, thread: DirectThreadRepositoryUpdateTitleResponseThread): DirectThreadRepositoryUpdateTitleResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], thread = thread.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseRootObject]
  }
}

