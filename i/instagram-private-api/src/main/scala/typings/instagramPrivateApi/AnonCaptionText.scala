package typings.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCaptionText extends js.Object {
  var captionText: String
  var mediaId: String
}

object AnonCaptionText {
  @scala.inline
  def apply(captionText: String, mediaId: String): AnonCaptionText = {
    val __obj = js.Dynamic.literal(captionText = captionText.asInstanceOf[js.Any], mediaId = mediaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCaptionText]
  }
}

