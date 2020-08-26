package typings.k6.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectRefinedBatchRequest[RT /* <: js.UndefOr[ResponseType] */] extends js.Object {
  var body: js.UndefOr[RequestBody | Null] = js.native
  var method: String = js.native
  var params: js.UndefOr[RefinedParams[RT] | Null] = js.native
  var url: String = js.native
}

object ObjectRefinedBatchRequest {
  @scala.inline
  def apply[/* <: js.UndefOr[typings.k6.httpMod.ResponseType] */ RT](method: String, url: String): ObjectRefinedBatchRequest[RT] = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectRefinedBatchRequest[RT]]
  }
  @scala.inline
  implicit class ObjectRefinedBatchRequestOps[Self <: ObjectRefinedBatchRequest[_], /* <: js.UndefOr[typings.k6.httpMod.ResponseType] */ RT] (val x: Self with ObjectRefinedBatchRequest[RT]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: RequestBody): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setBodyNull: Self = this.set("body", null)
    @scala.inline
    def setParams(value: RefinedParams[RT]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setParamsNull: Self = this.set("params", null)
  }
  
}

