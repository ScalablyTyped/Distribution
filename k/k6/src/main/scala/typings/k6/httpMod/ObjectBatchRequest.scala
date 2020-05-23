package typings.k6.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectBatchRequest extends js.Object {
  /** Request body. */
  var body: js.UndefOr[RequestBody | Null] = js.undefined
  /** Request method. */
  var method: String
  /** Requset parameters. */
  var params: js.UndefOr[Params | Null] = js.undefined
  /** Request URL. */
  var url: String
}

object ObjectBatchRequest {
  @scala.inline
  def apply(
    method: String,
    url: String,
    body: js.UndefOr[Null | RequestBody] = js.undefined,
    params: js.UndefOr[Null | Params] = js.undefined
  ): ObjectBatchRequest = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(body)) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(params)) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectBatchRequest]
  }
}

