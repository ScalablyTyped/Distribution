package typings.jpm.sdkRequestMod

import typings.jpm.FFAddonSDK.SDKURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseRequest extends js.Object {
  var content: String
  var contentType: String
  var headers: js.Object
  var url: String | SDKURL
  def delete(): Unit
  def get(): Unit
  def head(): Unit
  def post(): Unit
  def put(): Unit
}

object BaseRequest {
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
    url: String | SDKURL
  ): BaseRequest = {
    val __obj = js.Dynamic.literal(content = content, contentType = contentType, delete = js.Any.fromFunction0(delete), get = js.Any.fromFunction0(get), head = js.Any.fromFunction0(head), headers = headers, post = js.Any.fromFunction0(post), put = js.Any.fromFunction0(put), url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseRequest]
  }
}

