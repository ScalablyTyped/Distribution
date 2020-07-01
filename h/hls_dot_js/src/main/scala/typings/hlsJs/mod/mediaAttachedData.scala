package typings.hlsJs.mod

import typings.std.HTMLMediaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait mediaAttachedData extends js.Object {
  var media: HTMLMediaElement
  var mediaSource: String
}

object mediaAttachedData {
  @scala.inline
  def apply(media: HTMLMediaElement, mediaSource: String): mediaAttachedData = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], mediaSource = mediaSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[mediaAttachedData]
  }
}

