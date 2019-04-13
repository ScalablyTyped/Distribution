package typings
package hlsDotJsLib.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait mediaAttachedData extends js.Object {
  var mediaSource: java.lang.String
  var video: stdLib.HTMLVideoElement
}

object mediaAttachedData {
  @scala.inline
  def apply(mediaSource: java.lang.String, video: stdLib.HTMLVideoElement): mediaAttachedData = {
    val __obj = js.Dynamic.literal(mediaSource = mediaSource, video = video)
  
    __obj.asInstanceOf[mediaAttachedData]
  }
}

