package typings.instagramPrivateApi.directThreadRepositoryBroadcastResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadRepositoryBroadcastResponsePayload extends js.Object {
  var client_context: String
  var item_id: String
  var thread_id: String
  var timestamp: String
}

object DirectThreadRepositoryBroadcastResponsePayload {
  @scala.inline
  def apply(client_context: String, item_id: String, thread_id: String, timestamp: String): DirectThreadRepositoryBroadcastResponsePayload = {
    val __obj = js.Dynamic.literal(client_context = client_context.asInstanceOf[js.Any], item_id = item_id.asInstanceOf[js.Any], thread_id = thread_id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DirectThreadRepositoryBroadcastResponsePayload]
  }
}

