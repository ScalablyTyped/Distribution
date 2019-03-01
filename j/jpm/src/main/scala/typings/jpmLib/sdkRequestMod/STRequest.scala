package typings
package jpmLib.sdkRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait STRequest[ResponseType] extends BaseRequest {
  var response: STResponse[ResponseType]
}

object STRequest {
  @scala.inline
  def apply[ResponseType](
    content: java.lang.String,
    contentType: java.lang.String,
    delete: js.Function0[scala.Unit],
    get: js.Function0[scala.Unit],
    head: js.Function0[scala.Unit],
    headers: js.Object,
    post: js.Function0[scala.Unit],
    put: js.Function0[scala.Unit],
    response: STResponse[ResponseType],
    url: java.lang.String | jpmLib.FFAddonSDKNs.SDKURL
  ): STRequest[ResponseType] = {
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
    __obj.asInstanceOf[STRequest[ResponseType]]
  }
}

