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
    delete: () => scala.Unit,
    get: () => scala.Unit,
    head: () => scala.Unit,
    headers: js.Object,
    post: () => scala.Unit,
    put: () => scala.Unit,
    response: STResponse[ResponseType],
    url: java.lang.String | jpmLib.FFAddonSDKNs.SDKURL
  ): STRequest[ResponseType] = {
    val __obj = js.Dynamic.literal(content = content, contentType = contentType, delete = js.Any.fromFunction0(delete), get = js.Any.fromFunction0(get), head = js.Any.fromFunction0(head), headers = headers, post = js.Any.fromFunction0(post), put = js.Any.fromFunction0(put), response = response, url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[STRequest[ResponseType]]
  }
}

