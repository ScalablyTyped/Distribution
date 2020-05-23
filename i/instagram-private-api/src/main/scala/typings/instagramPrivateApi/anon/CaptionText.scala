package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionText extends js.Object {
  var captionText: String
  var mediaId: String
}

object CaptionText {
  @scala.inline
  def apply(captionText: String, mediaId: String): CaptionText = {
    val __obj = js.Dynamic.literal(captionText = captionText.asInstanceOf[js.Any], mediaId = mediaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionText]
  }
}

