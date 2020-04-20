package typings.greasemonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMimetype extends js.Object {
  var mimetype: String
  var name: String
  var url: String
}

object AnonMimetype {
  @scala.inline
  def apply(mimetype: String, name: String, url: String): AnonMimetype = {
    val __obj = js.Dynamic.literal(mimetype = mimetype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMimetype]
  }
}

