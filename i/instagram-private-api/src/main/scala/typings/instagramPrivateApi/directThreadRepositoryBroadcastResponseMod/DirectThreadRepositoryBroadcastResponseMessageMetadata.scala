package typings.instagramPrivateApi.directThreadRepositoryBroadcastResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadRepositoryBroadcastResponseMessageMetadata extends js.Object {
  var client_context: String
  var item_id: String
  var participant_ids: js.Array[String]
  var thread_id: String
  var timestamp: String
}

object DirectThreadRepositoryBroadcastResponseMessageMetadata {
  @scala.inline
  def apply(
    client_context: String,
    item_id: String,
    participant_ids: js.Array[String],
    thread_id: String,
    timestamp: String
  ): DirectThreadRepositoryBroadcastResponseMessageMetadata = {
    val __obj = js.Dynamic.literal(client_context = client_context.asInstanceOf[js.Any], item_id = item_id.asInstanceOf[js.Any], participant_ids = participant_ids.asInstanceOf[js.Any], thread_id = thread_id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DirectThreadRepositoryBroadcastResponseMessageMetadata]
  }
}

