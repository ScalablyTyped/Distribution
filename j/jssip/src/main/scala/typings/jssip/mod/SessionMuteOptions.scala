package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionMuteOptions extends js.Object {
  var audio: js.UndefOr[Boolean] = js.undefined
  var video: js.UndefOr[Boolean] = js.undefined
}

object SessionMuteOptions {
  @scala.inline
  def apply(audio: js.UndefOr[Boolean] = js.undefined, video: js.UndefOr[Boolean] = js.undefined): SessionMuteOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audio)) __obj.updateDynamic("audio")(audio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(video)) __obj.updateDynamic("video")(video.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionMuteOptions]
  }
}

