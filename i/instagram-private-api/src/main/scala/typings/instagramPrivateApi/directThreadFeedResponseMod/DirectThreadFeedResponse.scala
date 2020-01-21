package typings.instagramPrivateApi.directThreadFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadFeedResponse extends js.Object {
  var status: String
  var thread: DirectThreadFeedResponseThread
}

object DirectThreadFeedResponse {
  @scala.inline
  def apply(status: String, thread: DirectThreadFeedResponseThread): DirectThreadFeedResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], thread = thread.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DirectThreadFeedResponse]
  }
}

