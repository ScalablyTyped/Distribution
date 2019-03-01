package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait mediaAttachingData extends js.Object {
  var mediaSource: java.lang.String
  var video: stdLib.HTMLVideoElement
}

object mediaAttachingData {
  @scala.inline
  def apply(mediaSource: java.lang.String, video: stdLib.HTMLVideoElement): mediaAttachingData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mediaSource")(mediaSource)
    __obj.updateDynamic("video")(video)
    __obj.asInstanceOf[mediaAttachingData]
  }
}

