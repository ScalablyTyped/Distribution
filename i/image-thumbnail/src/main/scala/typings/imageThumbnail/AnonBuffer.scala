package typings.imageThumbnail

import typings.imageThumbnail.imageThumbnailStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuffer extends js.Object {
  var responseType: buffer
}

object AnonBuffer {
  @scala.inline
  def apply(responseType: buffer): AnonBuffer = {
    val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBuffer]
  }
}

