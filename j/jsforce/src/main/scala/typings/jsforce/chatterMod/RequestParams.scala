package typings.jsforce.chatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestParams extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var method: String
  var url: String
}

object RequestParams {
  @scala.inline
  def apply(method: String, url: String, body: String = null): RequestParams = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestParams]
  }
}

