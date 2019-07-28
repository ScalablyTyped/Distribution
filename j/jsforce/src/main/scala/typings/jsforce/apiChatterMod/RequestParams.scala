package typings.jsforce.apiChatterMod

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
    val __obj = js.Dynamic.literal(method = method, url = url)
    if (body != null) __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[RequestParams]
  }
}

