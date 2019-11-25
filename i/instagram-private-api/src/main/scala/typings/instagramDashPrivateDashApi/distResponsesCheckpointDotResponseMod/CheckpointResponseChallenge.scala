package typings.instagramDashPrivateDashApi.distResponsesCheckpointDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckpointResponseChallenge extends js.Object {
  var api_path: String
  var hide_webview_header: Boolean
  var lock: Boolean
  var logout: Boolean
  var native_flow: Boolean
  var url: String
}

object CheckpointResponseChallenge {
  @scala.inline
  def apply(
    api_path: String,
    hide_webview_header: Boolean,
    lock: Boolean,
    logout: Boolean,
    native_flow: Boolean,
    url: String
  ): CheckpointResponseChallenge = {
    val __obj = js.Dynamic.literal(api_path = api_path.asInstanceOf[js.Any], hide_webview_header = hide_webview_header.asInstanceOf[js.Any], lock = lock.asInstanceOf[js.Any], logout = logout.asInstanceOf[js.Any], native_flow = native_flow.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CheckpointResponseChallenge]
  }
}

