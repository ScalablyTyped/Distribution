package typings.jsforce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPicture extends js.Object {
  var picture: String
  var thumbnail: String
}

object AnonPicture {
  @scala.inline
  def apply(picture: String, thumbnail: String): AnonPicture = {
    val __obj = js.Dynamic.literal(picture = picture.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPicture]
  }
}

