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
  def apply[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: RequestBody = null, params: RefinedParams[RT] = null): ObjectRefinedBatchRequest[RT] = {
    val __obj = js.Dynamic.literal(method = method, url = url)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[ObjectRefinedBatchRequest[RT]]
  }
}

