package typings.imageThumbnail

import typings.imageThumbnail.imageThumbnailStrings.base64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBase64 extends js.Object {
  var responseType: base64
}

object AnonBase64 {
  @scala.inline
  def apply(responseType: base64): AnonBase64 = {
    val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBase64]
  }
}

