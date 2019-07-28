package typings.jpm.sdkRequestMod

import typings.jpm.FFAddonSDKNs.SDKURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends BaseRequest {
  var response: Response
}

object Request {
  @scala.inline
  def apply(
    content: String,
    contentType: String,
    delete: () => Unit,
    get: () => Unit,
    head: () => Unit,
    headers: js.Object,
    post: () => Unit,
    put: () => Unit,
    response: Response,
    url: String | SDKURL
  ): Request = {
    val __obj = js.Dynamic.literal(content = content, contentType = contentType, delete = js.Any.fromFunction0(delete), get = js.Any.fromFunction0(get), head = js.Any.fromFunction0(head), headers = headers, post = js.Any.fromFunction0(post), put = js.Any.fromFunction0(put), response = response, url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Request]
  }
}

