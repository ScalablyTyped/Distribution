package typings.instagramDashPrivateDashApi.distResponsesCheckpointDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckpointResponse extends js.Object {
  var challenge: CheckpointResponseChallenge
  var error_type: String
  var message: String
  var status: String
}

object CheckpointResponse {
  @scala.inline
  def apply(challenge: CheckpointResponseChallenge, error_type: String, message: String, status: String): CheckpointResponse = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], error_type = error_type.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CheckpointResponse]
  }
}

