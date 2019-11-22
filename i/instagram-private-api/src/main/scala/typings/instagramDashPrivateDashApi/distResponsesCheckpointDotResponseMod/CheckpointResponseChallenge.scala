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
    val __obj = js.Dynamic.literal(api_path = api_path, hide_webview_header = hide_webview_header, lock = lock, logout = logout, native_flow = native_flow, url = url)
  
    __obj.asInstanceOf[CheckpointResponseChallenge]
  }
}

