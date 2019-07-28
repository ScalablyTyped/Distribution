package typings.jpm.sdkRequestMod

import typings.jpm.FFAddonSDKNs.SDKURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait STRequest[ResponseType] extends BaseRequest {
  var response: STResponse[ResponseType]
}

object STRequest {
  @scala.inline
  def apply[ResponseType](
    content: String,
    contentType: String,
    delete: () => Unit,
    get: () => Unit,
    head: () => Unit,
    headers: js.Object,
    post: () => Unit,
    put: () => Unit,
    response: STResponse[ResponseType],
    url: String | SDKURL
  ): STRequest[ResponseType] = {
    val __obj = js.Dynamic.literal(content = content, contentType = contentType, delete = js.Any.fromFunction0(delete), get = js.Any.fromFunction0(get), head = js.Any.fromFunction0(head), headers = headers, post = js.Any.fromFunction0(post), put = js.Any.fromFunction0(put), response = response, url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[STRequest[ResponseType]]
  }
}

