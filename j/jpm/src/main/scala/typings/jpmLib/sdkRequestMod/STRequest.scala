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
    val __obj = js.Dynamic.literal(content = content, contentType = contentType, delete = delete, get = get, head = head, headers = headers, post = post, put = put, response = response, url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[STRequest[ResponseType]]
  }
}

