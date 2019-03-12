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
    delete: () => scala.Unit,
    get: () => scala.Unit,
    head: () => scala.Unit,
    headers: js.Object,
    post: () => scala.Unit,
    put: () => scala.Unit,
    response: Response,
    url: java.lang.String | jpmLib.FFAddonSDKNs.SDKURL
  ): Request = {
    val __obj = js.Dynamic.literal(content = content, contentType = contentType, delete = js.Any.fromFunction0(delete), get = js.Any.fromFunction0(get), head = js.Any.fromFunction0(head), headers = headers, post = js.Any.fromFunction0(post), put = js.Any.fromFunction0(put), response = response, url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Request]
  }
}

