package typings
package jpmLib.sdkRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseRequest extends js.Object {
  var content: java.lang.String
  var contentType: java.lang.String
  var headers: js.Object
  var url: java.lang.String | jpmLib.FFAddonSDKNs.SDKURL
  def delete(): scala.Unit
  def get(): scala.Unit
  def head(): scala.Unit
  def post(): scala.Unit
  def put(): scala.Unit
}

object BaseRequest {
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
    url: java.lang.String | jpmLib.FFAddonSDKNs.SDKURL
  ): BaseRequest = {
    val __obj = js.Dynamic.literal(content = content, contentType = contentType, delete = js.Any.fromFunction0(delete), get = js.Any.fromFunction0(get), head = js.Any.fromFunction0(head), headers = headers, post = js.Any.fromFunction0(post), put = js.Any.fromFunction0(put), url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseRequest]
  }
}

