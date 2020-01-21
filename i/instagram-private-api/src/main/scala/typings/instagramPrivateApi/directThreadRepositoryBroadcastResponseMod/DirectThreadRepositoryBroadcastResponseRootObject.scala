package typings.instagramPrivateApi.directThreadRepositoryBroadcastResponseMod

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
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_code = status_code.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DirectThreadRepositoryBroadcastResponseRootObject]
  }
}

