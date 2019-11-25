package typings.jsmediatags.typesMod

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait jsmediatagsError extends js.Object {
  var info: String
  var `type`: String
  var xhr: js.UndefOr[XMLHttpRequest] = js.undefined
}

object jsmediatagsError {
  @scala.inline
  def apply(info: String, `type`: String, xhr: XMLHttpRequest = null): jsmediatagsError = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (xhr != null) __obj.updateDynamic("xhr")(xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[jsmediatagsError]
  }
}

