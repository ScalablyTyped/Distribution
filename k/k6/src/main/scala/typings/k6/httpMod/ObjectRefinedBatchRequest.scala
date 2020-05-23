package typings.k6.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectRefinedBatchRequest[RT /* <: js.UndefOr[ResponseType] */] extends js.Object {
  var body: js.UndefOr[RequestBody | Null] = js.undefined
  var method: String
  var params: js.UndefOr[RefinedParams[RT] | Null] = js.undefined
  var url: String
}

object ObjectRefinedBatchRequest {
  @scala.inline
  def apply[RT](
    method: String,
    url: String,
    body: js.UndefOr[Null | RequestBody] = js.undefined,
    params: js.UndefOr[Null | RefinedParams[RT]] = js.undefined
  ): ObjectRefinedBatchRequest[RT] = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(body)) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(params)) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectRefinedBatchRequest[RT]]
  }
}

