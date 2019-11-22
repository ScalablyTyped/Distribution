package typings.instagramDashPrivateDashApi.distTypesLiveDotObsDashSettingsMod

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
    val __obj = js.Dynamic.literal(stream_key = stream_key, stream_url = stream_url)
  
    __obj.asInstanceOf[LiveRtmpSettings]
  }
}

