package typings.koaDashBodyparser.koaDashBodyparserMod.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var rawBody: String
}

object Request {
  @scala.inline
  def apply(rawBody: String, body: js.Any = null): Request = {
    val __obj = js.Dynamic.literal(rawBody = rawBody)
    if (body != null) __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[Request]
  }
}

