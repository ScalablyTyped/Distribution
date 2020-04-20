package typings.instagramPrivateApi.liveObsSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveRtmpSettings extends js.Object {
  var stream_key: String
  var stream_url: String
}

object LiveRtmpSettings {
  @scala.inline
  def apply(stream_key: String, stream_url: String): LiveRtmpSettings = {
    val __obj = js.Dynamic.literal(stream_key = stream_key.asInstanceOf[js.Any], stream_url = stream_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveRtmpSettings]
  }
}

