package typings.hlsDotJs.hlsDotJsMod

import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait mediaAttachingData extends js.Object {
  var mediaSource: String
  var video: HTMLVideoElement
}

object mediaAttachingData {
  @scala.inline
  def apply(mediaSource: String, video: HTMLVideoElement): mediaAttachingData = {
    val __obj = js.Dynamic.literal(mediaSource = mediaSource.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[mediaAttachingData]
  }
}

