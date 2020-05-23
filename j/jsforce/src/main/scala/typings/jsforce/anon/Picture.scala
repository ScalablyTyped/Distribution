package typings.jsforce.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Picture extends js.Object {
  var picture: String
  var thumbnail: String
}

object Picture {
  @scala.inline
  def apply(picture: String, thumbnail: String): Picture = {
    val __obj = js.Dynamic.literal(picture = picture.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Picture]
  }
}

