package typings
package k6Lib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectBatchRequest extends js.Object {
  var body: js.UndefOr[RequestBody | scala.Null] = js.undefined
  var method: java.lang.String
  var params: js.UndefOr[Params | scala.Null] = js.undefined
  var url: java.lang.String
}

object ObjectBatchRequest {
  @scala.inline
  def apply(method: java.lang.String, url: java.lang.String, body: RequestBody = null, params: Params = null): ObjectBatchRequest = {
    val __obj = js.Dynamic.literal(method = method, url = url)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[ObjectBatchRequest]
  }
}

