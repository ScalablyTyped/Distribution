package typings.koaBodyparser.mod.koaAugmentingMod

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
    val __obj = js.Dynamic.literal(rawBody = rawBody.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

