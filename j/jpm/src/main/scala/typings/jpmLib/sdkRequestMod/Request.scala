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
    val __obj = js.Dynamic.literal(content = content, contentType = contentType, delete = delete, get = get, head = head, headers = headers, post = post, put = put, response = response, url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Request]
  }
}

