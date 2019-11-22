package typings.instagramDashPrivateDashApi.distResponsesDirectDashThreadDotRepositoryDotBroadcastDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadRepositoryBroadcastResponseRootObject extends js.Object {
  var action: String
  var payload: DirectThreadRepositoryBroadcastResponsePayload
  var status: String
  var status_code: String
}

object DirectThreadRepositoryBroadcastResponseRootObject {
  @scala.inline
  def apply(
    action: String,
    payload: DirectThreadRepositoryBroadcastResponsePayload,
    status: String,
    status_code: String
  ): DirectThreadRepositoryBroadcastResponseRootObject = {
    val __obj = js.Dynamic.literal(action = action, payload = payload, status = status, status_code = status_code)
  
    __obj.asInstanceOf[DirectThreadRepositoryBroadcastResponseRootObject]
  }
}

