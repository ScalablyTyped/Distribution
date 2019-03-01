package typings
package jpmLib.sdkRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends BaseRequest {
  var response: Response
}

object Request {
  @scala.inline
  def apply(
    content: java.lang.String,
    contentType: java.lang.String,
    delete: js.Function0[scala.Unit],
    get: js.Function0[scala.Unit],
    head: js.Function0[scala.Unit],
    headers: js.Object,
    post: js.Function0[scala.Unit],
    put: js.Function0[scala.Unit],
    response: Response,
    url: java.lang.String | jpmLib.FFAddonSDKNs.SDKURL
  ): Request = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("contentType")(contentType)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("head")(head)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("post")(post)
    __obj.updateDynamic("put")(put)
    __obj.updateDynamic("response")(response)
    __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

