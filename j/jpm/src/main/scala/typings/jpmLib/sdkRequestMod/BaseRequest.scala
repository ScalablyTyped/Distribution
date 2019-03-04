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
    delete: js.Function0[scala.Unit],
    get: js.Function0[scala.Unit],
    head: js.Function0[scala.Unit],
    headers: js.Object,
    post: js.Function0[scala.Unit],
    put: js.Function0[scala.Unit],
    url: java.lang.String | jpmLib.FFAddonSDKNs.SDKURL
  ): BaseRequest = {
    val __obj = js.Dynamic.literal(content = content, contentType = contentType, delete = delete, get = get, head = head, headers = headers, post = post, put = put, url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseRequest]
  }
}

