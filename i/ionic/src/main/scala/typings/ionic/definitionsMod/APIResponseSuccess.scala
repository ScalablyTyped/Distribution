package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APIResponseSuccess extends APIResponse {
  var data: APIResponseData = js.native
  var meta: APIResponseMeta = js.native
}

object APIResponseSuccess {
  @scala.inline
  def apply(data: APIResponseData, meta: APIResponseMeta): APIResponseSuccess = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIResponseSuccess]
  }
  @scala.inline
  implicit class APIResponseSuccessOps[Self <: APIResponseSuccess] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: js.Object*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: APIResponseData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeta(value: APIResponseMeta): Self = this.set("meta", value.asInstanceOf[js.Any])
  }
  
}

