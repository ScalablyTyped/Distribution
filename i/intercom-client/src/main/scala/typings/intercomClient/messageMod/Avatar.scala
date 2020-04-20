package typings.intercomClient.messageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Avatar extends js.Object {
  var image_url: String
}

object Avatar {
  @scala.inline
  def apply(image_url: String): Avatar = {
    val __obj = js.Dynamic.literal(image_url = image_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avatar]
  }
}

