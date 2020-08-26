package typings.jsonRpcWs.mod

import typings.jsonRpcWs.jsonRpcWsStrings.`2Dot0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Payload[ParamType] extends js.Object {
  var error: js.UndefOr[js.Any] = js.native
  var id: String = js.native
  var jsonrpc: js.UndefOr[`2Dot0`] = js.native
  var method: String = js.native
  var params: js.UndefOr[ParamType] = js.native
  var result: js.UndefOr[js.Any] = js.native
}

object Payload {
  @scala.inline
  def apply[ParamType](id: String, method: String): Payload[ParamType] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload[ParamType]]
  }
  @scala.inline
  implicit class PayloadOps[Self <: Payload[_], ParamType] (val x: Self with Payload[ParamType]) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setJsonrpc(value: `2Dot0`): Self = this.set("jsonrpc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonrpc: Self = this.set("jsonrpc", js.undefined)
    @scala.inline
    def setParams(value: ParamType): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setResult(value: js.Any): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
  
}

