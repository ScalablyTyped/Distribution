package typings.hlsJs.mod

import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait mediaAttachedData extends js.Object {
  var mediaSource: String
  var video: HTMLVideoElement
}

object mediaAttachedData {
  @scala.inline
  def apply(mediaSource: String, video: HTMLVideoElement): mediaAttachedData = {
    val __obj = js.Dynamic.literal(mediaSource = mediaSource.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[mediaAttachedData]
  }
}

